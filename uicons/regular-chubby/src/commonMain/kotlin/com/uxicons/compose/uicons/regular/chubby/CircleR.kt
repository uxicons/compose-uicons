package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleR: ImageVector? = null

val Icons.Rc.CircleR: ImageVector
    get() = _CircleR ?: UXIcon(name = "CircleR") {
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
                moveTo(16f, 9.88f)
                curveToRelative(0f, -3.86f, -3.91f, -3.88f, -5.39f, -3.88f)
                curveToRelative(-0.55f, 0.0f, -0.74f, -0.02f, -1.18f, 0.0f)
                curveToRelative(-0.49f, 0.03f, -0.87f, 0.4f, -0.93f, 0.88f)
                curveToRelative(-0.11f, 0.49f, -0.5f, 2.41f, -0.5f, 5.12f)
                curveToRelative(0f, 3.09f, 0.51f, 5.16f, 0.53f, 5.24f)
                curveToRelative(0.13f, 0.54f, 0.69f, 0.86f, 1.21f, 0.73f)
                curveToRelative(0.54f, -0.13f, 0.86f, -0.68f, 0.73f, -1.21f)
                curveToRelative(-0.0f, -0.01f, -0.26f, -1.07f, -0.39f, -2.77f)
                curveToRelative(0.12f, 0.01f, 0.26f, 0.01f, 0.42f, 0.01f)
                curveToRelative(0.73f, 0f, 1.35f, -0.06f, 1.91f, -0.17f)
                curveToRelative(0.32f, 0.37f, 1.26f, 1.58f, 1.61f, 3.36f)
                curveToRelative(0.11f, 0.55f, 0.65f, 0.89f, 1.18f, 0.78f)
                curveToRelative(0.54f, -0.11f, 0.89f, -0.64f, 0.78f, -1.18f)
                curveToRelative(-0.33f, -1.67f, -1.07f, -2.94f, -1.61f, -3.7f)
                curveToRelative(1.28f, -0.82f, 1.63f, -2.09f, 1.63f, -3.23f)
                close()
                moveTo(10f, 11.99f)
                curveToRelative(0f, -1.77f, 0.18f, -3.18f, 0.32f, -3.99f)
                horizontalLineToRelative(0.29f)
                curveToRelative(3.39f, 0.01f, 3.39f, 1.0f, 3.39f, 1.88f)
                curveToRelative(0f, 0.74f, 0f, 2.12f, -3.5f, 2.12f)
                curveToRelative(-0.21f, 0f, -0.36f, -0.0f, -0.5f, -0.01f)
                close()
            }
        }.also { _CircleR = it}
