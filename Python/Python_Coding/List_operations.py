a="Hi my name is Thug"

print(a[1:10:2])   #2 is step, eg of list slicing
print(a[::-1])  #reverse
print(a.find("my"))           #prints starting index
print(a.count("i"))          #number of i in the string
print(a.replace("Thug","Harsh"))     #print(a.replace("old","new"))
print(a.upper())
print(a.lower())
print(a.title())      #first letter capital

b= [1,2,3,'hi','me']
b.append(6)
b.remove("hi")    #delete by value
b.remove("me")
del(b[1])           #delete by index
print(b)
b.reverse()
# b.clear()            #empty the list
print(max(b))
print(min(b))
b.insert(1,56)


print(b)
b.sort()
print(b)

a=[1,3,2,4]
a.pop(1)   #1 is index
print(a)