### Lambda uttryck

```java
//PriorityQueueExample.java
 TopElements<Integer> top = new TopElements<>((n1, n2) -> n1 - n2, 3);
```
```java
(n1, n2) -> n1 - n2) // Lambda uttryck
```
Exempel på hur lamba uttryck kan användas för att skapa en instans av klassen TopElements. Lambda uttrycket används för att skapa en Comparator som används för att jämföra två heltal. I exemplet ovan används lambda uttrycket för att skapa en instans av klassen TopElements som kan hålla tre heltal och som använder sig av en Comparator som jämför heltal genom att subtrahera dem från varandra.

Kortfattat är lamda uttryck en funktion utan namn. 
Skapar en instance av Comparator interfacet som används för att jämföra två heltal. 


### Stream, Map och Collect
```java
List<String> names = games.stream()
.filter(g -> g.getMinNbrPlayers() <= 5 && g.getMaxNbrPlayers >= 5)
.map(g -> g.getName())
.collect(Collectors.toList());
```

En lista av spel games filtreras med hjälp av stream och lambda uttryck.


```java
.filter(g -> g.getMinNbrPlayers() <= 5 && g.getMaxNbrPlayers >= 5)
```
Filtrerar listan games så att endast de spel som har minst 5 spelare och max 5 spelare visas.

```java
.map(g -> g.getName())
```
Skapar en ny lista med endast namnen på de spel som filtrerats fram.

```java
.collect(Collectors.toList());
```
Samlar ihop de filtrerade namnen i en lista.

---

```java
List<Integer> idList = idNbrs.stream().
        filter(id -> bugs.getPosts(id).size() > 1).
        sorted((id1, id2) -> bugs.getPosts(id2).size() - bugs.getPosts(id1).size()).
        collect(Collectors.toList());
```

En lista av id-nummer idNbrs filtreras med hjälp av stream och lambda uttryck.

```java
.filter(id -> bugs.getPosts(id).size() > 1)
```
Filtrerar listan idNbrs så att endast de id-nummer vars postlista har mer än ett element visas.

```java
.sorted((id1, id2) -> bugs.getPosts(id2).size() - bugs.getPosts(id1).size())
```
Sorterar de filtrerade id-numren i fallande ordning baserat på antalet element i postlistan.

```java
.collect(Collectors.toList())
```
Samlar ihop de filtrerade och sorterade id-numren i en lista.

### Huffman Träd
```java
public void printEncoding() {
    if(root != null) {
        printEncoding(root, "");
    }
}

private void printEncoding(Node n, String p) {
    //När vi nått slutet, a.k.a ett löv
    if(n.left == null) {
        System.out.println(n.symbol + " " + p);
    }
    //Annars fortsätt rekursivt
    else {
        printEncoding(n.left, p + "0");
        printEncoding(n.right, p + "1");
    }
}
```
Metoden printEncoding() anropar den privata metoden printEncoding(Node n, String p) med rotnoden och en tom sträng som argument. Om rotnoden inte är null anropas metoden printEncoding(Node n, String p) med rotnoden och en tom sträng som argument. Metoden printEncoding(Node n, String p) skriver ut symbolen och den kod som symbolen har. Om noden inte är ett löv anropas metoden rekursivt med nodens vänstra barn och en sträng som är p plus 0. 
Sedan anropas metoden rekursivt med nodens högra barn och en sträng som är p plus 1.

```java
if(n.left == null) {
    System.out.println(n.symbol + " " + p);
}
```
Räcker med att checka vänster sidan eftersom om vänster är null så är höger också null i ett korrekt uppbyggt Huffman träd.



### PriorityQueue

```java
public HuffmanTree(Map<Character, Double> freq) {
    //Skapar är PriorityQueue som sorterar efter weight på nodes
    PriorityQueue<Node> nodeList = new PriorityQueue<Node>((n1, n2) -> Double.compare(n1.weight, n2.weight));
    
    //Lägger in varje key : värde i nyskapade PriorityQueue
    for(Map.Entry<Character, Double> entry : freq.entrySet()) {
        nodeList.offer(new Node(entry.getKey(), entry.getValue()));
    }
    
    //Medans nodeList är större än 1 fortsätt gör följande
    while(nodeList.size() > 1) {
        //Ta ut lägsta värde på node
        Node leftNode = nodeList.poll();
        //Ta ut näst lägsta
        Node rightNode = nodeList.poll();
        //Skapa en temp root node som har weight summan av båda
        Node rootNode = new Node(' ', leftNode.weight + rightNode.weight);
        //Kopplar samman dem
        rootNode.left = leftNode;
        rootNode.right = rightNode;
        //Lägger till paret i listan
        nodeList.offer(rootNode);
    }
    //När listan är av storlek 1 så kommer vi ha byggt hela trädet.
    //Sätter därmed root till det enda Node objectet som finns kvar
    root = nodeList.poll();
}
```

