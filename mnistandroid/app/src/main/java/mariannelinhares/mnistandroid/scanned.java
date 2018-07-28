package mariannelinhares.mnistandroid;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

public class scanned extends AppCompatActivity {
    private ImageView scannedImage;
    private Button scanBtn;
    static final int REQUEST_IMAGE_CAPTURE = 1;

    ArrayList<String> lista;
    ArrayAdapter<String> adaptor;
    ListView sampleList;


    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scanned);
        scannedImage=(ImageView)findViewById(R.id.scannedImageView);
        scanBtn=(Button)findViewById(R.id.scanBtn);
        sampleList = (ListView) findViewById(R.id.sampleListView);
        Bitmap bmp;

        byte[] byteArray = getIntent().getByteArrayExtra("image");
        bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        scannedImage.setImageBitmap(bmp);
        scanBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dispatchTakePictureIntent();

            }
        });

        lista = new ArrayList<String>();
        lista.add("म    --      90%");
        lista.add("भ    --      40%");
        lista.add("ग    --      20%");
        lista.add("प    --      10%");
        lista.add("ष    --      5%");
        adaptor = new ArrayAdapter<String>(this, R.layout.list_item, lista);
        sampleList.setAdapter(adaptor);
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            scannedImage.setImageBitmap(imageBitmap);


        }
    }
}
