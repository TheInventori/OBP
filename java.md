# **JAVA**

* **objektovo orientovany jazyk** (modeluje objekty realneho sveta)
* pouziva sa na **dynamicke programovanie** (aplikacie, programovanie TV)
* **kompilovany aj interpretovany jazyk**
* po kompilacii zdrojoveho kodu vznikne **bytecode**, ktory je prenosny ale na spustenie potrebujeme interpreter
* **platformovo nezavisly**, bytecode je prenosny a spustitelny na roznych plafromach -> **podmienkou je nainstalovany JVM** (java virtual machine)

## Ako vytvorit program v JAVE

1. **vytvorenie**/editacia **zdrojoveho kodu** --> pripona: **.java**
1. **kompilacia** pomocou preklacada kompilatora --> javac *nazovsuboru*.java
1. po uspesnej kompilacii sa vytvoril bytecode --> *nazovsuboru*.class
1. **spustame** cez cmd --> java *nazovsuboru* <br> (spustitelny je iba bytecode; podmienkou je nainstalovany JVM)

```Java
public class hello{
    // hello = nazov suboru, case sensitive
    // nazov suboru a triedy su rovnake
    public static void main(String[] args) {
        System.out.println("Hello 3.B");
    }
}
```

Program v jave obsahuje jednu alebo viacero tried, musi obsahovat metodu main

## Trieda (Class)
* programatorom zadefinovany zlozeny datovy typ, ktory zapuzdruje datove polozky a metody
* klucove slovo na vytvorenie triedy - `class` - potom nasleduje nazov triedy
* napr. `class Reggin`
* Nazov triedy vzdy VELKYM pismenom
* trieda je sablona pre objekty a objekt je instanciou triedy
* ked su jednotlive objekty vytvorene, zdedia vsetky premenne a metody z triedy
* premenne triedy su atributy
```Java
class Strom{
    String druh;
    int vek;
    double vyska;
    double hrubka;

    Strom dub;
    dub = new Strom();
}
```


### Datove polozky
* popisuju stav/vlastnosti objektu --> popisuju stav/vlastnosti realneho objektu

### Metody
* urcuju alebo definuju sposob komunikacie s objektom alebo medzi objektmi
* na zaciatku zapisujeme prikazy len do metody `public static void main(String[] args) {}`
* `static` metody mozu existovat aj bez vytvorenia objektu
* `public` ma pristup iba objekty triedy
* metody v Jave su rovnocenne

## Preco je java OOP?
* **Proceduralne programovanie:** <br>
    pisanie funkcii / procedur (metod), ktore vykonavaju operacie s udajmi
* **Objektovo orientovane programovanie:** vytvaranie **objektov,** ktore obsahuju udaje aj metody

### Vyhody OOP
* program je rychlejsi a lahsie sa spusta
* poskytuje jasnu strukturu pre programy
* pomaha udrziavat kod Java v suchu "Neopakujte sa" a ulahcuje udrzbu, upravu a ladenie kodu
* umoznuje vytvarat plne znovu pouzitelne aplikacie s mensim mnozstvom kodu a kratsim casom vyvoja

## take veci
* `final` - nieco ako const
* text - `System.out.println("Meno: " + ahoj1.fname + " " + ahoj1.lname);`

## Konstruktor
* specialna metoda, ktora sa pouziva na inicializaciu objektov
* inicializuje hodnoty atributov
* nazov konstruktora musi byt velkym pismenom a je rovnaky ako nazov tredy
* konstruktor sa vola pri vytvarani objektu
* v konstruktore nemoze byt `return` a `void`!!
* `this.daco = daco`
```Java
public Main(int test) {
    premenna1 = 69;
    this.test = test; // zmeni permennu test v triede na hodnotu premennej test v konstruktore
}
```

### `this`
* klucove slovo, ktore sluzi na odlisenie nazvu parametra tj. lokalnej premennej od nazvu atributu triedy
* `this` vyjadruje prislusnost triede respektive instancii


* Ключевое слово, используемое для различения имени параметра, т.е. локальной переменной из имени атрибута класса
* 用于区分参数名称的关键字，即 来自类属性名称的局部变量
* کلمه کلیدی مورد استفاده برای متمایز کردن نام پارامتر، یعنی. یک متغیر محلی از نام ویژگی کلاس

