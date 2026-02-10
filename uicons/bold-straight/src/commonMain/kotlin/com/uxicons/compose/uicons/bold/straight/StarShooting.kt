package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarShooting: ImageVector? = null

val Icons.Bs.StarShooting: ImageVector
    get() = _StarShooting ?: UXIcon(name = "StarShooting") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.48f, 15f)
                horizontalLineToRelative(4.52f)
                verticalLineToRelative(1.08f)
                lineToRelative(-3.31f, 2.26f)
                lineToRelative(1.38f, 4.31f)
                lineToRelative(-0.89f, 0.62f)
                lineToRelative(-3.66f, -2.53f)
                lineToRelative(-3.61f, 2.53f)
                lineToRelative(-0.85f, -0.64f)
                lineToRelative(1.28f, -4.36f)
                lineToRelative(-3.34f, -2.18f)
                verticalLineToRelative(-1.09f)
                horizontalLineToRelative(4.55f)
                lineToRelative(1.39f, -4.73f)
                horizontalLineToRelative(1.15f)
                lineToRelative(1.39f, 4.73f)
                close()
                moveTo(21.94f, -0.06f)
                lineToRelative(-10f, 10f)
                lineToRelative(2.12f, 2.12f)
                lineTo(24.06f, 2.06f)
                lineTo(21.94f, -0.06f)
                close()
                moveTo(14.06f, 4.06f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-5f, 5f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(5f, -5f)
                close()
                moveTo(14.94f, 14.94f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(5f, -5f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-5f, 5f)
                close()
            }
        }.also { _StarShooting = it}
