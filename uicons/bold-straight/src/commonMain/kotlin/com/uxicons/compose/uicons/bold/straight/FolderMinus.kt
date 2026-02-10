package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderMinus: ImageVector? = null

val Icons.Bs.FolderMinus: ImageVector
    get() = _FolderMinus ?: UXIcon(name = "FolderMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(8f, 12.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                lineTo(8f, 15.5f)
                verticalLineToRelative(-3f)
                close()
                moveTo(24f, 6.5f)
                lineTo(24f, 23f)
                lineTo(0f, 23f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.57f, 1.57f, 1f, 3.5f, 1f)
                horizontalLineToRelative(4.85f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 20f)
                lineTo(21f, 8f)
                lineTo(3f, 8f)
                verticalLineToRelative(12f)
                lineTo(21f, 20f)
                close()
            }
        }.also { _FolderMinus = it}
