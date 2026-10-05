# Ejercicio 13

name=input("Como te llamas?: ")
producto=input("que pediste?: ")
precio=float(input("cuantos vale cada uno?: "))
unidades=int(input("cuantos pediste?: "))
propina=input("Desea deja una propina de 2 Euros?(si/no): ")


propina=((propina=="si")*2)


subtotal = (precio * unidades)

iva = subtotal * 0.21

total = (subtotal + iva + propina)

vip=(bool(total > 30))

unidad=str(unidades)
subtotal_=str(subtotal)
IVA=str(iva)
Total=str(total)
VIP=str(vip)

print("=======================\nTique de cafeteria\n=======================\nCliente: "+name+"\nProducto: "+producto+" x "+unidad+"\n----------------------\n\nSubtotal: "+subtotal_+" euros\nIVA(21%): "+IVA+ " euros\nTotal a pagar: "+Total+"\n\n----------------------\n\nsupera el umbral VIP(>30euros)?: "+VIP+"\n=======================")

