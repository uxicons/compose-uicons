package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleP: ImageVector? = null

val Icons.Rc.CircleP: ImageVector
    get() = _CircleP ?: UXIcon(name = "CircleP") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.61f, 6f)
                curveToRelative(-0.55f, 0.0f, -0.73f, -0.02f, -1.18f, 0.0f)
                curveToRelative(-0.49f, 0.03f, -0.87f, 0.4f, -0.93f, 0.88f)
                curveToRelative(-0.11f, 0.49f, -0.5f, 2.41f, -0.5f, 5.12f)
                curveToRelative(0f, 3.09f, 0.51f, 5.16f, 0.53f, 5.24f)
                curveToRelative(0.13f, 0.54f, 0.69f, 0.86f, 1.21f, 0.73f)
                curveToRelative(0.54f, -0.13f, 0.86f, -0.68f, 0.73f, -1.21f)
                curveToRelative(-0.0f, -0.01f, -0.26f, -1.07f, -0.39f, -2.77f)
                curveToRelative(0.12f, 0.01f, 0.26f, 0.01f, 0.42f, 0.01f)
                curveToRelative(4.55f, 0f, 5.5f, -2.24f, 5.5f, -4.12f)
                curveToRelative(0f, -3.86f, -3.91f, -3.88f, -5.39f, -3.88f)
                close()
                moveTo(10.5f, 12f)
                curveToRelative(-0.21f, 0f, -0.36f, -0.0f, -0.5f, -0.01f)
                curveToRelative(0f, -1.77f, 0.18f, -3.18f, 0.32f, -3.99f)
                horizontalLineToRelative(0.29f)
                curveToRelative(3.39f, 0.01f, 3.39f, 1.0f, 3.39f, 1.88f)
                curveToRelative(0f, 0.74f, 0f, 2.12f, -3.5f, 2.12f)
                close()
                moveTo(12f, 1f)
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
            }
        }.also { _CircleP = it}
