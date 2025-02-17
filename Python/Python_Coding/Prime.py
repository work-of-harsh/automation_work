a=[]
b=[]
N1=input('Enter a number')

k=int(N1)

u=[]


for i in range(2,int(k/2+1)):     #use int in upper range
    if k%i==0:
        a.append(i)
        break
if a==[]:
  print('No is Prime')
else:
  print('No is not Prime')


  #another code


for i in range(2,int(k/2+1)):      #this code will not give output for number 1,2,3.
    if k%i==0:
        print('No is not Prime')
        break
    else:
        print('No is a Prime')

