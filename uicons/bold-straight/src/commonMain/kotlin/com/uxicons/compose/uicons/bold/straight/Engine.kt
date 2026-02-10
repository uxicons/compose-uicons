package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Engine: ImageVector? = null

val Icons.Bs.Engine: ImageVector
    get() = _Engine ?: UXIcon(name = "Engine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                lineTo(19f, 1f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2.7f)
                lineToRelative(-2.5f, 3f)
                horizontalLineToRelative(-2.8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                lineTo(0f, 9f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.12f)
                lineToRelative(3.88f, 3.88f)
                horizontalLineToRelative(12.12f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(21f, 17f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7.88f)
                lineToRelative(-2.12f, -2.12f)
                verticalLineToRelative(-4.88f)
                horizontalLineToRelative(1.2f)
                lineToRelative(2.5f, -3f)
                horizontalLineToRelative(6.3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                close()
            }
        }.also { _Engine = it}
