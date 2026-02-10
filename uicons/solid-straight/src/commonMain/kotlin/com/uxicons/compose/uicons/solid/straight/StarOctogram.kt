package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarOctogram: ImageVector? = null

val Icons.Ss.StarOctogram: ImageVector
    get() = _StarOctogram ?: UXIcon(name = "StarOctogram") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                lineToRelative(3.52f, 3.52f)
                lineToRelative(4.97f, 0f)
                lineToRelative(0f, 4.97f)
                lineToRelative(3.52f, 3.52f)
                lineToRelative(-3.52f, 3.52f)
                lineToRelative(0f, 4.97f)
                lineToRelative(-4.97f, 0f)
                lineToRelative(-3.52f, 3.52f)
                lineToRelative(-3.52f, -3.52f)
                lineToRelative(-4.97f, 0f)
                lineToRelative(0f, -4.97f)
                lineToRelative(-3.52f, -3.52f)
                lineToRelative(3.52f, -3.52f)
                lineToRelative(0f, -4.97f)
                lineToRelative(4.97f, 0f)
                lineToRelative(3.52f, -3.52f)
                close()
            }
        }.also { _StarOctogram = it}
