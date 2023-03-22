# Playtech 2023 QA Engineer Intern Task 2023
## Files

- Service/WebPage: Class that contains the methods for the tasks.
- Main: Where the methods created for the main tasks are implemented.
- MainTest: Two JUnit tests. One for the main tasks, the other for the Bonus assignments.

## Task Solving Comments

Task 2 was initially solved by using XPath and specifying the search only for hyperlinks. For Bonus 1, 2 more
methods were implemented. The first one obtains the coordinates again by using XPath, and second uses those coordinates to drag the mouse and click on the link.

Task 3 implements the 'findElementInPage' method, which when called providing a String, will search for that String by obtaining the content of the HTML body, dividing it into paragraphs, and then comparing the String to it. If the String is in the text, the paragraph will be returned. Later the paragraph can be printed or put in a txt file (Bonus 2). 
It only searches for the body text since the task required the “Development QA Engineer (Intern)” String to be shown in the page, and by shown, I understand it means visible to the human eye.

Bonus 3 (JUnit tests) has 2 tests for both task implementations. The first implementation includes the main tasks, the second includes
the bonus assignments.


### Notes

The project was built using Maven
