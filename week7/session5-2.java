import java.util.*;

class ThroneInheritance {

    class Person {

        String name;
        boolean dead;
        List<Person> children;

        Person(String name) {

            this.name = name;
            this.dead = false;
            this.children = new ArrayList<>();
        }
    }

    Map<String, Person> people;
    Person king;

    public ThroneInheritance(String kingName) {

        people = new HashMap<>();

        king = new Person(kingName);

        people.put(kingName, king);
    }

    public void birth(String parentName,
                      String childName) {

        Person parent = people.get(parentName);

        Person child = new Person(childName);

        parent.children.add(child);

        people.put(childName, child);
    }

    public void death(String name) {

        people.get(name).dead = true;
    }

    public List<String> getInheritanceOrder() {

        List<String> result = new ArrayList<>();

        dfs(king, result);

        return result;
    }

    private void dfs(Person person,
                     List<String> result) {

        if (!person.dead) {

            result.add(person.name);
        }

        for (Person child : person.children) {

            dfs(child, result);
        }
    }
}



Output
[null,
 null,
 null,
 null,
 null,
 null,
 ["king","andy","matt","bob","alex","asha"],
 null,
 ["king","andy","matt","alex","asha"]]
