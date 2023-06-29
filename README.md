# citizens-cafe
demo project for a table-booking app


<h2>Thought Process/Assumptions</h2>

<p>My understanding of the assignment was to build an app that quickly let someone take down information for a restaurant reservation, and to store a list of these reservations.  I made each reservation editable and deletable.  I assumed this app would not be customer-facing, and so I prioritized ease of use, and clear, easy-to-understand information at a glance.</p>

<p>I laid out the appllication in a standard MVC strategy, with the angular frontend exposing a snappy and easy-to-use interface.  Spring boot contained the Reservation model and was utilized to quickly set up CRUD rest endpoints.  The information then passed through Spring and into and out of a MySQL database.  The reservation object consisted of the following fields: name, phone number, party size and time.  This is the pertinent information for booking a reservation.</p>

<h2>TODOs</h2>

<p>I wanted to make the list sorted by time(datetime), so that the top of the list was the next reservation scheduled to be seated.  I also wanted a date-time picker for setting the time, but could not get that implemented in time.</p>


![image](https://github.com/Michael-Cooper/citizens-cafe/assets/19694870/98d49e29-81ec-4b85-b514-655740d7799b)


![image](https://github.com/Michael-Cooper/citizens-cafe/assets/19694870/859b99ec-c471-4c26-9cbf-0570ff9d74bb)


![image](https://github.com/Michael-Cooper/citizens-cafe/assets/19694870/705db633-f3ba-466f-96c8-1cc402442966)


