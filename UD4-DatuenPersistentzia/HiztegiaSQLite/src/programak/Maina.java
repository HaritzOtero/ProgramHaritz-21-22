/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programak;

/**
 *
 * @author otero.haritz
 */
public class Maina {
    public static void main(String args[]) {

        View view = View.viewaSortuBistaratu();

        Model model = new Model();

        Controller controller = new Controller(model, view);
    }
}
