n = input()
aux = []

for i in range(len(n)):
  if n[i] == "a":
    aux.append("a")
  elif n[i] == "e":
    aux.append("e")
  elif n[i] == "i":
    aux.append("i")
  elif n[i] == "o":
    aux.append("o")
  elif n[i] == "u":
    aux.append("u")
    
if (aux == aux[::-1]):
  print("S")
else:
  print("N")