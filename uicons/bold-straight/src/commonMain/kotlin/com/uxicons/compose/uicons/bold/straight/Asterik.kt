package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Asterik: ImageVector? = null

val Icons.Bs.Asterik: ImageVector
    get() = _Asterik ?: UXIcon(name = "Asterik") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 24f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-4.66f)
                lineToRelative(-3.64f, 2.35f)
                lineToRelative(-4.33f, -6.72f)
                lineToRelative(4.59f, -2.96f)
                lineToRelative(-4.59f, -2.96f)
                lineToRelative(4.33f, -6.72f)
                lineToRelative(3.64f, 2.35f)
                verticalLineToRelative(-4.66f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4.66f)
                lineToRelative(3.64f, -2.35f)
                lineToRelative(4.33f, 6.72f)
                lineToRelative(-4.59f, 2.96f)
                lineToRelative(4.59f, 2.96f)
                lineToRelative(-4.33f, 6.72f)
                lineToRelative(-3.64f, -2.35f)
                close()
                moveTo(11f, 21f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-7.17f)
                lineToRelative(5.74f, 3.7f)
                lineToRelative(1.08f, -1.68f)
                lineToRelative(-5.98f, -3.85f)
                lineToRelative(5.98f, -3.85f)
                lineToRelative(-1.08f, -1.68f)
                lineToRelative(-5.74f, 3.7f)
                verticalLineToRelative(-7.17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(7.17f)
                lineToRelative(-5.74f, -3.7f)
                lineToRelative(-1.08f, 1.68f)
                lineToRelative(5.98f, 3.85f)
                lineToRelative(-5.98f, 3.85f)
                lineToRelative(1.08f, 1.68f)
                lineToRelative(5.74f, -3.7f)
                close()
            }
        }.also { _Asterik = it}
