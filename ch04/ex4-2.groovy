// 예제 4-2 최적화하지 않은 속도 테스트

def static final TEST_NUMBER_MAX = 5000

@Test
void mashup() {
    println "Test for range 1-${TEST_NUMBER_MAX}"
    print "Non-optimized: "
    start = System.currentTimeMillis()
    (1..TEST_NUMBER_MAX).each {n ->
	if (Classifier.isPerfect(n)) print '!'
	else if (Classifier.isAbundant(n)) print '+'
	else if (Classifier.isDeficient(n)) print '-'
    }
    println "\n\t ${System.currentTimeMillis() - start} ms"
    print "Non-optimized (2nd): "
    start = System.currentTimeMillis()
    (1..TEST_NUMBER_MAX).each {n ->
	if (Classifier.isPerfect(n)) print '!'
	else if (Classifier.isAbundant(n)) print '+'
	else if (Classifier.isDeficient(n)) print '-'
    }
    println "\n\t ${System.currentTimeMillis() - start} ms"
}
