a=[]
b=[]
N1=input('Enter a number')
k=int(N1)

u=[]
i=1

if (k%100==0) and (k%400)==0:     # "|" can be used as or
    print('Leap year')
elif (k%4==0) & (k%100!=0):
    print('Leap year')
else:
    print('Not Leap year')
