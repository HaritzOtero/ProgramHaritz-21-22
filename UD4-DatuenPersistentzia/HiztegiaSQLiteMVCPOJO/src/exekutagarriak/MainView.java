/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exekutagarriak;

import pkg1.Controller;
import pkg1.Model;
import pkg1.View;

/**
 *
 * @author otero.haritz
 */
public class MainView {
    public static void main(String args[]) {

        View view = View.viewaSortuBistaratu();

        Model model = new Model();

        Controller controller = new Controller(model, view);
    }
}
