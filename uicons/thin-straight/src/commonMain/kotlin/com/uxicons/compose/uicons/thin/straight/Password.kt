package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Password: ImageVector? = null

val Icons.Ts.Password: ImageVector
    get() = _Password ?: UXIcon(name = "Password") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 16f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1f)
                close()
                moveTo(9.72f, 12.99f)
                lineToRelative(2.28f, -2.28f)
                lineToRelative(2.28f, 2.28f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-2.28f, -2.28f)
                lineToRelative(2.28f, -2.28f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-2.28f, 2.28f)
                lineToRelative(-2.28f, -2.28f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(2.28f, 2.28f)
                lineToRelative(-2.28f, 2.28f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(17f, 17f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1f)
                close()
                moveTo(23.01f, 7.7f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-2.3f, 2.3f)
                lineToRelative(-2.3f, -2.3f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(2.3f, 2.3f)
                lineToRelative(-2.3f, 2.3f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(2.3f, -2.3f)
                lineToRelative(2.3f, 2.3f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-2.3f, -2.3f)
                lineToRelative(2.3f, -2.3f)
                close()
                moveTo(1f, 17f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                lineTo(1f, 16f)
                verticalLineToRelative(1f)
                close()
                moveTo(6.3f, 6.99f)
                lineToRelative(-2.3f, 2.3f)
                lineToRelative(-2.3f, -2.3f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(2.3f, 2.3f)
                lineToRelative(-2.3f, 2.3f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(2.3f, -2.3f)
                lineToRelative(2.3f, 2.3f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-2.3f, -2.3f)
                lineToRelative(2.3f, -2.3f)
                lineToRelative(-0.71f, -0.71f)
                close()
            }
        }.also { _Password = it}
