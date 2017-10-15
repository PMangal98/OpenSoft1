/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package opensoft1;

/**
 *
 * @author param
 */
public class QuestionPaperAttempt {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author param
 */
    
public QuestionPaperAttempt()
{
    N = 3;
    T = 2;
    Q[0]="Question1\n\n\nlines left";
    Q[1]="Question2";
    Q[2]="Question3";
}

public int getN()
{
    return N;
}

public int getT()
{
    return T;
}
public String getQuestion(int i)
{
    return Q[i];
}
private int qpaperID;
private int N;
private int T;//in minutes
private String[] Q = new String[20];
}
