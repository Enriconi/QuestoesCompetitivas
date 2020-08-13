while True:
  entrada = input().split()
  a = str(entrada[0])
  b = str(entrada[1])
  
  if (a == "0" and b == "0"):
    break  
  aux = b.replace(a, "")
  
  if (aux == ""):
    print("0")
  else:
    print("%01d" %int(aux))