## Zapuzdrenie
* zabezpecit aby boli citlive udaje pred pouzivatelmi skryte
* na dosiahnutie toho:
    1. deklarujeme metody triedy ako sukromne
    1. poskytujeme metody `get` a `set` na nastavenie pristupu a aktualizacie hodnoty sukromnej premennej
    1. vokajsia trieda k atributom private ma pristup lek ak poskytneme metodu: 
        * `get` - vrati hodnotu premennej
        * `set` - nstavi hodnotu premennej

## Scanner
```Java
import java.util.Scanner; // iba raz v kode
Scanner vstup = new Scanner(System.in); // iba raz v kode
a = vstup.nextInt(); // nacitanie int do a
text = vstup.nextln(); // nacitanie retazca
```
* Nazov scannera si davame aky chceme
* Vytvarame novy objekt triedy scanner, do zatvoriek dame `System.in`

## Pretazenie metod
Pretazene metody su metody, ktore maju rovnake mena ale rozne hlavicky
* metoda je pretazena, ak sa jej formalne parametre lisia poctom, alebo typom, alebo poradim
* metodu nie je mozne pretazit len zmenou typu navratovej hodnoty 

## Volanie metod inymi metodami tej istej triedy
* metody v jednej triede su si rovne
* metody instancii mozu lubovolne volat ine metody instancii danej triedy
* metody triedy nemozu volat jej instancie a pouzivat jej premenne (asi (neviem (hral som tetris 😊)))
* konstruktor triedy moze volat vsetky metody a konstruktory triedy

## Pouzitie statickych metod v objektoch
* staticka metoda z `java.core.api`

## Polia
* referencny datovy typ

### deklaracia
* pri deklaracii sa neudava velkost - vsetky polia su alokovane dynamicky

```Java
int []cisla;
```

* pred prvym pouzitim pridelim pamat pomocou operatora `new`

```Java
cisla = new int[5];
```

```Java
// jednoriadkovy zapis
int []cisla = new int[5];
```

```Java
// definicia 
int []cisla = {1, 2, 3, 5};
```

* dlzku pola zistujeme pomocou clenskej premennej `length`, ktoru automaticky vlastni kazde pole

### metody na triede arrays

musime importovat `java.util.Arrays`
```Java
import java.util.Arrays;
```
* metoda `sort(array_name)` - zoradi prvky pola v pripade cisel od najmensieho po najvacsie alebo v pripade retazcov abecedne

* metoda `binarySearch(array_name, x)` - vyhlada prvok v poli, POLE MUSI BYT NAJPRV ZORADENE, x = hladany prvok, ak je prvok najdeny, vracia sa jeho index, ak nie je najdeny vrati sa -1

* metoda `copyOfRange(src_array_name, start_index, end_index)` - skopiruje cast pola do ineho pola, ak dame start napr index 2 a end index 5 tak skopiruje indexy 2, 3, 4

### pole objektov
* v pripade pola objektov potrebujem vytvorit instancie objektu ku kazdemu prvku pola


## Retazce

* dalsi z nie primitivnych datovych typov (referencny datovy typ)
* sluzi na uchovavanie dlhsieho textu - az do 2 GB
* objekt triedy String (java.lang.String), ktora po deklaracii obsahuje specialne metody (prehladavanie, zistenie potu znakov a pod.)
* nacitanie retazca znakov (celeho riadku) - prikaz nextLine()

```Java
// je potrebne si spravit scanner
String a = vstup.nextLine();
```

### Vytvorenie retazca
```Java 
String veta = "Vonku svieti slnko.";
```
* ak compiler najde v zdrojaku text, vytvori pre neho objekt String

```Java
String s1, s2, s3, s4, s5, s6;
byte[] bajty = {(byte) 'E', (byte) 'v', (byte) 'a'};
char[] znaky = {'M', 'a', 'r', 't', 'i', 'n', 'a'};

s1 = new String("cao");
s2 = new String(s1);
s3 = new String(bajty);
s4 = new String(bajty, 1, 2); // vezmu sa 2 bajty od indexu 1
s5 = new String(znaky);
s6 = new String(znaky, 3, 4); // vezmu sa 4 znaky od indexu 3

```

