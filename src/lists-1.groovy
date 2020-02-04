
def list = [9, 4, 2, 10, 5]

println(list.max() == 10)
println list.min() == 2

list2 = list - 4

println(list2)

def list3 = ['asd', 'adsasdasd', 'd', 'dd']

list3.sort{it.size()}
Collections.sort(list3)

println(list3)