sudo apt install openjdk-17-jdk
sudo apt update
sudo apt install git
sudo apt install maven
git clone https://github.com/mboup1/projet-cours-maths-pc-spring-boot-angular

#Deploy app spring boot
./mvnw clean package -DskipTests
(si app  deja builder utiliser chmod +x mvnw)
java -jar target/backend-cours-maths-pc-0.0.1-SNAPSHOT.jar

# delete depot vm
rm -rf ~/projet-cours-maths-pc-spring-boot-angular

Pull
cd ~/projet-cours-maths-pc-spring-boot-angular
git pull origin main
cat src/main/resources/application.properties

