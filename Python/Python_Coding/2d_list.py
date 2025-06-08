
a=[[1,2,3],[1,22,0],[0,-1,9]]
k=a[0][0]
l=0
for i in range (len(a)):
    for j in range(len(a[i])):
        if a[i][j] >=k:
            l=k
            k=a[i][j]
            a[i][j]=l
            row=i
            col=j

for i in range (len(a[1])):
    if a[row][i]<=k:
        l=k
        k=a[row][i]

print(k)