package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _W: ImageVector? = null

val Icons.Br.W: ImageVector
    get() = _W ?: UXIcon(name = "W") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.85f, 24f)
            curveToRelative(-0.11f, 0f, -0.22f, -0.0f, -0.34f, -0.01f)
            curveToRelative(-1.89f, -0.15f, -3.36f, -1.5f, -3.67f, -3.37f)
            lineTo(0.02f, 1.72f)
            curveTo(-0.11f, 0.9f, 0.46f, 0.14f, 1.28f, 0.02f)
            curveToRelative(0.81f, -0.13f, 1.58f, 0.44f, 1.71f, 1.26f)
            lineToRelative(2.81f, 18.87f)
            curveToRelative(0.12f, 0.72f, 0.76f, 0.83f, 0.95f, 0.85f)
            curveToRelative(0.19f, 0.02f, 0.83f, 0.01f, 1.08f, -0.71f)
            lineToRelative(2.76f, -8.27f)
            curveToRelative(0.4f, -1.34f, 2.45f, -1.34f, 2.85f, 0f)
            lineToRelative(2.76f, 8.27f)
            curveToRelative(0.24f, 0.72f, 0.89f, 0.73f, 1.07f, 0.71f)
            curveToRelative(0.19f, -0.01f, 0.83f, -0.12f, 0.95f, -0.87f)
            lineTo(21.02f, 1.28f)
            curveToRelative(0.12f, -0.82f, 0.88f, -1.39f, 1.71f, -1.26f)
            curveToRelative(0.82f, 0.12f, 1.38f, 0.89f, 1.26f, 1.71f)
            lineToRelative(-2.81f, 18.87f)
            curveToRelative(-0.31f, 1.89f, -1.79f, 3.25f, -3.68f, 3.4f)
            curveToRelative(-1.91f, 0.15f, -3.56f, -0.96f, -4.16f, -2.75f)
            lineToRelative(-1.33f, -4.0f)
            lineToRelative(-1.33f, 4.0f)
            curveToRelative(-0.56f, 1.69f, -2.07f, 2.77f, -3.82f, 2.77f)
            close()
        }
    }.also { _W = it }
