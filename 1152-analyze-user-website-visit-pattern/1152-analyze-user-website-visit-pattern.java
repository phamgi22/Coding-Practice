class Solution {
    public List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
        HashMap<String, PriorityQueue<Pair<Integer, String>>> map = new HashMap<>();
        HashMap<String, HashSet<String>> visitedByUser = new HashMap<>();
        List<String> result = new ArrayList<>();
        for(int i = 0; i < username.length; i++){
            map.putIfAbsent(username[i], new PriorityQueue<Pair<Integer, String>>(new Comparator<Pair<Integer, String>>(){
                public int compare(Pair<Integer, String> p1, Pair<Integer, String> p2){
                    if(p1.getKey() > p2.getKey()){
                        return 1;
                    }else{
                        return -1;
                    }
                }
            }));
            map.get(username[i]).add(new Pair<Integer, String>(timestamp[i], website[i]));
        }
        // Store all websites a user visits in sorted order
        for(Map.Entry<String, PriorityQueue<Pair<Integer, String>>> element : map.entrySet()){
            PriorityQueue<Pair<Integer, String>> queue = element.getValue();
            String user = element.getKey();
            int i = 0;
            int size = queue.size();
			//Get all possible 3 website combination a user can have
            HashMap<String, HashMap<String, HashSet<String>>> visited =  new HashMap<>();
            while(!queue.isEmpty()){
                Pair<Integer, String> temp = queue.poll();
                String s = temp.getValue();
                if(i > 1){
                    for(Map.Entry<String, HashMap<String, HashSet<String>>> first : visited.entrySet()){   
                        String firstWeb = first.getKey();
                        for(Map.Entry<String, HashSet<String>> second : first.getValue().entrySet()){
                            String secondWeb = second.getKey();
                            StringBuilder sb = new StringBuilder();
                            sb.append(firstWeb);
                            sb.append(" ");
                            sb.append(secondWeb);
                            sb.append(" ");
                            sb.append(s);
                            second.getValue().add(s);
							// Add a completed sequence to the map
                            visitedByUser.putIfAbsent(sb.toString(), new HashSet<String>());
                            if(visitedByUser.get(sb.toString()).isEmpty() || !visitedByUser.get(sb.toString()).contains(user)){
                                visitedByUser.get(sb.toString()).add(user);
                            }
                        }
                    }
                }
                if(i > 0 && i < size - 1){
                    for(Map.Entry<String, HashMap<String, HashSet<String>>> first : visited.entrySet()){
                        first.getValue().putIfAbsent(s, new HashSet<String>());
                    }
                }
                if(i < size - 2){
                    visited.putIfAbsent(s, new HashMap<String, HashSet<String>>());
                }
                i++;
            }
        }
		// Get the sequence with most users or by lexico order
        PriorityQueue<Pair<Integer, String>> count = new PriorityQueue<>(new Comparator<Pair<Integer, String>>(){
            public int compare(Pair<Integer, String> p1, Pair<Integer, String> p2){
                if(p1.getKey() > p2.getKey()){
                    return -1;
                }else if(p1.getKey() < p2.getKey()){
                    return 1;
                }else{
                    if(p1.getValue().compareTo(p2.getValue()) < 0){
                        return -1;
                    }else{
                        return 1;
                    }
                }
            }
        });
        for(Map.Entry<String, HashSet<String>> path : visitedByUser.entrySet()){
            count.add(new Pair<Integer, String>(path.getValue().size(), path.getKey()));
        }
        result = Arrays.asList(count.poll().getValue().split(" "));
        return result;
    }
}