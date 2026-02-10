package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ad: ImageVector? = null

val Icons.Br.Ad: ImageVector
    get() = _Ad ?: UXIcon(name = "Ad") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 15f)
            curveToRelative(-0.01f, 1.31f, -1.99f, 1.31f, -2f, 0f)
            curveToRelative(0.01f, -1.31f, 1.99f, -1.31f, 2f, 0f)
            close()
            moveTo(6.69f, 14f)
            horizontalLineToRelative(1.62f)
            lineToRelative(-0.81f, -2.55f)
            lineToRelative(-0.81f, 2.55f)
            close()
            moveTo(24f, 7f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
            lineTo(5f, 22f)
            curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
            lineTo(0f, 7f)
            curveTo(0f, 4.24f, 2.24f, 2f, 5f, 2f)
            horizontalLineToRelative(14f)
            curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
            close()
            moveTo(12.43f, 17.05f)
            lineToRelative(-3.5f, -11f)
            curveToRelative(-0.39f, -1.37f, -2.47f, -1.37f, -2.86f, 0f)
            lineToRelative(-3.5f, 11f)
            curveToRelative(-0.25f, 0.79f, 0.18f, 1.63f, 0.97f, 1.88f)
            curveToRelative(0.79f, 0.25f, 1.63f, -0.18f, 1.88f, -0.97f)
            lineToRelative(0.3f, -0.95f)
            horizontalLineToRelative(3.53f)
            lineToRelative(0.3f, 0.95f)
            curveToRelative(0.25f, 0.8f, 1.12f, 1.23f, 1.88f, 0.97f)
            curveToRelative(0.79f, -0.25f, 1.23f, -1.09f, 0.97f, -1.88f)
            close()
            moveTo(21f, 6.5f)
            curveToRelative(-0.03f, -1.97f, -2.97f, -1.97f, -3f, 0f)
            verticalLineToRelative(4.64f)
            curveToRelative(-2.61f, -0.75f, -5.29f, 1.51f, -4.98f, 4.26f)
            curveToRelative(0.2f, 2.08f, 2.07f, 3.6f, 4.16f, 3.6f)
            horizontalLineToRelative(2.32f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(21.0f, 6.5f)
            close()
        }
    }.also { _Ad = it }
