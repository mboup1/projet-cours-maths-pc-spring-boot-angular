DNS IPv4 public
ec2-35-180-63-201.eu-west-3.compute.amazonaws.com

ec2-user@ec2-35-180-63-201.eu-west-3.compute.amazonaws.com

sudo yum update -y

sudo yum install java-17-amazon-corretto-devel -y

sudo yum install git -y


# Cloner le dépôt
git clone https://github.com/mboup1/projet-cours-maths-pc-spring-boot-angular.git
git clone https://github.com/mboup1/test-ec2-aws
cd projet-cours-maths-pc-spring-boot-angular/backend-cours-maths-pc/target
chmod +x mvnw
./mvnw clean package -DskipTests
java -jar target/backend-cours-maths-pc-0.0.1-SNAPSHOT.jar
java -jar target/test-ec2-aws-0.0.1-SNAPSHOT.jar



# tester la connectivité db mysql
sudo yum install telnet
telnet mysqldb.cpuq86y0a47c.eu-west-3.rds.amazonaws.com 3306

mysql -h mysqldb.cpuq86y0a47c.eu-west-3.rds.amazonaws.com -u root -p


# App run 8080
sudo lsof -i :8080

ajouter dans groupe de securité
TCP
8080
0.0.0.0/0

psql -h postgres.cpuq86y0a47c.eu-west-3.rds.amazonaws.com -U postgres -d postgres

SELECT * FROM `contact_message`;
