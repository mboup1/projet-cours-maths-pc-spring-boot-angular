DNS IPv4 public
ec2-35-180-63-201.eu-west-3.compute.amazonaws.com

ec2-user@ec2-35-180-63-201.eu-west-3.compute.amazonaws.com

sudo yum update -y

sudo yum install java-17-amazon-corretto-devel -y

sudo yum install git -y


# Cloner le dépôt
git clone https://github.com/mboup1/projet-cours-maths-pc-spring-boot-angular.git
cd projet-cours-maths-pc-spring-boot-angular/backend-cours-maths-pc/target
chmod +x mvnw
./mvnw clean package -DskipTests
java -jar target/backend-cours-maths-pc-0.0.1-SNAPSHOT.jar
