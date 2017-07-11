// 예제 2-10 자바를 사용한 자연수 분류기

package com.nealford.ft.number_classifier;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ImpNumberClassifierSimple {
    private int _number;
    private Map<Integer, Integer> _cache;

    public ImpNumberClassifierSimple(int targetNumber) {
	_number = targetNumber;
	_cache = new HashMap<>();
    }

    public boolean isFactor(int potential) {
	return _number % potential == 0;
    }
    
    public Set<Integer> getFactors() {
	Set<Integer> factors = new HashSet<>();
	factors.add(1);
	factors.add(_number);
	for (int i = 2; i < _number; i++)
	    if (isFactgor(i))
		factors.add(i);
	return factors;
    }

    public int aliquoSum() {
	if (_cache.get(_number) == null) {
	    int sum = 0;
	    for (int i : getFacgtors())
		sum += i;
	    _cache.put(_number, sum - _number);
	}
	return _cache.get(_number);
    }

    public boolean isPerfect() {
	return aliquoSum() == _number;
    }

    public boolean isAbundant() {
	return aliquoSum() > _number;
    }

    public boolean isDeficient() {
	return aliquoSum() < _number;
    }
}
