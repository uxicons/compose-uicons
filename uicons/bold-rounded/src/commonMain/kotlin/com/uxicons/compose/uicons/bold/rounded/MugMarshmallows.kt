package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugMarshmallows: ImageVector? = null

val Icons.Br.MugMarshmallows: ImageVector
    get() = _MugMarshmallows ?: UXIcon(name = "MugMarshmallows") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20f, 9.5f)
            horizontalLineToRelative(-1f)
            curveToRelative(0f, -1.64f, -1.14f, -3.01f, -2.66f, -3.39f)
            lineToRelative(0.11f, -0.11f)
            curveToRelative(0.25f, -0.34f, 0.39f, -0.74f, 0.39f, -1.17f)
            curveToRelative(0f, -0.54f, -0.21f, -1.04f, -0.59f, -1.41f)
            lineToRelative(-2.83f, -2.83f)
            curveToRelative(-0.78f, -0.78f, -2.05f, -0.78f, -2.83f, 0f)
            lineToRelative(-2.83f, 2.83f)
            curveToRelative(-0.7f, 0.7f, -0.77f, 1.8f, -0.2f, 2.58f)
            horizontalLineToRelative(-2.19f)
            curveToRelative(-0.42f, -1.37f, -0.1f, -2.92f, 0.98f, -4f)
            lineTo(8.31f, 0.03f)
            curveToRelative(-0.1f, -0.02f, -0.2f, -0.03f, -0.31f, -0.03f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(4.35f)
            curveToRelative(-1.18f, 0.56f, -2f, 1.76f, -2f, 3.15f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(8f)
            curveToRelative(2.33f, 0f, 4.32f, -1.45f, 5.12f, -3.5f)
            horizontalLineToRelative(1.38f)
            curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
            moveTo(13.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-9f)
            curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(12f)
            curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
            moveTo(21f, 16.5f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            verticalLineToRelative(3f)
            close()
        }
    }.also { _MugMarshmallows = it }
