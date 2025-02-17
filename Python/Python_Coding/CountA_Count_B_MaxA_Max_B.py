CountA=2      #Arbaz hands on practice in tcs
maxA=2
CountB=4
maxB=1


a=CountA
b=CountB
maxa=maxA
maxb=maxB
s=""

if CountB>=CountA:
    while a!=-1:
        if (b>0) & (maxb>0):
            s=s+"B"
        b=b-1
        if (a>0) & (maxa>0):
            s=s+"A"
        a=a-1
    for i in range (1,maxb):
        if b>0:
            s=s+"B"
            b=b-1

if CountB<CountA:
    while b!=-1:
        if (a>0) & (maxa>0):
            s=s+"A"
        a=a-1
        if (b>0) & (maxb>0):
            s=s+"B"
        b=b-1
    for i in range (1,maxa):
        if b>0:
            s=s+"A"
            a=a-1
print(s)
print(len(s))


            
        
