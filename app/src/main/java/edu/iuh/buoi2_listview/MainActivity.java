package edu.iuh.buoi2_listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvGoods;
    CustomGoodsAdapter adt;
    ArrayList<Goods> arrayList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvGoods = findViewById(R.id.lvGoods);

        arrayList = new ArrayList<>();
        arrayList.add(
                new Goods("Nấu mì...",
                        "shopDeVang", R.drawable.noicom));
        arrayList.add(
                new Goods("Gà khô...",
                        "shopDeVang", R.drawable.gakho));
        arrayList.add(
                new Goods("Xe cẩug...",
                        "shopTheGioiDoChoi", R.drawable.xe));
        arrayList.add(
                new Goods("Sách...",
                        "shopHongHoa", R.drawable.sach1));
        arrayList.add(
                new Goods("Sách...",
                        "shopDeVang", R.drawable.sach2));

        adt = new CustomGoodsAdapter(this, R.layout.item_listview, arrayList);

        lvGoods.setAdapter(adt);
    }
}