* retazec pozostava zo znakov
* kazdy znak ma v retazci svoje miesto, ktore je deinovame prostrednictvom indexu (0, 1, ..., (dlzka_retazca) - 1)
* `String data = "Madonna";` maju znaky indexy: "M" = 0, "a" = 1, "d" = 2...

### Dlzka retazca
* metoda length() - vratenie poctu znakov ulozeneho obsahu
```Java
String data = "Mama";
int dlzka = data.length();
System.out.println(dlzka);
```
* do premennej dlzka sa ulozi pocet znakov, ktore obsahuje premenna data t.j. v tomto pripade 4

### Inicializovane pole retazcov
* jednotlive retazce sa zapisu v uvodzovkach, oddelene ciarkami

```Java
String[] pole = {"Dana", "Eva", "Martina"};
for(int i = 0; i < pole.length; i++) {
    System.out.println(pole[i]);
}
```
### Spajanie retazcov - operator "+" a metoda `concat()`
* `concat()` zo spajanych retazcov vytvori 3. retazec - povodne retazce sa nemenia
```Java
String a = "Steven";
String b = "Spielberg";
String c = a + b; // premenna c obsahuje text "StevenSpielberg" bez medzery
String d = a + " "; // premenna d obsahuje text "Steven " s medzerou na konci
d = d.concat(b); // obsah premennej d sa zmeni tak, ze sa k nemu prida obsah premennej b, vysledok ulozeny v premennej d bude "Steven Spielberg"
```
* vysledkom spojenia akejkolvek premennej s retazcom je retazec
* ak pripocitame (+) obsah premennej k akemukolvek retazcu, tento obsah sa transformuje (skonvertuje) na retazec
### Dalsie metody
* metoda `toLowerCase()` - zmeni vsetky pismena na male
* metoda `toUpperCase()` - zmeni vsetky pismena na velke
* metoda `equals()` - ak su retazce zhodne, vysledkom je true, inak false
* metoda `equalsIgnoreCase()` - nerozlisuje velke a male pismena inak podobne ako `equals()`
* metoda `compareTo()`
* metoda `compareToIgnoreCase()` - nerozlisuje velke a male pismena
    * metody `compareTo...` vracaju hodnoty: -1 (ak je retazec v parametri vacsi), 1 (ak je retazec v parametri mensi), 0 (pri zhode)
* metoda `replace()` - zameni znaky v retazci, ma 2 parametre, zameni 1. znak za 2.
* metoda `substring(x, y)` - vrati z retazca znaky od zadanej pozicie az po poziciu, ktora sa nachadza pred druhym parametrom
    * metoda `substring(x)` - vrati znaky od zadanej pozicie az do konca retazca
```Java
String data = "Phoenix";
System.out.println(data.substring(2, 5));

// funkcia substring() vrati "oen"
```
```Java
String s = "male a VELKE";
char[] znaky = new char[10];

s.getChars(2, 9, znaky, 0);
System.out.println(znaky); // "le a VE"

// Kopiruje podretazec retazca s od indexu 2 po index 8 do pola znakov znaky od 0-teho indexu
```
* metody `startsWith(x)` a `endsWith(x)` - vratia `true` alebo `false` podla toho ci retazec zacina alebo konci s retazcom v parametri
* metoda `trim()` - odoberie vsetky medzery, tabulatory, a nove riadky na zaciatku i konci retazca
* metoda `charAt(position)` - vrati znak na pozicii v parametri
* metoda `lastIndexOf("VEL")` - ak je znak najdeny, vracia sa jeho index, ak nie je najdeny vrati sa -1

## Array list
* musime importnut:

```Java
import java.util.ArrayList;
```

* hovori sa tomu genericka trieda
* parametrizovane datove typy, ako parameter sluzi trieda, s kt. budeme pracovat
* POLE PREMENLIVEJ DLZKY
* k prvkom pola pristupujeme cez indexy
* vytvarame ho `ArrayList <Integer> list;` - parameter je trieda Integer
* vytvarame ho `ArrayList <String> alist;` - parameter je trieda String

