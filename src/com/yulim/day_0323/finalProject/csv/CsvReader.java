package com.yulim.day_0323.finalProject.csv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CsvReader {
    
    public ArrayList<List<String>> readCSV(String filename) {
        // 반환용 리스트
        ArrayList<List<String>> ret = new ArrayList<List<String>>();
        BufferedReader br = null;
        try {
            br = Files.newBufferedReader(Paths.get(filename));
            String line = "";

            while ((line = br.readLine()) != null) {
                // CSV 1행을 저장하는 리스트
                List<String> tmpList = new ArrayList<String>();
                String array[] = line.split(",");
                // 배열에서 리스트 반환
                tmpList = Arrays.asList(array);
                // System.out.println(tmpList);
                ret.add(tmpList);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return ret;
    }
}
