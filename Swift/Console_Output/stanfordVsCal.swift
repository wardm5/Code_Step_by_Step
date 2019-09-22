print("Stanford: How many points did they score? ", terminator: "")
let stanford = Int(readLine()!)
print("Cal: How many points did they score? ", terminator:"")
let cal = Int(readLine()!)
if cal! > stanford! {
    print("Cal won!")
} else {
    print("Stanford won!")
}
