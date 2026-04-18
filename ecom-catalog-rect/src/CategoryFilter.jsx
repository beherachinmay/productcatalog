const CategoryFilter = ({ categories, onSelect }) => {
  return (
    <div>
      <select id="categorySelect" className="from-control" onChange={(e) => onSelect(e.target.value)}>
        <option value="">All Categories</option>
        {categories.map(category => (
          <option key={category.id} value={category.id}>{category.name}</option>
        ))}

      </select>
    </div>
  );
}

export default CategoryFilter;