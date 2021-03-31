package ffb.quizsite.quizEngine.questions;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

@Service
public class QuestionServiceImpl implements QuestionService {

  @Autowired
  private QuestionRepository questionRepository;

  @Override
  public Question getQuestionById(Long id) {
    return questionRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
  }

  @Override
  public List<Question> getAllQuestions() {
    return (List<Question>) questionRepository.findAll();
  }

  @Override
  public Question createNewQuestion(Question question) {
    return questionRepository.save(question);
  }

  @Override
  public Question updateQuestionById(Long id, Question question) {
    Question toUpdate = questionRepository.findById(id)
        .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND));
    toUpdate.setAnswers(question.getAnswers());
    toUpdate.setOptions(question.getOptions());
    toUpdate.setTitle(question.getTitle());
    toUpdate.setText(question.getText());

    return questionRepository.save(toUpdate);
  }

  @Override
  public void deleteQuestionById(Long id) {
    questionRepository.deleteById(id);
  }
}
