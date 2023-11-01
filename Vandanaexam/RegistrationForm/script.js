function submitForm() {
  const name = document.getElementById("name").value;
  const email = document.getElementById("email").value;
  const products = document.getElementsByName("product");
  const suggested = document.getElementsByName("suggest");
  const companies = document.getElementsByName("company");
  const suggestions = document.getElementById("suggestion").value;
  const product = getValue(products);
  const suggest = getValue(suggested);
  const company = getValue(companies);

  alert(`
        name: ${name},
        email: ${email},
        product liking: ${product},
        suggested: ${suggest},
        company liking: ${company},
        suggestions: ${suggestions}
    `);
}

function getValue(element) {
  let result = "";
  for (let i = 0; i < element.length; i++) {
    if (element[i].checked) {
      result = element[i].value;
    }
  }
  return result;
}
