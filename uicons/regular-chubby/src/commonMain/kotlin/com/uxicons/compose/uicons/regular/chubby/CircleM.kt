package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleM: ImageVector? = null

val Icons.Rc.CircleM: ImageVector
    get() = _CircleM ?: UXIcon(name = "CircleM") {
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
                moveTo(15.38f, 6.53f)
                curveToRelative(0.1f, 0.18f, 2.36f, 4.52f, 2.62f, 10.42f)
                curveToRelative(0.02f, 0.55f, -0.4f, 1.02f, -0.96f, 1.04f)
                curveToRelative(-0.55f, 0.03f, -1.02f, -0.4f, -1.04f, -0.96f)
                curveToRelative(-0.14f, -3.31f, -0.99f, -6.13f, -1.63f, -7.83f)
                curveToRelative(-0.47f, 0.95f, -1.01f, 2.3f, -1.39f, 4.01f)
                curveToRelative(-0.1f, 0.46f, -0.51f, 0.78f, -0.98f, 0.78f)
                reflectiveCurveToRelative(-0.87f, -0.32f, -0.98f, -0.78f)
                curveToRelative(-0.38f, -1.71f, -0.93f, -3.06f, -1.39f, -4.01f)
                curveToRelative(-0.64f, 1.7f, -1.49f, 4.52f, -1.63f, 7.83f)
                curveToRelative(-0.02f, 0.55f, -0.51f, 0.97f, -1.04f, 0.96f)
                curveToRelative(-0.55f, -0.02f, -0.98f, -0.49f, -0.96f, -1.04f)
                curveToRelative(0.26f, -5.91f, 2.52f, -10.24f, 2.62f, -10.42f)
                curveToRelative(0.16f, -0.3f, 0.46f, -0.5f, 0.8f, -0.53f)
                curveToRelative(0.34f, -0.03f, 0.67f, 0.12f, 0.88f, 0.39f)
                curveToRelative(0.05f, 0.07f, 0.89f, 1.19f, 1.71f, 3.22f)
                curveToRelative(0.81f, -2.03f, 1.65f, -3.15f, 1.71f, -3.22f)
                curveToRelative(0.21f, -0.27f, 0.54f, -0.42f, 0.88f, -0.39f)
                curveToRelative(0.34f, 0.03f, 0.64f, 0.23f, 0.8f, 0.53f)
                close()
            }
        }.also { _CircleM = it}
