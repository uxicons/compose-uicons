package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SquareS: ImageVector? = null

val Icons.Br.SquareS: ImageVector
    get() = _SquareS ?: UXIcon(name = "SquareS") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(18f, 15.09f)
            curveToRelative(0f, 2.15f, -1.75f, 3.91f, -3.91f, 3.91f)
            horizontalLineToRelative(-4.22f)
            curveToRelative(-1.91f, 0f, -3.53f, -1.37f, -3.85f, -3.25f)
            curveToRelative(-0.14f, -0.82f, 0.41f, -1.59f, 1.23f, -1.73f)
            curveToRelative(0.82f, -0.14f, 1.59f, 0.41f, 1.73f, 1.23f)
            curveToRelative(0.07f, 0.44f, 0.45f, 0.75f, 0.9f, 0.75f)
            horizontalLineToRelative(4.22f)
            curveToRelative(0.5f, 0f, 0.91f, -0.41f, 0.91f, -0.91f)
            curveToRelative(0f, -0.4f, -0.27f, -0.76f, -0.66f, -0.87f)
            lineToRelative(-5.5f, -1.56f)
            curveToRelative(-1.67f, -0.48f, -2.84f, -2.02f, -2.84f, -3.76f)
            curveToRelative(0f, -2.15f, 1.75f, -3.9f, 3.9f, -3.9f)
            horizontalLineToRelative(4.22f)
            curveToRelative(1.91f, 0f, 3.53f, 1.37f, 3.85f, 3.25f)
            curveToRelative(0.14f, 0.82f, -0.41f, 1.59f, -1.23f, 1.73f)
            curveToRelative(-0.81f, 0.14f, -1.59f, -0.41f, -1.73f, -1.23f)
            curveToRelative(-0.07f, -0.44f, -0.45f, -0.75f, -0.9f, -0.75f)
            horizontalLineToRelative(-4.22f)
            curveToRelative(-0.5f, 0f, -0.9f, 0.41f, -0.9f, 0.9f)
            curveToRelative(0f, 0.4f, 0.27f, 0.76f, 0.66f, 0.87f)
            lineToRelative(5.51f, 1.56f)
            curveToRelative(1.67f, 0.48f, 2.83f, 2.02f, 2.83f, 3.76f)
            close()
        }
    }.also { _SquareS = it }
