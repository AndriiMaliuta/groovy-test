
def list1 = [1, 2, 3, 4, 5]

list1.add(6);
list1 << 7

println(list1)

def list2 = new ArrayList(list1)

println(list2)

def list3 = list1.clone()
println(list3[2])
println(list3.get(2))

list2.each {println(it)}