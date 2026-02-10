package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Icicles: ImageVector? = null

val Icons.Sc.Icicles: ImageVector
    get() = _Icicles ?: UXIcon(name = "Icicles") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.97f, 3.0f)
                curveToRelative(0.01f, -0.5f, -0.35f, -0.92f, -0.84f, -1.01f)
                curveToRelative(-2.12f, -0.38f, -6.17f, -1.0f, -10.14f, -1.0f)
                reflectiveCurveToRelative(-7.99f, 0.61f, -10.12f, 1.0f)
                curveToRelative(-0.5f, 0.09f, -0.86f, 0.53f, -0.84f, 1.03f)
                curveToRelative(0.14f, 3.62f, 0.58f, 7.84f, 1.52f, 11.35f)
                curveToRelative(0.21f, 0.79f, 1.32f, 0.83f, 1.58f, 0.05f)
                curveToRelative(0.56f, -1.64f, 0.99f, -4.27f, 1.27f, -5.74f)
                curveToRelative(0.24f, 3.6f, 1.23f, 9.72f, 2.34f, 13.73f)
                curveToRelative(0.2f, 0.71f, 1.21f, 0.75f, 1.45f, 0.05f)
                curveToRelative(1.34f, -3.89f, 2.09f, -9.6f, 2.8f, -13.78f)
                curveToRelative(0.51f, 2.03f, 1.15f, 3.84f, 1.94f, 5.74f)
                curveToRelative(0.3f, 0.73f, 1.34f, 0.74f, 1.65f, 0.02f)
                curveToRelative(0.83f, -1.91f, 1.46f, -3.73f, 1.9f, -5.76f)
                curveToRelative(0.3f, 2.73f, 0.96f, 5.8f, 1.9f, 8.74f)
                curveToRelative(0.24f, 0.76f, 1.34f, 0.71f, 1.54f, -0.06f)
                curveToRelative(1.28f, -5.07f, 1.98f, -10.19f, 2.06f, -14.37f)
                close()
            }
        }.also { _Icicles = it}
