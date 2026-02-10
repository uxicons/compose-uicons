package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Segway: ImageVector? = null

val Icons.Br.Segway: ImageVector
    get() = _Segway ?: UXIcon(name = "Segway") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 15f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-16f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(4f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(-9f)
            lineToRelative(-1.33f, -3f)
            horizontalLineToRelative(-3.67f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(13f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3.67f)
            lineToRelative(-1.33f, 3f)
            verticalLineToRelative(9f)
            horizontalLineToRelative(0.5f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            close()
        }
    }.also { _Segway = it }
