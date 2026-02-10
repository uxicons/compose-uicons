package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Star: ImageVector? = null

val Icons.Ss.Star: ImageVector
    get() = _Star ?: UXIcon(name = "Star") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.47f, 23.32f)
                lineTo(12f, 17.83f)
                lineTo(4.53f, 23.32f)
                lineTo(7.4f, 14.45f)
                lineTo(-0.06f, 9f)
                horizontalLineTo(9.15f)
                lineTo(12f, 0.12f)
                lineTo(14.85f, 9f)
                horizontalLineToRelative(9.21f)
                lineTo(16.6f, 14.45f)
                close()
            }
        }.also { _Star = it}
