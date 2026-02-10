package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleI: ImageVector? = null

val Icons.Rc.CircleI: ImageVector
    get() = _CircleI ?: UXIcon(name = "CircleI") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-6.56f, 0f, -9f, -2.44f, -9f, -9f)
                reflectiveCurveToRelative(2.44f, -9f, 9f, -9f)
                reflectiveCurveToRelative(9f, 2.44f, 9f, 9f)
                reflectiveCurveToRelative(-2.44f, 9f, -9f, 9f)
                close()
                moveTo(14.97f, 17.44f)
                curveToRelative(-0.11f, 0.46f, -0.52f, 0.76f, -0.97f, 0.76f)
                curveToRelative(-0.43f, -0.02f, -0.65f, -0.19f, -2.0f, -0.2f)
                curveToRelative(-1.05f, 0f, -1.75f, 0.17f, -1.76f, 0.17f)
                curveToRelative(-0.54f, 0.13f, -1.08f, -0.2f, -1.21f, -0.73f)
                curveToRelative(-0.13f, -0.54f, 0.19f, -1.08f, 0.73f, -1.21f)
                curveToRelative(0.03f, -0.01f, 0.5f, -0.12f, 1.24f, -0.18f)
                verticalLineToRelative(-8.09f)
                curveToRelative(-0.74f, -0.07f, -1.22f, -0.18f, -1.24f, -0.18f)
                curveToRelative(-0.54f, -0.13f, -0.86f, -0.68f, -0.73f, -1.21f)
                curveToRelative(0.13f, -0.54f, 0.68f, -0.86f, 1.21f, -0.73f)
                curveToRelative(0.0f, 0f, 0.71f, 0.17f, 1.76f, 0.17f)
                reflectiveCurveToRelative(1.75f, -0.17f, 1.76f, -0.17f)
                curveToRelative(0.53f, -0.13f, 1.08f, 0.2f, 1.21f, 0.73f)
                reflectiveCurveToRelative(-0.19f, 1.08f, -0.73f, 1.21f)
                curveToRelative(-0.03f, 0.01f, -0.5f, 0.12f, -1.24f, 0.18f)
                verticalLineToRelative(8.09f)
                curveToRelative(0.74f, 0.07f, 1.22f, 0.18f, 1.24f, 0.18f)
                curveToRelative(0.54f, 0.13f, 0.86f, 0.68f, 0.73f, 1.21f)
                close()
            }
        }.also { _CircleI = it}
