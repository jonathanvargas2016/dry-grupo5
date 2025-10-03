# Presentación de Equipo

## Nombre del equipo: Grupo5

## Integrantes:
1. Kevin Maxi
2. Marco Zaragocin
3. Jonathan Vargas

## Descripción breve del enfoque para resolver el reto DRY:

Revisamos cada archivo y encontramos clases con logica repetida y se enfoco en realizar una abstraccion para mejorar el codigo. Luego se crearon paquetes y se modificaron los nombres de los archivos para ubicarlos en cada paquete correspondiente.

## Código refactorizado:
https://github.com/jonathanvargas2016/dry-grupo5

## Antes y después:

- NotificationServiceImpl: Método privado reutilizable para validación
- OrderService: Método privado que centraliza la lógica
- UserManagerServiceImpl: creacion del Método isInvalid de validación reutilizable. Método privado processUser que centraliza la lógica
- ReportGenerator: Método genérico generateReport usando generics para reutilizar código.
- ProductService: reduccion de codigo repetido a un solo metodo con un nombre mas general
- EmployeePayroll: Un solo método processPayroll que acepta un parámetro Boolean isAnnualPayroll para manejar ambos casos.

## Aprendizajes principales:
Aprendimos sobre: 
 - métodos genéricos
 - reutilizacion de código
 - abstracción de código
 - ubicacion de archivos segun su funcionalidad
 - El código refactorizado es más mantenible, legible y extensible, cumpliendo efectivamente con los objetivos del principio DRY. La reducción de duplicación de código y la mejor organización estructural hacen que este proyecto sea un ejemplo exitoso de aplicación de buenas prácticas de programación.