// 예제 5-4 그루비의 학점 코드 테스트하기

import org.junit.Test
import com.nealford.ft.polydispatch.LetterGrade

import static org.junit.Assert.assertEquals

class LetterGradeTest {
    @Test
    public void test_letter_grades() {
	def lg = new LetterGrade()
	assertEquals("A", lg.gradeFromScore(92))
	assertEquals("B", lg.gradeFromScore(85))
	assertEquals("D", lg.gradeFromScore(65))
	assertEquals("F", lg.gradeFromScore("f"))
    }
}