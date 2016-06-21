This program displays the teams playing football and their respective scores in the terminal. The data is obtained from www.goal.com.

This works best with a maximized terminal.

On UNIX:
1) Go to the folder
2) Compile with javac -cp .:jsoup-1.9.2.jar FootballScores.java
3) Run with java -cp .:$PATH_TO_FOLDER/jsoup-1.9.2.jar:$PATH_TO_FOLDER FootballScores

On Windows:
1) Go to the folder
2) Compile with javac -cp .;jsoup-1.9.2.jar FootballScores.java MatchObject.java
3) Run with java -cp .;$PATH_TO_FOLDER/jsoup-1.9.2.jar;$PATH_TO_FOLDER FootballScores

Linux users may be able to add a shortcut to the run command as follows:
1) Open ~/.bash_aliases
2) Type 'alias footballscores="java -cp.:$PATH_TO_FOLDER/jsoup-1.9.2.jar:$PATH_TO_FOLDER FootballScores
3) Save the file
4) Type 'source ~/.bash_aliases'
5) The command 'footballscores' in the command prompt should now work with the same functionality
