package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleK: ImageVector? = null

val Icons.Rc.CircleK: ImageVector
    get() = _CircleK ?: UXIcon(name = "CircleK") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.82f, 12.19f)
                curveToRelative(0.74f, 0.88f, 1.71f, 2.39f, 2.16f, 4.61f)
                curveToRelative(0.11f, 0.54f, -0.24f, 1.07f, -0.78f, 1.18f)
                curveToRelative(-0.53f, 0.11f, -1.07f, -0.24f, -1.18f, -0.78f)
                curveToRelative(-0.41f, -2.06f, -1.35f, -3.34f, -1.94f, -3.96f)
                curveToRelative(-0.48f, 0.16f, -1.0f, 0.27f, -1.58f, 0.27f)
                curveToRelative(-0.17f, 0f, -0.32f, -0.0f, -0.45f, -0.01f)
                curveToRelative(0.12f, 1.98f, 0.42f, 3.25f, 0.42f, 3.27f)
                curveToRelative(0.13f, 0.54f, -0.19f, 1.08f, -0.73f, 1.21f)
                curveToRelative(-0.52f, 0.13f, -1.08f, -0.19f, -1.21f, -0.73f)
                curveToRelative(-0.02f, -0.09f, -0.53f, -2.15f, -0.53f, -5.24f)
                curveToRelative(0f, -2.71f, 0.39f, -4.63f, 0.5f, -5.12f)
                curveToRelative(0.06f, -0.49f, 0.48f, -0.88f, 0.99f, -0.88f)
                curveToRelative(0.63f, -0.02f, 1.15f, 0.63f, 0.98f, 1.24f)
                curveToRelative(-0.0f, 0.02f, -0.41f, 1.71f, -0.46f, 4.25f)
                curveToRelative(0.14f, 0.01f, 0.29f, 0.01f, 0.49f, 0.01f)
                curveToRelative(2.47f, 0f, 3.5f, -2.93f, 3.5f, -4.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 1.66f, -0.7f, 3.83f, -2.18f, 5.19f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, 7.71f, -3.29f, 11f, -11f, 11f)
                reflectiveCurveToRelative(-11f, -3.29f, -11f, -11f)
                reflectiveCurveToRelative(3.29f, -11f, 11f, -11f)
                reflectiveCurveToRelative(11f, 3.29f, 11f, 11f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -6.56f, -2.44f, -9f, -9f, -9f)
                reflectiveCurveToRelative(-9f, 2.44f, -9f, 9f)
                reflectiveCurveToRelative(2.44f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -2.44f, 9f, -9f)
                close()
            }
        }.also { _CircleK = it}
