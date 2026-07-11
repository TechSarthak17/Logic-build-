# Find out even or odd 

try :
    A = int (input ("Enter your number for checck it is even or odd "))
    
    if (A%2 ==0):
     print ("It is even number")
    elif(A%2 != 0 ):
     print ("This is odd number")
    else:
     print ("This is invalid input")

except ValueError :
     print ("Invalid input")