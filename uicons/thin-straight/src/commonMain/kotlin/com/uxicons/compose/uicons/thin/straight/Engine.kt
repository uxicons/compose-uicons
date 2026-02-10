package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Engine: ImageVector? = null

val Icons.Ts.Engine: ImageVector
    get() = _Engine ?: UXIcon(name = "Engine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6.23f)
                lineToRelative(-2.5f, 3f)
                horizontalLineToRelative(-2.27f)
                verticalLineToRelative(5f)
                lineTo(1f, 13f)
                verticalLineToRelative(-5f)
                lineTo(0f, 8f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4.71f)
                lineToRelative(3.29f, 3.29f)
                horizontalLineToRelative(13.71f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(23f, 19f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                lineTo(7.71f, 21f)
                lineToRelative(-2.71f, -2.71f)
                verticalLineToRelative(-9.29f)
                horizontalLineToRelative(1.73f)
                lineToRelative(2.5f, -3f)
                horizontalLineToRelative(10.77f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(10f)
                close()
            }
        }.also { _Engine = it}
