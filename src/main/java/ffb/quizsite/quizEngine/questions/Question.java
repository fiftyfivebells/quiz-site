package ffb.quizsite.quizEngine.questions;

import java.util.List;

public class Question {
  private String title;
  private String text;
  private List<String> options;
  private int[] answers;
  private int id;

  public Question() {}

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

  public int[] getAnswers() {
    return answers == null ? new int[0] : answers;
  }

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
