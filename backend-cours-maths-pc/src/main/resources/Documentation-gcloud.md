sudo apt install openjdk-17-jdk
# mettre à jour les paquets existants
sudo apt update
sudo apt install git
sudo apt install maven
git clone https://github.com/mboup1/projet-cours-maths-pc-spring-boot-angular

cd projet-cours-maths-pc-spring-boot-angular
cd backend-cours-maths-pc

#Deploy app spring boot
./mvnw clean package -DskipTests
(si app  deja builder utiliser chmod +x mvnw)
java -jar target/backend-cours-maths-pc-0.0.1-SNAPSHOT.jar

# delete depot vm
rm -rf ~/projet-cours-maths-pc-spring-boot-angular

Pull
cd ~/projet-cours-maths-pc-spring-boot-angular/backend-cours-maths-pc
git pull origin main
cat src/main/resources/application.properties

cat src/main/java/com/dame/backend_cours_maths_pc/Config/CorsConfig.java
cat src/main/java/com/dame/backend_cours_maths_pc/controller/ContactMessageController.java
# Frontend angular

1. Téléchargez et installez nvm. Exécutez la commande suivante dans votre terminal :
curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.5/install.sh | bash

2. Activez nvm
echo "export NVM_DIR=\"$HOME/.nvm\"" >> ~/.bashrc
echo "[ -s \"$NVM_DIR/nvm.sh\" ] && \. \"$NVM_DIR/nvm.sh\"" >> ~/.bashrc
source ~/.bashrc

command -v nvm

nvm install node

node -v
npm -v

cd ~/projet-cours-maths-pc-spring-boot-angular/frontend-cours-maths-pc-angular
npm install --legacy-peer-deps

npm start

cat contact/contact.component.ts



# env
mkdir src/environments
echo "export const environment = { };" > environment.prod.ts

cat src/environments/environment.prod.ts
npm run build -- --configuration=production

npm install -g http-server
cd dist/frontend-cours-maths-pc-angular
http-server -p 4200 -o