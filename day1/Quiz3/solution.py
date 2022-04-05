#"1234"  // true
#"12345" // false
#"a234"  // false
#"0000"    // true
#"1111"    // true
#"123456"  // true
#"098765"  // true
#"000000"  // true
#"090909"  // true

import re 

def pinChk(pinNum):
    strChk = re.sub('[0-9]','',pinNum)
    numChk = re.sub('[^0-9]','',pinNum)
    print(strChk)
    if len(strChk) == 0 and (len(numChk) == 4 or len(numChk) == 6):
        return True

    return False

if __name__ == "__main__":
    result = pinChk('023451')
    print(result)