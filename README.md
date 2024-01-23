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

## Depliegue en AKS

### Variables de entorno

```bash
export RESOURCE_GROUP=aks-demo-alb-rg
export CLUSTER_NAME=demo
export NAMESPACE=demo2301
```

### Obtener credenciales

```bash
az aks get-credentials --resource-group $RESOURCE_GROUP --name $CLUSTER_NAME
```

### Crear namespace

```bash
kubectl create namespace $NAMESPACE
```

### Desplegar aplicación

```bash
kubectl apply -f k8s/application.yaml -n $NAMESPACE
```

### Obtener IP pública

```bash
export SVC_IP=$(kubectl get svc demo-service -n $NAMESPACE -o jsonpath='{.status.loadBalancer.ingress[0].ip}')
```

### Probar aplicación

```bash
curl http://$SVC_IP/hello
```