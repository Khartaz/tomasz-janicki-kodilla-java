package com.kodilla.testing.forum.statistics;

public class StatisticsCalculator {
    int userCount;
    int postsCount;
    int commentsCount;
    double averagePostsPerUser;
    double averageCommentsPerUser;
    double averageCommentsPerPost;

    public void calculateAdvStatistics(Statistics statistics) {
        userCount = statistics.userNames().size();
        postsCount =  statistics.postsCount();
        commentsCount = statistics.commentsCount();

        if(userCount > 0) {
            averagePostsPerUser = ((double) postsCount) / userCount;
        }
        if(userCount > 0) {
            averageCommentsPerUser = ((double) commentsCount) / userCount;
        }
        if(postsCount > 0) {
            averageCommentsPerPost = ((double) commentsCount) / postsCount;
        }
    }

    public int getUserCount() {
        return userCount;
    }

    public int getPostsCount() {
        return postsCount;
    }

    public int getCommentsCount() {
        return commentsCount;
    }

    public double getAveragePostsPerUser() {
        return averagePostsPerUser;
    }

    public double getAverageCommentsPerUser() {
        return averageCommentsPerUser;
    }

    public double getAverageCommentsPerPost() {
        return averageCommentsPerPost;
    }
}



  /*  public HashMap<Integer, Double> calculateForecast() {
        HashMap<Integer, Double> resultMap = new HashMap<>();

        for(Map.Entry<Integer, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            resultMap.put(temperature.getKey(), temperature.getValue() +1);
        }

        return resultMap;
    }

    */