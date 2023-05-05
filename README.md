# java-studies-repo

## Basics

- public static void main(String[] args){}: função base, ela que vai roda o programa na JVM
- public final int: define uma constante
- public statici int: define uma variável que pertence a classe e não a instâncias. Ex: número de carros
- private/public int | string | Obj | Obj[] | criarMetodo(): criação de variáveis ou metodos
- import java.util.\*: importa todas as classes do pacote util

## Names

- "Class": Blueprint para novos objetos

- "Object": Instância da "Class"

- "Extend" (Herença): Criar novas classes baseado em classes
  Abstract: Criar uma classe mãe que não pode ser instanciada, apenas gerar novas classes

- "Iterface":similar a uma classe abstrata, é uma forma de armazenar apenas metodos que podem ser adicionacioandos "implement" a uma subclasse

- "this": no metodo "Constroct" ele permite diferenciar a paramentro do metodo com a variável que a classe define
- "new": criação de uma nova instância do objeto
- "get*" e "set*": ao invés de mudar a variável o objeto chama metodos para fazer alterações no objetos

## Pacote java.util

- Collection interface
  ArrayList - List
  LinkedList - List
  Vector - List
  HashSet - Set
  TeeeSet - Set
  PriorityQueue - Queue

- Map interface
  TreeMap
  Hashtable
  HashMap

## Outros Tópicos

### Genéricos: atende uma ação para diversos tipos de estruras de dados

1. Metodos genériocos: <T>
1. Classes genéricas: <E>

### Erros: lidar com erros de lógica ou runtime

1. try{} catch {}
1. throw metodoDoErro metodoDoErro
