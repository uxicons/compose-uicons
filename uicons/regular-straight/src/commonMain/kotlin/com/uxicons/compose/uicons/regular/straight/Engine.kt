package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Engine: ImageVector? = null

val Icons.Rs.Engine: ImageVector
    get() = _Engine ?: UXIcon(name = "Engine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                lineTo(20f, 1f)
                horizontalLineToRelative(-10f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3.97f)
                lineToRelative(-2.5f, 3f)
                horizontalLineToRelative(-2.53f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                lineTo(0f, 9f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3.41f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(12.41f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-11f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(22f, 18f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-9.59f)
                lineToRelative(-2.41f, -2.41f)
                verticalLineToRelative(-6.59f)
                horizontalLineToRelative(1.47f)
                lineToRelative(2.5f, -3f)
                horizontalLineToRelative(8.03f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _Engine = it}
