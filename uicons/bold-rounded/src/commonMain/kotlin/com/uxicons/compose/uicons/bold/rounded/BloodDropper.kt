package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BloodDropper: ImageVector? = null

val Icons.Br.BloodDropper: ImageVector
    get() = _BloodDropper ?: UXIcon(name = "BloodDropper") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16.5f, 3f)
            horizontalLineToRelative(-1.05f)
            curveToRelative(-0.24f, -1.69f, -1.69f, -3f, -3.45f, -3f)
            reflectiveCurveToRelative(-3.2f, 1.31f, -3.45f, 3f)
            horizontalLineToRelative(-1.05f)
            curveTo(3.92f, 3f, 1f, 5.92f, 1f, 9.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(0.5f)
            curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
            close()
            moveTo(16.5f, 19f)
            lineTo(7.5f, 19f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            verticalLineToRelative(-3.5f)
            lineTo(12.5f, 12f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(4.05f, 9f)
            curveToRelative(0.24f, -1.69f, 1.69f, -3f, 3.45f, -3f)
            horizontalLineToRelative(9f)
            curveToRelative(1.76f, 0f, 3.2f, 1.31f, 3.45f, 3f)
            horizontalLineToRelative(-2.45f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2.15f)
            curveToRelative(-0.56f, 1.18f, -1.76f, 2f, -3.15f, 2f)
            close()
        }
    }.also { _BloodDropper = it }
