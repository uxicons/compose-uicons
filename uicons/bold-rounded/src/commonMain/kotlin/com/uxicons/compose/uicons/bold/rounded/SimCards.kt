package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SimCards: ImageVector? = null

val Icons.Br.SimCards: ImageVector
    get() = _SimCards ?: UXIcon(name = "SimCards") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14f, 11f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(3f)
            close()
            moveTo(16f, 8f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            close()
            moveTo(10f, 13f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(1f)
            close()
            moveTo(14f, 15f)
            horizontalLineToRelative(2f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(3f)
            close()
            moveTo(22f, 6.74f)
            verticalLineToRelative(7.76f)
            curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
            horizontalLineToRelative(-7f)
            curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
            lineTo(6f, 4.5f)
            curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
            horizontalLineToRelative(4.76f)
            curveToRelative(1.19f, 0f, 2.34f, 0.48f, 3.18f, 1.32f)
            lineToRelative(2.24f, 2.24f)
            curveToRelative(0.84f, 0.84f, 1.32f, 2.0f, 1.32f, 3.18f)
            close()
            moveTo(19f, 6.74f)
            curveToRelative(0f, -0.4f, -0.16f, -0.78f, -0.44f, -1.06f)
            lineToRelative(-2.24f, -2.24f)
            curveToRelative(-0.28f, -0.28f, -0.67f, -0.44f, -1.06f, -0.44f)
            horizontalLineToRelative(-4.76f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-7.76f)
            close()
            moveTo(14.5f, 21f)
            horizontalLineToRelative(-4f)
            curveToRelative(-3.59f, 0f, -6.5f, -2.91f, -6.5f, -6.5f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 5.25f, 4.25f, 9.5f, 9.5f, 9.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _SimCards = it }
