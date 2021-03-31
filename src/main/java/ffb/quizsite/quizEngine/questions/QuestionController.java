package ffb.quizsite.quizEngine.questions;

import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/questions")
public class QuestionController {

  /**
   * Gets a question by ID
   *
   * @param id the ID of the question
   * @return a ResponseEntity containing the Question, or throws a 404 error
   */
  @GetMapping("/{id}")
  public ResponseEntity<Question> getQuestionById(Long id) {
    return null;
  }

  /**
   * Get all of the available Questions
   *
   * @return a ResponseEntity containing a List of all the questions
   */
  @GetMapping("/")
  public ResponseEntity<List<Question>> getAllQuestions() {
    return null;
  }

  /**
   * Adds a new Question to the database
   *
   * @param question the Question to be added
   * @return a ResponseEntity containing the newly added Question
   */
  @PostMapping(value = "/", consumes = "application/json", produces = "application/json")
  public ResponseEntity<Question> createNewQuestion(@RequestBody Question question) {
    return null;
  }

  /**
   * Retrieves a Question by ID and then updates that question
   *
   * @param id Id of the Question to retrieve
   * @param question the Question with the updated information
   * @return a ResponseEntity containing the updated Question
   */
  @PutMapping(value = "/{id}", consumes = "application/json")
  public ResponseEntity<Question> updateQuestionById(@PathVariable Long id, @RequestBody Question question) {
    return null;
  }

  /**
   * Deletes the Question with the matching ID from the database
   *
   * @param id the ID of the Question to find
   * @return a String displaying success or failure
   */
  @DeleteMapping("/{id}")
  public ResponseEntity<String> deleteQuestionById(@PathVariable Long id) {
    return null;
  }
}
