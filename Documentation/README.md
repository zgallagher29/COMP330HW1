# COMP330HW1

//PlANNING.txt contains some planning that we did on differnt dates
//REGEX_class:
    1) Creates our final document with all the mentions, identifiers, topics, keywords, and references.
    2) Sorts the files topologically based upon references
//Note.java: prompts the users to enter a mentions, identifiers, topics, keywords, or reference and returns what is in the file (without regex)
//wordInfo.java: Does a word count of the different cases
//topoSortedtxt:Prints the order of files topologically sorted 



Sources Read/Watched: 
1) https://alvinalexander.com/blog/post/java/how-find-string-simple-regex-pattern-matcher
2) https://www.youtube.com/watch?v=s_PfopWcMwI
3) https://regexr.com/
4) https://www.programcreek.com/2013/03/java-sort-map-by-value/ - We used this a lot for our topological sort
5) https://stackoverflow.com/questions/1053467/how-do-i-save-a-string-to-a-text-file-using-java


Functional Requirements:
1) Be able to report of all notes containing one or more mentions
2) Be able to generate a report of all notes, organized by mention
3) Be able to generate a report of all keywords
4) Be able to generate a report of all notes, organized by keyword
5) Be able to report notes by mention/keywords selectively
6) Report of all notes in topological order



To run: 
1) Clone the project into C9 or the IDE of your choice
2) Open up main.java and build/run it
3) "What is the name of the folder/directory?" will pop up on the screen
4) Enter the folder/directory you're looking for
5) Enter if you are looking for a unique identifiers, reference, person, topic, or keyword
6) When 'Time for Regex' pops up enter the folder/directory again
7) A file will be written () with all of the mentions, topics, references, keywords, and identifiers
8) The files will be returned topologically based upon their references




