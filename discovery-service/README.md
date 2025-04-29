### run with local profile
mvn spring-boot:run -P local

mvn spring-boot:run -P localqa

# deploy
cd /home/somch/somch_dev/discovery-service ; \
sudo docker compose -f discovery-docker-compose.yml --profile local down ; \
sudo docker image rm shaiful365/discovery-service-0.0.1 ; \
git pull ; \
mvn clean package -Plocal; \
mvn clean package -Pdev; \
mvn clean package -Pqa; \
sudo docker build -t shaiful365/discovery-service-0.0.1 .  ; \
sudo docker compose -f discovery-docker-compose.yml --profile local up -d 
