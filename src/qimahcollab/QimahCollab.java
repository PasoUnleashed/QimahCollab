/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qimahcollab;

/**
 *
 * @author User
 */
public class QimahCollab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        TextGenerator t1 = new QimahGenerator();
        TextGenerator t2 = new OsamaGenerator();
        System.out.println(t1.generateText());
        System.out.println(t2.generateText());
    }
    
}
