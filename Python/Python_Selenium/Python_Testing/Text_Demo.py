file = open('Text_Demo.txt')

print(file.read())     #reads all content
print(file.read(5))     #reads n number of characters from the cursor position
file.close()

with open('Text_Demo.txt',"r") as file:        #no need to use file.close()  # "r" stands for read mode

    file = open('Text_Demo.txt')
print(file.read(5))
file.close()

file = open('Text_Demo.txt')
print(file.readline())

file.close()

#printing line by line
file = open('Text_Demo.txt')

line = file.readline()
while line != "":
    print(line)
    line = file.readline()

file.close()

file = open('Text_Demo.txt')
line= file.readlines()
print(line)
print(line[0])

file.close()


