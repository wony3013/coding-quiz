def repeatStr(cnt, src):
    result = ""

    for i in range(cnt):
        result += src

    return result
 


if __name__ == "__main__":
    result = repeatStr(10, 'HI_')
    print(result)