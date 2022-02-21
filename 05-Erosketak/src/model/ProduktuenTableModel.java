/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author otero.haritz
 */
public class ProduktuenTableModel extends AbstractTableModel {

    private final String[] zutabeIzenak = {"Kodea", "Izena", "Prezioa"};
    private ArrayList<Produktua> data = new ArrayList<>();

    public ProduktuenTableModel() {
        data.add(new Produktua("J01", "Ogia", 1.5));
        data.add(new Produktua("J02", "Esnea", 1.05));
        data.add(new Produktua("J03", "Madalenak", 2.25));
        data.add(new Produktua("J04", "Mermelada", 3.0));

    }

    @Override
    public int getRowCount() {
        return data.size();

    }

    @Override
    public int getColumnCount() {
        return zutabeIzenak.length;

    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (columnIndex == 0) {
            return data.get(rowIndex).getStrKodea();
        } else if (columnIndex == 1) {
            return data.get(rowIndex).getIzena();
        } else if (columnIndex == 2) {
            return data.get(rowIndex).getPrezioa();
        }
        return null;

    }

    @Override
    public String getColumnName(int col) {
        return zutabeIzenak[col];
    }

    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    @Override
    public boolean isCellEditable(int row, int col) {
        if (col > 1 && row < 4) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void setValueAt(Object value, int row, int col) {
       
    }
}
