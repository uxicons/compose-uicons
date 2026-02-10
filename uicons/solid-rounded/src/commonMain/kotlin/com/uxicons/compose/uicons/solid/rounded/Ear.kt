package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ear: ImageVector? = null

val Icons.Sr.Ear: ImageVector
    get() = _Ear ?: UXIcon(name = "Ear") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.83f, 2.42f)
                curveTo(16.82f, 0.62f, 14.11f, -0.24f, 11.4f, 0.06f)
                curveTo(7.17f, 0.54f, 3.9f, 3.98f, 3.1f, 8.15f)
                curveToRelative(-0.13f, 0.67f, -0.08f, 1.59f, -0.08f, 1.91f)
                reflectiveCurveToRelative(0.26f, 1.31f, 0.39f, 1.81f)
                curveToRelative(0.33f, 1.35f, 0.61f, 2.52f, 0.61f, 6.13f)
                curveToRelative(-0.01f, 1.92f, 0.87f, 3.68f, 2.43f, 4.83f)
                curveToRelative(1.04f, 0.77f, 2.3f, 1.16f, 3.57f, 1.16f)
                curveToRelative(1.16f, 0f, 2.32f, -0.33f, 3.3f, -0.98f)
                curveToRelative(0.89f, -0.6f, 1.6f, -1.41f, 2.06f, -2.34f)
                curveToRelative(0.8f, -1.63f, 1.63f, -2.71f, 2.63f, -3.42f)
                curveToRelative(2.5f, -1.78f, 4.0f, -4.67f, 4.0f, -7.74f)
                curveToRelative(0f, -2.7f, -1.16f, -5.28f, -3.17f, -7.08f)
                close()
                moveTo(17f, 10.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                curveToRelative(-1.76f, 0f, -3.25f, 1.28f, -3.49f, 3.0f)
                curveToRelative(1.65f, 0.01f, 2.99f, 1.35f, 2.99f, 3.0f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                curveToRelative(-0.97f, 0f, -1.99f, -0.81f, -1.99f, -2.11f)
                curveToRelative(0.31f, -2.79f, 2.67f, -4.89f, 5.49f, -4.89f)
                curveToRelative(3.03f, 0f, 5.5f, 2.47f, 5.5f, 5.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Ear = it}
