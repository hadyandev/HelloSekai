package com.example.hellosekai;

import java.util.ArrayList;

public class HokageData {
    public static String[][] data = new String[][]{
            {"Hashirama Senju", "Hokage Pertama", "https://vignette.wikia.nocookie.net/naruto/images/3/30/Hokage_Hashirama.png"},
            {"Tobirama Senju", "Hokage Kedua", "https://vignette.wikia.nocookie.net/naruto/images/8/8f/Tobirama_Senju_Muka.png/revision/latest?cb=20160621171438&path-prefix=id"},
            {"Hiruzen Sarutobi", "Hokage Ketiga", "https://vignette.wikia.nocookie.net/naruto/images/e/e4/Hiruzen_Sarutobi.png"},
            {"Minato Namikaze", "Hokage Keempat", "https://vignette.wikia.nocookie.net/naruto/images/1/11/Hokage_Minato.png"},
            {"Tsunade", "Hokage Kelima", "https://vignette.wikia.nocookie.net/naruto/images/a/a2/Tsunade_as_Hokage.png/revision/latest?cb=20140406070654&path-prefix=id"},
            {"Danzō Shimurao", "(Kandidat) Hokage Keenam", "https://vignette.wikia.nocookie.net/naruto/images/2/24/Danzo_as_hokage.png/revision/latest?cb=20141019193339&path-prefix=id"},
            {"Kakashi Hatake", "Hokage Keenam", "https://vignette.wikia.nocookie.net/naruto/images/a/a1/Kakashi_hokage.png/revision/latest?cb=20150523144033&path-prefix=id"},
            {"Naruto Uzumaki", "Hokage Ketujuh", "https://vignette.wikia.nocookie.net/naruto/images/5/57/Naruto_Boruto_Movie.png"}
    };

    public static ArrayList<Hokage> getListData(){
        Hokage hokage = null;
        ArrayList<Hokage> list = new ArrayList<>();
        for (String[] aData : data) {
            hokage = new Hokage();
            hokage.setName(aData[0]);
            hokage.setRemarks(aData[1]);
            hokage.setPhoto(aData[2]);

            list.add(hokage);
        }

        return list;
    }
}
