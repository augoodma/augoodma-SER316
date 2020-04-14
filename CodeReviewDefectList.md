Code Review Defect List
Reviewer: Andrew Goodman (augoodma) GH Repo: https://github.com/augoodma/augoodma-SER316.git

|ID #| Location             |              Problem Description              | Problem             |
|    |----------------------|                                               |---------------------|
|    | File and Line Number |                                               | Category | Severity |
|----|----------------------|-----------------------------------------------|----------|----------|
| 1  | All .java files      | No file banner comments                       | CG       | LOW      |
| 2  | All .java files      | No class banner comments                      | CG       | LOW      |
| 3  | All .java files      | No method banner comments                     | CG       | LOW      |
| 4  | Cart.java: 37        | Method name not lower camelCase               | CG       | LOW      |
| 5  | Cart.java: 41        | Attribute name not lower camelCase            | CG       | LOW      |
| 6  | Cart.java: 105       | Method name not lower camelCase               | CG       | LOW      |
| 7  | Main.java: 12-13     | Attribute names not lower camelCase           | CG       | LOW      |
| 8  | Cart.java: 8-10      | Class attributes not private                  | CG       | LOW      |
| 9  | Cart.java: 8-10      | No leading underscores                        | CG       | LOW      |
| 10 | Cart.java            | Methods and attributes in improper order      | CG       | LOW      |
| 11 | Cart.java: 106       | Improper {} style                             | CG       | LOW      |
| 12 | Cart.java: 67-68     | Else if without {}                            | CG       | LOW      |
| 13 | All .java files      | Inconsistent indentation (spaces and indents) | CG       | LOW      |
| 14 | Cart.java: 92        | Identifier too long                           | CS       | LOW      |
| 15 | Cart.java: 112       | Identifier too short                          | CS       | LOW      |
| 16 | Cart.java: 41        | Method not implemented                        | FS       | BR       |
| 17 | Cart.java: 55        | Unused attribute (for now)                    | MD       | LOW      |

Category: CS – Code Smell defect. 
          CG – Violation of a coding guideline. Provide the guideline number. 
          FD – Functional defect. Code will not produce the expected result. 
          MD – Miscellaneous defect, for all other defects.
Severity: BR - Blocker, must be fixed asap. MJ – Major, of high importance but not a Blocker LOW – Low. 
