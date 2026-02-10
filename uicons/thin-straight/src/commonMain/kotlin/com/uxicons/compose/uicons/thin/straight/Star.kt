package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Star: ImageVector? = null

val Icons.Ts.Star: ImageVector
    get() = _Star ?: UXIcon(name = "Star") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24.06f, 9.03f)
                lineTo(14.85f, 9.03f)
                lineTo(12f, 0.16f)
                lineToRelative(-2.85f, 8.88f)
                lineTo(-0.06f, 9.03f)
                lineToRelative(7.46f, 5.45f)
                lineToRelative(-2.86f, 8.86f)
                lineToRelative(7.47f, -5.49f)
                lineToRelative(7.47f, 5.49f)
                lineToRelative(-2.86f, -8.86f)
                lineToRelative(7.46f, -5.45f)
                close()
                moveTo(17.56f, 20.71f)
                lineToRelative(-5.56f, -4.09f)
                lineToRelative(-5.56f, 4.09f)
                lineToRelative(2.13f, -6.6f)
                lineTo(3f, 10.03f)
                horizontalLineToRelative(6.88f)
                lineToRelative(2.12f, -6.61f)
                lineToRelative(2.12f, 6.61f)
                horizontalLineToRelative(6.88f)
                lineToRelative(-5.57f, 4.07f)
                lineToRelative(2.13f, 6.6f)
                close()
            }
        }.also { _Star = it}
