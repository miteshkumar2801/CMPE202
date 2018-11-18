## Readme for Lab9


## Patterns implemented with lambda function:

1. Strategy :

Use the Java JDK 8 Lambda function to add different sorting strategy into the list.

    List<SortingStrategy> sortingStrategies = new ArrayList<SortingStrategy>();
    sortingStrategies.add((a)-> { new BubbleSort().sort(a);});
    sortingStrategies.add((a)-> { new MergeSort().sort(a);});
    sortingStrategies.add((a)-> { new QuickSort().sort(a);});


2. COR : Chain of Responsibility :: Using Predicate Function

    Predicate<String> h1Tester =  (a) -> a.equalsIgnoreCase("R1");
    Predicate<String> h2Tester  = (a) -> a.equalsIgnoreCase("R2");
    Predicate<String> h3Tester  = (a) -> a.equalsIgnoreCase("R3");



