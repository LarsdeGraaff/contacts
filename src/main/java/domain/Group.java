package domain;

/**
 * Created by jeansmits on 9/07/15.
 */
public class Group {
    private String groupName;
    private Group parent;


    public Group() {
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Group getParent() {
        return parent;
    }

    public void setParent(Group parent) {
        this.parent = parent;
    }
}
