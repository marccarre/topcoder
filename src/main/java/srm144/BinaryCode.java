package srm144;

public class BinaryCode {
	private static final int ERROR = -1;
	private static final String NONE = "NONE";

	public String[] decode(final String message) {
		if (message.length() == 1) {
			final int q = intAt(0, message);
			return isValid(q) ? new String[] { "0", "1" } : new String[] { NONE, NONE };
		}
		return new String[] { decrypt(message, 0), decrypt(message, 1) };
	}

	private String decrypt(final String message, final int initialValue) {
		final StringBuilder builder = new StringBuilder();
		final int length = message.length();
		final int[] p = new int[length];

		p[0] = initialValue;
		builder.append(Integer.toString(initialValue));

		for (int i = 1; i < length; ++i) {
			p[i] = decryptAt(i, message, p);
			if (!isValid(p[i]))
				return NONE;

			if (i == (length - 1)) {
				final int lastQ = intAt(i, message);
				if (lastQ != (p[i] + p[i - 1]))
					return NONE;
			}

			builder.append(Integer.toString(p[i]));
		}

		return builder.toString();
	}

	private int decryptAt(int i, final String message, final int[] p) {
		final int q = intAt(i - 1, message);
		if (i == 1) {
			return isValidFirstQ(q) ? q - p[i - 1] : ERROR;
		} else {
			return isValidQ(q) ? q - p[i - 1] - p[i - 2] : ERROR;
		}
	}

	private int intAt(final int i, final String message) {
		return Character.getNumericValue(message.charAt(i));
	}

	private boolean isValid(final int item) {
		return (item == 0) || (item == 1);
	}

	private boolean isValidFirstQ(final int item) {
		return (item >= 0) && (item <= 2);
	}

	private boolean isValidQ(final int item) {
		return (item >= 0) && (item <= 3);
	}
}
