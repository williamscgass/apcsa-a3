This contains starter code for assignments.

Only a couple things need to be changed for new tests.
1. Create your new Testing File. Lets call this file MyTester.java
2. Inside the Main.java class, append the line: `org.junit.runner.JUnitCore.main("MyTester");`` below the 'Add your Tests Here' comment.
3. Make your class. Basic file structure should be:
public class MyTester extends Autograder {
}
Please see TestCalculator.java on how to write tests.
Autograder, by default, has 100 points for the assignment. This can be changed at the top of the class if necessary -- but I think problem points can be scaled to hit 100.

Run 'make' to see test results.
make clean gets rid of unwanted files.