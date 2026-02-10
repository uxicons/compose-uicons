package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleUser: ImageVector? = null

val Icons.Rc.CircleUser: ImageVector
    get() = _CircleUser ?: UXIcon(name = "CircleUser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(7.71f, 20.48f)
                curveToRelative(0.38f, -1.54f, 1.37f, -2.48f, 4.29f, -2.48f)
                reflectiveCurveToRelative(3.92f, 0.93f, 4.29f, 2.48f)
                curveToRelative(-1.18f, 0.36f, -2.59f, 0.53f, -4.29f, 0.53f)
                reflectiveCurveToRelative(-3.12f, -0.17f, -4.29f, -0.53f)
                close()
                moveTo(18.12f, 19.63f)
                curveToRelative(-1.01f, -3.22f, -3.92f, -3.63f, -6.12f, -3.63f)
                reflectiveCurveToRelative(-5.11f, 0.41f, -6.12f, 3.63f)
                curveToRelative(-2.03f, -1.35f, -2.88f, -3.77f, -2.88f, -7.63f)
                curveToRelative(-0.0f, -6.56f, 2.44f, -9.0f, 9.0f, -9.0f)
                reflectiveCurveToRelative(9f, 2.44f, 9f, 9f)
                curveToRelative(0f, 3.86f, -0.85f, 6.28f, -2.88f, 7.63f)
                close()
                moveTo(12f, 6f)
                curveToRelative(-2.69f, 0f, -4f, 1.31f, -4f, 4f)
                reflectiveCurveToRelative(1.31f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.31f, 4f, -4f)
                reflectiveCurveToRelative(-1.31f, -4f, -4f, -4f)
                close()
                moveTo(12f, 12f)
                curveToRelative(-1.59f, 0f, -2f, -0.41f, -2f, -2f)
                reflectiveCurveToRelative(0.41f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.41f, 2f, 2f)
                reflectiveCurveToRelative(-0.41f, 2f, -2f, 2f)
                close()
            }
        }.also { _CircleUser = it}
