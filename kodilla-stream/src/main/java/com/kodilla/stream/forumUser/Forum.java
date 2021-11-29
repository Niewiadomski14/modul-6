package com.kodilla.stream.forumUser;

import java.util.ArrayList;
import java.util.List;

public final class Forum {

       private final List<ForumUser> ListOfUsers =  new ArrayList<>();

        public Forum() {
            ListOfUsers.add(new ForumUser(1, "user1", 'M',1999, 12, 12,10));
            ListOfUsers.add(new ForumUser(2,"user2",'M',1979,3,3,0 ));
            ListOfUsers.add(new ForumUser(3,"user3",'F',2007,3,5,1000 ));
            ListOfUsers.add(new ForumUser(4,"user4",'F',1939,12,1,4 ));
            ListOfUsers.add(new ForumUser(5,"user5",'F',1967,7,11,100));
            ListOfUsers.add(new ForumUser(6,"user6",'M',2001,11,28,20 ));
            ListOfUsers.add(new ForumUser(7,"user7",'M',1977,10,2,76 ));
            ListOfUsers.add(new ForumUser(8,"user8",'M',1989,11,11,11 ));
        }
    public List<ForumUser> getUserList() {
            return new ArrayList<>(ListOfUsers);
    }

}
