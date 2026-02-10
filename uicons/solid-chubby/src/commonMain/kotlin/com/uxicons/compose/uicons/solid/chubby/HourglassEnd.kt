package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HourglassEnd: ImageVector? = null

val Icons.Sc.HourglassEnd: ImageVector
    get() = _HourglassEnd ?: UXIcon(name = "HourglassEnd") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.13f, 15.85f)
                lineToRelative(-0.13f, -0.08f)
                lineToRelative(-0.13f, 0.08f)
                curveToRelative(-0.6f, 0.37f, -1.13f, 0.88f, -1.56f, 1.51f)
                curveToRelative(0.47f, 0.08f, 1.03f, 0.14f, 1.7f, 0.14f)
                curveToRelative(0.69f, 0f, 1.25f, -0.06f, 1.7f, -0.14f)
                curveToRelative(-0.44f, -0.64f, -0.96f, -1.15f, -1.57f, -1.52f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.19f, 12f)
                curveToRelative(1.52f, -1.26f, 3.15f, -3.34f, 3.99f, -6.73f)
                curveToRelative(0.05f, -0.21f, 0.04f, -0.43f, -0.05f, -0.63f)
                curveToRelative(-0.06f, -0.15f, -1.6f, -3.64f, -8.13f, -3.64f)
                reflectiveCurveTo(3.94f, 4.49f, 3.87f, 4.64f)
                curveToRelative(-0.08f, 0.2f, -0.1f, 0.42f, -0.05f, 0.63f)
                curveToRelative(0.84f, 3.39f, 2.47f, 5.47f, 3.99f, 6.73f)
                curveToRelative(-1.52f, 1.26f, -3.15f, 3.34f, -3.99f, 6.73f)
                curveToRelative(-0.05f, 0.21f, -0.04f, 0.43f, 0.05f, 0.63f)
                curveToRelative(0.06f, 0.15f, 1.6f, 3.64f, 8.13f, 3.64f)
                reflectiveCurveToRelative(8.06f, -3.49f, 8.13f, -3.64f)
                curveToRelative(0.08f, -0.2f, 0.1f, -0.42f, 0.05f, -0.63f)
                curveToRelative(-0.84f, -3.39f, -2.47f, -5.47f, -3.99f, -6.73f)
                close()
                moveTo(15.57f, 18.89f)
                curveToRelative(-0.94f, 0.39f, -2.14f, 0.61f, -3.57f, 0.61f)
                curveToRelative(-1.66f, 0f, -2.85f, -0.28f, -3.54f, -0.56f)
                curveToRelative(-0.8f, -0.34f, -0.68f, -1.1f, -0.56f, -1.35f)
                curveToRelative(0.69f, -1.53f, 1.71f, -2.63f, 2.93f, -3.45f)
                curveToRelative(1.1f, -0.74f, 1.29f, -0.66f, 2.34f, 0f)
                curveToRelative(1.24f, 0.78f, 2.23f, 1.91f, 2.92f, 3.42f)
                curveToRelative(0.11f, 0.24f, 0.22f, 1.02f, -0.51f, 1.33f)
                close()
            }
        }.also { _HourglassEnd = it}
