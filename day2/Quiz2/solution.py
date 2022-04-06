import math

def factorial2(num): 
    return math.factorial(num)

def factorial(num):
    if(num > 1):
        return factorial(num-1) * num
    else:
        return 1

if __name__ == "__main__":

    print(factorial2(5))