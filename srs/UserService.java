package srs;

import srs.UserNotFoundException;

public class UserService {
    public int getUserScore(String[] records, String email) {
        for (String record : records) {
            if (record.startsWith(email) || record.endsWith(email)) {
                return Integer.valueOf(record.substring(record.indexOf(':') + 1, record.length()));
            }
            throw new UserNotFoundException("not found");
        }
        return 0;
    }
}
