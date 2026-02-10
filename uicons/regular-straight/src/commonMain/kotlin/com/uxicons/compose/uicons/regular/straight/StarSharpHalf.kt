package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarSharpHalf: ImageVector? = null

val Icons.Rs.StarSharpHalf: ImageVector
    get() = _StarSharpHalf ?: UXIcon(name = "StarSharpHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.57f, 23.09f)
                lineToRelative(2.83f, -8.75f)
                lineTo(0.04f, 9.0f)
                horizontalLineToRelative(9.24f)
                lineTo(12.5f, -0.67f)
                verticalLineToRelative(18.19f)
                lineToRelative(-7.93f, 5.57f)
                close()
                moveTo(6.2f, 11.0f)
                lineToRelative(3.54f, 2.57f)
                lineToRelative(-1.44f, 4.45f)
                lineToRelative(2.19f, -1.54f)
                verticalLineToRelative(-5.48f)
                horizontalLineToRelative(-4.3f)
                close()
            }
        }.also { _StarSharpHalf = it}
