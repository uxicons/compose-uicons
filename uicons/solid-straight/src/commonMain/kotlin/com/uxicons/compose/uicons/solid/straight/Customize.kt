package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Customize: ImageVector? = null

val Icons.Ss.Customize: ImageVector
    get() = _Customize ?: UXIcon(name = "Customize") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.84f, 6.25f)
                lineToRelative(-7.75f, 7.75f)
                horizontalLineToRelative(-3.09f)
                verticalLineToRelative(-3.09f)
                lineToRelative(7.75f, -7.75f)
                lineToRelative(3.09f, 3.09f)
                close()
                moveTo(23.36f, 0.64f)
                curveToRelative(-0.85f, -0.85f, -2.23f, -0.85f, -3.09f, 0f)
                lineToRelative(-1.11f, 1.11f)
                lineToRelative(3.09f, 3.09f)
                lineToRelative(1.11f, -1.11f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.09f)
                close()
                moveTo(22.95f, 6.97f)
                lineToRelative(-9.03f, 9.03f)
                horizontalLineToRelative(-5.91f)
                verticalLineToRelative(-5.91f)
                lineToRelative(7f, -7f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3.52f)
                curveToRelative(-1.05f, 0.37f, -2.02f, 0.93f, -2.86f, 1.65f)
                lineToRelative(-3.05f, -1.75f)
                lineTo(0.1f, 8.62f)
                lineToRelative(3.05f, 1.75f)
                curveToRelative(-0.1f, 0.54f, -0.15f, 1.09f, -0.15f, 1.63f)
                reflectiveCurveToRelative(0.05f, 1.08f, 0.15f, 1.63f)
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
                lineToRelative(-3.05f, -1.76f)
                curveToRelative(0.1f, -0.54f, 0.15f, -1.09f, 0.15f, -1.62f)
                reflectiveCurveToRelative(-0.05f, -1.08f, -0.15f, -1.62f)
                lineToRelative(3.05f, -1.76f)
                lineToRelative(-0.95f, -1.65f)
                close()
            }
        }.also { _Customize = it}
