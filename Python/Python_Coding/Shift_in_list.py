a=[1,2,3,4,5]
k=3  #shift by 3 spaces


for i in range(0,k):
    b = []
    b.insert(0, a[4])
    for j in range(0,len(a)-1):
        b.insert(j+1,a[j])
    a=b

print(b)
