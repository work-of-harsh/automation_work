#https://prepinsta.com/tcs-digital/coding-question/
#Question4

a=int(input('Enter Lower no: '))
b=int(input('Enter Upper no: '))

c=int(input('Enter Number of Digits '))
k=c
b1=0
Fac=1

def Factorial(p):
    fac=1
    if p>1: 
        for i in range(1,p+1):
        
            fac=fac*i
    x=fac
    return x
for m in range(a,b+1):
    v=(m*c)%2
    if v==0:
        b1+=1
        if m==b:
            break
    
    
        
        
    
    for i in range(m+1,b+1):
        for y in range(1,c):
            sum= m*y+i*(c-y)
            if sum%2==0:
                b1=int(b1+Factorial(c)/(Factorial(y)*Factorial(c-y)))

print(b1)
        
