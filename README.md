# fairyLights
## intro

The exercise is to write a controller for a length of fairy lights.  There are 20 fairy lights in alternating colours red, green and white that can be independently turned on and off. 
The controller is a java program that accepts (as a command line parameter) the name of a sequencing algorithm for turning the lights on and off.  When launched, the program will execute the requested sequencing algorithm in a permanent loop until it the program is terminated.  

## Quickstart
Locally:
```bash
git clone https://github.com/Vamshikiran/fairyLights.git
cd fairyLights
mvn clean install
#
#java -jar target/fairylight.jar ["sequence" | "sequence" | "alternate"] numberOfLights
#
java -jar target/fairylight.jar "sequence"
java -jar target/fairylight.jar "colour"
java -jar target/fairylight.jar "alternate" 
#
java -jar target/fairylight.jar "sequence" "15"
```
Docker:
```bash
git clone https://github.com/Vamshikiran/fairyLights.git
cd fairyLights
mvn clean install
docker-compose up
```


