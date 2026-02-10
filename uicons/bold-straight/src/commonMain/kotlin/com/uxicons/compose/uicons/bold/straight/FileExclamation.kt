package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileExclamation: ImageVector? = null

val Icons.Bs.FileExclamation: ImageVector
    get() = _FileExclamation ?: UXIcon(name = "FileExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.38f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                lineTo(22f, 5.67f)
                lineTo(16.38f, 0f)
                close()
                moveTo(5f, 21f)
                lineTo(5f, 3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(13f)
                lineTo(5f, 21f)
                close()
                moveTo(10.5f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                close()
                moveTo(10.5f, 17f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _FileExclamation = it}
