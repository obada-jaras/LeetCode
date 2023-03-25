
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        HashSet<Integer> visited = new HashSet<>();
        Queue<Integer> toVisit = new LinkedList<>(rooms.get(0));
        visited.add(0);

        while (!toVisit.isEmpty()) {
            int currentRoom = toVisit.poll();
            if (!visited.contains(currentRoom)) {
                toVisit.addAll(rooms.get(currentRoom));
                visited.add(currentRoom);
            }
        }

        return (visited.size() == rooms.size());
    }
}