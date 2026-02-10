package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _H1: ImageVector? = null

val Icons.Ts.H1: ImageVector
    get() = _H1 ?: UXIcon(name = "H1") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-7.5f)
                lineTo(3f, 12.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(-1f)
                lineTo(2f, 4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(21.2f, 4f)
                lineToRelative(-3.56f, 3.65f)
                lineToRelative(0.72f, 0.7f)
                lineToRelative(2.64f, -2.71f)
                verticalLineToRelative(14.36f)
                horizontalLineToRelative(1f)
                lineTo(22f, 4f)
                horizontalLineToRelative(-0.8f)
                close()
            }
        }.also { _H1 = it}
