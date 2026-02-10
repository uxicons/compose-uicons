package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LuggageCart: ImageVector? = null

val Icons.Br.LuggageCart: ImageVector
    get() = _LuggageCart ?: UXIcon(name = "LuggageCart") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 19f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(18f, 21.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            close()
            moveTo(22.5f, 16f)
            lineTo(8.5f, 16f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(6f, 4.5f)
            curveTo(6f, 2.02f, 3.98f, 0f, 1.5f, 0f)
            curveTo(0.67f, 0f, 0f, 0.67f, 0f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            lineTo(3f, 13.5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(14f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(24f, 7.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -2.31f, 1.75f, -4.22f, 4f, -4.47f)
            verticalLineToRelative(-0.53f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(3f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(0.53f)
            curveToRelative(2.25f, 0.25f, 4f, 2.16f, 4f, 4.47f)
            close()
            moveTo(21f, 7.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            close()
        }
    }.also { _LuggageCart = it }
