package kr.ac.kopo.tabhosttest;

import android.app.TabActivity;
import android.os.Bundle;
import android.widget.TabHost;

@SuppressWarnings("deprecation")
public class MainActivity extends TabActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabHost tabHost = getTabHost();

        // 1. 강아지 탭 (Music)
        TabHost.TabSpec tabSpecDog = tabHost.newTabSpec("DOG").setIndicator("강아지");
        tabSpecDog.setContent(R.id.tabDog);
        tabHost.addTab(tabSpecDog);

        // 2. 고양이 탭 (Singer)
        TabHost.TabSpec tabSpecCat = tabHost.newTabSpec("CAT").setIndicator("고양이");
        tabSpecCat.setContent(R.id.tabCat);
        tabHost.addTab(tabSpecCat);

        // 3. 말 탭 (Album)
        TabHost.TabSpec tabSpecHorse = tabHost.newTabSpec("HORSE").setIndicator("토끼");
        tabSpecHorse.setContent(R.id.tabHorse);
        tabHost.addTab(tabSpecHorse);

        // 4. 토끼 탭 (Album) -> 태그 중복 수정 ("tab3" -> "tab4")
        TabHost.TabSpec tabSpecRabbit = tabHost.newTabSpec("RABBIT").setIndicator("말");
        tabSpecRabbit.setContent(R.id.tabRabbit);
        tabHost.addTab(tabSpecRabbit);

        // 현재 선택될 탭 설정 (0부터 시작하므로 1은 '고양이' 탭입니다)
        tabHost.setCurrentTab(0);
    }
}