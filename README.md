Concurrent-RSS-reader

Name: Rohit Banka 
GitID: bankarohit

Name: Aditya Kulkarni
Git ID: comptotherescue

Contribution:
Aditya Kulkarni: I have implemented the serial read of RSS feed along with the business logic of parsing a feed.  I also implemented the frontend rendering of the feeds from the database. Made Bug fixes, ran tests etc.

Rohit Banka: I designed the project along with the database and other technical specifications. 
I implemented concurrency in readinging feed. Made tests for comparison between serial and parallel mechanism. I also implemented the backend api services for the correct rendering of feeds to the frontend interface. Made bug fixes etc.


Description:
We are implementing a RSS feed reader. We plan to subscribe to various news channels
and read news feeds from across the globe in two separate methods.
1) Serial Read: In this method we will not use any parallel methods and read the feeds
one after the other.
2) Parallel Read: We plan to read the feed in a parallel way, mapping tasks to thread
dynamically, meaning whichever thread is idle gets the task.


Installing and Running:

1) Unzip the file.
2) Run npm install in the directory
3) cd node-rss
4) run 'nodemon'

5) In another terminal 
6) cd web-app
7) run nodemon

go to localhost:8080 on browser.


