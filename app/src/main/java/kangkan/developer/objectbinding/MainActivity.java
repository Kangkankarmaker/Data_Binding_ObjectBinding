package kangkan.developer.objectbinding;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import kangkan.developer.objectbinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding=
                DataBindingUtil.setContentView(this,R.layout.activity_main);

       /* binding.setTxOne("1");
        binding.setTxTwo("2");
        binding.setTxThree("3");*/

       binding.setAStudent(new student("kangkan",22));

    }


    public class student{
        private String name;
        private int age;


        public student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
}
