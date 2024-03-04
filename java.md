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