package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pump: ImageVector? = null

val Icons.Br.Pump: ImageVector
    get() = _Pump ?: UXIcon(name = "Pump") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.5f, 6f)
            horizontalLineToRelative(-4f)
            curveToRelative(-0.9f, 0f, -1.75f, 0.22f, -2.5f, 0.61f)
            verticalLineToRelative(-3.61f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(4.5f, -0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(9f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(7.03f)
            curveToRelative(0.25f, 2.8f, 2.61f, 5f, 5.47f, 5f)
            horizontalLineToRelative(4f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(8f, 3f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(13f)
            horizontalLineToRelative(-2f)
            lineTo(8f, 3f)
            close()
            moveTo(19.5f, 21f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(4.5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-4.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(4.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            close()
        }
    }.also { _Pump = it }