```Java
import java.util.ArrayList;


ArrayList<Integer> list;                            // deklaracia premennej
list = new ArrayList<Integer>();                    // vytvorenie instancie
ArrayList<String> alist = new ArrayList<String>();  // deklaracia premennej 
                                                    //          +
                                                    // vytvorenie instancie
                                                    
list.add(10);                                       // pridame cislo 10 na koniec pola
list.add(25);                                       // pridame cislo 25 na koniec pola
list.add(7);                                        // pridame cislo 7 na koniec pola
list.add(2, 100);                                   // pridame cislo 100 na index 2 v 
                                                    // poli a vsetky vacsie indexy 
                                                    // posunie o 1
list.set(1, 23);                                    // nastavi cislo 23 na index 1
list.remove(2);                                     // odstrani index 2
list.size();                                        // vrati velkost ArrayListu "list"
```

## Dedicnost

* moznost pridat k zakladnej triede (rodicovskej/supertriede/predkovi) dalsie vlastnostia tak vytvorit odvodenu triedu (zdedenu/potomka/dcersku)
* dedenie je nastroj pre vytvaranie opakovane vyuzitelnych (reusable) programovych modulov
* dedenie umoznuje:
    * co bolo v zakladnej triede dobre, ponechat
    * co nam chybalo, dodat
    * co sa nam nepacilo, zmenit
* v Jave existuje len jednoducha dedicnost, t.j. kazda tireda moze mat len 1 priameho predka

### Realizacia dedicnosti

```JAVA
//           potomok        rodic
public class Kvader extends Obdlznik {
    public int hlbka;

    // v triede kvader dochadza k prekritiu/zatienenie (overwrite) metody dlzkaUhlopiecky
    public Kvader(int sirka, int vyska, int hlbka) {
        // konstruktor rodica
        super(sirka, vyska);
        this.hlbka = hlbka;
    }

    public double dlzkaUhlopriecky() {
        //                        volanie metody pomocou super.daco()
        return Math.sqrt(Math.pow(super.dlzkaUhlopriecky(), 2) + Math.pow(hlbka, 2));
    }
}
```

### Problemy s neimplicitnymi konstruktormi
* pri vyuziti dedicnosti pri konstrukcii objektu typu potomok musi byt vzdy mozne vyvolat konstruktor rodica
* su 2 moznosti:
    1. ak v rodicovi je konstruktor bez parametrov alebo implicitny, tak konstruktor v potomkovi moze byt implicitny
    1. ak v rodicovi je konstruktor s parametrom, tak explicitny konstruktor potomka musi existovat a ako svoj prvy prikaz musi volat pomocou slovicka super(konstruktor_rodica)
* aby sme usetrili starosti buducim potomkom triedy, odporuca sa v rodicovskej triede pripravit aj 1 konstruktor bez parametrov


### ak nechceme aby bolo mozne metodu prekrit
* zabranime pomocou slova `final`
* `final` zabrani prekrytiu ale nezabrani pretazeniu

### ak chceme aby bolo nutne metodu prekrit
* napisanim slova `abstract` v rodicovskej triede, vynutime v dcerskej triede naprogramovat metodu s rovnakym nazvom inak sa program neprelozi
* astraktna metoda ma len hlavicku!
* akonahle trieda obsahuje abstraktnu metodu, musi cela trieda byt `abstract`

### ak nechceme aby bolo mozne triedu zdedit
* zabezpecime to slovom `final` pred nazvom triedy, trieda sa stava koncovou a nemoze sa stat rodicom
* takato trieda nesmie obsahovat abstraktnu metodu, `final` a `abstract` by mali protichodny ucinok

### prekrytie premennej
* u primitivnych datovych typov to ma vyznam len vtedy ak potrebujeme premennu s rovnakym nazvom ale ineho typu
* u referencnych datovych typov dosiahneme v triede potomka specializacie tejto clenskej premennej
* k prekrytiu premennej sa da dostat v metodach instancie pomocou `super`
* v metodach triedy to nieje mozne, pretoze staticke metody nemozu pouzivat metody objektov


## Trieda Object

* triedy su organizovane v hierarchickej dedicnej postupnosti
* na vrchole je trieda `java.lang.Object`, ktora definuje zakladny stav a spravanie vsetkych objektov v programe
* ak neuvedieme triede predka, dosadi sa jej trieda `Object`, tato trieda nema ziadne zvonku dostupne datove prvky
* ma metody ktore:
    1. pouzivatel moze preprogramovat (prekryt):
        * `clone()`
        * `equals()`
        * `hashCode()`
        * `finalize()`
        * `toString()`
    1. finalne:
        * `getClass()`
        * `notify()`
        * `wait()`