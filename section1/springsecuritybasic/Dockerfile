# Use a imagem base do OpenJDK 17
FROM openjdk:17-jdk-alpine

# Diretório de trabalho dentro do contêiner
WORKDIR /app

# Copie o arquivo JAR da sua aplicação Spring Boot para o contêiner
COPY target/*.jar /app/app.jar


# Porta em que a aplicação Spring Boot estará escutando (ajuste conforme sua aplicação)
EXPOSE 8081

# Comando para iniciar a aplicação Spring Boot
CMD ["java", "-jar", "app.jar"]
