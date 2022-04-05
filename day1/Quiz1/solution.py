def tripleTrouble(fst, snd, trd):
    result = ""

    for i, j, k in zip(fst, snd, trd):
        result = result + i + j + k 

 
    return result



if __name__ == "__main__":
    result = tripleTrouble("LLh","euo","xtr")
    print(result)
    

