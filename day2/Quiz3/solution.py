def rowWeights(arr):
    return (sum(arr[0::2]),sum(arr[1::2]))


if __name__ == "__main__":

    print(rowWeights([80]))