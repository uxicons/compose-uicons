package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarShooting: ImageVector? = null

val Icons.Ts.StarShooting: ImageVector
    get() = _StarShooting ?: UXIcon(name = "StarShooting") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.95f, 0.76f)
                lineToRelative(-11.26f, 11.26f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(23.24f, 0.05f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(13.95f, 2.76f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-6.26f, 6.26f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(6.26f, -6.26f)
                close()
                moveTo(14.98f, 16.31f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(6.26f, -6.26f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-6.26f, 6.26f)
                close()
                moveTo(7.67f, 16.02f)
                horizontalLineToRelative(4.33f)
                verticalLineToRelative(0.92f)
                lineToRelative(-3.3f, 1.91f)
                lineToRelative(1.32f, 4.03f)
                lineToRelative(-0.75f, 0.53f)
                lineToRelative(-3.26f, -2.52f)
                lineToRelative(-3.27f, 2.53f)
                lineToRelative(-0.72f, -0.54f)
                lineToRelative(1.3f, -4.08f)
                lineToRelative(-3.32f, -1.85f)
                verticalLineToRelative(-0.92f)
                horizontalLineToRelative(4.35f)
                lineToRelative(1.18f, -4.5f)
                horizontalLineToRelative(0.97f)
                lineToRelative(1.18f, 4.5f)
                close()
                moveTo(9.86f, 17.02f)
                horizontalLineToRelative(-2.96f)
                lineToRelative(-0.89f, -3.4f)
                lineToRelative(-0.89f, 3.4f)
                horizontalLineToRelative(-2.93f)
                lineToRelative(2.33f, 1.3f)
                lineToRelative(-1.04f, 3.25f)
                lineToRelative(2.53f, -1.96f)
                lineToRelative(2.53f, 1.95f)
                lineToRelative(-1.05f, -3.18f)
                lineToRelative(2.36f, -1.37f)
                close()
            }
        }.also { _StarShooting = it}
