l=int(input('Enter no  of Elements: '))
p=[]
a=[]
for i in range (l) :
    k=int(input('Enter a Elements: '))
    p.append(k)
print(p)

s=int(input('Enter the shift no: '))
for i in range (l) :
    if i+s>=l:
        a.insert(i+s-l,p[i])
    else:
        a.insert(i+s,p[i])
print(a)
for i in range (l) :
    print(a[i], end=' ')

    
