

class Twitter {

    private Map<Integer, Set<Integer>> followers;
    private Map<Integer, Tweet> tweets; // userId -> head of tweet list
    private static int time = 0;

    public Twitter() {
        followers = new HashMap<>();
        tweets = new HashMap<>();
    }

    public void postTweet(int userId, int tweetId) {
        Tweet tweet = new Tweet(time++, tweetId);
        tweet.next = tweets.get(userId); // insert at head
        tweets.put(userId, tweet);
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> result = new ArrayList<>();

        PriorityQueue<Tweet> maxHeap =
                new PriorityQueue<>((a, b) -> Integer.compare(b.time, a.time));

        // get followees + self
        Set<Integer> followees =
                new HashSet<>(followers.getOrDefault(userId, new HashSet<>()));
        followees.add(userId);

        // add latest tweet of each user
        for (int id : followees) {
            Tweet t = tweets.get(id);
            if (t != null) {
                maxHeap.add(t);
            }
        }

        int count = 0;

        // extract top 10 tweets
        while (!maxHeap.isEmpty() && count < 10) {
            Tweet curr = maxHeap.poll();
            result.add(curr.value);
            count++;

            if (curr.next != null) {
                maxHeap.add(curr.next);
            }
        }

        return result;
    }

    public void follow(int followerId, int followeeId) {
        if (followerId == followeeId) return;

        followers
            .computeIfAbsent(followerId, k -> new HashSet<>())
            .add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        Set<Integer> set = followers.get(followerId);
        if (set != null) {
            set.remove(followeeId);
        }
    }

    private static class Tweet {
        int time;
        int value;
        Tweet next;

        Tweet(int time, int value) {
            this.time = time;
            this.value = value;
        }
    }
}