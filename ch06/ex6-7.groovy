// 예제 6-7 컴퓨터 종류를 모델링한 간단한 클래스

package com.nealford.ft.flyweight

class Computer {
    def type
    def cpu
    def memory
    def hardDrive
    def cd
}

class Desktop extends Computer {
    def driveBays
    def fanWattage
    def videoCard
}

class Laptop extends Computer {
    def usbPorts
    def dockingBay
}

class AssignedComputer {
    def computerType
    def userId

    public AssignedComputer(cimputerType, userId) {
	this.computerType = computerType
	this.userId = userId
    }
}
