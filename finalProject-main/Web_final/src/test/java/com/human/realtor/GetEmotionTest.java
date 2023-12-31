package com.human.realtor;

import com.human.util.ChartProcess;
import com.human.util.TextProcess;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;

public class GetEmotionTest {
    @Test
    public void doTest() throws Exception{
        TextProcess obj = new TextProcess();
        ArrayList<String> testStr = new ArrayList<>();
//        test sentence in api document
        testStr.add("싸늘하다. 가슴에 비수가 날아와 꽂힌다.");
        testStr.add("근처에 맛집도 많고 살기 좋은거 같아요.");
        testStr.add("월세가 좀 비싸긴 한데 깨끗하고 집주인도 친절합니다.");
        testStr.add("주위에 재밌는 데도 많고 맛집도 많긴 한데 사람들이 많아서 시끄럽고" +
                " 밤에 고성방가가 종종 발생합니다.");
        testStr.add("깨끗하고 집주인도 친절해서 좋은데 대신 월세가 조금 비싸요ㅠ");
        testStr.add("단점들" +
                " 1. 채광" +
                " 빛이 하나도 안 들어오는 곳이었다는 것 -_-, 들어가서 보니 방향은 동향인데. 동향이면 빛이 아침에는 좀 들어와야 되는 거 아닌가. 건물이 낮아서 앞 건물에 가려지는지 빛이 없어.. 생각해보니 낮에 부동산이랑 같이 볼 때도 어두워서 불 켜고 봤었는데 방이 본 곳 중에 제일 넓어서 그 생각하느라 불키고 보던 건 생각도 안 났다. 그리고 겨울이라 춥고 날이 흐리기도 해서.. 해 쨍쨍한 날 보러 갔으면 확연하게 느꼈을 텐데 아쉽다." +
                " 2. 곰팡이" +
                " 이 집에 애초부터 살던 곰팡이들.. 벽지도 곰팡이 때문에 덧붙인 거 같음. 덧붙이지 않은 현관 쪽엔 곰팡이가 있었다. 더 번지지 않게만 신경 쓰고 살았다. 생각해보면 빛이 안 드니 곰팡이가 따라올 수밖에" +
                " 3. 여름 습기" +
                " 여름에 습기 대박, 이건 1,2번과 연결되는 문제이다. 채광이 좋아야 여름에 습도를 낮춰주고 겨울에는 난방비가 적게 든다고 한다. 특히나 여름에 너무 습해서 바닥이 찐득거리고 집에 들어가고 싶지가 않았다. 습기 제거제 여러 개 갖다 둠." +
                " 4. 추위" +
                " 빌라라 그런가. 단열재를 부족하게 넣었나. 외풍이 세서 보일러비가 많이 나오고 바닥은 뜨거워도 공기가 차서 코끝이 시렸다. 진짜 추웠다고. 보일러비가 30평대 사는 사무실 분이랑 4평대 사는 내가 비슷한 게 말이 되냐고" +
                " 장점들" +
                " 1. 역세권" +
                " 지하철이랑 버스 가까운 곳에 있는 거, 근처에 슈퍼, 카페, 백화점 다 걸어서 이용할 수 있는 게 좋았다." +
                " 2. 전등불" +
                " 다행히 사는 동안 한 번도 안 나감. 나가면 갈기 귀찮잖아. " +
                " 3. 층간소음" +
                "  1인 가구만 살아서인지 조용했다. 가끔 누가 대화하는 소리도 들렸는데 친구가 온 건지.. 가~끔 그래서 괜찮았음. " +
                " 이제 4-5평 원룸 못 살 거 같아.. 살아서도 안되고. 더 좋은 데 살아야지.. 원룸 안녕~");

        for(String s:testStr)
            obj.getEmotion(s);
    }
}
