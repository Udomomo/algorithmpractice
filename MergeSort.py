import sys
sys.setrecursionlimit(10000)

def mergesort(rawlist):
    length = len(rawlist)
    
    leftlength = length // 2

    if leftlength >= 1:
        leftlist = mergesort(rawlist[:leftlength])
        rightlist = mergesort(rawlist[leftlength:])

    else:
        leftlist = []
        rightlist = rawlist

    mergedlist = merge(leftlist, rightlist)
    return mergedlist

def merge(leftlist, rightlist):
    mergedlist = []
    i, j = 0, 0
    while i < len(leftlist) and j < len(rightlist):
        if leftlist[i] <= rightlist[j]:
            mergedlist.append(leftlist[i])
            i += 1
        else:
            mergedlist.append(rightlist[j])
            j += 1
    
    if i == len(leftlist):
        mergedlist += rightlist[j:]
    else:
        mergedlist += leftlist[i:]

    return mergedlist

if __name__ == "__main__":
    rawlist = ["m", "e", "r", "g", "e", "s", "o", "r", "t"]
    print(mergesort(rawlist))
