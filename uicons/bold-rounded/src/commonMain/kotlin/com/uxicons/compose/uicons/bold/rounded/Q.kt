package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Q: ImageVector? = null

val Icons.Br.Q: ImageVector
    get() = _Q ?: UXIcon(name = "Q") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(22.56f, 21.44f)
            lineToRelative(-2.13f, -2.13f)
            curveToRelative(0.99f, -1.56f, 1.57f, -3.41f, 1.57f, -5.4f)
            verticalLineToRelative(-3.82f)
            curveTo(21.5f, -3.28f, 2.5f, -3.27f, 2f, 10.09f)
            verticalLineToRelative(3.82f)
            curveToRelative(-0.12f, 8.48f, 10.2f, 13.26f, 16.47f, 7.68f)
            lineToRelative(1.97f, 1.97f)
            curveToRelative(1.39f, 1.38f, 3.5f, -0.73f, 2.12f, -2.12f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-3.86f, 0f, -7f, -3.18f, -7f, -7.09f)
            verticalLineToRelative(-3.82f)
            curveToRelative(0.3f, -9.37f, 13.71f, -9.37f, 14f, 0f)
            verticalLineToRelative(3.82f)
            curveToRelative(0f, 1.15f, -0.28f, 2.24f, -0.76f, 3.21f)
            lineToRelative(-1.68f, -1.68f)
            curveToRelative(-1.39f, -1.38f, -3.5f, 0.73f, -2.12f, 2.12f)
            lineToRelative(1.9f, 1.9f)
            curveToRelative(-1.19f, 0.96f, -2.7f, 1.54f, -4.34f, 1.54f)
            close()
        }
    }.also { _Q = it }
