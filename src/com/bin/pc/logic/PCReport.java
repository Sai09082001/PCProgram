
package com.bin.pc.logic;

import com.bin.pc.commonutils.TextIO;

/**
 *
 * @author Binh_Do
 */
public class PCReport {
    
    /**
     * @effects return a formatted report of PCs
     */
//    public String displayReport(PC[] pcs) {
//        String s = new String();
//        String dash = "---------------------------------------------------------------------------------------------------\n";
//        if (pcs == null) s = null;
//        if (pcs.length == 0) s = null;
//        if (pcs.length != 0) {
//            s = s + dash;
//            s = s + String.format("%43s%s\n", "", "PCPROG REPORT");
//            s = s + dash;
//            for (int i = 0; i < pcs.length; i++) {
//                PC thisPC = pcs[i];
//                Object[] compArray = thisPC.getComps().getObjects();
//                String compString = java.util.Arrays.toString(compArray);
//                s = s + String.format("%3s %20s %6s %20s %50s\n", (i+1), thisPC.getModel(), thisPC.getYear(), thisPC.getManufacturer(), compString);
//            }
//        }
//        s += dash;
//        TextIO.put(s);
//        return s;
//    }
}
