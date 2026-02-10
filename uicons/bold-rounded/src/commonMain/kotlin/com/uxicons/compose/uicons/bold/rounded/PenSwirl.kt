package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSwirl: ImageVector? = null

val Icons.Br.PenSwirl: ImageVector
    get() = _PenSwirl ?: UXIcon(name = "PenSwirl") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9.31f, 23.23f)
            curveToRelative(-0.27f, 0.49f, -0.79f, 0.77f, -1.31f, 0.77f)
            curveToRelative(-0.25f, 0f, -0.5f, -0.06f, -0.73f, -0.19f)
            curveTo(2.65f, 21.24f, 0f, 16.94f, 0f, 12f)
            curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
            curveToRelative(0.57f, 0f, 1.15f, 0.04f, 1.71f, 0.12f)
            curveToRelative(0.82f, 0.12f, 1.39f, 0.88f, 1.27f, 1.7f)
            curveToRelative(-0.12f, 0.82f, -0.88f, 1.4f, -1.7f, 1.27f)
            curveToRelative(-0.42f, -0.06f, -0.85f, -0.09f, -1.29f, -0.09f)
            curveTo(7.04f, 3f, 3f, 7.04f, 3f, 12f)
            curveToRelative(0f, 3.82f, 2.09f, 7.17f, 5.73f, 9.19f)
            curveToRelative(0.72f, 0.4f, 0.98f, 1.31f, 0.58f, 2.04f)
            close()
            moveTo(22.18f, 9.02f)
            curveToRelative(-0.82f, 0.12f, -1.39f, 0.88f, -1.27f, 1.7f)
            curveToRelative(0.06f, 0.42f, 0.09f, 0.85f, 0.09f, 1.29f)
            curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
            curveToRelative(-2.6f, 0f, -4.79f, -2.03f, -4.99f, -4.61f)
            curveToRelative(-0.06f, -0.82f, -0.79f, -1.45f, -1.61f, -1.38f)
            curveToRelative(-0.83f, 0.06f, -1.45f, 0.78f, -1.38f, 1.61f)
            curveToRelative(0.32f, 4.14f, 3.82f, 7.39f, 7.98f, 7.39f)
            curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
            curveToRelative(0f, -0.57f, -0.04f, -1.15f, -0.12f, -1.71f)
            curveToRelative(-0.12f, -0.82f, -0.88f, -1.4f, -1.7f, -1.27f)
            close()
            moveTo(13.03f, 9.54f)
            verticalLineToRelative(0.95f)
            curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(0.95f)
            curveToRelative(1.15f, 0f, 2.25f, -0.46f, 3.06f, -1.27f)
            lineToRelative(5.71f, -5.71f)
            curveToRelative(0.85f, -0.85f, 1.01f, -2.24f, 0.25f, -3.17f)
            curveToRelative(-0.88f, -1.07f, -2.46f, -1.13f, -3.41f, -0.18f)
            lineToRelative(-5.81f, 5.81f)
            curveToRelative(-0.81f, 0.81f, -1.27f, 1.92f, -1.27f, 3.06f)
            close()
        }
    }.also { _PenSwirl = it }
