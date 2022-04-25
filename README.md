# Functional Programming with Java

**Intermediate operations are performed on a Stream and they will return a Stream back. Some examples are:**
- .distinct() _return => Stream<T>_
- .sorted() _return => Stream<T>_
- .map() _return => Stream<R>_
- .filter() _return => Stream<T>_

**Terminal operations return back something other than a Stream. Some examples are:**
- .forEach() _return => void_
- .reduce() _return => T (returns a specific type)_
- .collect() _return => R (returns a specific type - it can be either a map, list or set)_
