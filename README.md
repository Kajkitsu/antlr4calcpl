# Exec
    rm Calculator*.java *.tokens *.class
    java -jar ./antlr-4.11.1-complete.jar Calculator.g4 
    javac -cp ./antlr-4.11.1-complete.jar Calculator*.java MainListen.java
    java -cp .:antlr-4.11.1-complete.jar org.antlr.v4.gui.TestRig Calculator expr -tree example.txt
    
# Empty env
    sudo apt update
    sudo apt install zip
    sudo apt install unzip
    sudo apt install wget
    wget https://www.antlr.org/download/antlr-4.11.1-complete.jar
    sdk
    sdk list java
    sdk install java 22.3.r17-grl
    sdk use java 22.3.r17-grl
    wget https://www.antlr.org/download/antlr-4.11.1-complete.jar
    nano Calculator.g4 
    java -jar ./antlr-4.11.1-complete.jar Calculator.g4 
    javac -cp ./antlr-4.11.1-complete.jar Calculator*.java MainListen.java  
    nano example.txt
    java -cp .:antlr-4.11.1-complete.jar org.antlr.v4.gui.TestRig Calculator expr -tree example.txt
    java -cp .:antlr-4.11.1-complete.jar MainListen
