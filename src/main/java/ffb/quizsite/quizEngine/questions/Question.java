package ffb.quizsite.quizEngine.questions;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Question {

  @NotEmpty
  private String title;

  @NotEmpty
  private String text;

  @NotNull
  @Size(min = 2, message = "Must provide at least 2 options")
  private List<String> options;

  private int[] answers;

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;

  public Question() {
  }

  public Question(int id, String text, String title, List<String> options, int[] answers) {
    this.id = id;
    this.text = text;
    this.title = title;
    this.options = options;
    this.answers = answers;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public List<String> getOptions() {
    return options;
  }

  public void setOptions(List<String> options) {
    this.options = options;
  }

  @JsonIgnore
  public int[] getAnswers() {
    return answers == null ? new int[0] : answers;
  }

  @JsonProperty(access = Access.WRITE_ONLY)
  public void setAnswers(int[] answers) {
    this.answers = answers;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }
}
