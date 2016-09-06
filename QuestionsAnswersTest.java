/*
 * Araceli Gopar
 * QuestionsAnswersTest.java
 * Description: Write a class that sets up a map of questions and answers
 * 				and test it with a unit test class. 				
 */

import static org.junit.Assert.*;

import org.junit.Test;



public class QuestionsAnswersTest {
	
	QuestionsAnswers testQuestion = new QuestionsAnswers();
	
	@Test
	
	public void testAnswers() {
		//System.out.println(testQuestion.getRandomQuestion());
		
		assertEquals(false, testQuestion.testAnswer("What does HTML stand for?", "Hypertext Markup Language"));
		testQuestion.put("What does HTML stand for?", "Hypertext Markup Language");
		assertEquals(true, testQuestion.testAnswer("What does HTML stand for?", "Hypertext Markup Language"));
	}
	
	@Test
	public void testRandom(){
		
		
		String test1 = testQuestion.getRandomQuestion();
		assertEquals("Empty", test1);
		
		testQuestion.put("What does HTML stand for?", "Hypertext Markup Language");
		String test2 = testQuestion.getRandomQuestion();
	
		assertNotEquals("Empty", test2);
		assertEquals("Hypertext Markup Language", test2);
	}

}
