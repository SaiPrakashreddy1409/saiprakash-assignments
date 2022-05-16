# Command line
1. Navigate to the root of the project
2. Try to run tests
`./gradlew clean test -i` 
 If you get error like **command not found**, depending on the shell and OS you use try replacing `./gradlew` in the command with `gradlew` or `.\gradlew`.
3. The command should finish with **Build successful**
4. This should also create a **build** directory with different artifacts.
5. One of the artifacts is test results which you should be able to see at **build/reports/tests/test/index.html**.Success rate should show as **100%**.
6. If you have trouble in running any of these steps, please email us so that we can resolve it before the training starts. 