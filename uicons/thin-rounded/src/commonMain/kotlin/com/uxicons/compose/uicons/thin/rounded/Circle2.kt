package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Circle2: ImageVector? = null

val Icons.Tr.Circle2: ImageVector
    get() = _Circle2 ?: UXIcon(name = "Circle2") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 1f)
                curveTo(5.93f, 1f, 1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                reflectiveCurveTo(18.07f, 1f, 12f, 1f)
                close()
                moveTo(16f, 17.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-6.02f)
                curveToRelative(-0.28f, 0f, -0.39f, -0.19f, -0.43f, -0.27f)
                curveToRelative(-0.03f, -0.07f, -0.12f, -0.31f, 0.08f, -0.54f)
                curveToRelative(0.56f, -0.66f, 1.56f, -1.1f, 2.63f, -1.58f)
                curveToRelative(2.04f, -0.91f, 4.36f, -1.94f, 4.24f, -4.83f)
                curveToRelative(-0.09f, -2.12f, -1.84f, -3.77f, -4.0f, -3.77f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                curveToRelative(1.61f, 0f, 2.93f, 1.24f, 3.0f, 2.82f)
                curveToRelative(0.09f, 2.21f, -1.72f, 3.02f, -3.65f, 3.88f)
                curveToRelative(-1.18f, 0.52f, -2.29f, 1.02f, -2.99f, 1.85f)
                curveToRelative(-0.38f, 0.45f, -0.47f, 1.07f, -0.22f, 1.6f)
                curveToRelative(0.24f, 0.53f, 0.76f, 0.85f, 1.34f, 0.85f)
                horizontalLineToRelative(6.02f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                close()
            }
        }.also { _Circle2 = it}
