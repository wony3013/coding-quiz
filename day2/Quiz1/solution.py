# maxDiff([1, 2, 3, 4]);    //return 3, because 4 - 1 == 3
# maxDiff([1, 2, 3, -4]);   //return 7, because 3 - (-4) == 7
# maxDiff([ 1, 2, 3, 4, 5, 5, 4]) // return 4
# maxDiff([-4, -5, -3, -1, -31])  // return 30
# maxDiff([1000000])  // return 0
# maxDiff([])         // return 0

def maxDiff(lst):
    
    return max(lst) - min(lst) if lst else 0

def maxDiff_old(lst):

    if len(lst) == 0:
        lst = [0]
    return max(lst) - min(lst)

if __name__ == "__main__":
    lst = []

    print(maxDiff(lst))