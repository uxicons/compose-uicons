package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Star: ImageVector? = null

val Icons.Bs.Star: ImageVector
    get() = _Star ?: UXIcon(name = "Star") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 6.99f)
                lineTo(16.27f, 6.99f)
                lineTo(14.05f, 0.03f)
                lineTo(9.95f, 0.03f)
                lineTo(7.73f, 6.99f)
                lineTo(1f, 6.99f)
                lineTo(0f, 11.45f)
                lineToRelative(5.1f, 3.73f)
                lineToRelative(-2.53f, 7.86f)
                lineToRelative(4.33f, 0.98f)
                lineTo(12f, 20.26f)
                lineToRelative(5.11f, 3.77f)
                lineToRelative(4.32f, -0.99f)
                lineTo(18.9f, 15.19f)
                lineTo(24f, 11.45f)
                close()
                moveTo(15.38f, 14.04f)
                lineTo(17.48f, 20.57f)
                lineTo(12f, 16.53f)
                lineTo(6.51f, 20.57f)
                lineToRelative(2.1f, -6.53f)
                lineTo(3.09f, 9.99f)
                lineTo(9.92f, 9.99f)
                lineTo(12f, 3.48f)
                lineToRelative(2.08f, 6.51f)
                horizontalLineToRelative(6.82f)
                close()
            }
        }.also { _Star = it}
