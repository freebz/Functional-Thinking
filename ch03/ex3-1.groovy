// 예제 3-1 그루비에서 간단한 클로저 바인딩

package com.nealford.ft.simple_closure

class Employee {
    def name, salary
}

def paidMore(amount) {
    return {Employee e -> e.salary > amount}
}

isHighPaid = paidMore(100000)
