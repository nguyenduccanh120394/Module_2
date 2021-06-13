package service;

import model.Film;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileFilmManagement {
    public void writeToFileFilm(String path, List<Film> listFilm){
        FileWriter fileWriter ;
        BufferedWriter bw = null;
        try {
            fileWriter= new FileWriter("dataFilm.csv");
            bw = new BufferedWriter(fileWriter);
            bw.write("FILM ID,FILM NAME,SHOW TIME,DIRECTORS,ACTOR,MANUFACTURING YEAR,COUNTRY,CATEGORY,CONTENT\n");
            for (int i = 0; i < listFilm.size(); i++) {
                bw.write(listFilm.get(i).getIdFilm()+","+listFilm.get(i).getName()+","+listFilm.get(i).getShowTime()+","+listFilm.get(i).getDirectors()+","+
                        listFilm.get(i).getActor()+","+listFilm.get(i).getYearOfManufacture()+","+listFilm.get(i).getCountry()+","+listFilm.get(i).getCategory()+","+
                        listFilm.get(i).getContent()+"\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public List<Film> readFromFileFilm(String path){
        List<Film>filmList = new ArrayList<>();
        FileReader fileReader;
        BufferedReader br =null;
        try {
            fileReader = new FileReader(path);
            br=new BufferedReader(fileReader);
            String line = br.readLine();
            while ((line= br.readLine())!=null){
                String[]str=line.split(",");
                filmList.add(new Film(str[0],str[1],str[2],str[3],str[4],Integer.parseInt(str[5]),str[6],str[7],str[8]));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return filmList;
    }
}
