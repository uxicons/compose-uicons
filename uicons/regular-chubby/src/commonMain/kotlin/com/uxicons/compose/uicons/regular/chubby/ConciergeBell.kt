package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConciergeBell: ImageVector? = null

val Icons.Rc.ConciergeBell: ImageVector
    get() = _ConciergeBell ?: UXIcon(name = "ConciergeBell") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.82f, 20.02f)
                curveToRelative(-0.05f, 0.01f, -4.72f, 0.84f, -8.82f, 0.97f)
                verticalLineToRelative(-2.0f)
                curveToRelative(3.86f, -0.11f, 8.23f, -0.82f, 9.19f, -1.0f)
                curveToRelative(0.47f, -0.09f, 0.81f, -0.5f, 0.81f, -0.98f)
                curveToRelative(0f, -7.59f, -3.36f, -11.61f, -10f, -11.97f)
                verticalLineToRelative(-2.03f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.03f)
                curveToRelative(-6.64f, 0.36f, -10f, 4.38f, -10f, 11.97f)
                curveToRelative(0f, 0.48f, 0.34f, 0.89f, 0.81f, 0.98f)
                curveToRelative(0.96f, 0.19f, 5.33f, 0.89f, 9.19f, 1.0f)
                verticalLineToRelative(2.0f)
                curveToRelative(-4.1f, -0.13f, -8.77f, -0.96f, -8.82f, -0.97f)
                curveToRelative(-0.54f, -0.1f, -1.06f, 0.26f, -1.16f, 0.81f)
                curveToRelative(-0.1f, 0.54f, 0.26f, 1.06f, 0.81f, 1.16f)
                curveToRelative(0.23f, 0.04f, 5.7f, 1.02f, 10.18f, 1.02f)
                reflectiveCurveToRelative(9.95f, -0.97f, 10.18f, -1.02f)
                curveToRelative(0.54f, -0.1f, 0.91f, -0.62f, 0.81f, -1.16f)
                curveToRelative(-0.1f, -0.54f, -0.61f, -0.91f, -1.16f, -0.81f)
                close()
                moveTo(12f, 7f)
                curveToRelative(4.05f, 0f, 8.69f, 1.06f, 8.98f, 9.16f)
                curveToRelative(-1.78f, 0.29f, -5.76f, 0.84f, -8.98f, 0.84f)
                reflectiveCurveToRelative(-7.2f, -0.55f, -8.99f, -0.84f)
                curveToRelative(0.22f, -6.33f, 3.02f, -9.16f, 8.99f, -9.16f)
                close()
            }
        }.also { _ConciergeBell = it}
