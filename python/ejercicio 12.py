# Ejercicio 12

edad=int(input("Introduca su edad: "))
estudiante=(input("¿Es estudiante?: ")
compra=float(input("Introduzca el precio de la compra: "))

es_estudiante = estudiante=="si"


descuento=(es_estudiante and compra>=50 )or edad>=65
      

print("\nEdad: ",edad,"\n¿Es estudiante?(si/no): ",es_estudiante,"\nMonto de compra: ",compra,"\nAplica descuento?: ",descuento)
  
 
