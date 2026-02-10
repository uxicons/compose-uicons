package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonMilitaryPointing: ImageVector? = null

val Icons.Br.PersonMilitaryPointing: ImageVector
    get() = _PersonMilitaryPointing ?: UXIcon(name = "PersonMilitaryPointing") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.57f, 2.1f)
            curveTo(7.25f, 1.01f, 8.11f, -0.06f, 9.24f, 0.0f)
            lineToRelative(6.0f, 0.51f)
            curveToRelative(0.83f, 0.05f, 1.39f, 0.87f, 1.12f, 1.66f)
            lineToRelative(-0.32f, 0.83f)
            horizontalLineToRelative(-8.0f)
            lineToRelative(-0.48f, -0.9f)
            close()
            moveTo(12f, 9f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            lineTo(8f, 5f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            close()
            moveTo(23.31f, 22.77f)
            curveToRelative(-0.69f, 0.44f, -1.62f, 0.25f, -2.07f, -0.46f)
            lineToRelative(-3.23f, -5.07f)
            verticalLineToRelative(3.27f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            verticalLineToRelative(-6.5f)
            lineTo(1.5f, 14.0f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            lineTo(12.65f, 11.0f)
            curveToRelative(3.13f, 0f, 6.09f, 1.67f, 7.71f, 4.35f)
            lineToRelative(3.41f, 5.34f)
            curveToRelative(0.45f, 0.7f, 0.24f, 1.63f, -0.46f, 2.07f)
            close()
            moveTo(13.06f, 14.03f)
            curveToRelative(-0.14f, -0.01f, -0.27f, -0.03f, -0.41f, -0.03f)
            horizontalLineToRelative(-2.65f)
            verticalLineToRelative(3.87f)
            lineToRelative(3.06f, -3.84f)
            close()
            moveTo(15f, 16.41f)
            lineToRelative(-3.65f, 4.59f)
            horizontalLineToRelative(3.15f)
            curveToRelative(0.28f, 0f, 0.5f, -0.23f, 0.5f, -0.5f)
            verticalLineToRelative(-4.09f)
            close()
        }
    }.also { _PersonMilitaryPointing = it }
