package ffb.quizsite.quizEngine.questions;

import java.util.List;

public interface QuestionService {

  /**
   * Get a single question using its ID
   * @param id id of the questions
   * @return the question with matching id
   */
  Question getQuestionById(Long id);

  /**
   * Get all of the saved questions
   * @return a List of all questions
   */
  List<Question> getAllQuestions();

  /**
   * Saves a new Question
   * @param question the Question to save
   * @return the saved Question
   */
  Question createNewQuestion(Question question);

  /**
   * Selects a Question by id, then updates it with given Question
   * @param id id of the Question to update
   * @param question Question containing updated information
   * @return the newly updated Question
   */
  Question updateQuestionById(Long id, Question question);

  /**
   * Deletes the Question matching the provided id
   * @param id id of the Question to delete
   */
  void deleteQuestionById(Long id);
}
