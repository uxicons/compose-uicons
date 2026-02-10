package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FireFlameCurved: ImageVector? = null

val Icons.Bs.FireFlameCurved: ImageVector
    get() = _FireFlameCurved ?: UXIcon(name = "FireFlameCurved") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                curveToRelative(0f, -3.37f, 1.5f, -5.47f, 3.76f, -7.59f)
                lineToRelative(3.67f, -3.45f)
                lineToRelative(-1.19f, 4.9f)
                curveToRelative(-0.29f, 1.21f, -0.41f, 4.04f, 0.65f, 5.38f)
                curveToRelative(0.26f, 0.33f, 0.72f, 0.77f, 1.78f, 0.77f)
                curveToRelative(0.74f, 0f, 1.32f, -0.59f, 1.33f, -1.35f)
                curveToRelative(0.01f, -1.06f, -0.22f, -1.85f, -0.47f, -2.69f)
                curveToRelative(-0.25f, -0.84f, -0.54f, -1.78f, -0.54f, -2.96f)
                curveToRelative(0f, -2.59f, 0.73f, -4.26f, 0.82f, -4.44f)
                lineTo(12.96f, 0.04f)
                lineToRelative(1.48f, 2.34f)
                curveToRelative(0.81f, 1.27f, 1.95f, 2.4f, 3.05f, 3.5f)
                curveToRelative(2.22f, 2.2f, 4.52f, 4.47f, 4.52f, 8.13f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
                moveTo(5.26f, 12.16f)
                curveToRelative(-0.17f, 0.56f, -0.26f, 1.16f, -0.26f, 1.84f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -2.4f, -1.68f, -4.07f, -3.63f, -6.0f)
                curveToRelative(-0.46f, -0.45f, -0.92f, -0.91f, -1.38f, -1.4f)
                curveToRelative(-0.01f, 0.13f, -0.01f, 0.26f, -0.01f, 0.39f)
                curveToRelative(0f, 0.73f, 0.18f, 1.34f, 0.41f, 2.1f)
                curveToRelative(0.29f, 0.97f, 0.62f, 2.06f, 0.6f, 3.59f)
                curveToRelative(-0.03f, 2.38f, -1.97f, 4.31f, -4.33f, 4.31f)
                curveToRelative(-1.72f, 0f, -3.15f, -0.66f, -4.13f, -1.91f)
                curveToRelative(-0.67f, -0.85f, -1.06f, -1.88f, -1.27f, -2.93f)
                close()
            }
        }.also { _FireFlameCurved = it}
