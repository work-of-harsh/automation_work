step=5
m=step
k=1

def test_leftPyramid():
    step = 5
    k=1
    for i in range(0,step):
        for j in range(0,k):
            print("*", end ="")
        k+=1
        print("")

def test_rightPyramid():
    step = 5
    m = step
    k = 1
    for i in range(0,step):
        for j in range(m-1,0,-1):
            print(" ", end ="")
        m-=1
        for l in range(k):
            print("*", end="")
        k+=1
        print("")

def test_centerPyramid():
    step = 5
    m = step
    k = 1
    for i in range(0, step):
        for i in range(m-1,0,-1):
            print(" ", end="")
        m-=1
        for j in range(0,k):
            print("*",end="")
        k+=2
        print("")
