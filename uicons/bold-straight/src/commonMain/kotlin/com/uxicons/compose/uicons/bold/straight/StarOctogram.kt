package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarOctogram: ImageVector? = null

val Icons.Bs.StarOctogram: ImageVector
    get() = _StarOctogram ?: UXIcon(name = "StarOctogram") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4.24f)
                lineToRelative(1.39f, 1.39f)
                lineToRelative(0.88f, 0.88f)
                horizontalLineToRelative(3.21f)
                verticalLineTo(9.73f)
                lineToRelative(0.88f, 0.88f)
                lineTo(19.76f, 12f)
                lineToRelative(-1.39f, 1.39f)
                lineToRelative(-0.88f, 0.88f)
                verticalLineToRelative(3.21f)
                horizontalLineTo(14.27f)
                lineToRelative(-0.88f, 0.88f)
                lineTo(12f, 19.76f)
                lineToRelative(-1.39f, -1.39f)
                lineToRelative(-0.88f, -0.88f)
                horizontalLineTo(6.51f)
                verticalLineTo(14.27f)
                lineToRelative(-0.88f, -0.88f)
                lineTo(4.24f, 12f)
                lineToRelative(1.39f, -1.39f)
                lineToRelative(0.88f, -0.88f)
                verticalLineTo(6.51f)
                horizontalLineTo(9.73f)
                lineToRelative(0.88f, -0.88f)
                lineTo(12f, 4.24f)
                moveTo(12f, 0f)
                lineTo(8.48f, 3.52f)
                horizontalLineTo(3.52f)
                verticalLineToRelative(4.97f)
                lineTo(0f, 12f)
                lineToRelative(3.52f, 3.52f)
                verticalLineToRelative(4.97f)
                horizontalLineToRelative(4.97f)
                lineTo(12f, 24f)
                lineToRelative(3.52f, -3.52f)
                horizontalLineToRelative(4.97f)
                verticalLineToRelative(-4.97f)
                lineTo(24f, 12f)
                lineTo(20.48f, 8.48f)
                verticalLineTo(3.52f)
                horizontalLineToRelative(-4.97f)
                lineTo(12f, 0f)
                close()
            }
        }.also { _StarOctogram = it}
