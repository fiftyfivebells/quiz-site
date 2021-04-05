package ffb.quizsite.quizEngine.questions;

import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
@RequestMapping("/api")
public class QuestionController {

  @Autowired
  private QuestionService questionService;

  /**
   * Gets a question by ID
   *
   * @param id the ID of the question
   * @return a ResponseEntity containing the Question, or throws a 404 error
   */
  @GetMapping(path = "/questions/{id}")
  public ResponseEntity<Question> getQuestionById(@PathVariable Long id) {
    Question question = questionService.getQuestionById(id);
    return ResponseEntity.ok(question);
  }

  /**
   * Get all of the available Questions
   *
   * @return a ResponseEntity containing a List of all the questions
   */
  @GetMapping(path = "/questions")
  public ResponseEntity<List<Question>> getAllQuestions() {
    return ResponseEntity.ok(questionService.getAllQuestions());
  }

  /**
   * Adds a new Question to the database
   *
   * @param question the Question to be added
   * @return a ResponseEntity containing the newly added Question
   */
  @PostMapping(value = "/questions", consumes = "application/json", produces = "application/json")
  public ResponseEntity<Question> createNewQuestion(@Valid @RequestBody Question question) {
    return new ResponseEntity<>(questionService.createNewQuestion(question), HttpStatus.CREATED);
  }

  /**
   * Retrieves a Question by ID and then updates that question
   *
   * @param id       Id of the Question to retrieve
   * @param question the Question with the updated information
   * @return a ResponseEntity containing the updated Question
   */
  @PutMapping(value = "questions/{id}", consumes = "application/json")
  public ResponseEntity<Question> updateQuestionById(@PathVariable Long id,
      @RequestBody Question question) {
    Question updatedQuestion = questionService.updateQuestionById(id, question);
    return ResponseEntity.ok(updatedQuestion);
  }

  /**
   * Deletes the Question with the matching ID from the database
   *
   * @param id the ID of the Question to find
   * @return a String displaying success or failure
   */
  @DeleteMapping(path = "questions/{id}")
  public ResponseEntity<String> deleteQuestionById(@PathVariable Long id) {
    questionService.deleteQuestionById(id);
    return ResponseEntity.ok("Successfully deleted");
  }
}
