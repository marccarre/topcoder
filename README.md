topcoder - TopCoder algorithm contests
========

- Features:
	- Leverages the Greed plugin (see also: https://github.com/shivawu/topcoder-greed).
	- Generates sources, tests and requirements according to the standard Java folder structure (respectively in `src/main/java`, `src/test/java` and `src/main/resources`).
	- Gradle can be used to build the project and/or configure your favourite IDE.
	- Continuous compilation and testing is achieved using Python (`build.py`) on top of Gradle (`build.gradle`) and is triggered every time a change in the sources is saved.


- Run:
	- `./topcoder` to start the applet with the Greed plugin.
	- `gradle idea` or `gradle eclipse` to configure your favourite IDE.
	- `gradle check` to compile and test.
	- `python build.py` to compile and test continuously using Gradle.
	- `python build.py <gradle tasks>` to continuously run the specified Gradle tasks.


- Upgrade:
	- TopCoder's applet: replace `ContestAppletProd.jnlp` by the latest version available on www.topcoder.com.
	- Greed plugin: replace `Greed-*.jar` by the latest version available on https://github.com/shivawu/topcoder-greed/releases.
