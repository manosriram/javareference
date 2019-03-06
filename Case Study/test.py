ib = []
while True:
    s = input()
    # print(s)
    lib.append(s)
    if s == "EndOfInput":
        break
for i in range(len(lib)):
    if(lib[i] == "Books"):
        b = i+1
    if(lib[i] == "Borrowers"):
        bo = i+1
    if(lib[i] == "Checkouts"):
        ch = i+1
book = []
for i in range(b, bo-1):
    book.append(lib[i])
print(book)
borow = []
for i in range(bo, ch-1):
    borow.append(lib[i])
print(borow)
check = []
c = []
for i in range(ch, len(lib)-1):
    check.append(lib[i])
print(check)
dat = []
for i in range(len(check)):
    x = check[i]
    c.append(0)
    dat.append(x[16:])
dat = sorted(dat)
print(dat)
stid = []
ind = []
j = 0
while j < len(check):
    for i in range(len(check)):
        x = check[i]
        if(dat[j] == x[16:]):
            if(c[i] == 0):
                j = j+1
                stid.append(x[0:7])
                c[i] = 1
            break
print(stid)
