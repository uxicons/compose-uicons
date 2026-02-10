package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Desk: ImageVector? = null

val Icons.Br.Desk: ImageVector
    get() = _Desk ?: UXIcon(name = "Desk") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.5f, 12f)
            horizontalLineToRelative(-7f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(1.5f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            horizontalLineToRelative(-6f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(2f)
            lineTo(1.5f, 12f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(7.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-7.5f)
            lineTo(14f, 15f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(3f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(9f, 7f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-6f)
            close()
            moveTo(21f, 20.5f)
            curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
            verticalLineToRelative(-5.5f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
            verticalLineToRelative(5f)
            close()
        }
    }.also { _Desk = it }
