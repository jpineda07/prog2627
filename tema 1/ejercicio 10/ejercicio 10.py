# Ejercicio 10

# Pedimos los celsius y los pasamos a tipo float para poder hacer la formula para pasarlo a fahrenheit.

celsius=(input("Ingrese la temperatura en C: "))
C=float(celsius)

# Una vez transformado los celcius a tipo float hacemos la cuenta y pasamos los fahrenheit a tipo str para poder concattenarlo con texto.

fahrenheit= (C *  9/5) +32
F=str(fahrenheit)

print(celsius + "°C equivalen a " +F +"°F")
