package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TextBox: ImageVector? = null

val Icons.Bs.TextBox: ImageVector
    get() = _TextBox ?: UXIcon(name = "TextBox") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                lineTo(24f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                lineTo(6f, 1f)
                lineTo(6f, 0f)
                lineTo(2f, 0f)
                curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(12f)
                lineTo(0f, 18f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 6f)
                horizontalLineToRelative(1f)
                close()
                moveTo(20f, 18f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                lineTo(6f, 20f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                lineTo(4f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(12f)
                close()
                moveTo(8f, 7f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _TextBox = it}
