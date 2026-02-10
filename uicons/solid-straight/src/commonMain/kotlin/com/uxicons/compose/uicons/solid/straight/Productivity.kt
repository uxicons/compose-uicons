package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Productivity: ImageVector? = null

val Icons.Ss.Productivity: ImageVector
    get() = _Productivity ?: UXIcon(name = "Productivity") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 12f)
                curveToRelative(0f, -0.54f, -0.05f, -1.08f, -0.15f, -1.63f)
                lineToRelative(3.05f, -1.75f)
                lineToRelative(-2.99f, -5.2f)
                lineToRelative(-3.05f, 1.75f)
                curveToRelative(-0.84f, -0.72f, -1.81f, -1.28f, -2.86f, -1.65f)
                lineTo(15.0f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3.52f)
                curveToRelative(-1.05f, 0.37f, -2.02f, 0.93f, -2.86f, 1.65f)
                lineToRelative(-3.05f, -1.75f)
                lineTo(0.1f, 8.62f)
                lineToRelative(3.05f, 1.76f)
                curveToRelative(-0.1f, 0.54f, -0.15f, 1.09f, -0.15f, 1.62f)
                reflectiveCurveToRelative(0.05f, 1.08f, 0.15f, 1.62f)
                lineTo(0.1f, 15.38f)
                lineToRelative(2.99f, 5.2f)
                lineToRelative(3.05f, -1.75f)
                curveToRelative(0.84f, 0.72f, 1.81f, 1.28f, 2.86f, 1.65f)
                verticalLineToRelative(3.52f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3.52f)
                curveToRelative(1.05f, -0.37f, 2.02f, -0.93f, 2.86f, -1.65f)
                lineToRelative(3.05f, 1.75f)
                lineToRelative(2.99f, -5.2f)
                lineToRelative(-3.05f, -1.75f)
                curveToRelative(0.1f, -0.54f, 0.15f, -1.09f, 0.15f, -1.63f)
                close()
                moveTo(15f, 12f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                lineToRelative(-2f, 2f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.05f, -3.05f)
                curveToRelative(0.73f, -0.73f, 2.0f, -0.73f, 2.73f, 0f)
                lineToRelative(3.05f, 3.05f)
                lineToRelative(-1.41f, 1.41f)
                close()
            }
        }.also { _Productivity = it}
