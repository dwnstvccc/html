---

title: "Programa libreria"
author: "Leidy Catherine Barbosa"
date: "20/06/2023"

---
## Proyecto libreria  
- Como programador de software, se te ha asignado el desarrollo de una aplicación para una librería. La librería necesita un sistema de gestión que permita calcular la cantidad total de libros prestados a distintos clientes durante un pediodo de tiempo determinado. Ademas, se requiere generar un informe  de libros prestados por todos los clientes en ese mismo período de tiempo. Para llevar a cabo esta tarea, se debe registrar la siguiente información básica de cada cliente: número de identificación, nombre y direccion de residencia.  
### Historia de usuario 
![Texto alternativo](C:\Users\cathe\OneDrive\Imágenes\Capturas de pantalla/imagen7.png)

![Texto alternativo](C:\Users\cathe\OneDrive\Imágenes\Capturas de pantalla/imagen2.png)
### Aproximacion Caso de uso 
![Texto alternativo](C:\Users\cathe\OneDrive\Imágenes/imagen8.png) 
### Aproximacion Diagrama de flujo 
![Texto alternativo](C:\Users\cathe\OneDrive\Imágenes/imagen9.png)
### Aproximacion Speudocodigo
**Algoritmo** Libreria
    Caracteres: id [30], nombres [30], direcciones[30], clientes [30]
    Real: cantidadUno [30], cantidadDos [30], cantidadTres [30]
    Caracteres: identificacion, nombre, direccion
    Entero: numeroclientes, i
    Real: cantidad1, cantidad2, cantidad3, promedio <- 0
    Imprimir: "Ingrese  el número de clientes: "
    Asignar: numeroClientes
    Para i=0 hasta numeroclientes - 1, 1
    Imprimir: "Ingrese la identificación del cliente:"
    Asignar: identificacion
	Imprimir: "Ingrese el nombre del cliente:"
	Asignar: nombre
	Imprimir: "Ingrese la direccion de residencia del cliente:"
	Asignar: direccion
	Imprimir: "Ingrese la cantidad 1 del cliente:"
	Asignar: cantidad1
	Imprimir: "Ingrese la cantidad 2 del cliente:"
	Asignar: cantidad2
	Imprimir: "Ingrese la cantidad 3 del cliente:"
	Asignar: cantidad3
	id[i] <- identificacion
	nombres [i] <- nombre
	direcciones [i] <- direccion
	cantidadUno[i] <- cantidad1
	cantidadDos[i] <- cantidad2
	cantidadTres[i] <- cantidad3
	finPara
	Para i=0 hasta numeroClientes -1, 1
	promedio <-
	promedio +((cantidadUno[i]+cantidadDos[i]+cantidadTres[i])/3)numeroclientes
	finPara
	Imprimir: "El promedio es:" + promedio	
**FinAlgoritmo**











