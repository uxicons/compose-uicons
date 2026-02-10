package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoBall: ImageVector? = null

val Icons.Ss.NoBall: ImageVector
    get() = _NoBall ?: UXIcon(name = "NoBall") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveToRelative(-5.38f, -12f, -12f, -12f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                lineToRelative(-2.14f, -2.14f)
                curveToRelative(2.05f, -2.74f, 1.84f, -6.65f, -0.65f, -9.14f)
                curveToRelative(-2.49f, -2.49f, -6.4f, -2.7f, -9.14f, -0.65f)
                lineToRelative(-2.14f, -2.14f)
                curveToRelative(1.73f, -1.41f, 3.93f, -2.26f, 6.32f, -2.26f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                close()
                moveTo(12f, 8.67f)
                lineTo(10.89f, 9.47f)
                lineTo(9.24f, 7.83f)
                curveToRelative(0.3f, -0.2f, 0.61f, -0.35f, 0.94f, -0.48f)
                lineToRelative(1.82f, 1.32f)
                lineToRelative(1.82f, -1.32f)
                curveToRelative(0.63f, 0.24f, 1.21f, 0.61f, 1.72f, 1.12f)
                curveToRelative(0.11f, 0.11f, 0.19f, 0.23f, 0.28f, 0.35f)
                lineToRelative(-0.66f, 2.15f)
                lineToRelative(1.82f, 1.28f)
                curveToRelative(-0.04f, 0.88f, -0.3f, 1.75f, -0.8f, 2.51f)
                lineToRelative(-1.7f, -1.7f)
                lineToRelative(0.68f, -2.1f)
                lineToRelative(-3.16f, -2.29f)
                close()
                moveTo(2f, 12f)
                curveToRelative(0f, -2.4f, 0.85f, -4.6f, 2.26f, -6.32f)
                lineToRelative(14.06f, 14.06f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                curveToRelative(-5.51f, 0f, -10f, -4.49f, -10f, -10f)
                close()
                moveTo(14.35f, 18.59f)
                curveToRelative(-0.73f, 0.26f, -1.52f, 0.41f, -2.35f, 0.41f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                curveToRelative(0f, -0.82f, 0.15f, -1.61f, 0.41f, -2.35f)
                lineToRelative(2.19f, 2.19f)
                lineToRelative(-0.58f, 0.41f)
                curveToRelative(0.05f, 0.89f, 0.32f, 1.71f, 0.77f, 2.42f)
                lineToRelative(2.26f, 0.0f)
                lineToRelative(0.72f, 2.16f)
                curveToRelative(0.39f, 0.1f, 0.8f, 0.17f, 1.23f, 0.17f)
                curveToRelative(0.24f, 0f, 0.46f, -0.04f, 0.69f, -0.07f)
                close()
            }
        }.also { _NoBall = it}
