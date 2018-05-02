def mergesort(rawlist):
    length = len(rawlist)
    
    leftlength = length // 2

    if left_length >= 1:
        leftlist = rawlist[:left_length+1]
        rightlist = rawlist[leftlength+1:]
        mergesort(leftlist)
        mergesort(rightlist)

    else:
        leftlist = []
        rightlist = rawlist

    merge(leftlist, rightlist)


if __name__ == "__main__":
    mergesort(rawlist)
