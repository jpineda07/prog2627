# Ejercicio 9

nombre=(input("como te llamas?: "))
año_nacimiento=(input("en que año naciste?: "))
altura=(input("cuanto mides?(cm): "))

# Convertimos el año de nacimiento a tipo entero para hacer los calculos de la edad actual y la edad actual la pasamos a tipo string para concatenarla con el texto.

añoN=2026-int(año_nacimiento)
edad_ahora=str(añoN)

# Convertimos la altura a tipo float para hacer los calculos y pasarla de centimetros a metros y la altura en metros la pasamos a tipo string para concatenarla con el texto.

alturaM=float(altura)/100
altura_metros=str(alturaM)

# Convertimos la funcion type de cada dato a tipo string para poder concatenarla con el texto.

tipo_nombre=str(type(nombre))
tipo_edad=str(type(añoN))
tipo_altura=str(type(alturaM))
       
# el uso de "\n" nos hace un cambio de linea y nos ahorra el uso de varios print.

print("\n---FICHA REGISTRADA---\nNombre: " + nombre + " (Tipo: " + tipo_nombre + ")\nEdad: " + edad_ahora + " años" + " (Tipo: " + tipo_edad + ")\nAltura: "+ altura_metros + " m." + " (Tipo: " + tipo_altura + ")")
