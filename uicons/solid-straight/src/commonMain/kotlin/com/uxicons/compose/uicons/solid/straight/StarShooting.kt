package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarShooting: ImageVector? = null

val Icons.Ss.StarShooting: ImageVector
    get() = _StarShooting ?: UXIcon(name = "StarShooting") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.96f, 1.45f)
                lineToRelative(-10.56f, 10.56f)
                lineToRelative(-1.41f, -1.41f)
                lineTo(22.55f, 0.04f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(13.96f, 3.45f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-5.56f, 5.56f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(5.56f, -5.56f)
                close()
                moveTo(14.98f, 15.6f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(5.56f, -5.56f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-5.56f, 5.56f)
                close()
                moveTo(6.5f, 11.52f)
                horizontalLineToRelative(-0.97f)
                lineToRelative(-1.18f, 4.5f)
                lineTo(0f, 16.02f)
                verticalLineToRelative(0.92f)
                lineToRelative(3.32f, 1.85f)
                lineToRelative(-1.3f, 4.08f)
                lineToRelative(0.72f, 0.54f)
                lineToRelative(3.27f, -2.53f)
                lineToRelative(3.26f, 2.52f)
                lineToRelative(0.75f, -0.52f)
                lineToRelative(-1.33f, -4.03f)
                lineToRelative(3.3f, -1.91f)
                verticalLineToRelative(-0.92f)
                horizontalLineToRelative(-4.33f)
                lineToRelative(-1.18f, -4.5f)
                close()
            }
        }.also { _StarShooting = it}
