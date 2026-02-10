package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineBottle: ImageVector? = null

val Icons.Rs.WineBottle: ImageVector
    get() = _WineBottle ?: UXIcon(name = "WineBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.23f, 9.78f)
                lineToRelative(-4.22f, -2.81f)
                lineTo(15.01f, 0.01f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6.96f)
                lineToRelative(-4.22f, 2.81f)
                curveToRelative(-1.11f, 0.74f, -1.78f, 1.99f, -1.78f, 3.33f)
                verticalLineToRelative(10.9f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-10.9f)
                curveToRelative(0f, -1.34f, -0.67f, -2.58f, -1.78f, -3.33f)
                close()
                moveTo(19.01f, 22.01f)
                lineTo(5.01f, 22.01f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-2f)
                lineTo(5.02f, 13.01f)
                curveToRelative(0.03f, -0.63f, 0.36f, -1.21f, 0.88f, -1.56f)
                lineToRelative(5.11f, -3.41f)
                verticalLineToRelative(-4.04f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4.04f)
                lineToRelative(5.11f, 3.41f)
                curveToRelative(0.56f, 0.37f, 0.89f, 0.99f, 0.89f, 1.66f)
                verticalLineToRelative(8.9f)
                close()
            }
        }.also { _WineBottle = it}
