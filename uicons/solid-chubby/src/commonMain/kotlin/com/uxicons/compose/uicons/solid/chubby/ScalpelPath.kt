package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ScalpelPath: ImageVector? = null

val Icons.Sc.ScalpelPath: ImageVector
    get() = _ScalpelPath ?: UXIcon(name = "ScalpelPath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(21.5f, 20f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(12.31f, 12.19f)
                curveToRelative(-1.15f, -1.15f, -2.84f, -1.57f, -3.32f, -1.68f)
                curveToRelative(-2.64f, 2.86f, -5.66f, 6.57f, -7.88f, 11.04f)
                curveToRelative(-0.15f, 0.31f, -0.14f, 0.68f, 0.04f, 0.97f)
                curveToRelative(0.18f, 0.29f, 0.5f, 0.47f, 0.85f, 0.47f)
                curveToRelative(3.98f, 0f, 11.32f, -1.64f, 11.94f, -7.68f)
                curveToRelative(-0.16f, -0.65f, -0.6f, -2.1f, -1.63f, -3.12f)
                close()
                moveTo(22.99f, 4.37f)
                curveToRelative(-0.02f, -0.14f, -0.23f, -1.36f, -1.11f, -2.24f)
                curveToRelative(-0.88f, -0.88f, -2.1f, -1.09f, -2.24f, -1.11f)
                curveToRelative(-0.27f, -0.04f, -0.54f, 0.03f, -0.76f, 0.19f)
                curveToRelative(0.0f, -0.02f, -3.5f, 2.75f, -6.61f, 5.93f)
                curveToRelative(-0.52f, 0.52f, -1.11f, 1.11f, -1.72f, 1.75f)
                curveToRelative(0.94f, 0.32f, 2.18f, 0.9f, 3.19f, 1.9f)
                curveToRelative(0.78f, 0.78f, 1.3f, 1.7f, 1.64f, 2.52f)
                curveToRelative(0.46f, -0.49f, 1.04f, -1.09f, 1.77f, -1.82f)
                curveToRelative(3.4f, -3.4f, 5.57f, -6.22f, 5.66f, -6.34f)
                curveToRelative(0.17f, -0.22f, 0.23f, -0.49f, 0.19f, -0.76f)
                close()
            }
        }.also { _ScalpelPath = it}
