// 예제 5-10 그루비의 복소수

package com.nealford.ft.complexnums

class ComplexNumber {
    def real, imaginary

    public ComplexNumber(real, imaginary) {
	this.real = real
	this.imaginary = imaginary
    }

    def plus(rhs) {
	new ComplexNumber(this.real + rhs.real, this.imaginary + rhs.imaginary)
    }
    // formula: (x + yi)(u + vi) = (xu - yv) + (xv + yu)i.
    def multiply(rhs) {
	new ComplexNumber(
	    real * rhs.real - imaginary * rhs.imaginary,
	    real * rhs.imaginary + imaginary * rhs.real)
    }
	
    def String toString() {
	real.toString() + ((imaginary < 0 ? "" : "+") + imaginary + "i").toString()
    }
}
