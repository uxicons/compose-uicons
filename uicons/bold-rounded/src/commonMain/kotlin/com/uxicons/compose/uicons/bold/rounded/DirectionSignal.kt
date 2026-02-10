package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DirectionSignal: ImageVector? = null

val Icons.Br.DirectionSignal: ImageVector
    get() = _DirectionSignal ?: UXIcon(name = "DirectionSignal") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(21.85f, 14.23f)
            lineToRelative(-1.21f, -1.21f)
            curveToRelative(-0.66f, -0.66f, -1.54f, -1.02f, -2.48f, -1.02f)
            horizontalLineToRelative(-4.67f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(5.5f)
            curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
            horizontalLineToRelative(-5.5f)
            lineToRelative(0.0f, -0.49f)
            curveToRelative(0.0f, -0.83f, -0.66f, -1.5f, -1.49f, -1.51f)
            curveToRelative(-0.82f, 0.02f, -1.5f, 0.66f, -1.51f, 1.49f)
            lineToRelative(-0.0f, 0.51f)
            horizontalLineToRelative(-4.67f)
            curveToRelative(-0.94f, 0f, -1.81f, 0.36f, -2.48f, 1.02f)
            lineToRelative(-1.21f, 1.21f)
            curveToRelative(-0.97f, 0.97f, -0.97f, 2.56f, 0f, 3.54f)
            lineToRelative(1.21f, 1.21f)
            curveToRelative(0.66f, 0.66f, 1.54f, 1.02f, 2.48f, 1.02f)
            horizontalLineToRelative(4.67f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-5.5f)
            curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
            horizontalLineToRelative(5.49f)
            lineToRelative(0.01f, 2.5f)
            curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.0f)
            curveToRelative(0.83f, -0.0f, 1.5f, -0.68f, 1.5f, -1.5f)
            lineToRelative(-0.01f, -2.5f)
            horizontalLineToRelative(4.68f)
            curveToRelative(0.94f, 0f, 1.81f, -0.36f, 2.48f, -1.02f)
            lineToRelative(1.21f, -1.21f)
            curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0f, -3.54f)
            close()
            moveTo(5.47f, 6.85f)
            lineToRelative(-0.85f, -0.85f)
            lineToRelative(0.85f, -0.85f)
            curveToRelative(0.1f, -0.09f, 0.22f, -0.15f, 0.35f, -0.15f)
            horizontalLineToRelative(13.17f)
            verticalLineToRelative(2f)
            lineTo(5.83f, 7f)
            curveToRelative(-0.13f, 0f, -0.26f, -0.05f, -0.35f, -0.15f)
            close()
            moveTo(18.53f, 16.85f)
            curveToRelative(-0.1f, 0.09f, -0.22f, 0.15f, -0.35f, 0.15f)
            lineTo(5f, 17f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(13.17f)
            curveToRelative(0.13f, 0f, 0.26f, 0.05f, 0.35f, 0.15f)
            lineToRelative(0.85f, 0.85f)
            lineToRelative(-0.85f, 0.85f)
            close()
        }
    }.also { _DirectionSignal = it }