Denna kod bygger ett Huffman träd baserat på vikterna i en map. 
En PriorityQueue skapas som sorterar efter vikten på noderna.
Varje nyckel och värde i mapen läggs in i PriorityQueue.

```java
nodeList.offer(OBJECT);
```
Lägger till ett element i PriorityQueue.

```java
nodeList.poll();
```
Tar ut och returnerar det minsta elementet i PriorityQueue.

```java
System.out.println(nodeList);
```
Skriver ut hela PriorityQueue. Inte sorterad. D.v.s: den första noden är inte den minsta.


### Predicate
```java
//create a predicate
Predicate<Integer> p = n -> n % 2 == 0;
//test the predicate
System.out.println(p.test(4)); // true, because 4 is even
System.out.println(p.test(5)); // false, because 5 is odd
```
Använder lambda uttrycket för att skapa en instans av Predicate interfacet.
Lambdra uttryck 
```java
n -> n % 2 == 0
```
skapar en funktion som tar ett heltal som argument och returnerar true om talet är jämnt och false om talet är udda.


### Rekursion
Exempel 1
```
START_METOD
    SKAPAR NYTT_OBJEKT
    ANROPAR REKURSIV_METOD(START, PARAMETER, NYTT_OBJEKT)
    RETURN NYTT_OBJEKT
    

REKURSIV_METOD(START, PARAMETER, NYTT_OBJEKT)
    OM PARAMETER == 0
        ÄNDRA NYTT_OBJEKT
    ANNARS
        ANROPAR REKURSIV_METOD(UPPDATERAD_START, PARAMETER, NYTT_OBJEKT)
```


```java
public static List<File> biggerThan(File file, int size) {
    List<File> fileList = new ArrayList<File>();
    biggerThan(file, size, fileList);
    return fileList;
}

private static void biggerThan(File file, int size, List<File> fileList) {
    if(file.isFile()) {
        if(file.length() > size) {
            fileList.add(file);
        }
    }
    else if(file.isDirectory()) {
        for(File f : file.listFiles()) {
            biggerThan(f, size, fileList);
        }
    }
}
```


## EXTRA
```java
Map<String, int[]> games = new HashMap<>();
```
```java
Map<String, int[]> games = new TreeMap<>();
```

```java
public String toString() {
        StringBuilder sb = new StringBuilder();
        //Bygg rad för rad och lägg \n efter varje rad
        for(Map.Entry<String, int[]> entry : games.entrySet()) {
            sb.append(entry.getKey() + " " + averageRating(entry.getKey()) + "\n");
        }
        return sb.toString();
    }
```
TreeMap är en sorterad map som sorterar efter nyckeln. I exemplet ovan så kommer TreeMap att sortera efter nyckeln i bokstavsordning. HashMap däremot sorterar inte efter nyckeln. 

## Trick inför tenta
Ifall din toString() metod ibland ger rätt men ibland fel så testa att byta till TreeMap eller HashMap.
* TreeMap: Sorterar efter nyckeln
* HashMap: Sorterar inte efter nyckeln

---
Glöm inte sätta size på LinkedLists!
```java
public void drop(int n) {
    if(n < 0) {
        throw new IllegalArgumentException("Negativ");
    }
    
    if(size < n) {
        first = null;
        size = 0; //Glöm inte sätta size på LinkedLists!
    } 
    
    else {
        for(int i = 0; i < n; i++) {
            first = first.next;
            size--;
        }
    }
}
```
Denna funtkion tar bort n första elementen i en LinkedList. Om n är mindre än 0 så kastas ett IllegalArgumentException. Om n är större än storleken på listan så sätts first till null och size till 0. Annars så loopas listan igenom n gånger och first sätts till nästa element och size minskas med 1.