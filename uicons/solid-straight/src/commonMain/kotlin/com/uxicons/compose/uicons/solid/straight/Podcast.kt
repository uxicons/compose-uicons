package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Podcast: ImageVector? = null

val Icons.Ss.Podcast: ImageVector
    get() = _Podcast ?: UXIcon(name = "Podcast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.01f, 16.88f)
                curveToRelative(-0.24f, -0.65f, -0.65f, -1.23f, -1.18f, -1.67f)
                curveToRelative(0.73f, -0.87f, 1.17f, -1.99f, 1.17f, -3.21f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                curveToRelative(0f, 1.22f, 0.44f, 2.35f, 1.18f, 3.22f)
                curveToRelative(-0.53f, 0.45f, -0.93f, 1.03f, -1.17f, 1.69f)
                curveToRelative(-1.24f, -1.26f, -2.01f, -3.0f, -2.01f, -4.91f)
                curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                curveToRelative(0f, 1.9f, -0.76f, 3.62f, -1.99f, 4.88f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                curveToRelative(0f, 5.13f, 3.24f, 9.52f, 7.78f, 11.23f)
                lineToRelative(-0.54f, -2.44f)
                curveToRelative(-3.12f, -1.7f, -5.24f, -5.0f, -5.24f, -8.79f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 3.78f, -2.1f, 7.07f, -5.2f, 8.77f)
                lineToRelative(-0.52f, 2.44f)
                curveToRelative(4.51f, -1.73f, 7.72f, -6.1f, 7.72f, -11.21f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(15.23f, 18.54f)
                lineToRelative(-1.16f, 5.46f)
                horizontalLineToRelative(-4.07f)
                lineToRelative(-1.2f, -5.39f)
                curveToRelative(-0.18f, -0.97f, 0.36f, -1.91f, 1.27f, -2.2f)
                curveToRelative(0.83f, -0.27f, 1.48f, -0.41f, 1.93f, -0.41f)
                curveToRelative(0.45f, 0f, 1.1f, 0.14f, 1.94f, 0.41f)
                curveToRelative(0.9f, 0.29f, 1.45f, 1.2f, 1.29f, 2.12f)
                close()
                moveTo(12f, 14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                close()
            }
        }.also { _Podcast = it}
