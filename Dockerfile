# Stage de construction (build)
########################################################################################

# Utilisons une image de base qui a Maven installé
FROM maven:3.8.4-jdk-21 AS build


RUN echo "00000000 00000000 00000000 Message à afficher 00000000 00000000 00000000 00000000 00000000 "
#RUN printf "Message avec formatage possible\n"
#RUN echo "Utilisateur actuel: $(whoami)"
#RUN apt-get update && apt-get install -y nginx && echo "Version de Nginx installée: $(nginx -v 2>&1 | grep -oP '(?<=nginx/)\d+\.\d+\.\d+')"




#### #### #### #### #### #### #### #### #### #### #### #### #### #### ####






# Stage final (execution)
########################################################################################

#FROM eclipse-temurin:21-jre (voir : Dockerfile-ZeModel)

# Utiliser une image de base. Par exemple, nous utilisons ici une image Ubuntu légère.
FROM ubuntu:latest
FROM ubuntu

# S'exécute au moment de la construction de l'image.
RUN echo "export TERM=xterm" >> /etc/bash.bashrc

# Mettre à jour les paquets et installer les outils nécessaires si besoin (optionnel pour cet exemple)
# S'exécute au moment de la construction de l'image.
RUN apt-get update && apt-get install -y

# Créer le répertoire /app dans l'image
# S'exécute au moment de la construction de l'image.
RUN mkdir -p /app

# Copier un fichier spécifique du répertoire courant vers /app dans l'image
COPY mon-fichier.txt /app

### junk
COPY ./shell/entrypoint.sh /app
#ENTRYPOINT ["/entrypoint.sh"]
###

# Copier le script dans l'image
COPY ./shell/hello_world.sh /app
COPY ./shell/hello_world_callee.sh /app
# S'exécute au moment de la construction de l'image.
RUN chmod +x /app/*.sh

# Commande par défaut à exécuter quand le conteneur démarre (optionnel, pour cet exemple)
#CMD ["echo", "Conteneur Docker avec copie de fichier terminé."]
CMD ["/app/hello_world.sh"]

# Objectif : RUN est pour l'installation de logiciels, la configuration de
#l'environnement de l'image, tandis que ENTRYPOINT est pour spécifier comment le
#conteneur doit fonctionner quand il est démarré.

# S'exécute au démarrage du conteneur.
# ENTRYPOINT
