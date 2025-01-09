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



### 
```java