# Unidad 0 - Repaso Arreglos y Matrices

## Required

* jdk 1.8+
* Maven - https://maven.apache.org/
* Install maven wrapper: `mvn -N io.takari:maven:wrapper`

## Build and Run

```sh
# If you have maven
mvn clean package 

# With maven wrapper
./mvnw clean package 

java -cp target/unidad0-1.0.0.jar edu.pab.unidad0.Pagos
java -cp target/unidad0-1.0.0.jar edu.pab.unidad0.PowerNumbers
```

## Ejercicio 1 - Arreglos Unidimensionales

Actividad: Control de pagos

Crear una clase Pagos que tenga un vector donde se almacenaran los pagos realizados durante el año del servicio de agua.

**Nota**. Considerar que el tamaño del vector debe corresponder a la cantidad de meses que llevamos del año, vencidos.

La clase debe tener:
* Un método que calcule el pago promedio de servicio de agua y lo devuelva
* Un método que muestre el més con menor consumo. 
* Un método que muestre el mes con mayor consumo

## Ejercicio 2 - Arreglos Bidimensionales
* Crear una clase pontencias, con una matriz de dos dimensiones de 5x6.
* Crear un método que llene la primera columna de la matriz con números enteros randoms.
* Crear un método que genere a partir de los números random, en la fila correspondiente su potencia hasta llegar a la cantidad de columnas.