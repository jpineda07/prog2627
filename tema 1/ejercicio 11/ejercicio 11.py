# Ejercicio 11

cantidad_caramelos=int(input("cuantos caramelos tienes?: "))
cantidad_alumnos=int(input("cuantos alumnos hay?: "))

# Hacemos la division y el resto y ponemos str para poder concatenarlo luego con el texto
caramelos_alumno= str(cantidad_caramelos // cantidad_alumnos)
caramelos_bolsa = str(cantidad_caramelos % cantidad_alumnos)

print("\nCantidad de caramelos: ",cantidad_caramelos,"\nCantidad de alumnos: ",cantidad_alumnos,"\nCada alumno recibe: ",caramelos_alumno,"caramelos\nSobran en la bolsa: ",caramelos_bolsa,"caramelos")
                       
