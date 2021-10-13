package kr.ac.daegu.bsy;

import java.util.Scanner;
import java.util.StringTokenizer;

public class JungolPractice {
    // 출력 : 자가진단 1
    public void practice1() {
        System.out.println("Fun Programming!");
    }

    // 출력 : 자가진단 2
    public void practice2() {
        System.out.println("Programming! It's fun.");
    }

    // 출력: 자가진단 3
    // http://jungol.co.kr/bbs/board.php?bo_table=pbank&wr_id=140&sca=10
    public void practice3() {
        System.out.println("My name is Hong Gil Dong.");
        System.out.println("I am 13 years old.");
        //javascript 같은 경우
        // console.log('hihi');
        //char ch = 'a';
    }

    // 출력 : 자가진단 4
    public void practice4() {
        System.out.println("(@) (@)");
        System.out.println("(=^.^=)");
        System.out.println("(-m-m-)");
    }

    // 출력 : 자가진단 5
    public void practice5() {
        System.out.println("I can program well.");
        System.out.println("Dreams come true.");
    }

    // 출력 : 자가진단 6
    public void practice6() {
        System.out.println("My height");
        System.out.println("170");
        System.out.println("My weight");
        System.out.println("68.600000");
    }

    // 출력 : 자가진단 7
    public void practice7() {
        System.out.println("5 Dan");
        System.out.println("5 * 2 = 10");
    }

    // 출력 : 자가진단 8
    public void practice8() {
        System.out.printf("%10s%10s%10s\n", "item", "count", "price");
        System.out.printf("%10s%10d%10d\n", "pen", 20, 100);
        System.out.printf("%10s%10d%10d\n", "note", 5, 95);
        System.out.printf("%10s%10d%10d\n", "eraser", 110, 97);
    }

    // 출력 : 형성평가 1
    public void practice9() {
        System.out.println("My name is Hong");
    }

    // 출력 : 형성평가 2
    public void practice10() {
        System.out.println("My hometown");
        System.out.println("Flowering mountain");
    }

    // 출력 : 형성평가 3
    public void practice11() {
        System.out.println("TTTTTTTTTT");
        System.out.println("TTTTTTTTTT");
        System.out.printf("%6s\n", "TT");
        System.out.printf("%6s\n", "TT");
        System.out.printf("%6s\n", "TT");
    }

    // 출력 : 형성평가 4
    public void practice12() {
        int kor = 90;
        int mat = 80;
        int eng = 100;
        int sum = (kor + mat + eng);
        int avg = (sum/3);
        System.out.println("kor " + kor);
        System.out.println("mat " + mat);
        System.out.println("eng " + eng);
        System.out.println("sum " + sum);
        System.out.println("avg " + avg);
    }

    // 출력 : 형성평가 5
    public void practice13() {
        System.out.printf("%15s%15s%15s\n", "Seoul", "10,312,545", "+91,375");
        System.out.printf("%15s%15s%15s\n", "Pusan", "3,567,910", "+5,868");
        System.out.printf("%15s%15s%15s\n", "Incheon", "2,758,296", "+64,888");
        System.out.printf("%15s%15s%15s\n", "Daegu", "2,511,676", "+17,230");
        System.out.printf("%15s%15s%15s", "Gwangju", "1,454,636", "+29,774");
    }



    /*
     * 1야드(yd)는 91.44cm이고 1인치(in)는 2.54cm이다.
     * 2.1야드와 10.5인치를 각각 cm로 변환하여
     * 다음 형식에 맞추어 소수 첫째자리까지 출력하시오.
     * */
    public void practice11112() {
        float yd = 91.44f; // 실수는 float
        float in = 2.54f;
        float yardToCm = 2.1f * yd;
        float inchToCm = 10.5f * in;

        String strYardToCm = String.format("%.1f", yardToCm);
        String strInchToCm = String.format("%.1f", inchToCm);

        System.out.println("2.1야드toCm : " + strYardToCm);
        System.out.println("10.5인치toCm : " + strInchToCm);
    }

