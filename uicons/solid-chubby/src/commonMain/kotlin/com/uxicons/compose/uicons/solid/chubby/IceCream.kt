package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _IceCream: ImageVector? = null

val Icons.Sc.IceCream: ImageVector
    get() = _IceCream ?: UXIcon(name = "IceCream") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 3.2f)
                curveToRelative(1.42f, -0.77f, 3.57f, -0.73f, 3.64f, -0.73f)
                curveToRelative(-0.72f, -0.98f, -1.92f, -1.47f, -3.64f, -1.47f)
                reflectiveCurveToRelative(-2.93f, 0.48f, -3.64f, 1.47f)
                curveToRelative(0.07f, -0.0f, 1.89f, -0.1f, 3.64f, 0.73f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.19f, 7.25f)
                curveToRelative(0.27f, -0.01f, 0.54f, -0.01f, 0.81f, -0.01f)
                curveToRelative(2.64f, 0f, 5.26f, 0.36f, 7.8f, 1.07f)
                curveToRelative(0.01f, 0.0f, 0.02f, 0.01f, 0.03f, 0.01f)
                curveToRelative(-0.19f, -2.59f, -1.64f, -3.86f, -4.41f, -3.86f)
                curveToRelative(-2.36f, 0f, -3.76f, 0.92f, -4.24f, 2.79f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.12f, 7.39f)
                curveToRelative(0.18f, -1.07f, 0.56f, -1.99f, 1.12f, -2.73f)
                curveToRelative(-0.49f, -0.13f, -1.05f, -0.19f, -1.68f, -0.19f)
                curveToRelative(-2.77f, 0f, -4.22f, 1.26f, -4.41f, 3.85f)
                curveToRelative(0.01f, -0.0f, 0.02f, -0.01f, 0.03f, -0.01f)
                curveToRelative(1.61f, -0.45f, 3.27f, -0.76f, 4.93f, -0.93f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.27f, 10.24f)
                curveToRelative(-4.75f, -1.33f, -9.78f, -1.33f, -14.54f, 0f)
                curveToRelative(-0.52f, 0.14f, -0.83f, 0.68f, -0.7f, 1.2f)
                curveToRelative(1.71f, 7.07f, 7.14f, 11.19f, 7.37f, 11.37f)
                curveToRelative(0.18f, 0.13f, 0.39f, 0.2f, 0.6f, 0.2f)
                reflectiveCurveToRelative(0.42f, -0.07f, 0.6f, -0.2f)
                curveToRelative(0.23f, -0.17f, 5.66f, -4.29f, 7.37f, -11.37f)
                curveToRelative(0.13f, -0.52f, -0.18f, -1.05f, -0.7f, -1.2f)
                close()
            }
        }.also { _IceCream = it}
