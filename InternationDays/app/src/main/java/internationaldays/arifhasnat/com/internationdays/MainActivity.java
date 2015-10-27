package internationaldays.arifhasnat.com.internationdays;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.view.Menu;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;

public class MainActivity extends Activity {



    MediaPlayer mp;
    CalendarView calView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_USER_PORTRAIT);

        setContentView(R.layout.activity_main);


        calView =(CalendarView) findViewById(R.id.calendarView1);
        calView.setOnDateChangeListener(new OnDateChangeListener(){

            @Override
            public void onSelectedDayChange(CalendarView arg0, int arg1,
                                            int arg2, int arg3) {
                // TODO Auto-generated method stub

                AlertDialog.Builder builder =new AlertDialog.Builder(MainActivity.this);

                if(arg2==0&&arg3==1){




                }else if(arg2==0&&arg3==2){

                }else if(arg2==0&&arg3==3){

                }
                else if(arg2==0&&arg3==4){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==5){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==6){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==7){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==8){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==9){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }

                else if(arg2==0&&arg3==10){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==11){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==12){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==13){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==14){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==15){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==16){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==17){
                    Toast.makeText(getBaseContext(), "International Day of Commemoration in Memory of the Victims of the Holocaust",Toast.LENGTH_LONG).show();

                    builder.setMessage(" 	International Day of Commemoration in Memory of the Victims of the Holocaust "+"\n"+"The 2014 observance of the International Day of Commemoration in memory of the victims of the Holocaust is centred around the theme “Journeys through the Holocaust”. This theme recalls the various journeys taken during this dark period, from deportation to incarceration to freedom, and how this experience transformed the lives of those who endured it. These are stories of pain and suffering, yet ultimately also of triumph and renewal, serving as a guiding force for future generations. "+"\n"+"More:http://www.un.org/en/holocaustremembrance/2014/calendar2014.shtml");
                    //builder.setMessage("hey !"+yourName +" you are  in "+values+"%"+"love with "+gfName +" Its very low . Are you actually in Love?? ");
                    builder.setCancelable(false);
                    builder.setTitle(" 	International Day of Commemoration in Memory of the Victims of the Holocaust");
                    builder.setPositiveButton("back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }
                else if(arg2==0&&arg3==18){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==19){
                    Toast.makeText(getBaseContext(), "we43o International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==20){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==21){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==22){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==23){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==24){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==25){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==26){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==27){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==28){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==29){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==30){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==0&&arg3==31){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==1&&arg3==1){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==1&&arg3==2){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==1&&arg3==3){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==4){
                    Toast.makeText(getBaseContext(), "World Cancer Day",Toast.LENGTH_LONG).show();

                    builder.setMessage(" 	World Cancer Day "+"\n"+"Each year on 4 February, WHO and International Agency for Research on Cancer (IARC) supports Union for International Cancer Control (UICC) to promote ways to ease the global burden of cancer"

                            +"Cancer is the uncontrolled growth and spread of cells. It can affect almost any part of the body. The growths often invade surrounding tissue and can metastasize to distant sites. Many cancers can be prevented by avoiding exposure to common risk factors, such as tobacco smoke. In addition, a significant proportion of cancers can be cured, by surgery, radiotherapy or chemotherapy, especially if they are detected early.");
                    //builder.setMessage("hey !"+yourName +" you are  in "+values+"%"+"love with "+gfName +" Its very low . Are you actually in Love?? ");
                    builder.setCancelable(false);
                    builder.setTitle(" 	World Cancer Day");
                    builder.setPositiveButton("Again", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();



                }
                else if(arg2==1&&arg3==5){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==6){

                    Toast.makeText(getBaseContext(), "International Day of Zero Tolerance to Female Genital Mutilation",Toast.LENGTH_LONG).show();

                    builder.setMessage("International Day of Zero Tolerance to Female Genital Mutilation"+"\n"+"Female genital mutilation (FGM) comprises all procedures that involve partial or total removal of the external female genitalia, or other injury to the female genital organs for non-medical reasons, and is recognized internationally as a violation of the human rights of girls and women."

                            +"It reflects deep-rooted inequality between the sexes, and constitutes an extreme form of discrimination against women. It is nearly always carried out on minors."

                            +"The practice also violates a person's rights to health, security and physical integrity, the right to be free from torture and cruel, inhuman or degrading treatment, and the right to life when the procedure results in death."

                            +"Though the practice has persisted for over a thousand years, programmatic evidence suggests that FGM/C can end in one generation. While UNICEF currently works in 22 countries on the elimination of FGM/C, since 2008 UNFPA and UNICEF have collaborated on the UNFPA-UNICEF Joint Programme on Female Genital Mutilation/Cutting: Accelerating Change in 15 of those countries in West, East and North Africa. "

                            +"On 20 December 2012, the UN General Assembly adopted Resolution A/RES/67/146 in which it"
                            +"“Calls upon States, the United Nations system, civil society and all stakeholders to continue to observe 6 February as the International Day of Zero Tolerance for Female Genital Mutilation and to use the day to enhance awareness- raising campaigns and to take concrete actions against female genital mutilations”.");
                    builder.setTitle(" International Day of Zero Tolerance to Female Genital Mutilation");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Again", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }
                else if(arg2==1&&arg3==7){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==8){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==9){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }

                else if(arg2==1&&arg3==10){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==11){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==12){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==13){
                    builder.setTitle(" World Radio Day 2014");
                    builder.setMessage("13 February is World Radio Day — a day to celebrate radio as a medium; to improve international cooperation between broadcasters; and to encourage major networks and community radio alike to promote access to information, freedom of expression and gender equality over the airwaves."

                            +"As radio continues to evolve in the digital age, it remains the medium that reaches the widest audience worldwide. It is essential to furthering UNESCO’s commitment to promote gender equality and women’s empowerment."

                            +"Through World Radio Day celebrations around the world, UNESCO will promote gender equality by:"
                            +"- See more at: http://www.unesco.org/new/en/world-radio-day#sthash.8Hgfbqg3.dpuf");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Again", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();



                }
                else if(arg2==1&&arg3==14){

                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==15){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==16){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==17){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==18){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==19){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==20){

                    builder.setMessage("Social justice is an underlying principle for peaceful and prosperous coexistence within and among nations. We uphold the principles of social justice when we promote gender equality or the rights of indigenous peoples and migrants. We advance social justice when we remove barriers that people face because of gender, age, race, ethnicity, religion, culture or disability.For the United Nations, the pursuit of social justice for all is at the core of our global mission to promote development and human dignity. The adoption by the International Labour Organization of the Declaration on Social Justice for a Fair Globalization is just one recent example of the UN system’s commitment to social justice. The Declaration focuses on guaranteeing fair outcomes for all through employment, social protection, social dialogue, and fundamental principles and rights at work.The General Assembly proclaimed 20 February as World Day of Social Justice in 2007, inviting Member States to devote the day to promoting national activities in accordance with the objectives and goals of the World Summit for Social Development and the twenty-fourth session of the General Assembly. Observance of World Day of Social Justice should support efforts of the international community in poverty eradication, the promotion of full employment and decent work, gender equity and access to social well-being and justice for all. ");
                    builder.setTitle("World Day of Social Justice 20 February");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Again", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss()
                            ;
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();



                }
                else if(arg2==1&&arg3==21){
                    mp=MediaPlayer.create(getBaseContext(),R.raw.amarvayer1);
                    mp.start();

                    builder.setMessage("International Mother Language Day 21 February  --International Mother Language Day was proclaimed by the General Conference of the United Nations Educational, Scientific and Cultural Organization (UNESCO) in November 1999 (30C/62). On 16 May 2009 the United Nations General Assembly in its resolution A/RES/61/266 called upon Member States to promote the preservation and protection of all languages used by peoples of the world By the same resolution, the General Assembly proclaimed 2008 as the International Year of Languages, to promote unity in diversity and international understanding, through multilingualism and multiculturalism. International Mother Language Day has been observed every year since February 2000 to promote linguistic and cultural diversity and multilingualism. The date represents the day in 1952 when students demonstrating for recognition of their language, Bangla, as one of the two national languages of the then Pakistan, were shot and killed by police in Dhaka, the capital of what is now Bangladesh. Languages are the most powerful instruments of preserving and developing our tangible and intangible heritage. All moves to promote the dissemination of mother tongues will serve not only to encourage linguistic diversity and multilingual education but also to develop fuller awareness of linguistic and cultural traditions throughout the world and to inspire solidarity based on understanding, tolerance and dialogue.");
                    builder.setTitle("International Mother Language Day 21 February"+"\n"+"");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                            mp.stop();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);
                            mp.stop();

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();










                }
                else if(arg2==1&&arg3==22){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==23){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==24){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==25){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==26){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==27){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==28){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==1&&arg3==29){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                //=======
                else if(arg2==2&&arg3==1){
                    builder.setMessage("Zero Discrimination Day [UNAIDS]"+"\n"+"More: http://www.unaids.org/en/aboutunaids/");

                    builder.setTitle("Zero Discrimination Day [UNAIDS]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Again", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();



                }else if(arg2==2&&arg3==2){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==2&&arg3==3){
                    builder.setMessage(" 	World Wildlife Day");
                    builder.setTitle(" 	World Wildlife Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();


                }
                else if(arg2==2&&arg3==4){

                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==5){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==6){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==7){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==8){

                    builder.setMessage("A promise is a promise: Time for action to end violence against women There is one universal truth, applicable to all countries, cultures and communities: violence against women is never acceptable, never excusable, never tolerable------Secretary-General Ban Ki-moon"+"\n"+"");
                    builder.setTitle(" 	International woment's Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();


                }
                else if(arg2==2&&arg3==9){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }

                else if(arg2==2&&arg3==10){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==11){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==12){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==13){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==14){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==15){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==16){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==17){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==18){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==19){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==20){

                    builder.setMessage("The pursuit of happiness is a fundamental human goal Speaking at the High Level Meeting on Happiness and Well-Being: Defining a New Economic Paradigm convened during the sixty-sixth session of the General Assembly the Secretary General Ban Ki-moon stated that the world “needs a new economic paradigm that recognizes the parity between the three pillars of sustainable development. Social, economic and environmental well-being are indivisible. Together they define gross global happiness.”  The meeting was convened at an initiative of Bhutan, a country which recognized the supremacy of national happiness over national income since the early 1970s and famously adopted the goal of Gross National Happiness over Gross National Product. The General Assembly of the United Nations in its resolution 66/281PDF document of 12 July 2012 proclaimed 20 March the International Day of Happiness recognizing the relevance of happiness and well-being as universal goals and aspirations in the lives of human beings around the world and the importance of their recognition in public policy objectives. The United Nations invites Member States,  international and regional organizations, as well as civil society, including non-governmental organizations and individuals, to observe the International Day of Happiness in an appropriate manner, including through education and public awareness-raising activities.");
                    builder.setTitle(" International Day of Happiness -20 March");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();



                }
                else if(arg2==2&&arg3==21){

                    //builder.setMessage("This year's theme was chosen by the Office of the UN High Commissioner for Human Rights to highlight the problem of racism in sports, which remains a disturbing occurrence in many parts of the world, as well as to raise awareness of the role sports can play in combating racism and racial discrimination. Both sports and human rights share many fundamental values and objectives. The principles underpinning the Olympic Charter, such as non-discrimination and equality, are also the bedrock of human rights. The Olympic Charter notes that the goal of Olympism is to place sport at the service of the harmonious development of man, with a view to promoting a peaceful society concerned with the preservation of human dignity. According to the UN Office on Sport for Development and Peace, well-designed sport activities that incorporate the best values of sport – self-discipline, respect for one's opponent, fair play, and teamwork – can help integrate marginalized groups and teach individuals the values necessary to prevent and resolve social tensions and conflicts. The 2001 Durban Declaration and Programme of Action – a document at the centre of the international community's efforts to prevent, combat and eradicate racism, racial discrimination, xenophobia and related intolerance – urges States, in cooperation with intergovernmental organizations, the International Olympic Committee and international and regional sports federations, to intensify the fight against racism in sport (para 218). In a resolution of 2010 (A/HRC/RES/13/27), the UN Human Rights Council urged States to prevent, combat and address all manifestations of racism, racial discrimination, xenophobia and related intolerance in the context of sporting events.The UNESCO Charter of Physical Education and Sport states that every human being has a fundamental right of access to physical education and sport. The first article of the Universal Declaration of Human Rights affirms that all human beings are born free and equal in dignity and rights.The International Day for the Elimination of Racial Discrimination reminds us of our collective responsibility for promoting and protecting these ideals.");
                    builder.setMessage("21 March 	International Day for the Elimination of Racial Discrimination 	A/RES/2142 (XXI)"
                            +"21 March 	World Poetry Day [UNESCO] 	—"
                            +"21 March 	International Day of Nowruz 	A/RES/64/253"
                            +"21 March 	World Down Syndrome Day 	A/RES/66/149"
                            +"21 March 	International Day of Forests and the Tree 	A/RES/67/200"
                            +"draft A/C.3/66/L.27");
                    builder.setTitle(" Toady has six International Day ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }
                else if(arg2==2&&arg3==22){
                    builder.setMessage("World Water Day 22 March This year on World Water Day...International Year of Water Cooperation In December 2010, the United Nations General Assembly declared 2013 the United Nations International Year of Water Cooperation (Resolution A/RES/65/154). The Year is lead by UNESCO because of the Organization’s unique multidisciplinary approach, which blends the natural and social sciences, education, culture and communication. Given the intrinsic nature of water as a transversal and universal element, the United Nations International Year on Water Cooperation naturally would embrace and touch upon all these aspects. To find out more visit Water Cooperation 2013 website.");


                    builder.setTitle(" World Water Day 22 March ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }
                else if(arg2==2&&arg3==23){
                    builder.setMessage("World Meteorological Day  [WMO] ");
                    builder.setTitle("World Meteorological Day  [WMO] ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }
                else if(arg2==2&&arg3==24){
                    builder.setMessage("World TB Day  orld TB Day, falling on March 24th each year, is designed to build public awareness that tuberculosis today remains an epidemic in much of the world, causing the deaths of nearly one-and-a-half million people each year, mostly in developing countries. It commemorates the day in 1882 when Dr Robert Koch astounded the scientific community by announcing that he had discovered the cause of tuberculosis, the TB bacillus. At the time of Koch's announcement in Berlin, TB was raging through Europe and the Americas, causing the death of one out of every seven people. Koch's discovery opened the way towards diagnosing and curing TB."+"\n"+"International Day for the Right to the Truth concerning Gross Human Rights Violations and for the Dignity of Victims"+"The purpose of the Day is to: Honour the memory of victims of gross and systematic human rights violations and promote the importance of the right to truth and justice; Pay tribute to those who have devoted their lives to, and lost their lives in, the struggle to promote and protect human rights for all; Recognize, in particular, the important work and values of Archbishop Oscar Arnulfo Romero, of El Salvador, who was assasinated on 24 March 1980, after denouncing violations of the human rights of the most vulnerable populations and defending the principles of protecting lives, promoting human dignity and opposition to all forms of violence. The UN General Assembly, in its resolution, invites all Member States, international organizations and civil society organizations and individuals, to observe the International Day in an appropriate manner.");
                    builder.setTitle("World TB Day  "+"\n"+"International Day for the Right to the Truth concerning Gross Human Rights Violations and for the Dignity of Victims");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }
                else if(arg2==2&&arg3==25){
                    builder.setMessage(" 	International Day of Remembrance of the Victims of Slavery and the Transatlantic Slave Trade More http://www.un.org/en/events/slaveryremembranceday/ "+"\n"+"International Day of Solidarity with Detained and Missing Staff Members more: http://www.un.org/en/events/detainedstaffday/");
                    builder.setTitle(" 	International Day of Remembrance of the Victims of Slavery and the Transatlantic Slave Trade  "+"\n"+"International Day of Solidarity with Detained and Missing Staff Members");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();


                }
                else if(arg2==2&&arg3==26){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==27){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==28){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==2&&arg3==29){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==2&&arg3==30){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();}
                else if(arg2==2&&arg3==31){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                //-------
                else if(arg2==3&&arg3==1){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==3&&arg3==2){
                    builder.setMessage("Autism is a lifelong developmental disability that manifests itself during the first three years of life. The rate of autism in all regions of the world is high and it has a tremendous impact on children, their families, communities and societies.Throughout its history, the United Nations family has promoted the rights and well-being of the disabled, including children with developmental disabilities. In 2008, the Convention on the Rights of Persons with Disabilities entered into force, reaffirming the fundamental principle of universal human rights for all.The United Nations General Assembly unanimously declared 2 April as World Autism Awareness Day (A/RES/62/139) to highlight the need to help improve the lives of children and adults who suffer from the disorder so they can lead full and meaningful lives.");
                    builder.setTitle("  	World Autism Awareness Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }else if(arg2==3&&arg3==3){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==3&&arg3==4){
                    builder.setMessage(" On 8 December 2005, the General Assembly declared that 4 April of each year shall be observed as the International Day for Mine Awareness and Assistance in Mine Action. It called for continued efforts by States, with the assistance of the United Nations and relevant organizations, to foster the establishment and development of national mine-action capacities in countries where mines and explosive remnants of war constitute a serious threat to the safety, health and lives of the civilian population, or an impediment to social and economic development at the national and local levels. ");
                    builder.setTitle("International Day for Mine Awareness and Assistance in Mine Actiony");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }
                else if(arg2==3&&arg3==5){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==3&&arg3==6){
                    builder.setMessage(" 	International Day of Sport for Development and Peace");
                    builder.setTitle(" 	International Day of Sport for Development and Peace");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();


                }
                else if(arg2==3&&arg3==7){
                    builder.setMessage(" Day of Remembrance of the Victims of the Rwanda Genocide.	more: http://www.un.org/en/preventgenocide/rwanda/commemoration/annualcommemoration.shtml"+"\n"+"World Health Day [WHO] More: http://www.who.int/campaigns/world-health-day/2014/en/index.html");
                    builder.setTitle(" Two days:	1.Day of Remembrance of the Victims of the Rwanda Genocide && 2. World Health Day [WHO]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==3&&arg3==8){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==3&&arg3==9){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }

                else if(arg2==3&&arg3==10){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==3&&arg3==11){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==3&&arg3==12){
                    builder.setMessage("The General Assembly, in its resolution A/RES/65/271 of 7 April 2011, declared 12 April as the International Day of Human Space Flight “to celebrate each year at the international level the beginning of the space era for mankind, reaffirming the important contribution of space science and technology in achieving sustainable development goals and increasing the well-being of States and peoples, as well as ensuring the realization of their aspiration to maintain outer space for peaceful purposes.12 April 1961 was the date of the first human space flight, carried out by Yuri Gagarin, a Soviet citizen. This historic event opened the way for space exploration for the benefit of all humanity.The General Assembly expressed its deep conviction of the common interest of mankind in promoting and expanding the exploration and use of outer space, as the province of all mankind, for peaceful purposes and in continuing efforts to extend to all States the benefits derived there from.");
                    builder.setTitle(" 	International Day of Human Space Flight");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==3&&arg3==13){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==3&&arg3==14){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==3&&arg3==15){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==3&&arg3==16){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==3&&arg3==17){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==3&&arg3==18){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==3&&arg3==19){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==3&&arg3==20){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==3&&arg3==21){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==3&&arg3==22){
                    builder.setMessage(" From a man in the Maldives worried about relocating his family as sea levels rise, to a polar bear in the melting artic, climate change has many faces. To celebrate International Mother Earth Day, images of people, animals, and places directly affected or threatened by climate change – as well as images of people stepping up to do something about it, have been collected all around the world. (See the gallery) Mother Earth is a common expression for the planet Earth in a number of countries and regions, which reflects the interdependence that exists among human beings, other living species and the planet. For instance, Bolivians call Mother Earth Pachamama and Nicaraguans refer to her as Tonantzin.The proclamation of 22 April as International Mother Earth Day is an acknowledgement that the Earth and its ecosystems provide its inhabitants with life and sustenance. It also recognizes a collective responsibility, as called for in the 1992 Rio Declaration, to promote harmony with nature and the Earth to achieve a just balance among the economic, social and environmental needs of present and future generations of humanity. Recognizing that Mother Earth reflects the interdependence that exists among human beings, other living species and the planet we all inhabit, the General Assembly declared 22 April as International Mother Earth Day (A/RES/63/278) to highlight the need to help improve the lives of children and adults who suffer from the disorder so they can lead full and meaningful lives.");
                    builder.setTitle("  	International Mother Earth Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Intent i=new Intent("com.example.nationalandinternationaldays.MainActivity");
                            startActivity(i);

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==3&&arg3==23){
                    builder.setMessage("World Book Capital 2013: Bangkok 23 April is a symbolic date for world literature for on this date in 1616, Cervantes, Shakespeare and Inca Garcilaso de la Vega all died. It is also the date of birth or death of other prominent authors such as Maurice Druon, Haldor K.Laxness, Vladimir Nabokov, Josep Pla and Manuel Mejía Vallejo."+"\n"+"2. English, along with French, is one of the two working languages of the United Nations Secretariat, and one of the Organization's six official and working languages. Because it is so widely spoken, English is often referred to as a world language or the lingua franca of the modern era. ");
                    builder.setTitle("Two days 1.World Book and Copyright Day 2.English Language Day ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==3&&arg3==24){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==3&&arg3==25){
                    builder.setMessage("22 April 2013 -- World Malaria Day will be celebrated on 25 April 2013. The global campaign theme for 2013 and the coming years is Invest in the future. Defeat malaria. World Malaria Day was instituted by WHO Member States during the 2007 World Health Assembly. It is an occasion to highlight the need for continued investment and sustained political commitment for malaria prevention and control. It is also an opportunity for new donors to join the global malaria partnership, and for research and academic institutions to showcase their scientific work. ");
                    builder.setTitle(" World Malaria Day [WHO] ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==3&&arg3==26){
                    builder.setMessage("On April 26 every year, we celebrate World Intellectual Property Day in order to promote discussion of the role of intellectual property (IP) in encouraging innovation and creativity.In 2000, WIPO's member states designated April 26 – the day on which the WIPO Convention came into force in 1970 – as World IP Day with the aim of increasing general understanding of IP. Since then, World IP Day has offered a unique opportunity each year to join with others around the globe to consider how IP contributes to the flourishing of music and the arts and to driving the technological innovation that helps shape our world.");
                    builder.setTitle(" World Intellectual Property Day [WIPO] ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==3&&arg3==27){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==3&&arg3==28){
                    builder.setMessage("The World Day for Safety and Health at Work is an annual international campaign to promote safe, healthy and decent work. It is held on 28 April and has been observed by the International Labour Organization (ILO) since 2003. More: http://www.un.org/en/events/safeworkday/");
                    builder.setTitle(" 	World Day for Safety and Health at Work [ILO]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==3&&arg3==29){
                    builder.setMessage("On this Remembrance Day, I urge the international community to intensify efforts to rid the world of chemical weapons, along with all other weapons of mass destruction. Let us work together to bring all States under the Convention and promote its full implementation. This is how we can best honour past victims and liberate future generations from the threat of chemical weapons.UN Secretary-General Ban Ki-moon more: http://www.un.org/en/events/chemwarfareday/");
                    builder.setTitle("Day of Remembrance for all Victims of Chemical Warfare");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }else if(arg2==3&&arg3==30){

                    builder.setMessage("One of the greatest cultural expressions of the 20th century, jazz is already capturing the spirit of the 21st. In times of change and uncertainty, we need the power of jazz more than ever before to bring people together and to strengthen respect for shared values.Irina Bokova, Director General Message on the occasion of the International Jazz Day 30 April More: http://www.un.org/en/events/jazzday/");
                    builder.setTitle(" 	International Jazz Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                //---------------
                else if(arg2==4&&arg3==1){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==4&&arg3==2){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==4&&arg3==3){
                    builder.setTitle("World Press Freedom Day ");
                    builder.setMessage(" World Press Freedom Day celebrates its 20th anniversary in 2013. The Day was proclaimed by the UN General Assembly in December 1993, following the recommendation of UNESCO's General Conference. Since then, 3 May, the anniversary of the Declaration of Windhoek is celebrated worldwide as World Press Freedom Day. It is an opportunity to:celebrate the fundamental principles of press freedom;assess the state of press freedom throughout the world;defend the media from attacks on their independence;pay tribute to journalists who have lost their lives in the line of duty.");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }
                else if(arg2==4&&arg3==4){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==4&&arg3==5){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==4&&arg3==6){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==4&&arg3==7){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==4&&arg3==8){
                    builder.setMessage("By resolution 59/26 of 22 November 2004, the UN General Assembly declared 8–9 May as a time of remembrance and reconciliation and, while recognizing that Member States may have individual days of victory, liberation and commemoration, invited all Member States, organizations of the United Nations System, non-governmental organizations and individuals to observe annually either one or both of these days in an appropriate manner to pay tribute to all victims of the Second World War.The Assembly stressed that this historic event established the conditions for the creation of the United Nations, designed to save succeeding generations from the scourge of war, and called upon the Member States of the United Nations to unite their efforts in dealing with new challenges and threats, with the United Nations playing a central role, and to make every effort to settle all disputes by peaceful means in conformity with the Charter of the United Nations and in such a manner that international peace and security are not endangered.On 2 March 2010, by resolution 64/257, the General Assembly invited all Member States, organizations of the United Nations system, non-governmental organizations and individuals to observe these days in an appropriate manner to pay tribute to all victims of the Second World War. A special solemn meeting of the General Assembly in commemoration of all victims of the war was held in the second week of May 2010, marking the sixty-fifth anniversary of the end of the Second World War.");
                    builder.setTitle("Time of Remembrance and Reconciliation for Those Who Lost Their Lives during the Second World War");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }
                else if(arg2==4&&arg3==9){
                    builder.setMessage("By resolution 59/26 of 22 November 2004, the UN General Assembly declared 8–9 May as a time of remembrance and reconciliation and, while recognizing that Member States may have individual days of victory, liberation and commemoration, invited all Member States, organizations of the United Nations System, non-governmental organizations and individuals to observe annually either one or both of these days in an appropriate manner to pay tribute to all victims of the Second World War.The Assembly stressed that this historic event established the conditions for the creation of the United Nations, designed to save succeeding generations from the scourge of war, and called upon the Member States of the United Nations to unite their efforts in dealing with new challenges and threats, with the United Nations playing a central role, and to make every effort to settle all disputes by peaceful means in conformity with the Charter of the United Nations and in such a manner that international peace and security are not endangered.On 2 March 2010, by resolution 64/257, the General Assembly invited all Member States, organizations of the United Nations system, non-governmental organizations and individuals to observe these days in an appropriate manner to pay tribute to all victims of the Second World War. A special solemn meeting of the General Assembly in commemoration of all victims of the war was held in the second week of May 2010, marking the sixty-fifth anniversary of the end of the Second World War.");
                    builder.setTitle("Time of Remembrance and Reconciliation for Those Who Lost Their Lives during the Second World War");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }

                else if(arg2==4&&arg3==10){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==4&&arg3==11){
                    builder.setMessage("World Migratory Bird Day [UNEP] More: http://www.worldmigratorybirdday.org/");
                    builder.setTitle("World Migratory Bird Day [UNEP] ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }
                else if(arg2==4&&arg3==12){
                    builder.setMessage("World Migratory Bird Day [UNEP] More: http://www.worldmigratorybirdday.org/");
                    builder.setTitle("World Migratory Bird Day [UNEP] ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==4&&arg3==13){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==4&&arg3==14){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==4&&arg3==15){
                    builder.setMessage("The International Day of Families is observed on the 15th of May every year. The Day was proclaimed by the UN General Assembly in 1993 with resolution A/RES/47/237 and reflects the importance the international community attaches to families. The International Day provides an opportunity to promote awareness of issues relating to families and to increase knowledge of the social, economic and demographic processes affecting families.In its resolution, the General Assembly also noted that the family-related provisions of the outcomes of the major United Nations conferences and summits of the 1990s and their follow-up processes continue to provide policy guidance on ways to strengthen family-centred components of policies and programmes as part of an integrated comprehensive approach to development.The International Day of Families has inspired a series of awareness-raising events, including national family days. In many countries, that day provides an opportunity to highlight different areas of interest and importance to families. Activities include workshops and conferences, radio and television programmes, newspaper articles and cultural programmes highlighting relevant themes. ");
                    builder.setTitle("International Day of Families ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }
                else if(arg2==4&&arg3==16){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==4&&arg3==17){
                    builder.setMessage("The purpose of  World Telecommunication and Information Society Day (WTISD) is to help raise awareness of the possibilities that the use of the Internet and other information and communication technologies (ICT) can bring to societies and economies, as well as of ways to bridge the digital divide. 17 May marks the anniversary of the signing of the first International Telegraph Convention and the creation of the International Telecommunication Union.");
                    builder.setTitle("World Telecommunication and Information Society Day [ITU]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==4&&arg3==18){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==4&&arg3==19){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==4&&arg3==20){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==4&&arg3==21){
                    builder.setMessage("In 2001, UNESCO adopted the Universal Declaration on Cultural Diversity and in December 2002, the UN General Assembly, in its resolution 57/249, declared May 21 to be the World Day for Cultural Diversity for Dialogue and Development.The day provides us with an opportunity to deepen our understanding of the values of cultural diversity and to learn to live together better.In 2011, a grassroots campaign ‘Do One Thing For Diversity and Inclusion’, celebrating the annual World Day for Cultural Diversity was launched by UNESCO and the UN Alliance of Civilizations.The 2013 campaign, by encouraging people and organizations from around the world to take concrete action to support diversity, aims:To raise awareness worldwide about the importance of intercultural dialogue, diversity and inclusion. To build a world community of individuals committed to support diversity with real and every day-life gestures.To combat polarization and stereotypes to improve understanding and cooperation among people from different cultures.  The campaign works through a dedicated Facebook page, serving as a platform for people around the world to share their experiences through posts and videos.");
                    builder.setTitle(" World Day for Cultural Diversity for Dialogue and Development");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==4&&arg3==22){
                    builder.setMessage("International Day for Biological Diversity The 2013 theme (Water and Biodiversity) was chosen to coincide with the United Nations designation of 2013 as the International Year of Water Cooperation. The theme speaks to the important role of biodiversity and ecosystems in providing for water security, and therefore for sustainable development.The United Nations General Assembly, by its resolution 55/201 of 20 December 2000, proclaimed 22 May as The International Day for Biological Diversity, to increase understanding and awareness of biodiversity issues. The date designated for the day was chosen to commemorate the adoption of the text of the Convention on 22 May 1992 by the Nairobi Final Act of the Conference for the Adoption of the Agreed Text of the Convention on Biological Diversity.The day was first created by the Second Committee of the UN General Assembly in late 1993, and the UN General Assembly, by its resolution 49/119 of 19 December 1994, designated December 29th (the date of entry into force of the Convention of Biological Diversity) the International Day for Biological Diversity. However, it was difficult for many countries to plan and carry out suitable celebrations for the date of 29 December, given the number of holidays that coincide around that time of year.");
                    builder.setTitle(" 	International Day for Biological Diversity");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==4&&arg3==23){
                    builder.setMessage("Obstetric fistula is a preventable and treatable childbearing injury - the result of prolonged, obstructed labour. It leaves women incontinent, ashamed and often isolated from their communities. A debilitating condition that has left — and continues to leave — hundreds of thousands of women suffering in solitude and shame, obstetric fistula is perhaps one of the most telling examples of inequitable access to maternal health care and, until recently, one of the most hidden. Over 300 million women worldwide sufferfrom complications of pregnancy and delivery. For every woman who dies of maternal related causes, at least 20 women experience a maternal morbidity, of which obstetric fistula is one of the most severe forms. The Campaign to End Fistula, launched by UNFPA and partners in 2003 is now present in 50 countries across Africa, Asia and the Arab region. In its resolution A/RES/67/147, the General Assembly calls on the international community to use the International Day to significantly raise awareness and intensify actions towards ending obstetric fistula.");
                    builder.setTitle("International Day to End Obstetric Fistula");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==4&&arg3==24){
                    builder.setMessage("Vesak, the Day of the Full Moon in the month of May, is the most sacred day to millions of Buddhists around the world. It was on the Day of Vesak two and a half millennia ago, in the year 623 B.C., that the Buddha was born. It was also on the Day of Vesak that the Buddha attained enlightenment, and it was on the Day of Vesak that the Buddha in his eightieth year passed away.The General Assembly, by its resolution 54/115 of 1999, recognized internationally the Day of Vesak to acknowledge the contribution that Buddhism, one of the oldest religions in the world, has made for over two and a half millennia and continues to make to the spirituality of humanity. This day is commemorated annually at the UN Headquarters and other UN offices, in consultation with the relevant UN offices and with permanent missions, which also wish to be consulted.");
                    builder.setTitle("Vesak the Day of the Full Moon ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==4&&arg3==25){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==4&&arg3==26){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==4&&arg3==27){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==4&&arg3==28){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==4&&arg3==29){
                    builder.setMessage("Since its beginning in 1948, United Nations peacekeeping has evolved into one of the main tools used by the international community to manage complex crises that threaten international peace and security.The International Day of United Nations Peacekeepers, which is commemorated each year on the 29th of May, is an occasion to salute the more than 111,000 peacekeepers serving in 15 missions in some of the world's most volatile and dangerous environments. This Day is also a time to mourn fallen peacekeepers. During its history, more than 3,100 Blue Helmets have died devoting their lives to peace, including 111 men and women in 2012.");
                    builder.setTitle("International Day of UN Peacekeepers");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }else if(arg2==4&&arg3==30){Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==4&&arg3==31){
                    builder.setMessage("World No-Tobacco Day [WHO] More: http://www.who.int/tobacco/wntd/en/");
                    builder.setTitle("World No-Tobacco Day [WHO]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }
                //june


                else if(arg2==5&&arg3==1){
                    builder.setMessage(" The Global Day of Parents is observed on the 1st of June every year. The Day was proclaimed by the UN General Assembly in 2012 with resolution A/RES/66/292 and honours parents throughout the world. The Global Day provides an opportunity to appreciate all parents in all parts of the world for their selfless commitment to children and their lifelong sacrifice towards nurturing this relationship.In its resolution, the General Assembly also noted that the family has the primary responsibility for the nurturing and protection of children and that children, for the full and harmonious development of their personality, should grow up in a family environment and in an atmosphere of happiness, love and understanding.The resolution recognizes the role of parents in the rearing of children and invites Member States to celebrate the Day in full partnership with civil society, particularly involving young people and children. ");
                    builder.setTitle("Global Day of Parents");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }else if(arg2==5&&arg3==2){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==5&&arg3==3){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==5&&arg3==4){
                    builder.setMessage("International Day of Innocent Children Victims of Aggression--On 19 August 1982, at its emergency special session on the question of Palestine, the General Assembly, “appalled at the great number of innocent Palestinian and Lebanese children victims of Israel’s acts of aggression”, decided to commemorate 4 June of each year as the International Day of Innocent Children Victims of Aggression (resolution ES-7/8).The purpose of the day is to acknowledge the pain suffered by children throughout the world who are the victims of physical, mental and emotional abuse. This day affirms the UN's commitment to protect the rights of children.");
                    builder.setTitle("International Day of Innocent Children Victims of Aggression");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==5&&arg3==5){
                    builder.setMessage("More about this day--http://www.unep.org/wed/");
                    builder.setTitle("World Environment Day [UNEP]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==5&&arg3==6){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==5&&arg3==7){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==5&&arg3==8){
                    builder.setMessage(" By its resolution 63/111 of 5 December 2008, the UN General Assembly designated 8 June as World Oceans Day.The official designation of World Oceans Day is an opportunity to raise global awareness of the challenges faced by the international community in connection with the oceans.The lungs of our planet, providing most of the oxygen we breathe, the oceans are also a major source of food and medicines and a critical part of the biosphere.The General Assembly recognized the important contribution of sustainable development and management of the resources and uses of the oceans and seas to the achievement of international development goals, including those contained in the United Nations Millennium Declaration.The resolution calls upon user States and States bordering straits used for international navigation to continue to cooperate by agreement on matters relating to navigational safety, including safety aids for navigation, and the prevention, reduction and control of pollution from ships.Member states are also urged to increase the coverage of hydrographic information on a global basis to enhance capacity-building and technical assistance and to promote safe navigation, especially in areas used for international navigation, in ports and where there are vulnerable or protected marine areas.");
                    builder.setTitle("World Oceans Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==5&&arg3==9){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==5&&arg3==1){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==5&&arg3==10){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==5&&arg3==11){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==5&&arg3==12){
                    builder.setMessage("The International Labour Organization (ILO) launched the World Day Against Child Labour in 2002 to focus attention on the global extent of child labour and the action and efforts needed to eliminate it. Each year on 12 June, the World Day brings together governments, employers and workers organizations, civil society, as well as millions of people from around the world to highlight the plight of child labourers and what can be done to help them.Around the world, large numbers of children are engaged in paid or unpaid domestic work in the home of a third party or employer. These children can be particularly vulnerable to exploitation. Their work is often hidden from the public eye, they may be isolated, and they may be working far away from their family home. Stories of the abuse of children in domestic work are all too common. On the 2013 World Day Against Child Labour the ILO calls for:Legislative and policy reforms to ensure the elimination of child labour in domestic work and the provision of decent work conditions and appropriate protection to young workers in domestic work who have reached the legal working age.Ratify ILO Convention No. 189 concerning decent work for domestic workers and its implementation along with the ILO’s child labour Convention. 1Action to build the Worldwide movement against child labour and to build the capacity of domestic workers organizations to address child labour.");
                    builder.setTitle("World Day Against Child Labour");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==5&&arg3==13){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==5&&arg3==15){
                    builder.setMessage("The global population of people aged 60 years and older will more than double, from 542 million in 1995 to about 1.2 billion in 2025. Around 4 to 6% of elderly people have experienced some form of maltreatment at home. Elder maltreatment can lead to serious physical injuries and long-term psychological consequences. The incidence of abuse towards older people is predicted to increase as many countries are experiencing rapidly ageing populations.Elder abuse is a global social issue which affects the health and human rights of millions of older persons around the world, and an issue which deserves the attention of the international community.The United Nations General Assembly, in its resolution 66/127, designated June 15 as World Elder Abuse Awareness Day. It represents the one day in the year when the whole world voices its opposition to the abuse and suffering inflicted to some of our older generations.");
                    builder.setTitle(" 	World Elder Abuse Awareness Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }
                else if(arg2==5&&arg3==14){
                    builder.setMessage("12 June 2013 -- World Blood Donor Day, celebrated on 14 June every year, serves to raise awareness of the need for safe blood and blood products and to thank voluntary unpaid blood donors for their life-saving gifts of blood. With the slogan Give the gift of life: donate blood, this year’s campaign, the 10th anniversary of World Blood Donor Day, will focus on the value of donated blood to the patient, not only in saving life, but also in helping people live longer and more productive lives. ");
                    builder.setTitle("World Blood Donor Day [WHO]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==5&&arg3==16){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==5&&arg3==17){
                    builder.setMessage("Freshwater is valuable. Of all the water on Earth, only 2.5 per cent is freshwater. And of all this freshwater, the total usable supply for ecosystems and humans is less than 1 per cent. When demand for water exceeds available supply, it results in water scarcity. Drylands are particularly vulnerable to water scarcity.MOre: http://www.un.org/en/events/desertificationday/");
                    builder.setTitle("World Day to Combat Desertification and Drought]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==5&&arg3==18){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==5&&arg3==19){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==5&&arg3==20){
                    builder.setMessage("For years, many countries and regions have been holding their own Refugee Days and even Weeks. One of the most widespread is Africa Refugee Day, which is celebrated on 20 June in several countries.The UN General Assembly, on 4 December 2000, adopted resolution 55/76 where it noted that 2001 marked the 50th anniversary of the 1951 Convention relating to the Status of Refugees, and that the Organization of African Unity (OAU) had agreed to have International Refugee Day coincide with Africa Refugee Day on 20 June.The General Assembly therefore decided that 20 June would be celebrated as World Refugee Day.");
                    builder.setTitle("World Refugee Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==5&&arg3==21){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==5&&arg3==22){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==5&&arg3==23){
                    builder.setMessage("The UN General Assembly, in its resolution 57/277, designated 23 June as Public Service Day.The UN Public Service Day intends to celebrate the value and virtue of public service to the community; highlight the contribution of public service in the development process; recognize the work of public servants, and encourage young people to pursue careers in the public sector.Since the first Awards Ceremony in 2003, the United Nations has received an increasing number of submissions from all around the world."+"\n"+"Absent in statistics, unnoticed by researchers, neglected by national and local authorities and mostly overlooked by civil society organizations – the situation of widows is, in effect, invisible.Yet abuse of widows and their children constitutes one of the most serious violations of human rights and obstacles to development today. Millions of the world’s widows endure extreme poverty, ostracism, violence, homelessness, ill health and discrimination in law and custom.To give special recognition to the situation of widows of all ages and across regions and cultures, the United Nations General Assembly declared 23 June 2011 as the first-ever International Widows’ Day, to be celebrated annually.");
                    builder.setTitle("Tow day: 1.United Nations Public Service Day 2. 	International Widows' Day ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==5&&arg3==24){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==5&&arg3==25){
                    builder.setMessage("We are happy to report that the campaign was once again very successful It generated numerous web stories, videos, blog postings, news articles and opinion pieces from experts and media outlets, which together attracted thousands of individuals to the many social networks linked to the Day of the Seafarer.The level of participation was much greater than in 2012. The number of Twitter messages reached more than ten million people, while Facebook reached more than 300,000 users. This year the toolkit was made available on a new social platform called Slide Share which was viewed more than 10,000 times.The message of the Secretary-General was copied on DVDs and distributed on board vessels, and was watched by thousands of people in addition to the views generated on the IMO YouTube channel. The campaign effectively brought about a global conversationamong individuals, organizations, industry players and seafarers themselves and raised awareness of the vital role that seafarers play in the global economy.For the first time, this year, IMO staff gave interviews to the United Nations Radio in Chinese, English, French, Portuguese and SpanishWe received hundreds of photos from organizations, companies, governments and seafarers themselves. Have a look at this selection of photos from around the world.");
                    builder.setTitle(" 	Day of the Seafarer [IMO]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==5&&arg3==26){
                    builder.setMessage("1.International Day against Drug Abuse and Illicit Trafficking  more: http://www.un.org/en/events/drugabuseday/2. United Nations International Day in Support of Victims of Torture more: http://www.un.org/en/events/torturevictimsday/");
                    builder.setTitle("Two International Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==5&&arg3==27){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==5&&arg3==28){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==5&&arg3==29){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==5&&arg3==30){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==5&&arg3==31){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }

                //july
                else if(arg2==6&&arg3==1){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==6&&arg3==2){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();

                }else if(arg2==6&&arg3==3){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==4){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==5){
                    builder.setMessage("In 1992, the United Nations General Assembly proclaimed, in its resolution 47/90 of 16 December 1992, the International Day of Cooperatives to be celebrated annually on the first Saturday of July.The aim of this International Day is to:Increase awareness on cooperatives; Highlight the complementarily of the goals and objectives of the United Nations and the international cooperative movement;Underscore the contribution of the movement to the resolution of the major problems addressed by the United Nations; Strengthen and extend partnerships between the international cooperative movement and other actors, including governments, at local, national and international levels.");
                    builder.setTitle("International Day of Cooperatives");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==6&&arg3==6){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==7){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==8){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==9){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==1){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==10){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==11){
                    builder.setMessage("As the world population edged to 7 billion people in 2011 (up from 2.5 billion in 1950), it has had profound implications for development. A world of 7 billion is both a challenge and an opportunity with implications on sustainability, urbanization, access to health services and youth empowerment.In 1989, in its decision 89/46, the Governing Council of the United Nations Development Programme recommended that, in order to focus attention on the urgency and importance of population issues in the context of overall development plans and programmes and the need to find solutions for these issues, 11 July should be observed by the international community as World Population Day.About 16 million girls under age 18 give birth each year. Another 3.2 million undergo unsafe abortions. The vast majority – 90 per cent -- of the pregnant adolescents in the developing world are married. But for far too many of these girls, pregnancy has little to do with informed choice. Often it is a consequence of discrimination, rights violations (including child marriage), inadequate education or sexual coercion.On 2013 World Population Day, we raise awareness of the issue of adolescent pregnancy in the hopes of delivering a world where every pregnancy is wanted, every childbirth is safe, and every young person’s potential is fulfilled.");
                    builder.setTitle("World Population Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==6&&arg3==12){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==13){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==14){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==15){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==16){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==17){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==18){
                    builder.setMessage("Every year on 18 July — the day Nelson Mandela was born — the UN joins a call by the Nelson Mandela Foundation to devote 67 minutes of time to helping others, as a way to mark Nelson Mandela International Day.For 67 years Nelson Mandela devoted his life to the service of humanity — as a human rights lawyer, a prisoner of conscience, an international peacemaker and the first democratically elected president of a free South Africa");
                    builder.setTitle("Nelson Mandela International Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==6&&arg3==19){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==20){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==21){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==22){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==23){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==24){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==25){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==26){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==27){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==6&&arg3==28){
                    builder.setMessage("World Hepatitis Alliance“It’s closer than you think” is the theme of this year’s World Hepatitis Day, which takes place on 28 July 2012.The campaign focuses on raising awareness of the different forms of hepatitis: what they are and how they are transmitted; who is at risk; and the various methods of prevention and treatment.Despite its staggering toll on health, hepatitis remains a group of diseases that are largely unknown, undiagnosed and untreated.More: http://www.who.int/csr/disease/hepatitis/world_hepatitis_day/en/");
                    builder.setTitle("World Hepatitis Day [WHO]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==6&&arg3==29){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==6&&arg3==30){
                    builder.setMessage("The International Day of Friendship was proclaimed in 2011 by the UN General Assembly with the idea that friendship between peoples, countries, cultures and individuals can inspire peace efforts and build bridges between communities.The resolution (A/RES/65/275) places particular emphasis on involving young people, as future leaders, in community activities that include different cultures and promote international understanding and respect for diversity.The Day is also intended to support the goals and objectives of the Declaration and Programme of Action on a Culture of Peace and the International Decade for a Culture of Peace and Non-Violence for the Children of the World (2001-2010).To mark the International Day of Friendship the UN encourages governments, international organizations and civil society groups to hold events, activities and initiatives that contribute to the efforts of the international community towards promoting a dialogue among civilizations, solidarity, mutual understanding and reconciliation.");
                    builder.setTitle("International Day of Friendship");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }else if(arg2==6&&arg3==31){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }

                //aug
                else if(arg2==7&&arg3==1){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==7&&arg3==2){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();

                }else if(arg2==7&&arg3==3){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==4){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==5){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==6){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==7){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==8){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==9){
                    builder.setMessage("The International Day of the World's Indigenous People (9 August) was first proclaimed by the General Assembly in December 1994, to be celebrated every year during the first International Decade of the World's Indigenous People (1995 – 2004).MOre: http://www.un.org/en/events/indigenousday/");
                    builder.setTitle("International Day of the World's Indigenous Peoples");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==7&&arg3==1){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==10){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==11){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==12){
                    builder.setMessage("On 17 December 1999, in its resolution 54/120, the United Nations General Assembly endorsed the recommendation made by the World Conference of Ministers Responsible for Youth (Lisbon, 8-12 August 1998) that 12 August be declared International Youth Day. More: http://www.un.org/en/events/youthday/");
                    builder.setTitle("International Youth Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==7&&arg3==13){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==14){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==15){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==16){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==17){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==18){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==19){
                    builder.setMessage("World Humanitarian Day is a time to recognize those who face danger and adversity in order to help others. The day was designated by the General Assembly to coincide with the anniversary of the 2003 bombing of the United Nations headquarters in Baghdad, Iraq.19 August, 2013 marks 10 years since that tragic event, which claimed 22 lives. This year, the international community will pause to remember those who died, as well as the dozens of aid workers, who have died in the years since.But World Humanitarian Day is also an opportunity to celebrate the spirit that inspires humanitarian work around the globe.This year the UN and its humanitarian partners are launching a ground-breaking campaign called The world needs more… This is a first-of-its-kind project that will quite literally turn words into aid. More: http://www.un.org/en/events/humanitarianday/");
                    builder.setTitle("World Humanitarian Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==7&&arg3==20){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==21){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==22){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==23){
                    builder.setMessage("Message from Ms Irina Bokova, Director-General of UNESCO, on the occasion of the International Day for the Remembrance of the Slave Trade and its Abolition, 23 August 2013   . More : http://www.unesco.org/new/en/unesco/events/prizes-and-celebrations/celebrations/international-days/slave-trade-and-its-abolition/");
                    builder.setTitle(" 	International Day for the Remembrance of the Slave Trade and Its Abolition [UNESCO]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==7&&arg3==24){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==25){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==26){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==27){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==28){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==7&&arg3==29){
                    builder.setMessage("Since nuclear weapons testing began in the mid-twentieth century, with the first test on 16 July 1945, nearly 2,000 have taken place. There has been little consideration of the devastating effects of testing on human life, let alone the understanding of nuclear fallout from atmospheric tests.  More:http://www.un.org/en/events/againstnucleartestsday/ ");
                    builder.setTitle("International Day against Nuclear Tests");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }else if(arg2==7&&arg3==30){
                    builder.setMessage("Enforced disappearance has frequently been used as a strategy to spread terror within the society. The feeling of insecurity generated by this practice is not limited to the close relatives of the disappeared, but also affects their communities and society as a whole.    More: http://www.un.org/en/events/disappearancesday/");
                    builder.setTitle("International Day of the Victims of Enforced Disappearances");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }else if(arg2==7&&arg3==31){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                //aug
                else if(arg2==8&&arg3==1){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==8&&arg3==2){

                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==8&&arg3==3){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==8&&arg3==4){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==8&&arg3==5){
                    builder.setMessage("Poverty persists in all countries of the world, ‎regardless of their economic, social and cultural situation, particularly in developing countries.In recognition of the role of charity in alleviating humanitarian crises and human ‎suffering within and among nations, as well as of the efforts of charitable organizations ‎and individuals, including the work of Mother Teresa, the General Assembly of the ‎United Nations in its resolution A/RES/67/105PDF document designated the 5th of September, the ‎anniversary of the death of Mother Teresa, as the International Day of Charity.‎On this International Day of Charity, the United Nations invites all Member States and all international and regional organizations, as well as civil society, including non-governmental organizations and individuals, to commemorate the Day in an appropriate manner, by encouraging charity, including through education and public awareness-raising activities. ");
                    builder.setTitle("International Day of Charity");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==8&&arg3==6){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==8&&arg3==7){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==8&&arg3==8){
                    builder.setMessage("Literacy is a right and a foundation for lifelong learning, better well-being and livelihoods. As such it is a driver for sustainable and inclusive development.  Over the years, the notion of  literacy has evolved. The conventional concept limited to reading, writing and numeracy skills is still in wide use, as well as the notion of functional literacy which links literacy with socio-economic development. But other ways of understanding “literacy” or “literacies” have emerged to address the diverse learning needs  of individuals in knowledge-oriented and globalized societies.  More: http://www.unesco.org/new/en/unesco/events/prizes-and-celebrations/celebrations/international-days/literacy-day/");
                    builder.setTitle("International Literacy Day [UNESCO]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==8&&arg3==9){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }

                else if(arg2==8&&arg3==10){
                    builder.setMessage("World Suicide Prevention Day (WSPD), on 10 September, is organized by the International Association for Suicide Prevention (IASP). The purpose of this day is to raise awareness around the globe that suicide can be prevented.  More:  http://www.who.int/mental_health/prevention/suicide/wspd/en/");
                    builder.setTitle("World Suicide Prevention Day [WHO]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==8&&arg3==11){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==8&&arg3==12){
                    builder.setMessage("South-South cooperation, as an important element of international cooperation for development, offers viable opportunities for developing countries and countries with economies in transition in their individual and collective pursuit of sustained economic growth and sustainable development.Developing countries have the primary responsibility for promoting and implementing South-South cooperation, not as a substitute for but rather as a complement to North-South cooperation, and in this context reiterating the need for the international community to support the efforts of the developing countries to expand South-South cooperation.  More: http://www.un.org/en/events/southcooperationday/");
                    builder.setTitle("United Nations Day for South-South Cooperation");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==8&&arg3==13){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==8&&arg3==14){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==8&&arg3==15){
                    builder.setMessage(" Democracy is a universal value based on the freely expressed will of people to determine their own political, economic, social and cultural systems and their full participation in all aspects of their lives. While democracies share common features, there is no single model of democracy. Activities carried out by the United Nations in support of efforts of Governments to promote and consolidate democracy are undertaken in accordance with the UN Charter, and only at the specific request of the Member States concerned.More :http://www.un.org/en/events/democracyday/");
                    builder.setTitle("International Day of Democracy");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==8&&arg3==16){
                    builder.setMessage("In 1994, the UN General Assembly proclaimed 16 September the International Day for the Preservation of the Ozone Layer, commemorating the date of the signing, in 1987, of the Montreal Protocol on Substances that Deplete the Ozone   More:  http://www.un.org/en/events/ozoneday/");
                    builder.setTitle(" 	International Day for the Preservation of the Ozone Layer");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==8&&arg3==17){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==8&&arg3==18){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==8&&arg3==19){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==8&&arg3==20){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==8&&arg3==21){
                    builder.setMessage(" Each year the International Day of Peace is observed around the world on 21 September. The General Assembly has declared this as a day devoted to strengthening the ideals of peace, both within and among all nations and peoples.The International Day of Peace was established in 1981 by resolution 36/67PDF document of the United Nations General Assembly to coincide with its opening session, which was held annually on the third Tuesday of September. The first Peace Day was observed in September 1982.In 2001, the General Assembly by unanimous vote adopted resolution 55/282PDF document, which established 21 September as an annual day of non-violence and cease-fire.The United Nations invites all nations and people to honour a cessation of hostilities during the Day, and to otherwise commemorate the Day through education and public awareness on issues related to peace.http://www.un.org/en/events/peaceday/");
                    builder.setTitle("International Day of Peace");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==8&&arg3==22){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==8&&arg3==23){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==8&&arg3==24){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==8&&arg3==25){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==8&&arg3==26){
                    builder.setMessage("The theme was chosen in order to focus IMO’s efforts during 2013 on carrying out the commitments made at the UN Conference on Sustainable Development, better known as Rio+20,  held in June 2012 in Rio de Janeiro, Brazil. More: http://www.un.org/en/events/maritimeday/index.shtml");
                    builder.setTitle("World Maritime Day [IMO]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==8&&arg3==27){

                    builder.setMessage(" Tourism today is a trillion dollar sector involving the movement of over one billion tourists a year around the world and another five to six billion domestically. More http://www.un.org/en/events/tourismday/index.shtml");
                    builder.setTitle("World Tourism Day [UNWTO]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==8&&arg3==28){
                    builder.setMessage("Rabies is a zoonosis (a disease that is transmitted from animals to humans) that is caused by a virus. It is known to be present in more than 150 countries and territories of all continents except Antarctica. More: http://www.who.int/rabies/en/");
                    builder.setTitle("I 	World Rabies Day [WHO]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==8&&arg3==29){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();

                }else if(arg2==8&&arg3==30){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==8&&arg3==31){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }

                //sep

                else if(arg2==9&&arg3==1){

                    builder.setMessage(" 	International Day of Older Persons : On 14 December 1990, the United Nations General Assembly (by resolution 45/106) designated 1 October the International Day of Older Persons.This was preceded by initiatives such as the Vienna International Plan of Action on Ageing - which was adopted by the 1982 World Assembly on Ageing - and endorsed later that year by the UN General Assembly. More:  http://www.un.org/en/events/olderpersonsday/");
                    builder.setTitle(" 	International Day of Older Persons");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }else if(arg2==9&&arg3==2){
                    builder.setMessage("The International Day of Non-Violence is marked on 2 October, the birthday of Mahatma Gandhi, leader of the Indian independence movement and pioneer of the philosophy and strategy of non-violence.  More: http://www.un.org/en/events/nonviolenceday/index.shtml");
                    builder.setTitle(" 	International Day of Non-Violence");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }else if(arg2==9&&arg3==3){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==9&&arg3==4){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==9&&arg3==5){
                    builder.setMessage("A Call for Teachers!” is the slogan of World Teachers’ Day 2013 (5 October), which UNESCO is celebrating along with its partners, the International Labour Organization (ILO), UNDP, UNICEF and Education International (EI).  Since teachers are the most powerful force for equity, access and quality education, a call for teachers means calling for quality education for all.  Quality education offers hope and the promise of a better standard of living. There is no stronger foundation for lasting peace and sustainable development than a quality education provided by well trained, valued, supported and motivated teachers.More: http://www.unesco.org/new/en/world-teachers-day ");
                    builder.setTitle(" 	International Day of Non-Violence");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==9&&arg3==9){
                    builder.setMessage("World Post Day is celebrated each year on 9 October, the anniversary of the establishment of the Universal Postal Union in 1874 in the Swiss Capital, Bern. It was declared World Post Day by the UPU Congress held in Tokyo, Japan in 1969.Since then, countries across the world participate annually in the celebrations. The Posts in many countries use the event to introduce or promote new postal products and services.  More: http://www.un.org/en/events/postday/");
                    builder.setTitle(" 1.	World Post Day 2.World Sight Day [WHO]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==9&&arg3==7){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==9&&arg3==8){

                }
                else if(arg2==9&&arg3==6){
                    builder.setMessage("In Resolution 40/202 of 17 December 1985, the UN General Assembly designated the first Monday of October of every year as World Habitat Day.This year, the United Nations chose the theme Urban Mobility because mobility and access to goods and services is essential to the efficient functioning of our cities and towns as they expand. Accessible cities encourage a shift towards more sustainable modes of transportation and draw more and more travellers out of cars and onto trains, buses, bike paths, and sidewalks.But mobility is about more than just the mode of transport we use. Urban planning and design should focus on how to bring people and places together, by creating cities that focus on accessibility, and optimal urban densities, rather than simply increasing the length of urban transport infrastructure. More: http://www.un.org/en/events/habitatday/ ");
                    builder.setTitle("World Habitat Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }

                else if(arg2==9&&arg3==10){
                    builder.setMessage("World Mental Health Day [WHO] ");
                    builder.setTitle("World Mental Health Day [WHO] ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==9&&arg3==11){
                    builder.setMessage("On December 19, 2011, the United Nations General Assembly adopted Resolution 66/170 to declare 11 October as the International Day of the Girl Child, to recognize girls’ rights and the unique challenges girls face around the world. For its second observance, this year’s Day will focus on “Innovating for Girls’ Education”.The fulfilment of girls’ right to education is first and foremost an obligation and moral imperative. There is also overwhelming evidence that girls’ education, especially at the secondary level, is a powerful transformative force for societies and girls themselves: it is the one consistent positive determinant of practically every desired development outcome, from reductions in mortality and fertility, to poverty reduction and equitable growth, to social norm change and democratization. More: http://www.un.org/en/events/girlchild/");
                    builder.setTitle(" 	International Day of the Girl Child");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==9&&arg3==12){

                }
                else if(arg2==9&&arg3==13){
                    builder.setMessage("By resolution 44/236 (22 December 1989), the General Assembly designated the second Wednesday of October International Day for Natural Disaster Reduction. The International Day was to be observed annually during the International Decade for Natural Disaster Reduction, 1990-1999.By resolution 64/200 of 21 December 2009 the General Assembly decided to designate 13 October as the date to commemorate the Day and to change the Day's name to International Day for Disaster Reduction. The objective of the observance is to raise awareness of how people are taking action to reduce their risk to disasters. More:  http://www.un.org/en/events/disasterreductionday/");
                    builder.setTitle("International Day for Disaster Reduction");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==9&&arg3==14){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==9&&arg3==15){
                    builder.setMessage("The first International Day of Rural Women was observed on 15 October 2008. This new international day, established by the General Assembly in its resolution 62/136 of 18 December 2007, recognizes “the critical role and contribution of rural women, including indigenous women, in enhancing agricultural and rural development, improving food security and eradicating rural poverty.”Rural women play a critical role in the rural economies of both developed and developing countries. In most parts of the developing world they participate in crop production and livestock care, provide food, water and fuel for their families, and engage in off-farm activities to diversify their families’ livelihoods. In addition, they carry out vital functions in caring for children, older persons and the sick.  More:  http://www.un.org/en/events/ruralwomenday/");
                    builder.setTitle("International Day of Rural Women");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==9&&arg3==16){
                    builder.setMessage("More: http://www.fao.org/getinvolved/worldfoodday/en/");
                    builder.setTitle(" 	World Food Day [FAO] ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==9&&arg3==17){
                    builder.setMessage("The International Day for the Eradication of Poverty has been observed every year since 1993, when the United Nations General Assembly, by resolution 47/196, designated this day to promote awareness of the need to eradicate poverty and destitution in all countries. Fighting poverty remains at the core of the Millennium Development Goals (MDGs) and the post-2015 development agenda.This year's official commemoration on 17 October at UN Headquarters will be an occasion to recognize people living in poverty as critical partners for fighting the development challenges we face. The commemoration at the UN is organized in partnership with the International Movement ATD Fourth World, the NGO Sub-committee for the Eradication of Poverty and the UN Department of Economic and Social Affairs, supported by the Missions of France and Burkina Faso to the UN. More: http://www.un.org/en/events/povertyday/");
                    builder.setTitle("International Day for the Eradication of Poverty ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==9&&arg3==18){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==9&&arg3==19){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==9&&arg3==20){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==9&&arg3==21){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==9&&arg3==22){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==9&&arg3==23){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==9&&arg3==24){
                    builder.setMessage("UN Day marks the anniversary of the entry into force in 1945 of the UN Charter. With the ratification of this founding document by the majority of its signatories, including the five permanent members of the Security Council, the United Nations officially came into being.24 October has been celebrated as United Nations Day since 1948. In 1971, the United Nations General Assembly recommended that the day be observed by Member States as a public holiday. More:http://www.un.org/en/events/unday/                 2.The General Assembly in 1972 instituted World Development Information Day to draw the attention of world public opinion to development problems and the need to strengthen international cooperation to solve them (resolution 3038 (XXVII)).  The Assembly decided that the date for the Day should coincide in principle with United Nations Day, 24 October, which was also the date of the adoption, in 1970, of the International Development Strategy for the Second United Nations Development Decade.The Assembly felt that improving the dissemination of information and the mobilization of public opinion, particularly among young people, would lead to greater awareness of the problems of development, thus, promoting efforts in the sphere of international cooperation for development.");
                    builder.setTitle("1.United Nations Day  2.World Development Information Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==9&&arg3==25){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==9&&arg3==26){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==9&&arg3==27){
                    builder.setMessage("Audiovisual documents, such as films, radio and television programmes, are our common heritage and contain the primary records of the 20th and 21st centuries. They help to maintain the cultural identity of a people; but countless documentary treasures have disappeared since the invention of image and sound technologies that permit the peoples of the world to better share their experiences, creativity and knowledge.All of the world's audiovisual heritage is endangered. Nowhere can it be said to be preserved, but through initiatives such as the World Day for Audiovisual Heritage and the Memory of the World Programme, the precious work of preservation professionals is given impetus to manage a range of technical, political, social, financial and other factors that threaten the safeguarding of our heritage. More: http://www.un.org/en/events/audiovisualday/");
                    builder.setTitle("World Day for Audiovisual Heritage [UNESCO] ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==9&&arg3==28){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==9&&arg3==29){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==9&&arg3==30){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==9&&arg3==31){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                //-------------------------oct
                else if(arg2==10&&arg3==1){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==10&&arg3==2){

                    builder.setMessage("International Day to End Impunity for Crimes against Journalists");
                    builder.setTitle("International Day to End Impunity for Crimes against Journalists");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }else if(arg2==10&&arg3==3){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==10&&arg3==4){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==10&&arg3==5){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==10&&arg3==6){
                    builder.setMessage("On 5 November 2001, the UN General Assembly declared 6 November of each year as the International Day for Preventing the Exploitation of the Environment in War and Armed Conflict (A/RES/56/4).Though mankind has always counted its war casualties in terms of dead and wounded soldiers and civilians, destroyed cities and livelihoods, the environment has often remained the unpublicized victim of war.Water wells have been polluted, crops torched, forests cut down, soils poisoned, and animals killed to gain military advantage. More:http://www.un.org/en/events/environmentconflictday/");
                    builder.setTitle("International Day for Preventing the Exploitation of the Environment in War and Armed Conflict");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==10&&arg3==7){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==10&&arg3==8){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==10&&arg3==9){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==10&&arg3==1){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==10&&arg3==12){
                    builder.setMessage(" Today marks the fifth annual World Pneumonia Day and global health advocates are calling on leaders to scale up existing interventions and invest in new diagnostics and treatments to defeat pneumonia.Pneumonia is the single largest cause of death in children under five, killing more children than AIDS, malaria and tuberculosis combined . In 2012 , 1.1 million children under five died from pneumonia, the bulk of whom were less than 2 years old. 99% of these deaths are in developing countries, where access to healthcare facilities and treatment is out of reach for many children.       More:http://www.who.int/pmnch/media/events/2013/pneumonia_day/en/");
                    builder.setTitle("World Pneumonia Day [WHO]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==10&&arg3==11){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==10&&arg3==10){
                    builder.setMessage("Proclaimed by the UNESCO General Conference (Resolution 31C/ 20) in 2001, the World Science Day for Peace and Development is an annual event celebrated all over the world to recall the commitment made at the UNESCO-ICSU World Conference on Science (Budapest 1999).The purpose of the World Science Day for Peace and Development is to renew the national, as well as the international commitment to science for peace and development and to stress the responsible use of science for the benefit of society. The World Science Day for Peace and Development also aims at raising public awareness of the importance of science and to bridge the gap between science and societies. More: http://www.un.org/en/events/scienceday/");
                    builder.setTitle("World Science Day for Peace and Development");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==10&&arg3==13){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==10&&arg3==14){
                    builder.setMessage(" The World Diabetes Day campaign is led by PMNCH member the International Diabetes Federation and its member associations. It engages millions of people worldwide in diabetes advocacy and awareness. World Diabetes Day was created in 1991 by the International Diabetes Federation and the World Health Organization in response to growing concerns about the escalating health threat that diabetes now poses. World Diabetes Day became an official United Nations Day in 2007 with the passage of United Nation Resolution 61/225. The campaign draws attention to issues of paramount importance to the diabetes world and keeps diabetes firmly in the public spotlight.World Diabetes Day is a campaign that features a new theme chosen by the International Diabetes Federation each year to address issues facing the global diabetes community. While the themed campaigns last the whole year, the day itself is celebrated on November 14, to mark the birthday of Frederick Banting who, along with Charles Best, first conceived the idea which led to the discovery of insulin in 1922. More: http://www.who.int/pmnch/media/events/2013/diabetesday/en/");
                    builder.setTitle("World Diabetes Day [WHO]");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==10&&arg3==15){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==10&&arg3==16){
                    builder.setMessage(" In 1996, the UN General Assembly (by resolution 51/95) invited UN Member States to observe the International Day for Tolerance on 16 November, with activities directed towards both educational establishments and the wider public.This action followed on the United Nations Year for Tolerance, 1995, proclaimed by the UN General Assembly in 1993 at the initiative of UNESCO, as outlined in the Declaration of Principles on Tolerance and Follow-up Plan of Action for the Year.The 2005 World Summit Outcome document (A/RES/60/1) furthered the commitment of Heads of State and Government to advance human welfare, freedom and progress everywhere, as well as to encoura   More: http://www.un.org/en/events/toleranceday/        2.Since the adoption of the World Day of Remembrance for Road Traffic Victims, pursuant to General Assembly resolution 60/5, the observance has spread to a growing number of countries on every continent.The Day has become an important tool in global efforts to reduce road casualties. It offers an opportunity fordrawing attention to the scale of emotional and economic devastation caused by road crashes and for giving recognition to the suffering of road crash victims and the work of support and rescue services. In 2008, remembrance services and other related events were held in such countries as Argentina, Australia, Brazil, Brunei Darussalam, Canada, India, Japan, Mexico, Nigeria, the Philippines, South Africa, Uganda and the United States, and almost every country in Europe. More http://www.un.org/en/roadsafety/remembrance.shtml   3. In 1996, the UN General Assembly (by resolution 51/95) invited UN Member States to observe the International Day for Tolerance on 16 November, with activities directed towards both educational establishments and the wider public.This action followed on the United Nations Year for Tolerance, 1995, proclaimed by the UN General Assembly in 1993 at the initiative of UNESCO, as outlined in the Declaration of Principles on Tolerance and Follow-up Plan of Action for the Year.The 2005 World Summit Outcome document (A/RES/60/1) furthered the commitment of Heads of State and Government to advance human welfare, freedom and progress everywhere, as well as to encourage tolerance, respect, dialogue and cooperation among different cultures, civilizations and peoples. More: http://www.un.org/en/events/toleranceday/ ");
                    builder.setTitle("1.International Day for Tolerance   2.World Day of Remembrance for Road Traffic Victims  3.World Chronic Obstructive Pulmonary Disease Day [WHO] ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==10&&arg3==17){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==10&&arg3==18){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==10&&arg3==19){

                    builder.setMessage("Ashwini Sunil Dahiwale with her daughter Sheetal Sunil Dahiwale, at their residential toilet in Chandrapur District (India). Toilets are being used regularly in the biovillage Cihkali (a UNICEF project) and offer some dignity for students and their families.Photo © UNICEF India/2012/Dhiraj Singh More:http://www.un.org/en/events/toiletday/");
                    builder.setTitle("World Toilet Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==10&&arg3==20){
                    builder.setMessage("By resolution 836(IX) of 14 December 1954, the General Assembly recommended that all countries institute a Universal Children's Day, to be observed as a day of worldwide fraternity and understanding between children. It recommended that the Day was to be observed also as a day of activity devoted to promoting the ideals and objectives of the Charter and the welfare of the children of the world. The Assembly suggested to governments that the Day be observed on the date and in the way which each considers appropriate. The date 20 November, marks the day on which the Assembly adopted the Declaration of the Rights of the Child, in 1959, and the Convention on the Rights of the Child, in 1989.    2.  World Philosophy Day was introduced in 2002 by UNESCO to honour philosophical reflection in the entire world by opening up free and accessible spaces. Its objective is to encourage the peoples of the world to share their philosophical heritage and to open their minds to new ideas, as well as to inspire a public debate between intellectuals and civil society on the challenges confronting our society.In 2005 the UNESCO General Conference proclaimedPDF document that World Philosophy Day would be celebrated every third Thursday of November. In 2013, World Philosophy Day will be held for the eleventh time on Thursday, 21 November with events organized at the international, national and local levels. They will enable their participants to share a multitude of views and experiences, fully respecting cultural diversity. This year’s World Philosophy Day celebrates philosophy in general, and at the same time offers an occasion for reflection on some of the major contemporary challenges, which are related to the general theme of the 2013 World Philosophy Day “Inclusive Societies, Sustainable Planet”.");
                    builder.setTitle("1.Universal Children’s Day   2. World Philosophy Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==10&&arg3==21){
                    builder.setMessage("In recognition of the increasing impact television has on decision-making by bringing world attention to conflicts and threats to peace and security and its potential role in sharpening the focus on other major issues, including economic and social issues, the United Nations General Assembly proclaimed 21 November as World Television Day (through resolution 51/205 of 17 December 1996).World Television Day is not so much a celebration of the tool, but rather the philosophy which it represents. Television represents a symbol for communication and globalization in the contemporary world. MOre: http://www.un.org/en/events/televisionday/");
                    builder.setTitle("World Television Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==10&&arg3==22){
                    builder.setMessage(" Within the framework of the Second Industrial Development Decade for Africa (1991-2000), the UN General Assembly, in 1989, proclaimed 20 November Africa Industrialization Day (resolution 44/237).  The Day is intended to mobilize the commitment of the international community to the industrialization of Africa.This year’s Africa Industrialisation Day highlights the crucial role of job creation and entrepreneurship in eradicating poverty and will be observed in New York on 22 November 2013.  More: http://www.un.org/en/events/africaday/");
                    builder.setTitle("Africa Industrialization Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==10&&arg3==23){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==10&&arg3==24){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==10&&arg3==25){
                    builder.setMessage(" Violence against women is a human rights violationViolence against women is a consequence of discrimination against women, in law and also in practice, and of persisting inequalities between men and women Violence against women impacts on, and impedes, progress in many areas, including poverty eradication, combating HIV/AIDS, and peace and securit Violence against women and girls is not inevitable. Prevention is possible and essentialViolence against women continues to be a global pandemic. Up to 70 per cent of womenexperience violence in their lifetime. More: http://www.un.org/en/events/endviolenceday/");
                    builder.setTitle("International Day for the Elimination of Violence against Women ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==10&&arg3==26){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==10&&arg3==27){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==10&&arg3==28){Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();

                }
                else if(arg2==10&&arg3==29){
                    builder.setMessage(" In 1977, the General Assembly called for the annual observance of 29 November as the International Day of Solidarity with the Palestinian People (resolution 32/40 B). On that day, in 1947, the Assembly adopted the resolution on the partition of Palestine (resolution 181 (II))In resolution 60/37 of 1 December 2005, the Assembly requested the Committee on the Exercise of the Inalienable Rights of the Palestinian People and the Division for Palestinian Rights, as part of the observance of the International Day of Solidarity with the Palestinian People on 29 November, to continue to organize an annual exhibit on Palestinian rights or a cultural event in cooperation with the Permanent Observer Mission of Palestine to the UN. More: http://www.un.org/en/events/palestinianday/index.shtml");
                    builder.setTitle("International Day of Solidarity with the Palestinian People");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }else if(arg2==10&&arg3==30){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==10&&arg3==31){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }

                else if(arg2==11&&arg3==1){
                    builder.setMessage("World closing in on Millennium Development Goal 6, globally the AIDS epidemic has been halted and reversed—race is on to reach universal access to HIV treatment.Declining new HIV infections in children New HIV infections among adults and children were estimated at 2.3 million in 2012, a 33% reduction since 2001. New HIV infections among children have been reduced to 260 000 in 2012, a reduction of 52% since 2001. Fewer AIDS-related deaths AIDS-related deaths have also dropped by 30% since the peak in 2005 as access to antiretroviral treatment expands.Progress in antiretroviral therapyBy the end of 2012, some 9.7 million people in low- and middle-income countries were accessing antiretroviral therapy, an increase of nearly 20% in just one year. In 2011, UN Member States agreed to a 2015 target of reaching 15 million people with HIV treatment.More investments Despite a flattening in donor funding for HIV, which has remained around the same as 2008 levels, domestic spending on HIV has increased, accounting for 53% of global HIV resources in 2012. The total global resources available for HIV in 2012 was estimated at US$ 18.9 billion, US$ 3-5 billion short of the US$ 22-24 billion estimated to be needed annually by 2015. More: http://www.un.org/en/events/aidsday/");
                    builder.setTitle(" 	World AIDS Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }else if(arg2==11&&arg3==2){
                    builder.setMessage("The International Day for the Abolition of Slavery, 2 December, marks the date of the adoption, by the General Assembly, of the United Nations Convention for the Suppression of the Traffic in Persons and of the Exploitation of the Prostitution of Others (resolution 317(IV) of 2 December 1949).he focus of this day is on eradicating contemporary forms of slavery, such as trafficking in persons, sexual exploitation, the worst forms of child labour, forced marriage, and the forced recruitment of children for use in armed conflict.Today, 21 million women, men and children are trapped in slavery all over the world. The International Labour Organization (ILO) has teamed up with prominent artists, athletes and advocates in its new campaign to End Slavery Now. More: http://www.un.org/en/events/slaveryabolitionday/");
                    builder.setTitle(" 	International Day for the Abolition of Slavery");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();

                }else if(arg2==11&&arg3==3){
                    builder.setMessage("Around the world, one billion persons with disabilities face physical, social, economic and attitudinal barriers that exclude them from participating fully and effectively as equal members of society. They are disproportionately represented among the world’s poorest, and lack equal access to basic resources, such as education, employment, healthcare and social and legal support systems. In spite of this situation, disability has remained largely invisible in the mainstream development agenda and its processes. In many parts of the world today, lack of awareness and understanding of accessibility as a cross-cutting development issue remains an obstacle to the achievement of progress and development through the Millennium Development Goals, as well as other internationally agreed outcomes for all.  More:  http://www.un.org/en/events/disabilitiesday/");
                    builder.setTitle("International Day of Persons with Disabilities");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==11&&arg3==4){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==5){
                    builder.setMessage("International Volunteer Day (IVD) offers an opportunity for volunteer organizations and individual volunteers to make visible their contributions - at local, national and international levels - to the achievement of the Millennium Development Goals (MDGs)Apart from mobilising thousands of volunteers every year, the United Nations Volunteers (UNV) programme works closely with partners and governments to establish national volunteer programmes to create structures that foster and sustain local volunteerism in countries. Through the Online Volunteering service volunteers can take action for sustainable human development by supporting the activities of development organizations over the Internet. Every day thousands of people are volunteering, online or on-site, contributing to peace and development and working to achieve the MDGs.  More:  http://www.un.org/en/events/volunteerday/");
                    builder.setTitle("1.International Volunteer Day for Economic and Social Development  2. 	World Soil Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==11&&arg3==6){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==7){
                    builder.setMessage("International Civil Aviation Day [ICAO] ");
                    builder.setTitle("International Civil Aviation Day [ICAO] ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==11&&arg3==8){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==9){
                    builder.setMessage(" International Anti-Corruption Day  Corruption is a complex social, political and economic phenomenon that affects all countries. Corruption undermines democratic institutions, slows economic development and contributes to governmental instability. Corruption attacks the foundation of democratic institutions by distorting electoral processes, perverting the rule of law and creating bureaucratic quagmires whose only reason for existing is the soliciting of bribes. Economic development is stunted because foreign direct investment is discouraged and small businesses within the country often find it impossible to overcome the -start-up costs- required because of corruption. ");
                    builder.setTitle(" International Anti-Corruption Day ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }

                else if(arg2==11&&arg3==10){
                    builder.setMessage("The UN General Assembly proclaimed 10 December as Human Rights Day in 1950, to bring to the attention ‘of the peoples of the world’ the Universal Declaration of Human Rights as the common standard of achievement for all peoples and all nations.In 2013, the Office of the UN High Commissioner for Human Rights marks 20 years since its establishment.The United Nations General Assembly created the mandate of High Commissioner for the promotion and protection of all human rights in December 1993. The General Assembly was acting on a recommendation from delegates to the World Conference on Human Rights held in Vienna earlier the same year. More:  http://www.un.org/en/events/humanrightsday/ ");
                    builder.setTitle(" 	Human Rights Day ");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==11&&arg3==11){
                    builder.setMessage("Covering around 27 percent of the earth’s land surface, mountains play a critical role in moving the world towards sustainable economic growth. They not only provide sustenance and wellbeing to 720 million mountain people around the world, but indirectly benefit billions more living downstream.In particular, mountains provide freshwater, energy and food – resources that will be increasingly scarce in coming decades. However, mountains also have a high incidence of poverty and are extremely vulnerable to climate change, deforestation, land degradation and natural disasters.   MOre: http://www.un.org/en/events/mountainday/");
                    builder.setTitle("International Mountain Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==11&&arg3==12){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==13){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==14){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==15){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==16){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==17){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==18){
                    builder.setMessage("On 4 December 2000, the UN General Assembly, taking into account the large and increasing number of migrants in the world, proclaimed 18 December as International Migrants Day. On 18 December 1990, the General Assembly had adopted the International Convention on the Protection of the Rights of All Migrant Workers and Members of Their Families.UN Member States and intergovernmental and non-governmental organizations are invited to observe International Migrants Day through the dissemination of information on the human rights and fundamental freedoms of migrants, and through the sharing of experiences and the design of actions to ensure their protection. More:  http://www.un.org/en/events/migrantsday/");
                    builder.setTitle(" International Migrants Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==11&&arg3==19){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==20){

                    builder.setMessage("The General Assembly, on 22 December 2005, by resolution 60/209 identified solidarity as one of the fundamental and universal values that should underlie relations between peoples in the Twenty-first century, and in that regard decided to proclaim 20 December of each year International Human Solidarity Day. More:  http://www.un.org/en/events/humansolidarityday/");
                    builder.setTitle(" 	International Human Solidarity Day");
                    builder.setCancelable(false);
                    builder.setPositiveButton("Back", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();

                        }
                    });
                    builder.setNegativeButton("Exit", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                            System.exit(0);

                        }
                    });




                    AlertDialog alert=builder.create();
                    alert.show();
                }
                else if(arg2==11&&arg3==21){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==22){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==23){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==24){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==25){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==26){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==27){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==28){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }
                else if(arg2==11&&arg3==29){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==11&&arg3==30){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();
                }else if(arg2==11&&arg3==31){
                    Toast.makeText(getBaseContext(), "No International days Declare yet", Toast.LENGTH_LONG).show();



                }


            }});




    }





















    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

}
