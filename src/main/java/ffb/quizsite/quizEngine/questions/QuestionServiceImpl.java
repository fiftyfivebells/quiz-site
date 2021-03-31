package ffb.quizsite.quizEngine.questions;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuestionServiceImpl implements QuestionService {

  @Autowired
  private QuestionRepository questionRepository;

  @Override
  public Question getQuestionById(Long id) {
    return null;
  }

  @Override
  public List<Question> getAllQuestions() {
    return null;
  }

  @Override
  public Question createNewQuestion(Question question) {
    return null;
  }

  @Override
  public Question updateQuestionById(Long id, Question question) {
    return null;
  }

  @Override
  public void deleteQuestionById(Long id) {

  }
}
