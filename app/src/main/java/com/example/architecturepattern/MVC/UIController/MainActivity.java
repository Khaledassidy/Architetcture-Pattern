package com.example.architecturepattern.MVC.UIController;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.architecturepattern.MVC.Model.Model;
import com.example.architecturepattern.R;

/*
Architetcture Pattern

ne7na law sha8len b sherke mnktob code akeed fe 7ada tene 3am yesht8el ma3e b sherke hay fa lezm nkoun metf2en 3ala tare2a wa7de nektob l code heda law 3 ne7na kamen lezm netefe2 3a tare2a kelna keef nektob l code 3ashn kel wa7ad ye2dar ye2ra code tene

fa eja wa7ad menon 2al la7 e5tere3 tare2a esma "bla bla " 7a tr7na bel she8l ma3 ba3d w nektob kolna bnafs tare2a  w ne2ra l codet ba3d w ma 7ada mn barat sherke la7 ya3ref tare2a hay ne7na bas le 7a ne2raha

bas fred eno fe sherke tenye ejet bada l code ta3elna t3del 3lee teshtre w t3del 3lee fa nees hawde le jeyen mesh 7a yenfa3 ma3oun tare2et l "bla bla"
fa lezm sherke hay jeye ma3 sherke le mneshte8l feha tetfe2 3ala tare2a wa7de baynetkoun te2ro feha codet ba3d

fa ejo ba3den tafa2o 3ala tare2a standered   eno aye developer bye2dar yeje ye2ra code tene w byefham sho meshte8l sha8le hay esma architecture pattern

fa 2abl ma nblesh neshara7 l archetetcture pattern badna no3roud exmple:
3ana wa7d mesken 3atshen fa 3ashn yeshrab lezm ydawer 3ala ananet may yeshrab mena  bas fe tare2a wa7de mn 3 toro2 lezm ye5tara 3ashn ye2dar yeshtere 2anenet l may:
1-eno fe supermarket ta7t l beet fa heda sha5s 7a yrou7 3ala l super market yefta7 l barad ytlae3 annet l may yrou7 y7aseb l cashier y2olo eno ana a5dt ananet may w ba3den temshe
2-tare2a tenye eno fe cafe btrou7 3lee bte7jez makenak l kerse ta3elak tetlob mn l waiter bt2olo bade ananet may fa 7rou7 l waiter yejbalk elak sha5syen anent l may elak sha5syen mesh la aye 7ada tene 7a yjeblak yeha w y7telak yeha edemak ma howe 3aref l waiter lamen jeyeb ananet l may
3-tare2a telte eno fe 3ana jehez le beb3 may w batata w aye she fa enta 7a trou7 7atet coin b2lb hayda jehez w tekbous eno badak ananet may fa byo3od 2 min ba3den b nazlak anenet l may 2awl ma ynazlk ananet l mayn 7a ne5od ananet l may bas jehez heda mesh fer2a ma3o meen 7at l coin w meen a5ad ananet l may howe bas by3ref eno fe coin da5elt w yrou7 mnazel ananet l may mesh fer2a ma3o meen 7at l coin 2aw meen nater hay l ananet l may

tare2a l 2ola enta met7kem be kel she enta le ro7t 3ala super market enta fat7t l barad enta a5dt aanet l may enta 7asbt 3ala ananet l may fa enta l met7akem ya3ne controller
tare2a tenye enta le ro7 3al cafe w enta le talbt mn waiter ananet may fa ra7 l waiter s 2admalk yeha la anent l may fa heda l waiter be nesbe ele howe l presenter
tare2a telte enta ro7t 7atet l coin w natrt jeyehz la ynzlk yeha la annet l may fa enta dalet marbout 7ed jehez la7d ma ananet l may tenzel fa enta 3ebra 3an binding 2aw fe 3mlyet rabt btseer

tyeb law t5yalna eno ananet l may hayde le badna yeha esma model badna nosala
w law t5yalna eno enta view badak tosal la hay ananet l may le heye l model

fa tare2a l 2ola esma  model view controller(MVC)
tare2a tenye esma model view presenter (MVP)
tare2a telte l mas2ol 3an l binding she esmo viewmodel fa esma model view view model <MVVM)

MVC
t5ayal eno 3anadak application b2lbo view w fe 3ande databse 2aw aye data bade 2osal la data feha fa houn data heye l model fa enta badak tosal la data w ne7na 2olna bel mvc enta met7kem be kel she enta hayde 7a tetrjam lala activity fa l activity b2lba controller le met7kem b kel she  l controller 7a yesma3 la aye event mn l view 7a yrou7 l controller yjeeb aye data le howe 3eyeza mn l model l model hyda 7a yraje3 data lal controller l controller 7a ye3red data bel view hyde kel l mvc
View:you,Model:Water,Controller:you  houn enta 3am ta3mel kel she enta l controller w enta l view enta kel she 3am ta3mlo b2edak
|----|
View |
|    |
|    |
|    |
Controller------>Model
     |             |
     |-------------|
MVP
t5yal 3andak application feha b2olbo view w 3andak databse 2aw aye data bade 2osal la data feha houn data heye l model bas hal mara bas re7t la teshtere ananet l may fe wa7ad howe le jablak yeha l wa7ad heda howe class esmo l Presenter fa l view 7a y2ol lal preseneter bade she m3yan  l presenter 7a yrou7 yjeeb heda she le bado yeh mn l model l model 7a yraje3 hyda she lal presneter l presneter 3aref l view sha5syan 7a yrou7 mraje3 hyde she lal view
View:you,Model:water,Presenter:waiter mvp l waiter lezm ya3ref meen enta ya3ne enta b aye table l2no 7a yredlak l bottle la 2elak enta sha5seyan mesh la aye 7ada ya3ne 7a yred l bottle la 7asab meeen be3et requst bado l bottle lezm yraje3 l bottle la correct table correct costumer
 |--------------------|
View------------->Presenter------------->Model
                      |---------------------|

MVVM
byeshbah l mvp bas fer2 z8eer 3ndak application fe b2lbo l view  w 3andak databse 2aw aye data bade 2osal la data feha houn data heye l model w hal mara 3andak she esmo viewmodel l viewmodel heda ma by3ref she 3an l view abadan wala she  metl l makana le 7kena 3ana ta3et l may ma keen fer2a ma3a meen 7at l coin 2aw meen 2a5ad ananet l may howe l view model ma by3ref aye she 3an l view bas l view 7a y2olo lala viewmodel ana bade data m3yane fa l viewmodel 7a yrou7 yjeeb data mn l model l model 7a yraje3a lal viewmodel l viewmodel ma by3ref l veiw 3ashen y2olo ana jebtlk data howe bas l view model 7a ytle3 hay data w 7a y2ool data hay wsltne l view heda bekoun marbout fe 3amlyet binding betkoun marbout heda l view bel viewmodel 2awal ma data hay terja3 l vew hay 7a ya3ref eno fe data w y3rda ya3ne l viewmodel ma rajtlo yeha howe l view ma3molo binding rabt ma3 l viewmodel fa bas data terja3 lal viewmodel la7ala l view bt2ol fe data ejet so bade 2o3rouda
View:you,Model:water,Viewmodel:binding you wait for machine la ta3tek l water fa enta houn you binded to it nrabat feha ya3ne bel mvp howe 7a yrje3a 2elak l bottle of water mesh la7ada 8ayrak ama houn bel mvvm howe 7a ye5od 10 sec la ya3mel response la meen ma keen mesh hemo meen bekoun ya3ne houn 7a ykoun fe request mn l view 3al viewmodel 7a rou7 l model mraj3a lal viewmodel l data fa l view w l viewmodel ma by3rfo she 3an ba3d bas le 7a yseer eno l view 3meel observe 3al view model 2awl ma yerja3la data tenbe3et yenba3at notify lal view eno data rej3et lal viewmodel w tenba3at 2e5er data weslet w byest2bela l view w byo3rouda

View------->ViewModel---->Model
                 |----------|


l mvc implemntation:
7a ykoun 3ana project lal movies 7a n7ewel no3roud fe list mn l movies ne7na 7a njeba mn databse m3yane heda le 7a ntab2o 3ala kel l archetecture pattern
fa 2awl she 3mlna l model ta3et l moview feha name,data,description w id la hay l model ya3ne bel nesbe 2elna heda databse

fa hala2 l matlob mena njeeb data mn hay databse l model w ne7na na3ml handeling la l click le 7a tseer na3mel function btrje3 model bel main activity w mn5leha trje3 new model bhay tare2a 3mna handel eno keef 7a njeeb l data mn l model

badna na3ml handle lal click la button mawjoude bel activity fa badna bas nekbes 3al button yrou7 3ared heda l movie le esmo breaking bad bel activity b textview
fa houn le 7a yseer bas l user yekbous 3al button 7a yjeblo data mn l model w ba3den best2bela w be3roda b textview

tyeb sho 3ele2to bel mvc:
kamen bheda 7a ntabe2 example l movies w 7a net3alam she jdeed esmo butterknife

ne7na 2olna l mvc 3ebra 3an model le howe 3ana hala2 l movie
w 3ana view 3ebra 3an xml b2lbo textview w button
w l controller le 3am ya3mel handle la kel she by3mel handle lal user input le heye eno l user yekbous 3al button bas yekbous ye3roud data b view  w by3mel handle eno yjeeb data mn databse mn l model le 3ana w ya3ne l controller houn howe l activity
houn l controller w l view b nafs l class lezm ykouno
bhay l case l case:
Model:model class of moview
View:Textview
Controller:mainactivity

w fe tare2ten lal click button 2awl wa7de use code setonclicklistbe....ect using coding java
tare2a tenye eno ta3mel function te5od view w te7t b2lba textview.setetxt(....) w ba3den trou7 3al xml 3al button be attribute l onlcik bt3te hay l method using xml


bas howe feek  tefsel l controller le howe eno na3ml class b2lbo function btetlob l data mn l model w btrje3a b function btrje3 model ba3den function teje btrje3 l name taba3 l moview le bhay l data le b2lb l model le rej3t lal controller
w ba3den bel mainactivity bt3ref l obejct mn controller w btestd3e l method
fa houn l view ba3tet request lal conttoller l controller ra7 3emel requst lal model w ba3den l model ba3tetlo data lal controller w l controller ba3at data lal view hay heye l mvc

w 2e5er sha8le eno l mvc howe ma byest3mal ma byensa7o fe sharket fe bas eno test3mlo b project z8ere



MVP impelmnation:

howe aktar she byensa7o fe sharket w aktr she most3mal be kel projects
l mvp howe mesh she standered ya3ne howe concept standered bas tare2et ketbto kel 7ada 3ando tare2a m3yane
fa tre2a l 7a ne7keha akr wa7de baseta mesh standered ya3ne momken trou7 3ala sherke ykono sha8alen mvp bas mesh nafs tare2a le enta bt3refa w sherke 8ayra kamen sha8len mvp bas tare2a yemken ana mane sheyfa wala sherke l abl ya3ne l implemntation lal mvp mesh standered bas l concept howe nafso zeto bkel toro2

fa hala2 3ana xml b2lbo textview w button fa 7a nekbous 3al button yezhar elna esm l film b textview

2awl she bel mvp hala2 3an class esmo presenter tyeb heda l presenter ween byen7at hal pckage la7alo 2aw ma3 l ui l presenter byen7at ma3 l ui l prseneter b7en7at bel ui ma3 l activity le 7akoun heda l presenter joweta  :
hala2 bado ykoun fe 7ala2et wasl been l presenter w been l activity le 3ande been l view ya3ne 7ala2et l wasl l hay 3ebra 3an interface fa mnrou7 mn3mel interface
fa 7a na3ml interface esmo MoviewView

hala2 ne7na badna heda l presenter yjeblna film mn databse mn l model w ba3d ma jebo la film mn databse bade jeeb l esm ta3elo w ba3den b2ola lal activity l esm taba3 l film heda howe ma t3mle aye she tene la tosale lal model wala la databse ana la7 jeblek l she le ente 3eyzte

fa 2awl she bel presenter bade function jeeb data mn datbse w kamen bade heda l presenter lama yjeeb name taba3 l film y2ool laln activity eno ana jebt name keef bado y2ola lal activity eno jebt name 3an tare2 l interface le esmo MoviewView

fa hala2 ba3mel function jowa l interface void onGetMovieName() b5leha te5od string esm l film l2no ana bade est3mel heda l interface la yeb3at data mn l presenter lal activity w bel activity est2bela w 2o3rouda


hala2 b2lb l l prseneter bade 2olo eno 7a ykoun fe 3ande varible mn no3 l interface le 3ane le howe l MovieView b3rf paramter w b3mel constructor bye5od heda l interface w b3melo intilize


ba3den bade 2a3ml function bel presenter tjeeb data mn l interface le heye nafs l method le 3mlneha bel mvc ta3et getmoview le btrje3 new Model(.......)

hala2 tene function le bade yeha heye l function le 7a nedeha mn l main tjeblna name taba3 l film mn 5elel l interface le 3ana
fa ba3mel method esma public  void getMoviename() b2lba bade 3ayet la l method le b2lb l interface w eb3tla la hay l method name taba3 l movie 3ashn est2blo bel activity

hala2 ne7na bas shr7na l mvp 2olna l mvp 3eref bel zabt 7a ya3te anenet l may la meen fa lezm bel main activity 2aw eno ya3ne bas n3ref l presenter lezm l preenter ya3ref eno hyde l view sho l2no howe bel mvp by3te ananet l may la sha5s m7dada fa bel presneter n7ot l presenter ne7na 7a na3te bel constructor 3am na3te MoviewView paramter le ana bade da5lo l2no lezm l presenter ykoun 3eref meen l view l2no bado yeb3at l data la view m7dade fa ana bas 3am 2a3te l consturctor MovieView fa bhay tare2a l presenter 7a ya3ref howe la meen bado yeb3at data
fa ne7na bel main activity 7a n3rf presenter object bel constuctor ne7na badna neb3tlo interface bas badel ma neb3tlo new interface mn5le l activity ta3mel implemnt la heda l interface 3ashn neb3at lal prsenter eno enta bas badak teb3at data bteb3ata la hay l activity w beb3tlo sa3eta bel constructor this w howe by3mel overide la method implemnt le mawjoude bel inteface w byeb3tle ma3a l moviename

fa hala2 ne7na le 3yzeno eno lama yseer event bel view ya3ne ned8at 3ala button yrou7 y3yet lal presenter heda w y2olo b3tle l movie name mn databse lal prsenter

fa hala2 bas ekbous 3al button beb3at requst lal presenter eno jeble l data mn databse le heye l movie name  fa l presenter berou7 3al model b2olo bade hay data fa l model byeb3at data lal preseneter w hay data le wesltne beb3ata lal interface le howe 7ala2et waslt been l activity w l presenter  fa hala2 l activity ma ela aye 3ela2a bel model wala bte2dar tosal lal model le bye2dar bas yosal lal model howe l prsenter bye2dar yosal bas ne7na mneb3tlo lala presenter eno b3at resust jeble data mn l model
fa howe bas tosal data lal prsenter btenba3at lal interface method w be ma2no ne7na 2eylelo eno l activity heye l main activity w ma3mol implmnt lal method bel main actiivty fa btosal name 3al main ne7na mnest2bela w mn7ota b textview
ya3ne enta ma b3telo l activity le heye interface fa saret bas tesd3e method l interface bel presenter le 7a yetnafaz howe code le mawjoud bel main


fa 2awl she l user 7a yed8at 3l button 3ashn yjeeb l name ta3el l movie fa 2awl ma yenda8at 3ala l button bel main activity fa 7a t2olo l view le heye l mainactivity eno bade l moview name mn l model fa 7a yrou7 le presenter 2awl ma yosalo requst getmoviename 7a yrou7 yestd3e l method le bel presenter le joweta ana bade eb3at requst lal model 2olo jeble l moview fa l model bteb3at l moview lal presenter fa ana be5od mena name la hay l movie w beb3at heda name lal interface method l2no ana keef bade etwasla ma3 l activity mn 5elel waset baynetoun le howe l interface fa hala2 bel main b2olo 3arfle prsenter w 3ate lal presenter ma7al ma howe bado yeb3at data mn 5elel constructor fa ana ba3telo l activity le heye 3emle implemnt mn hay l interface fa sar bas 3am yestd3e l method le bel presenter 7a yesd3e l method le bel main w yeb3tla name w ana 7a rou7 est2bel name w 7ota b tetview

fa bhay l 7ale ne7na 5aylna l activity bas heye le tet7akm bel ui bt3mle handle la event metl l button w bt3roud data  faslneha 3an data ya3ne heye ma feha tosal la database ma bt3ref aye she 3an l model heye bas bt3mel tawasoul ma3 l presenter w l presenter 3aref meen howe l view le bado hay data meeen bado ananet l may fa ne7na ba3tnelo lal presenter l view le heye l activity    heye la nosal la data w logic kolo bseer bel presenter fa l pressnter mas2ol 3ashn yosal la data w mas2ol 3an aye logic 7a yseer bel application fa 7a yrou7 yrje3 data hayde 3an tare2 l interface

heda howe l mvp

hala2 momken tle2e nees btest3mel ba3d interface been l model w l presenter bt3mel interface tene

butterknife:
sho l meshkle le bt7ola l butterknife enta mesh kel ma badak test3mel view badak to3oud t3mel findviewbyid...ect fa alkoun ana 7a 2a3mel library jdede esma butter knife bt7ellekoun l meshkle hayde  bas hyde ma3ad st3melet sar fe badel l viewbinding le heye nafsa zeta l butterknife



MVVM:
howe akatr model most3mal:
mn mayzeto 7emeye dod ser2a,code byen2ra bsor3a,ma3zoul tameman aye she tene ,sahl ne5tebro

l youm la7 nblesh shar7 b she esmo architecture pattern:
exmple:t5ayal eno ne7na badna nebne madene kemle sho l motatlebet le b7aje ela:
2awl sha8le b7aje eno n7aded l maken eno ween bade ebne hay l madene
tene she badna n7aded eno adesh la7 tkoun mase7et hay l madene
telet she la7 n7ded l ameken l ra2seye tab3et hay l madene msln ween 7a tkoun l mostashfeyet,weeen l ameken tarfehye ,weeen l maderes ,ween 7a tkoun l jaweme3,ween 7a tkoun ameken sakan ,ween 7a tkoun l bona ta7teye taba3et l madene
hawde koloun mnetlek 3lyhoun esm architetcture pattern ya3ne l anmat l hykaleye hala2 ne7na heek 7addna haykaleyt l madene bas ne7na ma balsna bel bene2 hawde ta7dedet k2no ne7na 7adadna l arichetuture pattern l anmat l hykaleye ta3et l madene ba3d ma 7dadna l amekn l ra2seye w mase7et l madene w een bada tkoun hay l madene mn balesh nfout bel tasafasel msln
mne5od kel 2ot3a mn l 2ot3a le 7addneha msln mne5od l 2ot3a le heye l mase7a le 7addneha lal mostshfeyet mnblesh n7ded eno adesh 7atkoun mase7et l mostashfa adesh 7akoun 3adad tawabe2  bekl tabe2 kam 8orfe la7koun feha ya3ne mnblesh nebne l ajze2 le 7addenha mn abl hyde l ajze2 l baseta le 3am nebneha mtl 8oraf lal ameken le 7a teskoun feha nees adesh 7akoun mase7ta adesh 7akoun 3adad l abneye lal soken hyde tajze2et l baseta le 3am njaze2a mnetle2 3lyha esm design pattern

mn hawde l amsel:
l arichetucture pattern:byeshra7 l mokwenet w tafe3loha keef ya3ne ya3ne msln ya3ne ne7na 7addna l mase7a w 7addna l amken l mostshfa w amaken tarfeh w l abneye ya3ne hala2 enta bas te5roj mn baytak w badak trou7 3ala amken la tarfeh bt3ref keef badak tetfe3al mn ma7al ma enta seken la ma7al ma enta raye7 la ameken tarfeh  hyde arichetucture pattern byeshra7 l mokwenet w tafe3ola ma3 ba3d
design pattern:byeshra7 l bene2 ya3ne enta 7addt maken l mostshfa bas eno keef 7aykoun lawna kam tabe2 feha  ya3ne heye mokwenet l bene2 hyde mokwenet l bene2 heye design pattern
w momken ne5tesera b 3ebra tenye eno l archetucture pattern  howe 3ebra 3an mo5tat tajrede ama design pattern howe 3ebra 3an bene2 lal mo5tat l tajrede

hala2 lesh btest5dam l arichetecture pattern w design pattern:
-2awln 3ashn ne7sal 3ala code wade7 w mafhoum keef ya3ne ya3ne enta hala2 btbne mashro3 m3yan application w heda l mashro3 byeshte8l ma3ak team mkawan mn 4 asha5as bas enta tektob code yemken yeje wa7ad tene ykamel heda l code  bas yeje heda sha5s lezm ykoun by3ref  lezm ykoun ykoun fe arichtucture pattern w design pattern bshakl eno bas yeje la ykamel yefham sho ana keteb 3ala sho 3am eshte8l yaref eno enta sho 3am t7ewel tebne ya3ne bas tkoun 3am tebne jez2 m3yan mn l application l programmer tene yefhamak eno enta sho 3am t7wel tebne fa heda she kteer mohem eno ykoun l code understandable
-tene sha8le eno ykoun l code reusability ya3ne hala2 3am ebne she m3yan bel application w mmken ba3den 3oz ebne b application tene fa badal ma erja3 ektbo mn 2awl w jdeede berja3 bas bjeeeb l code metl ma howe le ketbo b 8eeer application w 7oto bhay l appplication w hyde sha8le btseer bas tkoun fasel l eshya 3an ba3da ya3ne manak m5le en hyde m3l2a bhyde bshakl eza emto lal code la test3mlo ykoun fe restriction eno ma feek test5dmo lal code ela ma ykoun mawjoud hay sha8le
-telet sha8le eno by3mlk she esmo cleaner code ykoun l code ndeef w 5ale mn aye mashekl w ebel lal maintance ya3ne bas la eje a3mel update lal code ykoun sahl 3lye w maintance ma ye5od wa2t tawel w ykoun l code 5ele mn l exeption hyde no2ta moheme lesh best3mel l design pattern w l arichetecture pattern

arechetecture pattern w anwe3a:
-model view controller(MVC)
-model view presenter(MVP)
-model view view model(MVVM)
-MVI heda arichetecture jdede


design pattern byen2esem la 3 anwa3:
-creational pattern(Builder,singleton,dependency injection,factory)
-structure pattern(Adapter,Facade,Decerator)
-behavoral pattern(Observer,State,Command)

tab3an kel mostla7 mn haw keloun elo dars 5as

hala hawde keloun best5dmo b mahro3 wa7ad la2 mesh darore:
enta momken test5dem arichetecure wa7ad msln MVC w te5od mn design pattern msln Bulider,Facade,Stet,observer w tebne mashro3 mesh darore tkoun btest5dem kel she b mashro3 wa7ad bas enta lezm ta3refoun koloun eno aymta test5dem hal she w weeen test5dema


hala2 l archetecture patter:
howe be2om b ta2sem l mahem l mo5telefe bel application la mokwenet most2elel b7ad zeta w heda she beshel 3mlyet ta3del w l update lal appliction
w b5le l maintibility ashal mn 5ell tanzem l code l2no kel ma keen l code aktr mnazam kenet l maintibility ashal
w btshel l archetectue pattern 2e3edet este5dem l mokwenet b maken tene 2aw b application tene ya3ne reusibility

hala2 l MVVM:
mvvm howe arichetucture pattern aktr she mashhour be2om b fasl l mokwenet l appliction la 3 mokwenet ra2seye sho houne l mokwenet:

Model:ma3neto namozaj hay 3ebra 3an taba2a mas2ole 3an edaret l data w l mante2 l 5as bel application heda jez2 bte3emal ma3 data ema iza keen mn api 2aw mn databse local room 2aw sql bekoun b2lbo kel she 5aso bel databse w enshe2a w columns ya3ne howe byhtam bel data tab3 l application ya3ne kel l data taba3et l application mawjoude bel model
view: ma3neto l 3ard 3ebra 3an wejha lal user ya3ne activity 2aw fragemnt b2lba kel she beshofo l most5dem le heye bt3rod feha l data howe heda byehtam bel 3anaser le btshofa ya3ne bel user interface howe activity 2aw fragmnet ya3ne howe 7ala2et wasl been l baynet w been l user interface keef bseer heda tafe3oul l user by3mel event m3yan mn l view 3ala l viewmodel insert msln fa hy l event btenrasal mn l view lal view model l viewmodel byersel heda l event lal model la databse  bhay tare2a bseer ta8yer bel databse w byerja3 heda ta8yer lal viewmodel telk2eyan mesh b2ede bas hala2 ma fe sehm mn l view model lal view ya3ne ma fe tawasoul mobesher been l viewmodel w l view l2no houn lama yseer ta8yer b databse 2aw b data ta3et l app  w yseer e3det heda ta8yer lal viewmodel l view mala7 yrou7 yetlbo la heda ta8yer ela eza keen jowet l viewmodel she esmo live data 3an tare2 live data la7 ytem est3lem l view 3an kel ta8yer 3am yseer de5el l baynet  ya3ne l view mesh 7a yotlob request mn viewmodel la yredelo data laken by3mel l view observe lal viewmodel ya3ne l view la7 yra2eb l viewmodel w be mojarad ma yseer ta8yer de5el l  viewmodel la7 ytem 2e3a2o lal view by deffult mndoun ma yetlbo l view hay no2ta jawhreye bemyez l vewmodel 3an be2e l eshya metl l preseneter l far2 tene eno la7 ykoun 3ana taba2 tenye been l viewmodel w l model esma repository  ya3ne l viewmodel ma be5teb mobeshratan l model laken be5teb l model 3an tare2 taba2 tenye esma repository l repository howe le 7aykoun 7ala2et wasl been l model w l viewmodel ya3ne taba2at ra2seye heye 3 l view ,viewmodel w model laken btem wad3 taba2a senweye been l model w l viewmodel btetsama repository
viewmodel:ma3neto 3ard l namozaj howe 3ebra 3an waset been l view w l model byorbout l data mn l model le b2lbo data w bejheza la y2om brda bel view w bekoun mas2l 3an l cofigration change le momken tseer

le bseer eno l view btetlob data mn l view model l viewmodel btotlob data mn l model fa l model btjeeb data bteb3ta lal viewmodel w l view model bteb3ta lal view w l viewmodel heye bt5zen data b2lb livedata fa bas yseer ta8yer 3al liuve data te8re btrje3 data lal view mn 5elel l observer l2no btkoun l activity 3am ta3mel observe 3ala l livedata
bas fe 2 senario bel nsebe lal livedata:
eza kenet 3am tet3mal ma3 data takledeye mesh databse fa houn le b5zen data bel live data howe l viewmodel mn 5elel l set() w bas l activity 3am tra2eb ta8yer live data houn l acivity 3am tr2eb l method le mawjoud bel viewmodel le btrje3 live data fa fe method std3neyha b2lba set() 8ayret livedata fa de8re btrja3 vimodel btb3ta data lal activity
ama houn l activity 3am tr2eb method le brje3 live data bel viewmodel fa enta bas ro7t 3mlt insert std3et method mn l view model la ta3mel insert fa ra7et hay l method std3et method le bel repostory w method le bel respository std3e method le doa w 3mlet insert la data fa hala2 room shef eno fe ta8yer la data fa ra7 8ayar live data internally ya3ne k2no 3mel set() fa ta8yer hay livedata 3mlet reflect 3ala live data le bel repsotory w ta8yer l live data bel repository 3melet ta8yer 3ala live data bel viewmodel fa l activity 3am ta3mel observe 3a hay l viewmodel fa ra7 viewmodel 3emel notify lal activiy w 2ala live data t8ayret le 3am ta3mela observe fa 5ode hay live data l jdede w 3adle l ui taba3ek fa houn kolo sar by deffult 2ama fo2 sar yadaweyn ne7na 3mlna ta8yer lal live data mn 5elel method set()


ma3neto l 3ard 3ebra 3an wejha lal user ya3ne activity 2aw fragemnt b2lba kel she beshofo l most5dem le heye bt3rod feha l data howe heda byehtam bel 3anaser le btshofa ya3ne bel user interface howe activity 2aw fragmnet ya3ne howe 7ala2et wasl been l baynet w been l user interface keef bseer heda tafe3oul l user by3mel event m3yan mn l view 3ala l viewmodel insert msln fa hy l event btenrasal mn l view lal view model l viewmodel byersel heda l event lal model la databse  bhay tare2a bseer ta8yer bel databse w byerja3 heda ta8yer lal viewmodel telk2eyan mesh b2ede bas hala2 ma fe sehm mn l view model lal view ya3ne ma fe tawasoul mobesher been l viewmodel w l view l2no houn lama yseer ta8yer b databse 2aw b data ta3et l app  w yseer e3det heda ta8yer lal viewmodel l view mala7 yrou7 yetlbo la heda ta8yer ela eza keen jowet l viewmodel she esmo live data 3an tare2 live data la7 ytem est3lem l view 3an kel ta8yer 3am yseer de5el l baynet  ya3ne l view mesh 7a yotlob request mn viewmodel la yredelo data laken by3mel l view observe lal viewmodel ya3ne l view la7 yra2eb l viewmodel w be mojarad ma yseer ta8yer de5el l  viewmodel la7 ytem 2e3a2o lal view by deffult mndoun ma yetlbo l view hay no2ta jawhreye bemyez l vewmodel 3an be2e l eshya metl l preseneter l far2 tene eno la7 ykoun 3ana taba2 tenye been l viewmodel w l model esma repository  ya3ne l viewmodel ma be5teb mobeshratan l model laken be5teb l model 3an tare2 taba2 tenye esma repository l repository howe le 7aykoun 7ala2et wasl been l model w l viewmodel ya3ne taba2at ra2seye heye 3 l view ,viewmodel w model laken btem wad3 taba2a senweye been l model w l viewmodel btetsama repository:

l mvvm fena ne3ber 3lee mn 5elel heda l exmple:
3teber badna na3mel robot byet7arak byemshe by3mel 7araket ok
model howe 3ebra 3an l brain taba3 l robot le b2lbo mawjoud m3raf kel task metl eno yesmhe yor2os ya3mel kel she 7araket bas hawde ma byetaba2o law7do hawde byetba2o mn 5elel instruction ya3ne l model 3ande howe list of tasks bye2dar ya3meloun l robot
view howe 3ebra 3an remote controle menst3mlo la na3ml interact ma3 robot 3ana b2lbo button for walk button for dance button for wave  bas tekbous 3ala button mn haw msln l wave button tell the robot what to do bhay l exmple howe wave
viewmodel howe 3ebra 3an translator been rorbot bran and remote controle ya3ne bas tekbous 3ala button m3yan mn remote controle hayde byen3mal tranlsate w btente2l lal model 3ashn ynafez 7arake mo3ayne ya3ne howe bas nekbous 3ala buttton bel remote hayde l action btetrjm la she m3yan command byefhama l robot w btenresel lal 3a2lo lala robot w bt2olo nafzle hyde l action
exmple iza kabsana 3ala wave button bel remote controle l viewmodel btrjem hay l kabse lal rebote controle w b2olo bafez hay l 7arake le heye wave make wave
ya3ne kabsana 3ala remote controle wave button bte5oda l viewmodel w btersel l viewmodel message lal model le howe 3a2l l robot w bt2olo please wave

ya3ne l mvvvm btes3dna controle 3ala l application mn 5elel seprate l brain le howe l model le howe data w by3mel seprate lal remote controle le howe l activity w kamen seprate l translater le howe l viewmodel hay separation btsd3na to manage l application

l mvvm heye template lal client application archetecture bt3mel serate lala application le3na l 3 part kel part mas2ol 3ala she m3yan model,view,viewmodel
howe byefsel l data presentation ya3ne l l user interface le btreoud data 3ana data nafsa btefsouloun 3an ba3d kel wa7de ma 5asa b tene

ya3ne l model b2lba kel she data kel she 5aso bel databse sawe2 keeen m api 2aw local databse by3mel encapsulate la data ta3et l application mtl l user information,data retrive from web service ma bekoun fe b2lba wala code 5aso bel user interface 2aw keef data badna ten3ered 3ebra 3an database class w entity mn 5elela bt3mel structure lal data
l view hyde mn 5elela mnetwasal ma3 l viewmodel lal action le momken ya3mela l user hyde l layer observe viewmodel w ma bekoun b2lba aye code 5aso bel logic taba3 l appliction heye 3bra 3ana activity bya3mel action l user mn 5ela w mn 5elel hayde l action mnetwasal ma3 l viewmodel w mne2dar mn 5elela na3ml observe lal viewmodel w heye mas2ole bas 3an l presentation data to user w trigger l action le momken ya3mela l user heye mas2ole 3an kel she beshofo l user w by3mel ma3o interact heye l user interafce b2lba button recycle view ...etc
l viewmodel  heye 3ebra 3an link 2aw wasel been l view w l model b2lab kel logic  manage data le bada ten3arad w bteb3at data le bada ten3arad lal view la7ala mndoun aye requst mn l view ya3ne heye l viewmodel ma btetwasal ma3 l view ya3ne b2lb l view ne7na ma mneb3at requst lal viewmodel eno badna hay data la2 l view observe ber2eb l viewmodel w beshof data le 3am tet8ayr feha mn 5elel live data le mawjoude b2lb l viewmodel w mn5elel l viewmodel ne7na mnetwasal ma3 l model la na3ml aye action 3ala l model bas mesh bshakl mobesher mn 5elel kamen waset baynon le howe l repostory w heda l class kamen bya3mel manage la aye confiration momken l view yseer 3lyha metl l rotation


MVVM:
View-->viewmodel-->repository->model
       livedata


mo5atat lal view viewmodel:

mn blesh bel activity 2aw frgemnt le bemsel l view ba3den mn activity 2aw fragemnt byetlob mn l viewmodel w l viewmodel byotlob mn repository repository momken ykoun naw3en 5eyaren ya ema bekoun  ya ema btkoun data mawjoude be server bel remote metl firebase ,api ya3ne databse 5arejeye ,2aw btkoun l viewmodel de5leye metl l room btkoun databse de5leye
heda l aktr este5dem arichetecture pattern lesh l2no by3tek tarteb akatr lal application l2no houn ne7na 3am nefsel been l userinterface w l databse w heda she be2lel l taklefet l maintainbility w beshel eno neshte8l ka team metl msln wa7ad yestelm l model wa7ad yestelm l viewmodel wala yesteml view ya3ne howe heek faale l data 3an l user interface ya3ne mesh metl ma kona na3mel eno na3mel query la data base mn l activity 3ala l databse la2 houn enta btestd3e method w heye la7ala btjeblak databse w bt7otlak yeha enta 3leek bas ta3mel populate la data ya3ne btjeek data mn bara 3leek tbeha bas 2aw iza badak ta3mel insert bas btst3mel method bel viewmodel w howe la7alo berou7 by3mel insert bas houn eno enta mesh kel mara badak teje 3al activity badak ta3mel objet mn l databse w ta3mlinsert 2aw mesh kel mara enta bas t2olob shshe badak terja3 ta3mel objet mn databse w yerja3 yejblak data 2aw mesh kel mara badak ta3mel requst la mn databse la yejblak data la2 houn howe la7alo bas yshof ta8yer bjeeb data w enta 3leek bas t7ota b view ya3ne enta b2lb l view ya3ne houn kolo mafsoul 3an tene ya3ne keen law badak data terja3 3ashn t7ota b receycle view keeen tsstd3e Databse.getintance,getallemployee() hala2 batalt ta3mel heek sar 3andak observer heye la7al btjblk data bala ma enta testd3eha w bel nesbe lal insert enta 3am testd3e method bas 3am ta3teha paramter bas heye la7ala 3am trou7 ta3mel insert b worker thread ya3ne enta law ma fasltoun keeen kel mara badak ta3mel insert badak trou7 yta3mel thread jdeed ma belak iza keen badak ta3mel 5 insert ma3 ba3d badak ta3mel 5 thread heda she 8alat bhay tare2a enta fasel kel she 3an ba3do

Activity|fragemnt
       |
       |
    View model
    livedata
        |
        |
    Respoitory
        |
        |
 _______|__________________
 |                         |
 |                         |
 |                         |
 Model(Room)         Remote data source(Retrofit)api
 |                          |
 |                          |
 |                          |
 SQLIte                  webservice

exmple badna ne7sob 3omr sha5s ntab2o mn 5elel l mvvvm
bade 2a3ml 4 packages:
package model
package repostory
package viewmodel
package howe l view

fa houn le sar eno 3mlt model fe b2lbo name w l age w 3mlt interface bel reposotry package bye5od name w age  w berje3 muable livedata
ba3den bel repostory 3mlt implemnt la heda l imferface w 7asbt  age w jebt name w jebt data mn l model w 3tyto l age w name w rj3t hay data b mutable live data ok fa houn l repository heye le 3am tetwasal ma3 l model
w ba3den 3mlt viewmodel b2lbo function btrkje3 mutable live data w btstd3e method l repsotory w bel main activity 7atet observe 3alal funtion le brje3 live data
fa hala2 ana bas ekbous 3ala l button btrou7 bestd3e method l bel viewmodel w viewmodel btrou7 btsd3e l method le bel repsotory w l repsotory bteytwasal ma3 ma3 l model b sayev data w be3del 3ala l live data fa bas hayde live data tet3dal heda ta3del kmen byetba2a 3ala livedata le mawjoude bel viewmodel fa l activity 3am ta3ml observe 3ala hyde live data btshof eno sar fe ta3del 3alyha fa l viewmodel bt3ml notify lala activity w bt2ola eno sar fe ta3del 3ala live data w btb3tla e5er live data 3anda fa heek tab2na mafhoun l mvvvm faslna l logic w l data 3an l user interface


l mvvvm btest5dam akatr bel project l m32ade w b7aje la ta7deset kteer bel application mnest5deml mvvm





exmple tene 3ande activity bada te3roud esm b textview bas hal mara 7a nest3mel l mutable live data na3ml 3lyha observe


tatabe2 l mvvm b project la7alo esmo mvvm




mvi:
3ana mwazaf shta8l be sherke mratabe w sherke hayde daf3tlo ma3asho bas bel visa bas 3ashn ye5od ma3asho bel visa lezm yet3emal ma3 l atm tyeb heda le bado ye5od ma3asho keef bado yet3emal ma3 l atm 3ando sha8lten lezm ya3meloun 3ashn ye2dar ya3mel access lal atm:
-2awl she l keybord ta3el l atm 3ashn ye2dar yda5el aye ra2m she she bado yeh 3al atm
-tene sha8le hey l screen 3shn yshof l eshya le btetl3lo

fa 3ashn ye2dar yet3emal ma3 l atm le bseer howe by3mel action bed5el data 2aw ma3lomet lal atm mn 5elel l keybord w ba3d heek l atm bt3mel shwayet magic w ba3d heek btl3lo data 3ala l screen hyde fa bel nesbe lal atm l keybord hyde 3ebra 3an input w l screen 3ebra 3an output
tyeb law hala2 3ana aye sha8le bte5od input w bt3melna output msln 3ana sha8le bte5od ra2m msln ra2m 2 bt3lna 4 bt5od ra2m 3 bt3o 6,4 bt3o 8 fa hyde 3ebra 3an sha8le bte5od input ra2m w btdrbo b 2 w bt3lna l output fa hyde 3ara 3an function aye sha8le bt5od input w bt3mel shwayet eshya bheda l input w b3den bt3lna output mnsameha function l atm nafs l kalem bte5od input w bt3lna output

tyeb so2al hal l atm btre2a hyde bte2dar tet3emal ma3 nafsa ya3ne hal bte2dar tale3 masare law7da 2aw hal bte2dar ta3mel aye she law7da akeed la2 l2no cycle ta3eta ma kelmlet me7teje action le howe keybord 7ada yda5el she  w me7teje 7ada yshof l screen w ye5od bene2an 3lyha action
heda sha5s 3ashn ye2dar yet3emal ma3 l atm fa heda sha5s bye5od action 3an tare2 2edo 2edo hyde btemsek l keybord w bd5el action lal atm ba3d heek bye5od l output le tale3 mn l screen beshofo b3youno w ba3d heek bd5el heda l kalem le shefo la 3a2lo w befker fe w bene2an 3lee bey5od action fa howe heek heda sha5s 3ando inout jeye mn l screen le tal3a mn l atm  w 3ando output le howe tale3 mn 2edo 7a yrou7 lal keybord le heye l input bel nesbe lal atm  fa heek 3ana kamen sha8le tenye bte5od input w ben2an 3al input by3te output le howe l sha5s heda le bado yet3emal ma3 l atm fa heda sha5s sar kamen bel nesbe 2elna function fa 3ashn l cycle kola hyde tseer w l atm teshte8l lezm 3amel l user ka2no function  3ashn ye2dar ykamele l cycle hyde
tyeb houne lesh 7ato l atm bel shere3?
l2no hyde l atm ela kaza meze:
1-2awl meze bt3mel l user as a function ya3ne enta ya user mawjoud 3ashn tkemel l function hyde
2-immutable input ya3ne 3ando input 8ayer ka2bele la ta8yer ya3ne 3ando input ma byenfa3 tet8ayar howe 3ando 5eyarat input lezm enta  te5tar menounn wa7ad ma byenfa3 t2lef 5eyar mn 3andak eshya sebte ma byenfa3 teta8ayr
3-howe 3ando known view state ya3ne ben2an 3ala l action 2aw zer le enta 7a tekbous 3lee l atm 3erfe eno sho 7a yezhrlk bel zabt so heye 3anda view state sebte w m3rofe ben2an 3al action le enta 7a te5do
4- bene2an eno heye known view state w immutable input l atm safe to use


fa ejo l mobile engineer 2alo eno wala hal atm men7a w 3anda kaza meze lesh ma nest5dem hawde l mazeya bel mobile engineer 2aw l mobile development 3ashn ne2dar nest5dem l mazeya hyde 3ashen ne2dar nest5dem l mzeya hyde le mawjoude de5el l atm jowet l mobile development eza rj3na la cycle ta3et heda sha5s le bado yet3emal ma3 l atm:
-la7 nbdel l atm bel mobile
-tyeb l input bel atm keen 3ebra 3an keybord bel mobile howe 3ebra 3an touch screen ta3et l mobile
-l output bel screen keen 3ebata 3an screen  l output bel mobile heye kamen l screen l mobile
fa sar l mobile howe bel nesbele l funtion w howe bel nesbe ele l input w l output metla metl l atm

tyeb cycle keef 7a tseer hal mobile howe law7do 7a yeshte8l la2:
lezm ykoun l user mawjoud
l user bye5od action mo3yan b2edo eno howe yeknous 3ala she zer bel screen 2aw she tene 3ala l scren 2aw ya3mel scroll heda 3ebra 3n action
bel mobile  2ana 3eref naweya l sha5s le 3am yest5dmo w 3eref sho 7a yseer metl l atm lama keen 3ande azrar m7dade ana 3eref l user 7a yekbous 3ala she menon w 3eref sho 7a yet3mlo fa ana houn bel mobile 3eref naweya l user bel mobile w m7dedlo kabset m7dade ya3ne law yekbous 3ala zer m3yan ana 3eref sho naweya le  7a yet3lo lama yekbous 3ala zer heda  le m7dad fa naweya houn bade sameha intent
fa ana hala2 3ande lista be kel l intent le momken l user ye5oda ben2an 3al action le user 7a ya3mlo b2edo l mobile 7a ye5od intent m3ayan mn le 3ando
fa hyde l intent 7a tet5od lal mobile le howe l function w l function 7a ta3mel process lal intent hyde w tale3le she mn demn aye she ana m3rfo yemken loading  result error 2aw aye she ya3ne 7a ye5od l mobile l intent hyde bene2an 3ala action l user w ytl3ele she mn hawde l loading,result,error aye she mnhwde 3era 3an result
result hyde 7a 7awela la view mo3ayan tezhar 3ala shshe l view hyde 7a tezhar lala user le howe l output bel nesbe lal mobile w ben2an 3ala heda l output 7a ye5od l user input mn 5elel 3youno ba3den 7a yd5elo heda l input la function l user ma3den berou7 befker heek w ben2an 3lee la heda l input byerj3 by3mel action m3yan le howe l output w heda l output befout 3ala l mobile ka input bene2an 3ala heda l input byeb3at intent lal finction l mobile w by3le3 result le howe l view w bye5do la heda l user l output le tele3 mn shehe w byrj3 by3mel nafs she .... cyclee hede


fa hdye le eshay le 3ande metl l funtion l intent action bade 2a3mloun bsha8le wa7de jame3oun b model fa hyde cycle bel nesbe ele heye l model 2a3mlo model 5ale loading ,result 2aw error jowa lista ta3et l ehya le momken te7sal


fa hala2 3ande model,intent,action,view

le bseer ana 3ande intent hay 2awl sha8le be5oda mn user le heye l intent mn 5elel action l user by3melo l model hala2 7a ye5od l intent hyde l model w y3mele function l model heye l funtion w ytl3eloe l model she mn hawde result,loading,error fa l model 7a ye5od l intent as parameter as an input w ba3d heek  by3mele shwayet logic 3lee tyeb ana a5dt l intent da5lto lal model neteje mn heda 3ebra 3n result 7a tezhar jowa l view fa l view 7a ye5od l result mn l model heda ka input 3ashn l user yshof l view w ye5od action 3lee ben2an 3al view le tele3
7a e5od 7arf l M mn l model
7a e5od 7arf l V mn l view
w 7a e5od 7arf l I mn l intent so
sar MVI archetetuture pattern jdeed esmo MVI howe 3ebra 3an modeling la result le bel  function l btseer jowa


hala2 3ande ana l action lel user by3melo b2edo w l le l user beshof b 3youno ka input w l view le btetla3 3al shshe heda kolo bseer de5el l activity

ya3ne l action l user 7a ye5do 7a yseer jowa l activity l2no l activity heye le 3am tbyen lal user w howe 3am ye2dar ye5od 3lyha action metl l setonclick listner...etc
w view le 3am yetla3 7a yben bel activity 3ashn yezhr lal user l user ye2dar yshofo w ye5od action ben2an 3lee

l intent le byen3mlo process jowa l function bel model 2aw jowa l function w bytla3 ka result heda bseer jowa l viewmodel tyeb keef ma enta 2oltlna heda mvi mesh mvvvm nees kteer alo eno l mvi 3ebra 3an add on 2aw she zyed 3an l mvvm fa sar fene est5dem l viewmodel tyb law ma bade est5dem l viewmodel be2dar 7ot l model 2aw l intent w result ta3wlete b2yae presentation logic 2aw aye loigc ana 7a est5dmo ya3ne ne7na 7a ne7ke 3an l mvi as add on 3ala l mvvm
fa 3ande actiity bte5od l action w te3roud view w 3ande viewmodel bye5od intent w yt3le result

fa hala2 ne7na 5alena nensa kel she w nrkez 3ala l activity w l viewmodel


3ande activity w view model bye7ko ma3 ba3d keef bye7ko ma3 ba3d keef 3an tare2 sha8lten:
1-2awl sha8le l view states heye l model metl loading 2aw result 2aw l error
2-intent ka2emet naweya le ana ba3refa ta3et l user

heye l model metl loading,result,error l viewstate bekounn 3ande bel application view satate mo3ayan yen3mlo render jowa l activity ya3ne ana balesh eno 3ande viewsatete byen3mlo render ba3den lal activity fa lama yen3mlo render bseer l user bye2dar yshof l eshay le ana bade yeh yshofa ya3ne hala2 l user beshof eshya 3ala l mobile screen 3ala l application tab3na w bye5od bene2an 3ala l eshya le shefa  action l action heda ana bade 7awlo la intent fa ben2an 3al l action le howe 7a ye5do ana 7a 2a3ml send la intent ya3ne law kabas 3ala button m3yan fa 7a 2olo eb3at l intent heda fa hal2 ana ma3e intent w bade eb3ato lal view model 2aw bade l viewmodel yest3mlo fa 7a 2a3mel process lal intent heda  fa ana 3ande intent m3ayn 7a 2a3mlo process jowa l view model  l viewmodel 3emel process lal intent hyde w 5als keef bade 7awlo lala view state fa hala2 ana 3ande she reduce l result le tal3a mn process intent  w bt7wlo la view state ba3d ma 7awlo lala view state 7a yseer redering heda l view state b2kb l activity ba3den iza l user 3emel action mnerja3 mnb3at intent bterka3 l intent bye3mla process b2lb l viewmodel btrj3 l viewmodel reduce hyde l intent la view state.....etc 7adala meshe bel cycle hyde immutable ma fe aye she l user by2dar ye5ter3o

iza jena rakzana 7a nl7ez eno l activity 3ebra 3an class w l viewmodel 3ebra 3an class w l intent 3ebra 3an class jowe kel naweya 2aw l intent le l user momken ya3mela
w l viewstate 3ebra 3an class   jowe kel l viewstate le momken tezhar lal user

ya3ne 3ande 4 classes w 3ande 4 function le houne  rendering,rduce,send ,process

Activity joweta 2 function:redinring,send
viewmodel joweta 2 function process,reduce

hala2 l activity bte5od input w btle3 output w l viewmodel bte5od input btle3 output
tyeb sho l input bel nesbe lal activity howe l render sho ya3ne ya3ne ana 7a eb3at lal activity viewstate ka input w ya3mlo reder la heda l view state ya3ne ye3rdo 3ala l activity
tyeb sho l output bel nesbe lal activity howe send  3ashen l user ya ya3mel action l activity l activity 7a tale3le intent m3yane

view model sho howe l input bel nesbe 2elo  l input howe l process intent ya3ne ana 7a eb3at intent lala viewmodel 3ashn ya3emlo preocess
w l output howe l nateje le tal3a mn l process intent 2aw mn l function le viewmodel

tyeb hala2 3ande 4 function metl ma 2olna balesh mn sho balesh mn send l user ba3tle action mo3ayen send hyde 3ebra 3an output mn l activity w bel nesbe lal viewmodel 3ebra 3an input 3ashn eb3ata lal viewmodel as an input  ba3mela process ba3d ma 2a3mel process ba3mel reduce lala nateje tel3et hyde b2ol reudce lal process le 2e5de l send fa l output tael3 mn l viewmodel 3ebra 3an reduce fa 3ashn 2o3roud nateje le tal3a mn reduce ba3mela rediring mn l activity fa hy cycle ta3et l mvi
send->process>reduce>render

send btseer ween bel activity
l process btseer ween bel viewmodel
l reduce btseer ween bel viewmodel
l redicring btseer ween bel activity


fa hala2 badna ntbe2 heda l concept b exmple 3ande button w teztview kel ma ekbous 3al button bade yen3aml zyede wa7d 3ala l testview ya3ne counter


 */


public class MainActivity extends AppCompatActivity {
    Button button;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=findViewById(R.id.getmoview);
        textView=findViewById(R.id.text);

        button.setOnClickListener(v->{
           textView.setText(getMovieFromModel().getName());
        });

    }

    public Model getMovieFromModel(){
        return new Model("breaking bad","2002","very nice",1);

    }


}