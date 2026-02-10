package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleD: ImageVector? = null

val Icons.Rc.CircleD: ImageVector
    get() = _CircleD ?: UXIcon(name = "CircleD") {
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
                moveTo(12f, 6f)
                curveToRelative(-1.11f, 0f, -2.56f, 0.18f, -2.62f, 0.19f)
                curveToRelative(-0.4f, 0.05f, -0.73f, 0.34f, -0.84f, 0.73f)
                curveToRelative(-0.02f, 0.08f, -0.54f, 1.99f, -0.54f, 5.08f)
                reflectiveCurveToRelative(0.52f, 4.98f, 0.54f, 5.06f)
                curveToRelative(0.11f, 0.38f, 0.43f, 0.67f, 0.82f, 0.72f)
                curveToRelative(0.06f, 0.01f, 1.52f, 0.21f, 2.64f, 0.21f)
                curveToRelative(4.48f, 0f, 5f, -3.42f, 5f, -6f)
                reflectiveCurveToRelative(-0.52f, -6f, -5f, -6f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-0.54f, 0f, -1.19f, -0.06f, -1.67f, -0.11f)
                curveToRelative(-0.14f, -0.74f, -0.33f, -2.09f, -0.33f, -3.89f)
                reflectiveCurveToRelative(0.19f, -3.16f, 0.33f, -3.9f)
                curveToRelative(0.48f, -0.05f, 1.14f, -0.1f, 1.67f, -0.1f)
                curveToRelative(1.99f, 0f, 3f, 0.62f, 3f, 4f)
                reflectiveCurveToRelative(-1.01f, 4f, -3f, 4f)
                close()
            }
        }.also { _CircleD = it}
