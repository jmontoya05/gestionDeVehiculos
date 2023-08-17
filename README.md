# Ejercicio: Sistema de Gestión de Vehículos
Imagina que estás desarrollando un sistema de ges1ón de vehículos que debe manejar
diferentes 1pos de vehículos, como automóviles y motocicletas. Los vehículos 1enen
caracterís1cas comunes como número de ruedas, marca y modelo, pero también 1enen
propiedades específicas.
Define una clase base llamada Vehiculo que tenga los siguientes atributos y métodos:
Atributos: ruedas, marca, modelo
Método: obtener_informacion() que imprime la información básica del vehículo.
Crea dos clases derivadas de Vehiculo:
a. Automovil:
Atributos adicionales: numero_puertas, 1po_combus1ble
Método: obtener_informacion() que llama al método base y luego muestra la información
específica del automóvil.
b. Motocicleta:
Atributos adicionales: cilindrada, 1po_manejo
Método: obtener_informacion() que llama al método base y luego muestra la información
específica de la motocicleta.
Define una interfaz llamada Conducible con el método conducir().
Implementa la interfaz Conducible en las clases Automovil y Motocicleta. En el método
conducir(), simplemente imprime un mensaje genérico indicando que el vehículo se encuentra
en movimiento.
Crea una clase llamada Propietario con los siguientes atributos y métodos:
Atributos: nombre, apellido, vehiculo (de 1po Vehiculo)
Método: mostrar_informacion() que imprime los detalles del propietario y su vehículo.
Crea instancias de diferentes 1pos de vehículos (automóviles y motocicletas) y asigna
propietarios a cada uno. Luego, muestra la información de los propietarios y sus vehículos.


![Gestion de vehiculos](https://i.ibb.co/sQ84HHj/Gestion-de-vehiculos.png)
