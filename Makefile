test:
	javac -cp .:junit.jar:hamcrest.jar *.java
	java -cp .:junit.jar:hamcrest.jar Main
	cat RESULTS.txt

clean:
	rm -rf *.class
	rm -rf RESULTS.txt