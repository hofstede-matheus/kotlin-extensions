# kotlin-extensions
A collection of idiomatic Kotlin Extensions to assist Kotlin and Android Applications development

Current extensions:

**gone()** - View.visibility = View.GONE
```
button.gone()
```
**visible()** View.visibility = View.VISIBLE
```
button.visible()
```
**invisible()** View.visibility = View.INVISIBLE
```
button.invisible()
```
**isVisibleIf** View.isVisible = true else View.isVisible = false
```
progress isVisibleIf state.isLoading 
```
**isEnabledIf** EditText.isEnabled = true else View.isEnabled = false
```
progress isEnabledIf state.shoudEditPassword
```
