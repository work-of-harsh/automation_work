b=0
numSeq=[4,3,2,1]
t=[]
t=numSeq
d=0
c=[]
e=0
k=[]

while len(t)!=0:
    
        e=int(t[0])
        b=b+t[0]
        t.pop(0)
        a=len(t)
        k=[]
        if (e%2==0) & (a!=0):
             for i in range (a):
                k.append(t[a-i-1])
             t=k
   
        

        e=int(t[0])
        d=d+t[0]
        t.pop(0)
        a=len(t)
        k=[]
        if (e%2==0) & (a!=0):
            for h in range (a):
                k.append(t[a-h-1])
            t=k
print(b-d)
            
    
