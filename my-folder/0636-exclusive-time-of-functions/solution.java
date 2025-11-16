class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        Deque<Log> stack = new ArrayDeque<>();
        int[] ans = new int[n];
        for(String s : logs) {
            Log log = new Log(s);
            if (log.isStart) {
                stack.push(log);
            } else {
                Log top = stack.pop();
                ans[log.id] += (log.time - top.time + 1);
                if (!stack.isEmpty()) {
                    ans[stack.peek().id] -= (log.time - top.time + 1);
                }
            }
        }
        return ans;
    }

    private static class Log{
        public int id;
        public boolean isStart;
        public int time;

        public Log(String s) {
            String[] str = s.split(":");
            this.id = Integer.valueOf(str[0]);
            this.time = Integer.valueOf(str[2]);
            this.isStart = str[1].equals("start");
        }
    }
}
