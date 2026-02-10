package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BedBunk: ImageVector? = null

val Icons.Br.BedBunk: ImageVector
    get() = _BedBunk ?: UXIcon(name = "BedBunk") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9f, 14.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
            reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
            reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
            close()
            moveTo(24f, 5f)
            verticalLineToRelative(17.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1.5f)
            lineTo(3f, 21f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            lineTo(0f, 1.5f)
            curveTo(0f, 0.67f, 0.67f, 0f, 1.5f, 0f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
            horizontalLineToRelative(4f)
            curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
            close()
            moveTo(13f, 6f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(1f)
            close()
            moveTo(3f, 18f)
            horizontalLineToRelative(7f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(-3f)
            lineTo(3f, 9f)
            verticalLineToRelative(9f)
            close()
            moveTo(21f, 18f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(-6f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(8f)
            close()
            moveTo(6.5f, 5f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(7.88f, 0f, 6.5f, 0f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            close()
        }
    }.also { _BedBunk = it }