    // 1 두 개의 문자열을 입력받아서
    // 2 두 문자열의 길이의 합을 출력하는 프로그램을 작성하시오.
    // 3 각 문자열의 길이는 30자 미만이다.
    public void practice11113() {
        // 입력받기
        Scanner sc = new Scanner(System.in);
        System.out.println("첫번째 문자열 을 입력하세요");
        String str = sc.nextLine();
        if(str.length() > 30) {
            System.out.println("문자열1의 길이는 20자 미만 이어야 합니다.");
            return;
        }
        System.out.println("두번째 문자열 을 입력하세요");
        String str2 = sc.nextLine();
        if(str2.length() > 30) {
            System.out.println("문자열2의 길이는 20자 미만 이어야 합니다.");
            return;
        }
        System.out.println("입력받은 값(첫번째): " + str);
        System.out.println("입력받은 값(두번째): " + str2);
        int sum = str.length() + str2.length();
        System.out.println("=============");
        System.out.println("길이: " + sum);
    }

    // 5개의 정수를 입력받아 모두 붙여서 문자열로 저장한 후 세 자씩 나누어서 출력하는 프로그램을 작성하시오.
    public void practice11115() {
        System.out.println("practice4");
    }

    public void practice11117() {
        //5개의 정수를 입력받는다
        // 모두 붙여서 문자열로 저장
        // 세 자씩 나누어 출력

        // for문
        /*
        public static void main(String[] args) {
            for(int i = 0; i <= 10; i++){
                System.out.print(i);
            }
            System.out.println("\n============");
            String[] strs = {"1","2","3","4","5"};

            for(String s : strs) {
                System.out.println(s);
            }
        }*/
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        String[] str = new String[5];
        String sum = "";
        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + "번째 수 입력하시오");
            arr[i] = sc.nextInt();
            str[i] = String.valueOf(arr[i]);
            sum += str[i];
        }
        System.out.println(sum);

        int s = sum.length();
        int count = 0;

        for (int i = 0; i < s; i++){
            if (count == 3) {
                System.out.println();
                count = 0;
            }
            System.out.print(sum.charAt(i));
            count++;
        }

        //3명 학생의 국어 영영 2과목의 점수를 입력 받아서
        // 각개인별로 평균이 80 이상이면 "합격"
        //그렇지 않으면"불합격"
        //합격한 사람의 수를 출력하는 프로그램

    }

    //3명 학생의 국어 영어 2과목의 점수를 입력 받아서
    //각개인별로 평균이 80 이상이면 "합격"
    //그렇지 않으면"불합격"
    //합격한 사람의 수를 출력하는 프로그램
    //optional mission : 가능한 메소드로 분리해서 작성
    public void  practice111111111(){
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][2];
        int i;
        int[] sum = new int[3];
        double[] avg = new double[3];
        int pass = 0;

        for (i=0; i<3; i++){
            System.out.println((i+1)+"번째 학생의 국어,영어 성적을 입력하세요" );
            for (int j=0; j<2; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        for(i=0;i<3;i++){
            sum[i] = arr[i][0] + arr[i][1];
            avg[i] = sum[i]/2;

            if (avg[i]>=80){
                System.out.println((i+1)+"번쨰 학생 합격입니다");
                pass += 1;
            }
            else {
                System.out.println((i+1)+"번째 학생 불합격입니다");
            }
        }
        System.out.println("합격한 사람의 수는" + pass + "명입니다.");

    }

    // 삼각형의 밑변의 길이와 높이를 입력 받아 넓이를 출력
    // "continue?"에서 하나의 문자를 입력받아
    // 그 문자가 'Y' 나 'y'이면 작업을 반복
    // 다른 문자이면 종료하는 프로그램
    // (넓이는 반올림하여 소수 첫번째 자리까지)
    public void practice2222222222222(){
        Scanner sc = new Scanner(System.in);

        while(true){
            // 삼각형 밑변의 길이
            System.out.println("밑변의 길이를 정수로 입력하시오");
            int baseLineLen = sc.nextInt();
            // 삼각형의 높이
            System.out.println("높이를 정수로 입력하시오");
            int height = sc.nextInt();
            //입력 받은 값 시험
            System.out.println("밑변의 길이: " + baseLineLen);
            System.out.println("높이: " + height);

            // 넓이를 출력
            float area = (float) (baseLineLen * height) / 2;
            System.out.println("넓이: " + area);

            System.out.println("Continue?");
            sc.nextLine();
            String str = sc.nextLine();
            if (str.equals("Y") || str.equals("y")){
                break;
            }

        }


    }
}

