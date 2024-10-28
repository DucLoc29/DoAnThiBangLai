/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package readexcel;

public class CauHoi {
    private String id;
    private String question;
    private String a;
    private String b;
    private String c;
    private String correctAnswer;
    private String imagePath;

    public CauHoi(String id, String question, String a, String b, String c, String correctAnswer, String imagePath) {
        this.id = id;
        this.question = question;
        this.a = a;
        this.b = b;
        this.c = c;
        this.correctAnswer = correctAnswer;
        this.imagePath = imagePath;
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

    public String getImagePath() {
        return imagePath;
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

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
    


    @Override
    public String toString() {
        return "ID: " + id + "\nQuestion: " + question + "\nA: " + a + "\nB: " + b + "\nC: " + c + "\nCorrect Answer: " + correctAnswer + "\nImage Path: " + imagePath;
    }
}

