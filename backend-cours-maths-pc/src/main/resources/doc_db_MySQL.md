gcloud sql connect mysqldb --user=root

show databases;
use users_gcloud_db; 

CREATE TABLE contact_message (
id BIGINT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(255) NOT NULL,
email VARCHAR(255) NOT NULL,
phone VARCHAR(20),
message TEXT
);


show tables;

INSERT INTO contact_message (name, email, phone, message)
VALUES ('John Doe', 'john.doe@example.com', '1234567890', 'Hello, I need help with math lessons.');

INSERT INTO contact_message (name, email, phone, message)
VALUES ('Jane Smith', 'jane.smith@example.com', '0987654321', 'Hi, I am interested in physics lessons.');


SELECT * FROM `contact_message`;


Installation du client MySQL sur ton instance
sudo apt update
sudo apt install mysql-client
mysql --version
# Test connexion db

sudo apt-get install default-mysql-client
sudo apt-get install default-mysql-client
mysql -h ip -u root -p


