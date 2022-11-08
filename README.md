# Exec
    rm Calculator*.java *.tokens *.class
    java -jar ./antlr-4.11.1-complete.jar Calculator.g4 
    javac -cp ./antlr-4.11.1-complete.jar Calculator*.java MainListen.java
    java -cp .:antlr-4.11.1-complete.jar org.antlr.v4.gui.TestRig Calculator expr -tree example.txt
