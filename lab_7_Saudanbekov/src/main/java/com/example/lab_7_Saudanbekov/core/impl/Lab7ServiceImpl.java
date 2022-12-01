package com.example.lab_7_Saudanbekov.core.impl;

import com.example.lab_7_Saudanbekov.core.Lab7Service;
import org.springframework.stereotype.Service;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemNotFoundException;
import java.util.Scanner;


@Service
public class Lab7ServiceImpl implements Lab7Service {
    private String helloText = "Hello World";

    @Override
    public String getHelloText() {
        return helloText;
    }
    @Override
    public String getTextFromFile(String fileName){
        StringBuilder stringBuilder = new StringBuilder();
        try{
            File myObj = new File("text-files/" + fileName);

            Scanner myReader = new Scanner(myObj);
            while(myReader.hasNextLine()){
                String data = myReader.nextLine();
                stringBuilder.append(data);
            }
            myReader.close();
        }catch (FileSystemNotFoundException | FileNotFoundException e){
            System.out.println("An error occurred. File not found");
            e.printStackTrace();
        }
        return  stringBuilder.toString();
    }

}
