package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarSharpHalf: ImageVector? = null

val Icons.Ss.StarSharpHalf: ImageVector
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
            }
        }.also { _StarSharpHalf = it}
