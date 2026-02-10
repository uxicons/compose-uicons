package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Youtube: ImageVector? = null

val Icons.Brand.Youtube: ImageVector
    get() = _Youtube ?: UXIcon(name = "Youtube") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.5f, 6.19f)
            curveToRelative(-0.28f, -1.04f, -1.09f, -1.86f, -2.12f, -2.14f)
            curveTo(19.5f, 3.55f, 12f, 3.55f, 12f, 3.55f)
            reflectiveCurveToRelative(-7.5f, 0f, -9.38f, 0.5f)
            curveTo(1.59f, 4.33f, 0.78f, 5.15f, 0.5f, 6.19f)
            curveTo(0f, 8.07f, 0f, 12f, 0f, 12f)
            reflectiveCurveToRelative(0f, 3.93f, 0.5f, 5.81f)
            curveToRelative(0.28f, 1.04f, 1.09f, 1.86f, 2.12f, 2.14f)
            curveTo(4.5f, 20.45f, 12f, 20.45f, 12f, 20.45f)
            reflectiveCurveToRelative(7.5f, 0f, 9.38f, -0.5f)
            curveToRelative(1.03f, -0.28f, 1.84f, -1.1f, 2.12f, -2.14f)
            curveTo(24f, 15.93f, 24f, 12f, 24f, 12f)
            reflectiveCurveTo(24f, 8.07f, 23.5f, 6.19f)
            close()
            moveTo(9.55f, 15.57f)
            verticalLineTo(8.43f)
            lineTo(15.82f, 12f)
            lineTo(9.55f, 15.57f)
            close()
        }
    }.also { _Youtube = it }
