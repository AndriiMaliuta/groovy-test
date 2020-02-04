def map1 = [name : 'Vasyl', age : 45, address : 'Some street, 67']

println(map1)

println(map1.name)
println(map1.get('name'))
println(map1['name'])
println(map1[0])

map1.foo = 5

println(map1)

def map2 = [1 : 'a',
       (true) : 'p',
       (false): 'q',
       (null) : 'x',
       'null' : 'z']

println(map2)

map2.each { entry ->
    println "$entry.key : $entry.value"
}

map2.eachWithIndex { entry, i ->
    println "$i -- $entry.key -- $entry.value"
}