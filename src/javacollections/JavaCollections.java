package javacollections;

public class JavaCollections {

}

/*
 * Arrays - initialized with fixed values like int array[] = new int[10]; so not
 * arrays are not dynamically growing (no more alloaction based on the
 * requirements) and the arrays operation like (searching) is very expensive
 * 
 * 
 * 
 * 
 * A collection — sometimes called a container — is simply an object that groups
 * multiple elements into a single unit. Collections are used to store,
 * retrieve, manipulate, and communicate aggregate data. Typically, they
 * represent data items that form a natural group, such as a poker hand (a
 * collection of cards), a mail folder (a collection of letters), or a telephone
 * directory (a mapping of names to phone numbers). If you have used the Java
 * programming language — or just about any other programming language — you are
 * already familiar with collections.
 * 
 * Collections Framework? A collections framework is a unified architecture for
 * representing and manipulating collections. All collections frameworks contain
 * the following: Interfaces: These are abstract data types that represent
 * collections. Interfaces allow collections to be manipulated independently of
 * the details of their representation Implementations: These are the concrete
 * implementations of the collection interfaces. In essence, they are reusable
 * data structures. Algorithms: These are the methods that perform useful
 * computations, such as searching and sorting, on objects that implement
 * collection interfaces.
 * 
 * 
 * Benefits of the Java Collections Framework Reduces programming effort: By
 * providing useful data structures and algorithms, the Collections Framework
 * frees you to concentrate on the important parts of your program rather than
 * on the low-level "plumbing" required to make it work. Increases program speed
 * and quality: This Collections Framework provides high-performance,
 * high-quality implementations of useful data structures and algorithms.
 * Reduces effort to learn and to use new APIs: Many APIs naturally take
 * collections on input and furnish them as output. Reduces effort to design new
 * APIs: This is the flip side of the previous advantage. Designers and
 * implementers don't have to reinvent the wheel each time they create an API
 * that relies on collections; instead, they can use standard collection
 * interfaces. Fosters software reuse: New data structures that conform to the
 * standard collection interfaces are by nature reusable. No knowledge about
 * size Dynamic expansion Fast random access Fast lookups Ordered vs unordered
 * null vs non-null automatic sorting <key, value> mappings
 * 
 * 
 * Iterable Collection -- Root Intreface --> Set - [Sorted Set] / List / Queue /
 * Deque Map - Root Interface (key, value) pairs [Sorted Map]
 * 
 * 
 * List Interface -> ArryaList / LinkedList / Vector - [Stack] Queue - Prioirty
 * Queue Dqueue - ArrayDeque / LinkedList 
 * Set - HashSet / LinkedHashSet - [SortedSet, TreeSet]
 * 
 * Map - AbstractMap [HashMap - EnumMap] public interface Collection<E> extends
 * Iterable<E> {
 * 
 * 
 * }
 * 
 * Collection — the root of the collection hierarchy. A collection represents a
 * group of objects known as its elements. Set — a collection that cannot
 * contain duplicate elements List — an ordered collection (sometimes called a
 * sequence). Lists can contain duplicate elements. Queue / Deque — a collection
 * used to hold multiple elements prior to processing. Map — an object that maps
 * keys to values. A Map cannot contain duplicate keys; each key can map to at
 * most one value. SortedSet — a Set that maintains its elements in ascending
 * order (ordered sets) SortedMap — a Map that maintains its mappings in
 * ascending key order.
 * 
 * 
 * Traversing Collections 1) using aggregate operations
 * myShapesCollection.stream() .filter(e -> e.getColor() == Color.RED)
 * .forEach(e -> System.out.println(e.getName()));
 * 
 * 2) with the for-each construct and for (Object o : collection)
 * System.out.println(o);
 * 
 * 3) by using Iterators public interface Iterator<E> { Iterator iterator =
 * listArray.iterator(); while(iterator.hasNext()){
 * System.out.println(iterator.next()); }
 * 
 * 
 * //collection interface add(Object) addAll(Collection c) clear()
 * contains(Object o) containsAll(Collection c) equals(Object o) hashCode()
 * isEmpty() iterator() max() parallelStream() remove(Object o)
 * removeAll(Collection c) removeIf(Predicate filter) retainAll(Collection c)
 * size() spliterator() stream() toArray()
 * 
 * 
 * 1) List Interface List <data-type> list1= new ArrayList(); List <data-type>
 * list2 = new LinkedList(); List <data-type> list3 = new Vector(); List
 * <data-type> list4 = new Stack();
 * 
 */