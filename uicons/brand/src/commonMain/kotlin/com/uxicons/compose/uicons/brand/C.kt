package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _C: ImageVector? = null

val Icons.Brand.C: ImageVector
    get() = _C ?: UXIcon(name = "C") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.59f, 9.2f)
            curveToRelative(0f, 0f, -0.35f, -3.3f, -3.63f, -3.39f)
            reflectiveCurveTo(8.01f, 8.28f, 8.01f, 11.95f)
            reflectiveCurveToRelative(1.86f, 6.6f, 5.04f, 6.6f)
            curveToRelative(3.18f, 0f, 3.54f, -3.67f, 3.54f, -3.67f)
            lineToRelative(6.1f, 0.37f)
            curveToRelative(0f, 0f, 0.36f, 3.31f, -2.19f, 5.83f)
            curveToRelative(-2.55f, 2.52f, -5.69f, 2.94f, -7.88f, 2.92f)
            curveToRelative(-2.19f, -0.02f, -5.22f, 0.03f, -8.16f, -2.97f)
            reflectiveCurveToRelative(-3.43f, -5.93f, -3.43f, -8.8f)
            curveToRelative(0f, -2.87f, 0.56f, -6.67f, 4.05f, -9.55f)
            curveTo(7.45f, 0.72f, 9.85f, 0f, 12.26f, 0f)
            curveToRelative(10.04f, 0f, 10.71f, 9.26f, 10.71f, 9.26f)
            lineTo(16.59f, 9.2f)
            close()
        }
    }.also { _C = it }
