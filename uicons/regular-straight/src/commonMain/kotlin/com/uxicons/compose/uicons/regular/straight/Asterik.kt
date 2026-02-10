package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Asterik: ImageVector? = null

val Icons.Rs.Asterik: ImageVector
    get() = _Asterik ?: UXIcon(name = "Asterik") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 24f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-4.9f)
                lineToRelative(-3.85f, 2.4f)
                lineToRelative(-4.14f, -6.64f)
                lineToRelative(4.58f, -2.85f)
                lineToRelative(-4.58f, -2.85f)
                lineToRelative(4.14f, -6.64f)
                lineToRelative(3.85f, 2.4f)
                verticalLineToRelative(-4.9f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(4.9f)
                lineToRelative(3.85f, -2.4f)
                lineToRelative(4.14f, 6.65f)
                lineToRelative(-4.58f, 2.85f)
                lineToRelative(4.58f, 2.85f)
                lineToRelative(-4.14f, 6.64f)
                lineToRelative(-3.85f, -2.4f)
                close()
                moveTo(10f, 22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-6.5f)
                lineToRelative(5.21f, 3.25f)
                lineToRelative(2.02f, -3.25f)
                lineToRelative(-5.61f, -3.5f)
                lineToRelative(5.61f, -3.5f)
                lineToRelative(-2.02f, -3.25f)
                lineToRelative(-5.21f, 3.25f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(6.5f)
                lineToRelative(-5.21f, -3.25f)
                lineToRelative(-2.02f, 3.25f)
                lineToRelative(5.61f, 3.5f)
                lineToRelative(-5.61f, 3.5f)
                lineToRelative(2.02f, 3.25f)
                lineToRelative(5.21f, -3.25f)
                close()
            }
        }.also { _Asterik = it}
