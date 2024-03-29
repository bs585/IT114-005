<table><tr><td> <em>Assignment: </em> IT114 - Number Guesser</td></tr>
<tr><td> <em>Student: </em> Brandon Sanchez (bs585)</td></tr>
<tr><td> <em>Generated: </em> 10/4/2022 10:55:34 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-number-guesser/grade/bs585" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create the below branch name</li><li>Implement the NumberGuess4 example from the lesson/slides</li><li>Add/commit the files as-is from the lesson material (this is the base template)</li><li>Pick two (2) of the following options to implement</li><ol><li>Display higher or lower as a hint after a wrong guess</li><li>Implement anti-data tampering of the save file data (reject user direct edits)</li><li>Add a difficulty selector that adjusts the max strikes per level</li><li>Display a cold, warm, hot indicator based on how close to the correct value the guess is (example, 10 numbers away is cold, 5 numbers away is warm, 2 numbers away is hot; adjust these per your preference)</li><li>Add a hint command that can be used once per level and only after 2 strikes have been used that reduces the range around the correct number (i.e., number is 5 and range is initially 1-15, new range could be 3-8 as a hint)</li><li>Implement separate save files based on a "What's your name?" prompt at the start of the game</li></ol><li>Fill in the below deliverables</li><li>Create an m3_submission.md file and fill in the markdown from this tool when you're done</li><li>Git add/commit/push your changes to the HW branch</li><li>Create a pull request to main</li><li>Complete the pull request</li><li>Grab the link to the m3_submission.md from the main branch and submit that direct link to github</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Implementation 1 (one of the picked items) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Two Screenshots: Add a screenshot demonstrating the feature during runtime; Add a screenshot (or so) of the snippets of code that implement the feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98120824/193966958-173c8161-a99c-46f0-9a2d-519ad6842419.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code for &quot;Display higher or lower as a hint after a wrong guess&quot;<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98120824/193968829-c25fa496-f9dc-4936-ad31-c775591a2aa7.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Showing that it works<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the logic behind your implementation</td></tr>
<tr><td> <em>Response:</em> <p>For this problem, I used an else-if statement. The code looks at the<br>user&#39;s inputs and by using true and false logic, it determines if the<br>guess will align with the actual number. if the guess is less than<br>the number, it will tell the user that they need to select a<br>higher value and if the guess is greater than it tells the user<br>to lower the value.&nbsp; pretty straight forward.<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Implementation 2 (one of the picked items) </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Two Screenshots: Add a screenshot demonstrating the feature during runtime; Add a screenshot (or so) of the snippets of code that implement the feature</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98120824/193967218-4f7646aa-4ad9-4865-928a-f32ccab454a7.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Code for &quot;Add a difficulty selector that adjusts the max strikes per level&quot;<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98120824/193968829-c25fa496-f9dc-4936-ad31-c775591a2aa7.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>Showing that it works<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain the logic behind your implementation</td></tr>
<tr><td> <em>Response:</em> <p>This code was a bit tricky to implement. the code is place right<br>at the start function and before anything else starts, the user has a<br>prompt that asks them how many strikes they would want. By using the<br>input scanner, it scans the user input. The setstrike variable casts input into<br>a int and then setstrike updates maxstrikes. after, the whole time the user<br>is playing, the amount of strikes is set to the value they selected.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add a link to the related pull request of this hw</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/bs585/IT114-005/pull/5">https://github.com/bs585/IT114-005/pull/5</a> </td></tr>
<tr><td> <em>Sub-Task 2: </em> Discuss anything you learned during this lesson/hw or any struggles you had</td></tr>
<tr><td> <em>Response:</em> <p>Nothing really tricky. just some errors i was getting but the professor helped<br>me out.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-number-guesser/grade/bs585" target="_blank">Grading</a></td></tr></table>