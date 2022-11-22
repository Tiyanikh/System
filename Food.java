package BookingSystem;


public class Food {
    Integer FoodSelID;
    Integer Courses;
    String MenuDescription;

    public Integer getFoodSelID()
    {
        return FoodSelID;
    }
    public void setFoodSelID(Integer FoodSelID)
    {
        this.FoodSelID = FoodSelID;
    }
    public Integer getCourses()
    {
        return Courses;
    }
    public void SetCourses(Integer Courses)
    {
        this.Courses = Courses;
    }
    public String getMenuDescription()
    {
        return MenuDescription;
    }
    public void setMenuDescription(String MenuDescription)
    {
        this.MenuDescription = MenuDescription;
    }

    
    public Food(Integer FoodSelID, Integer Courses, String MenuDescription)
    {
        this.FoodSelID = FoodSelID;
        this.Courses = Courses;
        this.MenuDescription = MenuDescription;
    }
}
