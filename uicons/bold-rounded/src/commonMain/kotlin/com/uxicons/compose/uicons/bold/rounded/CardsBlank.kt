package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CardsBlank: ImageVector? = null

val Icons.Br.CardsBlank: ImageVector
    get() = _CardsBlank ?: UXIcon(name = "CardsBlank") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.17f, 2f)
            lineTo(14.9f, 0.24f)
            curveToRelative(-2.87f, -0.88f, -5.95f, 0.73f, -6.86f, 3.62f)
            lineToRelative(-0.04f, 0.14f)
            horizontalLineToRelative(-2.5f)
            curveTo(2.47f, 4f, 0f, 6.47f, 0f, 9.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(5f)
            curveToRelative(1.72f, 0f, 3.26f, -0.8f, 4.27f, -2.04f)
            curveToRelative(0.23f, 0.03f, 0.47f, 0.05f, 0.7f, 0.05f)
            curveToRelative(2.38f, 0f, 4.55f, -1.55f, 5.25f, -3.9f)
            lineToRelative(3.09f, -9.31f)
            curveToRelative(0.84f, -2.88f, -0.8f, -5.93f, -3.63f, -6.8f)
            close()
            moveTo(13f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 9.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(5f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(9f)
            close()
            moveTo(20.94f, 7.9f)
            lineToRelative(-3.09f, 9.31f)
            curveToRelative(-0.27f, 0.91f, -1.0f, 1.55f, -1.87f, 1.73f)
            curveToRelative(0.01f, -0.15f, 0.02f, -0.29f, 0.02f, -0.44f)
            lineTo(16f, 9.5f)
            curveToRelative(0f, -2.77f, -2.07f, -5.07f, -4.74f, -5.44f)
            curveToRelative(0.61f, -0.85f, 1.7f, -1.27f, 2.73f, -0.96f)
            lineToRelative(5.27f, 1.76f)
            curveToRelative(1.3f, 0.4f, 2.05f, 1.79f, 1.68f, 3.04f)
            close()
        }
    }.also { _CardsBlank = it }
