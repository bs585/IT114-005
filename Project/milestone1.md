<table><tr><td> <em>Assignment: </em> It114 Milestone1</td></tr>
<tr><td> <em>Student: </em> Brandon Sanchez (bs585)</td></tr>
<tr><td> <em>Generated: </em> 10/25/2022 5:11:00 PM</td></tr>
<tr><td> <em>Grading Link: </em> <a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-milestone1/grade/bs585" target="_blank">Grading</a></td></tr></table>
<table><tr><td> <em>Instructions: </em> <ol><li>Create a new branch called Milestone1</li><li>At the root of your repository create a folder called Project</li><li>Create a milestone1.md file inside the project folder</li><li>Git add/commit/push it to Github</li><li>Create a pull request from Milestone1 to main (don't complete/merge it yet)</li><li>Copy in the latest Socket sample code from the most recent Socket Part example of the lessons</li><ol><li>Recommended Part 5, but Part 4 should be sufficient</li><li><a href="https://github.com/MattToegel/IT114/tree/Module5/Module5">https://github.com/MattToegel/IT114/tree/Module5/Module5</a>&nbsp;<br></li></ol><li>Git add/commit the baseline</li><li>Ensure the sample is working and fill in the below deliverables</li><li>Get the markdown content or the file and paste it into the milestone1.md file or replace the file with the downloaded version</li><li>Git add/commit/push all changes</li><li>Complete the pull request merge from step 5</li><li>Locally checkout main</li><li>git pull origin main</li></ol></td></tr></table>
<table><tr><td> <em>Deliverable 1: </em> Startup </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot showing your server being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98120824/197677616-3ebdeae4-0ba8-428b-92a4-9f4eb75ca0e2.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>screenshot of server being started and running<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Add screenshot showing your client being started and running</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98120824/197677328-e9c217cb-5f6f-4b78-8455-b41aa46874ef.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>screenshot of client starting and running<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 3: </em> Briefly explain the connection process</td></tr>
<tr><td> <em>Response:</em> <p>Server and ServerThread are being used for the server-side connection. In ServerThread a<br>user must have a name to be able to connect to the server.<br>Without a name being set the user will not be able to access<br>the server. We get their name by the SetClientName and GetClientName function.&nbsp;&nbsp;<div>When a<br>client connects it uses the sendConnect method to connect the user to the<br>server. The name is used as the socket handshake so it can be<br>able to connect to a server.&nbsp;</div><br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 2: </em> Sending/Receiving </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98120824/197678005-404b636a-6d61-48ab-aeb4-17de3a30729c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>screenshot of 3 clients seeing each other messages<br></p>
</td></tr>
<tr><td><img width="768px" src="https://user-images.githubusercontent.com/98120824/197678328-575bf75c-4956-4409-acc6-1cca026aa311.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>user2 and user3 are in a private room. user1 not in the private<br>room<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the messages are sent, broadcasted, and received</td></tr>
<tr><td> <em>Response:</em> <div>For messages, we have ServerThread "send methods" that get the message from a<br>user. the sendMessage class sets the payload and gets the messages.&nbsp;<br></div><div>In Room, we<br>have methods that get the user's input and puts it through a boolean<br>to see if they're connected and if they are connected (TRUE) they can<br>send messages in the room.</div><div>Anytime a user sends a message we have a<br>processMessage method on the client side that turns messages into payloads. in processMessage<br>we get the user's name and use the getMessage method to print out<br>all messages from individual users.&nbsp;</div><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 3: </em> Disconnecting / Terminating </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add screenshot(s) showing evidence related to the checklist on the right</td></tr>
<tr><td><table><tr><td><img width="768px" src="https://user-images.githubusercontent.com/98120824/197678847-5da6dd86-1962-4ac6-8f76-953432d4e69c.png"/></td></tr>
<tr><td> <em>Caption:</em> <p>disconnecting users. server(lobby) is still running<br></p>
</td></tr>
</table></td></tr>
<tr><td> <em>Sub-Task 2: </em> Briefly explain how the various disconnects/terminations are handled</td></tr>
<tr><td> <em>Response:</em> <p>Everything is pretty much done in ServerThread. We have a method in ServerThread<br>that gets the message from the client to disconnect. The messages are turned<br>into payloads. When a client disconnects the user is reallocating where they are.<br>They&#39;re put in limbo. Anytime a room has no client it gets cleaned<br>up with both the room and server thread files. Even if all rooms<br>are cleared and the server has no users, the server is still waiting<br>on input from any user instead of fully terminating itself when all users<br>disconnect.&nbsp;<br></p><br></td></tr>
</table></td></tr>
<table><tr><td> <em>Deliverable 4: </em> Misc </td></tr><tr><td><em>Status: </em> <img width="100" height="20" src="http://via.placeholder.com/400x120/009955/fff?text=Complete"></td></tr>
<tr><td><table><tr><td> <em>Sub-Task 1: </em> Add the pull request for this branch</td></tr>
<tr><td> <a rel="noreferrer noopener" target="_blank" href="https://github.com/bs585/IT114-005/pull/7">https://github.com/bs585/IT114-005/pull/7</a> </td></tr>
</table></td></tr>
<table><tr><td><em>Grading Link: </em><a rel="noreferrer noopener" href="https://learn.ethereallab.app/homework/IT114-005-F22/it114-milestone1/grade/bs585" target="_blank">Grading</a></td></tr></table>