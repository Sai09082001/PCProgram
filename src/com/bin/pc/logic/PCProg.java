//package com.bin.pc.logic;
//
//import static com.bin.pc.commonutils.TextIO.getln;
//import static com.bin.pc.commonutils.TextIO.putln;
//import static com.bin.pc.commonutils.TextIO.writeFile;
//import static com.bin.pc.commonutils.TextIO.writeStandardOutput;
//
//import java.util.Vector;
//
//import com.bin.pc.commonutils.DomainConstraint;
//import com.bin.pc.commonutils.NotPossibleException;
//
//
//public class PCProg {
//  @DomainConstraint(mutable=true,optional=false)
//  private Set<PC> objs;
//  
//  /**
//   * @effects
//   *  initialise this to have an empty set of PCs
//   */
//  public PCProg() {
//    // objs = new Set<>();
//  }
//
//  public String displayReport() {
//    if (objs.size() > 0) {
//      Vector<PC> pcs = objs.getElements();
//      
//      PCReport reportObj = new PCReport();
//      return reportObj.displayReport(pcs.toArray(new PC[pcs.size()]));
//    } else {
//      return null;
//    }
//  }
//  
//  /**
//   * @effects 
//   *  save report to a file pcs.txt in the same directory 
//   *  as the program's
//   */
//  public void saveReport(String report) {
//    String fileName = "pcs.txt";
//    writeFile(fileName);
//    putln(report);
//    writeStandardOutput();
//  }
//
//
//  public static void main(String[] args) {
//    
//    PCProg prog = new PCProg();
//    
//    try {
//      prog.createObjects();
//    
//      // display report
//      String report = prog.displayReport();
//        
//      if (report != null) {
//        // prompt user to save report
//        putln("Save report to file? [Y/N]");
//        String toSave = getln();
//        if (toSave.equals("Y")) {
//          prog.saveReport(report);
//          putln("report saved");
//        }
//      }
//    } catch (NotPossibleException e) {
//      System.err.printf("%s: %s%n", e, e.getMessage());
//    }
//    
//    putln("~END~");
//  }
//}
//
