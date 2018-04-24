subtotal, gratuity_rate = eval(input("Enter the subtotal and a gratuity rate: "))
gratuity = (gratuity_rate * 0.01) * subtotal

print("The gratuity is,", format(gratuity, "10.2f"), "and the subtotal is,", subtotal)
