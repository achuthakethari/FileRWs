// Copyright @ SanKir Technologies, 2018 - Java Programming -File Read Write.
package filerws;

import java.io.*;


// Program reads all the lines of inputfile.txt and copies to outptfile.txt
// matchfile is created with only lines containing matchword

public class FileRWs {


    public static void main(String args[]) {

        // Read a file and print the lines of file
        System.out.println();
       // String filepath = "F:\\DataSets\\inputfile.txt";
        //String filepath=filepath1;
        String filecontents = "the file contents are \n ";
        String wordmatch = "the matchword file  \n " ;
        String findreplace="the replced file is \n";

       // System.out.println(filepath);

        try {
            FileReader fr = new FileReader("F:\\DataSets\\inputfile.txt");
            BufferedReader br = new BufferedReader(fr);
            String currentline = br.readLine();


            while (currentline != null) {

                System.out.println(currentline); // print each line read

                filecontents = filecontents + currentline + "\n";// 1st task - read all lines

                if (currentline.contains("This")) // 2nd task - read lines containing specific word
                    wordmatch = wordmatch + currentline + "\n";

                currentline=currentline.replace(" ", ",");
                findreplace = findreplace + currentline + "\n";

                currentline = br.readLine();
            }

            br.close();
            fr.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        System.out.println();
        System.out.println("Now writing to files ");
        String filepath1 = "F:\\IdeaProjects\\outputfile.txt";
        String filepath2 = "F:\\IdeaProjects\\matchfile.txt";
        String filepath3 = "F:\\IdeaProjects\\findreplacefile.txt";

        try {
            FileWriter fw1 = new FileWriter(filepath1); // file to write al lines
            BufferedWriter bw1 = new BufferedWriter(fw1);
            bw1.write(filecontents);
            bw1.close();
            fw1.close();

            FileWriter fw2 = new FileWriter(filepath2); // file to write lines containing specific word
            BufferedWriter bw2 = new BufferedWriter(fw2);
            bw2.write(wordmatch);
            bw2.close();
            fw2.close();

            FileWriter fw3 = new FileWriter(filepath3); // file to write lines containing replaced lines
            BufferedWriter bw3 = new BufferedWriter(fw3);
            bw3.write(findreplace);
            bw3.close();
            fw3.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();

        }

        /*System.out.println();
        String s = filecontents.replace(".\n", ";");
        System.out.println(s);*/

    }

}
