package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookOpenReader: ImageVector? = null

val Icons.Br.BookOpenReader: ImageVector
    get() = _BookOpenReader ?: UXIcon(name = "BookOpenReader") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.5f, 4.5f)
            curveToRelative(0.15f, -5.93f, 8.85f, -5.93f, 9f, 0f)
            curveToRelative(-0.15f, 5.93f, -8.85f, 5.93f, -9f, 0f)
            close()
            moveTo(24f, 15.5f)
            verticalLineToRelative(1.79f)
            curveToRelative(0f, 2.66f, -1.9f, 4.93f, -4.52f, 5.41f)
            lineToRelative(-5.76f, 1.14f)
            curveToRelative(-1.14f, 0.21f, -2.29f, 0.21f, -3.42f, 0.0f)
            lineToRelative(-5.81f, -1.15f)
            curveToRelative(-2.6f, -0.47f, -4.49f, -2.75f, -4.49f, -5.41f)
            verticalLineToRelative(-1.79f)
            curveToRelative(-0.08f, -3.33f, 3.22f, -6.09f, 6.48f, -5.41f)
            lineToRelative(3.36f, 0.7f)
            curveToRelative(0.82f, 0.15f, 1.56f, 0.53f, 2.16f, 1.06f)
            curveToRelative(0.6f, -0.54f, 1.35f, -0.92f, 2.19f, -1.07f)
            lineToRelative(3.28f, -0.69f)
            curveToRelative(1.65f, -0.3f, 3.29f, 0.13f, 4.55f, 1.18f)
            curveToRelative(1.26f, 1.05f, 1.98f, 2.59f, 1.98f, 4.22f)
            close()
            moveTo(10.5f, 15.21f)
            curveToRelative(0f, -0.73f, -0.52f, -1.35f, -1.23f, -1.48f)
            lineToRelative(-3.36f, -0.7f)
            curveToRelative(-0.71f, -0.13f, -1.44f, 0.07f, -2.01f, 0.55f)
            curveToRelative(-0.57f, 0.48f, -0.9f, 1.18f, -0.9f, 1.92f)
            verticalLineToRelative(1.79f)
            curveToRelative(0f, 1.21f, 0.86f, 2.24f, 2.05f, 2.46f)
            lineToRelative(5.45f, 1.08f)
            verticalLineToRelative(-5.62f)
            close()
            moveTo(21f, 15.5f)
            curveToRelative(0f, -0.74f, -0.33f, -1.44f, -0.9f, -1.92f)
            curveToRelative(-0.57f, -0.48f, -1.32f, -0.67f, -2.05f, -0.54f)
            lineToRelative(-3.28f, 0.69f)
            curveToRelative(-0.75f, 0.14f, -1.27f, 0.76f, -1.27f, 1.48f)
            verticalLineToRelative(5.62f)
            lineToRelative(5.42f, -1.07f)
            curveToRelative(1.21f, -0.22f, 2.08f, -1.25f, 2.08f, -2.46f)
            verticalLineToRelative(-1.79f)
            close()
        }
    }.also { _BookOpenReader = it }
