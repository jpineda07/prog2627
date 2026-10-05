# Ejercicio 13

name=input("Como te llamas?: ")
producto=input("que pediste?: ")
precio=float(input("cuantos vale cada uno?: "))
unidades=int(input("cuantos pediste?: "))
propina=input("Desea deja una propina de 2 Euros?(si/no): ")


propina=str((propina=="si")*2)


subtotal = (precio * unidades)

iva = subtotal * 0.21

total = (subtotal + iva + propina)

vip=(bool(total > 30))

print("=======================\nTique de cafeteria\n=======================\nCliente: "+name+"\nProducto: "+producto+"x"+unidades+"\n----------------------\n\nSubtotal: "+subtotal+" euros\nIVA(21%): "+iva+ "euros\nTotal a pagar: "+total+"\n\n----------------------\n\nsupera el umbral VIP(>30euros)?: "+vip+"\n=======================")

print(total)
print(propina)
print(iva)
print(vip)
