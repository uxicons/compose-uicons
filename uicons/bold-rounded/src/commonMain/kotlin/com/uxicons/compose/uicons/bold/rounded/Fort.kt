package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fort: ImageVector? = null

val Icons.Br.Fort: ImageVector
    get() = _Fort ?: UXIcon(name = "Fort") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.5f, 0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.89f, 0.39f, 1.68f, 1f, 2.23f)
            verticalLineToRelative(4.77f)
            horizontalLineToRelative(-6f)
            lineTo(9f, 6.23f)
            curveToRelative(0.61f, -0.55f, 1f, -1.35f, 1f, -2.23f)
            lineTo(10f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            lineTo(3f, 2f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveTo(0f, 0.67f, 0f, 1.5f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.89f, 0.39f, 1.68f, 1f, 2.23f)
            verticalLineToRelative(12.77f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            horizontalLineToRelative(12f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            lineTo(23f, 6.23f)
            curveToRelative(0.61f, -0.55f, 1f, -1.35f, 1f, -2.23f)
            lineTo(24f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(18f, 21f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
            verticalLineToRelative(3f)
            lineTo(6f, 21f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            lineTo(4f, 7f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(18f, 7f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            close()
        }
    }.also { _Fort = it }
