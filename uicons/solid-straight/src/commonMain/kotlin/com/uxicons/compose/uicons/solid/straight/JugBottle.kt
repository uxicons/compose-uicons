package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _JugBottle: ImageVector? = null

val Icons.Ss.JugBottle: ImageVector
    get() = _JugBottle ?: UXIcon(name = "JugBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.49f, 6.11f)
                lineToRelative(-6.49f, -1.08f)
                verticalLineToRelative(-3.02f)
                horizontalLineToRelative(1f)
                lineTo(14f, 0f)
                lineTo(5f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(3.18f)
                lineToRelative(-2.05f, 0.77f)
                curveToRelative(-1.17f, 0.44f, -1.95f, 1.56f, -1.95f, 2.81f)
                verticalLineToRelative(15.24f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(-14.94f)
                curveToRelative(0f, -1.47f, -1.05f, -2.72f, -2.51f, -2.96f)
                close()
                moveTo(17f, 9.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-5.5f)
                close()
            }
        }.also { _JugBottle = it}
