package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineBottle: ImageVector? = null

val Icons.Ss.WineBottle: ImageVector
    get() = _WineBottle ?: UXIcon(name = "WineBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.01f, 2.0f)
                lineTo(9.01f, 0.01f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2.0f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(19.23f, 9.78f)
                lineToRelative(-4.22f, -2.81f)
                verticalLineToRelative(-2.96f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2.96f)
                lineToRelative(-4.22f, 2.81f)
                curveToRelative(-1.09f, 0.72f, -1.74f, 1.92f, -1.77f, 3.22f)
                horizontalLineToRelative(13.99f)
                verticalLineToRelative(2f)
                lineTo(3.01f, 15.01f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-10.9f)
                curveToRelative(0f, -1.34f, -0.67f, -2.58f, -1.78f, -3.33f)
                close()
            }
        }.also { _WineBottle = it}
