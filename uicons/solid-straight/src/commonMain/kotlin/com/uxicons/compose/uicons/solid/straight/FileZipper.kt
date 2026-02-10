package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileZipper: ImageVector? = null

val Icons.Ss.FileZipper: ImageVector
    get() = _FileZipper ?: UXIcon(name = "FileZipper") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(15f, 7f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                lineTo(7f, 0f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                lineTo(22f, 7f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(7f, 3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(7f, 6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(7f, 9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(10f, 18f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                lineToRelative(1f, -5f)
                horizontalLineToRelative(2f)
                lineToRelative(1f, 5f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _FileZipper = it}
