def getListDiff(lst):
    return len(range(min(lst), max(lst))) + 1 - len(lst) if lst else 0

if __name__ == "__main__":

    print(getListDiff([-10,2,3])) # -10 -9 -8 -7 -6 -5 -4 -3 -2 -1 0 1 2 3

'''
[1, 2, 3, 4] => 0
[] => 0
[1] => 0
[6, 3, 1] => 3
[4, 8, 6] => 2
[1, 11, 8, 12] => 8
'''