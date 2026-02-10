package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarOctogram: ImageVector? = null

val Icons.Ts.StarOctogram: ImageVector
    get() = _StarOctogram ?: UXIcon(name = "StarOctogram") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 24f)
                lineToRelative(-3.52f, -3.52f)
                lineTo(3.52f, 20.48f)
                verticalLineToRelative(-4.97f)
                lineToRelative(-3.52f, -3.52f)
                lineToRelative(3.52f, -3.52f)
                lineTo(3.52f, 3.52f)
                horizontalLineToRelative(4.97f)
                lineToRelative(3.52f, -3.52f)
                lineToRelative(3.52f, 3.52f)
                horizontalLineToRelative(4.97f)
                verticalLineToRelative(4.97f)
                lineToRelative(3.52f, 3.52f)
                lineToRelative(-3.52f, 3.52f)
                verticalLineToRelative(4.97f)
                horizontalLineToRelative(-4.97f)
                lineToRelative(-3.52f, 3.52f)
                close()
                moveTo(4.51f, 19.48f)
                horizontalLineToRelative(4.38f)
                lineToRelative(3.1f, 3.1f)
                lineToRelative(3.1f, -3.1f)
                horizontalLineToRelative(4.38f)
                verticalLineToRelative(-4.38f)
                lineToRelative(3.1f, -3.1f)
                lineToRelative(-3.1f, -3.1f)
                verticalLineToRelative(-4.38f)
                horizontalLineToRelative(-4.38f)
                lineToRelative(-3.1f, -3.1f)
                lineToRelative(-3.1f, 3.1f)
                horizontalLineToRelative(-4.38f)
                verticalLineToRelative(4.38f)
                lineToRelative(-3.1f, 3.1f)
                lineToRelative(3.1f, 3.1f)
                verticalLineToRelative(4.38f)
                close()
            }
        }.also { _StarOctogram = it}
