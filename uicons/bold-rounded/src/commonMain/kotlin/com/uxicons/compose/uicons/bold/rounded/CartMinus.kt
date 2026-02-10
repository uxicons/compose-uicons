package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CartMinus: ImageVector? = null

val Icons.Br.CartMinus: ImageVector
    get() = _CartMinus ?: UXIcon(name = "CartMinus") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.95f, 9.89f)
            lineToRelative(-1.08f, 4.04f)
            curveToRelative(-0.64f, 2.4f, -2.83f, 4.08f, -5.31f, 4.08f)
            lineTo(7.25f, 18.01f)
            curveToRelative(-1.75f, 0f, -3.24f, -1.31f, -3.47f, -3.04f)
            lineTo(2.24f, 3.43f)
            curveToRelative(-0.03f, -0.25f, -0.25f, -0.43f, -0.5f, -0.43f)
            horizontalLineToRelative(-0.25f)
            curveTo(0.67f, 3f, 0f, 2.33f, 0f, 1.5f)
            reflectiveCurveTo(0.67f, 0f, 1.5f, 0f)
            horizontalLineToRelative(0.25f)
            curveTo(3.5f, 0f, 4.99f, 1.31f, 5.22f, 3.04f)
            lineToRelative(0.26f, 1.96f)
            horizontalLineToRelative(6.02f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            lineTo(5.88f, 8f)
            lineToRelative(0.88f, 6.57f)
            curveToRelative(0.03f, 0.25f, 0.25f, 0.43f, 0.5f, 0.43f)
            horizontalLineToRelative(10.3f)
            curveToRelative(1.13f, 0f, 2.12f, -0.76f, 2.41f, -1.85f)
            lineToRelative(1.08f, -4.04f)
            curveToRelative(0.21f, -0.8f, 1.04f, -1.28f, 1.84f, -1.06f)
            curveToRelative(0.8f, 0.21f, 1.27f, 1.04f, 1.06f, 1.84f)
            close()
            moveTo(7f, 20f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
            close()
            moveTo(17f, 20f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
            close()
            moveTo(16.5f, 6f)
            horizontalLineToRelative(6f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            close()
        }
    }.also { _CartMinus = it }
