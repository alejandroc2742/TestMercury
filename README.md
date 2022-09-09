# MercuryTest

Prueba técnica para nuevos ingenieros Mercury. Este proyecto usa Lombok, por lo cual se recomienda descargar el jar de lombok e instalarlo en el IDE en el que se presentará la prueba.

## Instalación

clonar el repositorio 
```
https://github.com/alejandroc2742/TestMercury.git
```
Realizar una instalación limpia
```
mvn clean install
```
los servicios actuales para creación y consulta de de canciones se encuentran publicados en 
```
http://localhost:9090/addSong
```
Se pueden añadir canciones con el JSON 
```
{
	"nameSong":"Porfiado - Cuando sea grande",
	"artist":"cuarteto de nos",
	"releaseYear":"1989"
}
```
Para recuperar una canción ejecutaremos
```
http://localhost:9090/getSong/{id} donde {id} es un entero correspondiente al id de la canción a recuperar
```

El proyecto se debe importar como un proyecto maven y una vez levantado se podrá ingresar a su base de datos con los datos de conexión del application.properties en la ruta

```
http://localhost:9090/h2-console/login.jsp
```
