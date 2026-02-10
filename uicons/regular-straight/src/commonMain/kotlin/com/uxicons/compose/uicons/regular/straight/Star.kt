package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Star: ImageVector? = null

val Icons.Rs.Star: ImageVector
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
                moveTo(12f, 15.35f)
                lineToRelative(3.66f, 2.69f)
                lineToRelative(-1.4f, -4.34f)
                lineTo(17.94f, 11f)
                horizontalLineTo(13.39f)
                lineTo(12f, 6.67f)
                lineTo(10.61f, 11f)
                horizontalLineTo(6.06f)
                lineToRelative(3.68f, 2.69f)
                lineToRelative(-1.4f, 4.34f)
                close()
            }
        }.also { _Star = it}
