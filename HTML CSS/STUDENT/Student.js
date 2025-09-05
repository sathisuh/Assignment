// script.js

document.addEventListener("DOMContentLoaded", () => {
  const form = document.getElementById("regForm");

  form.addEventListener("submit", (e) => {
    e.preventDefault();
    let isValid = true;
    let messages = [];

    // remove previous error borders
    form.querySelectorAll(".error-border").forEach(el => {
      el.classList.remove("error-border");
    });

    // check required fields
    form.querySelectorAll("[required]").forEach(input => {
      if (!input.value.trim()) {
        isValid = false;
        messages.push(`${input.name || "Field"} is required`);
        input.classList.add("error-border");
      }
    });

    // mobile validation
    const mobile = form.querySelector("input[name='mobile']");
    if (mobile && !/^[6-9]\d{9}$/.test(mobile.value)) {
      isValid = false;
      messages.push("Enter a valid 10-digit Mobile number");
      mobile.classList.add("error-border");
    }

    // alternate mobile validation (optional)
    const altMobile = form.querySelector("input[name='altMobile']");
    if (altMobile && altMobile.value && !/^[6-9]\d{9}$/.test(altMobile.value)) {
      isValid = false;
      messages.push("Enter a valid Alternate number");
      altMobile.classList.add("error-border");
    }

    // Aadhaar validation (12 digits)
    const aadhaar = form.querySelector("input[name='aadhaar']");
    if (aadhaar && !/^\d{12}$/.test(aadhaar.value)) {
      isValid = false;
      messages.push("Enter a valid 12-digit Aadhaar number");
      aadhaar.classList.add("error-border");
    }

    // PAN validation (ABCDE1234F format)
    const pan = form.querySelector("input[name='pan']");
    if (pan && !/^[A-Z]{5}[0-9]{4}[A-Z]{1}$/.test(pan.value)) {
      isValid = false;
      messages.push("Enter a valid PAN number (ABCDE1234F)");
      pan.classList.add("error-border");
    }

    // Resume upload check
    const resume = form.querySelector("input[name='resume']");
    if (resume && resume.files.length > 0) {
      const file = resume.files[0];
      const allowed = ["application/pdf", "application/msword",
        "application/vnd.openxmlformats-officedocument.wordprocessingml.document"];
      if (!allowed.includes(file.type)) {
        isValid = false;
        messages.push("Resume must be PDF or Word format");
        resume.classList.add("error-border");
      }
    }

    // Photo upload check
    const photo = form.querySelector("input[name='photo']");
    if (photo && photo.files.length > 0) {
      const file = photo.files[0];
      if (!file.type.startsWith("image/")) {
        isValid = false;
        messages.push("Photo must be an image file");
        photo.classList.add("error-border");
      }
    }

    // show results
    if (!isValid) {
      alert("❌ Form submission failed:\n\n" + messages.join("\n"));
      // scroll to first error
      const firstError = form.querySelector(".error-border");
      if (firstError) {
        firstError.scrollIntoView({ behavior: "smooth", block: "center" });
      }
    } else {
      alert("✅ Form submitted successfully!");
      form.reset();
    }
  });
});

