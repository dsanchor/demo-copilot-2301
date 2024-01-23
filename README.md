# REST API con Spring Boot

## Compilación

Para compilar el proyecto se debe ejecutar el siguiente comando:

```bash
mvn clean package
```

## Ejecución

Para ejecutar el proyecto se debe ejecutar el siguiente comando:

```bash
mvn spring-boot:run
```

## Test hello con curl

Para probar el proyecto se debe ejecutar el siguiente comando:

```bash
curl http://localhost:8080/hello
```

## Test reverse con curl

Para probar el proyecto se debe ejecutar el siguiente comando:

```bash
curl http://localhost:8080/reverse?input=hello
```

## Test remove-vowels con curl

Para probar el proyecto se debe ejecutar el siguiente comando:

```bash
curl http://localhost:8080/removeVowels?input=hello
```

## Ejecutar test unitarios

Para ejecutar los test unitarios se debe ejecutar el siguiente comando:

```bash
mvn test
```

## Dockerización

Para crear la imagen de docker se debe ejecutar el siguiente comando:

```bash
docker build -t demo2301 .
```

Para ejecutar la imagen de docker se debe ejecutar el siguiente comando:

```bash
docker run -p 8080:8080 demo2301
```

