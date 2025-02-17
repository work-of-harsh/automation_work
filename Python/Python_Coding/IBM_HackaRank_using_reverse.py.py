b=0
numSeq=[4,3,2,1]
t=[]
t=numSeq
d=0
c=[]

e=0
k=[]
    
while len(t)!=0:
    e=t[0]
    b=b+t[0]
    t.pop(0)    #deletes particular index
    a=len(t)
    if e%2==0:
        t.reverse()
        
    
    if len(t)!=0:
        e=t[0]
        d=d+t[0]
        t.pop(0)
        a=len(t)
        if e%2==0:
            t.reverse()
print(b-d)
