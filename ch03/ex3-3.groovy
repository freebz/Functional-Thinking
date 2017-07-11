// 예제 3-3 또 다른 클로저 바인딩

isHigherPaid = paidMore(200000)
println isHigherPaid(Smithers)
println isHigherPaid(Homer)
def Burns = new Employee(name:"Monty", salary:1000000)
print isHigherPaid(Burns)
// false, false, true
