
package doanthibanglai;

/**
 *
 * @author Duc Loc
 */
public class CauHoi {
    private String id;
    private String question;
    private String a;
    private String b;
    private String c;
    private String correctAnswer;

    public CauHoi(String id, String question, String a, String b, String c, String correctAnswer) {
        this.id = id;
        this.question = question;
        this.a = a;
        this.b = b;
        this.c = c;
        this.correctAnswer = correctAnswer;
    }

    public String getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getA() {
        return a;
    }

    public String getB() {
        return b;
    }

    public String getC() {
        return c;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public void setA(String a) {
        this.a = a;
    }

    public void setB(String b) {
        this.b = b;
    }

    public void setC(String c) {
        this.c = c;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    

    @Override
    public String toString() {
        return "ID: " + id + "\nQuestion: " + question + "\nA: " + a + "\nB: " + b + "\nC: " + c + "\nCorrect Answer: " + correctAnswer;
    }
}
