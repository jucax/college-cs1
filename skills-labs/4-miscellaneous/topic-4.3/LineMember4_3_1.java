class LineMember4_3_1 {
    private String name;
    private LineMember4_3_1 inFront;

    public String getName() {
        return this.name;
    }

    public LineMember4_3_1 getInFront() {
        return this.inFront;
    }

    public static String getLineMembers(LineMember4_3_1 lastMember) {
        if (lastMember.getInFront() == null) {
            return lastMember.getName();
        } else {
                return lastMember.getName() + "->" +getLineMembers(lastMember.getInFront());
        }
    }
}