def numPrimorial(num):
    x = 2
    result = 1
    if num < 2:
        return 0
    for i in range(num):
        y = 2
        while i < num:
            if x % y == 0:
                if x == y:
                    print(x)
                    result = result * x
                    x += 1
                    break
                else:
                    x += 1
            else:
                y += 1
    return result

if __name__ == "__main__":

    print(numPrimorial(10))