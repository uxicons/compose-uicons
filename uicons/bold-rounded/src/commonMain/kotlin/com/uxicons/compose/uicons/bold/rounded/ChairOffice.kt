package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ChairOffice: ImageVector? = null

val Icons.Br.ChairOffice: ImageVector
    get() = _ChairOffice ?: UXIcon(name = "ChairOffice") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 7f)
            horizontalLineToRelative(-0.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-0.5f)
            curveTo(2.02f, 7f, 0f, 9.02f, 0f, 11.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            lineTo(10.5f, 19f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(9f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(9f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-6f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(19.5f, 10f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(2.77f)
            curveToRelative(-0.29f, -0.17f, -0.64f, -0.27f, -1f, -0.27f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-4f)
            horizontalLineToRelative(0.5f)
            close()
            moveTo(8f, 5f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(4f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            lineTo(16f, 14f)
            lineTo(8f, 14f)
            lineTo(8f, 5f)
            close()
            moveTo(4.5f, 10f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.36f, 0f, -0.71f, 0.1f, -1f, 0.27f)
            verticalLineToRelative(-2.77f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            close()
        }
    }.also { _ChairOffice = it }
