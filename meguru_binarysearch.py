#https://qiita.com/drken/items/97e37dd6143e33a64c8c

def is_ok(index, key):
    if a[index] >= key:
        return True
    else:
        return False

#二分探索のテンプレ。左は条件を満たさない。右は条件を満たす。
#右-左が1になれば、そこが答え。
def binary_search(key):
    left = -1 # a[0]が条件を満たすこともある
    right = len(a) # a[len(a)-1]が条件を満たさないこともある

    while right - left > 1:
        mid = left + (right - left) // 2
        
        if is_ok(mid, key):
            right = mid
        else:
            left = mid
    
    return right

if __name__ == "__main__":
    a = [1, 14, 32, 51, 73, 151, 243, 419, 750, 910]
    print(binary_search(51))
    print(binary_search(73))
    print(binary_search(1))
    print(binary_search(911))