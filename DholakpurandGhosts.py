for _ in range(int(input())):
    n,b=[int(i) for i in input().split()]
    p=[int(i) for i in input().split()]
    count=0
    if b%2==0:
        for a in p:
            if a%2==0:
                count+=1
    else:
        for a in p:
            if a%2!=0:
                count+=1
    if count>=n/2:
        print("Yes")
    else:
        print("No")
