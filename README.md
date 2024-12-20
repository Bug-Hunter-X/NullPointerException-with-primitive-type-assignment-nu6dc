# NullPointerException in Scala with Primitive Type Assignment
This repository demonstrates a common Scala error: attempting to assign null to a primitive type (Int in this case).  Primitive types in Scala cannot be null; they must have a value. This will result in a compilation error.

## Bug
The file `bug.scala` contains code that tries to assign `null` to an `Int` variable. This will cause a compilation error.

## Solution
The file `bugSolution.scala` showcases the proper way to handle such a scenario using `Option` or another suitable approach that can handle the potential absence of a value. 