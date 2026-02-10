package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Oven: ImageVector? = null

val Icons.Br.Oven: ImageVector
    get() = _Oven ?: UXIcon(name = "Oven") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.5f, 0f)
            lineTo(6.5f, 0f)
            curveTo(3.47f, 0f, 1f, 2.47f, 1f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(11f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(23f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(6.5f, 3f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(2.5f)
            lineTo(4f, 8f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
            moveTo(17.5f, 21f)
            lineTo(6.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-7.5f)
            horizontalLineToRelative(16f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(18f, 14f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            lineTo(7f, 19f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(10f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            close()
            moveTo(10.5f, 5.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(15f, 5.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(6f, 5.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
        }
    }.also { _Oven = it }
