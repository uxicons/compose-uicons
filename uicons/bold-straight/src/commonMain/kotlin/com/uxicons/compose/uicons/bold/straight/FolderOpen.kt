package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderOpen: ImageVector? = null

val Icons.Bs.FolderOpen: ImageVector
    get() = _FolderOpen ?: UXIcon(name = "FolderOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 10f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-7.15f)
                lineTo(6.35f, 1f)
                horizontalLineToRelative(-2.85f)
                curveTo(1.57f, 1f, 0f, 2.57f, 0f, 4.5f)
                verticalLineToRelative(18.5f)
                horizontalLineToRelative(20.1f)
                lineToRelative(3.9f, -13f)
                horizontalLineToRelative(-3.0f)
                close()
                moveTo(3f, 8f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(2f)
                lineTo(5.92f, 10f)
                lineToRelative(-2.92f, 8.38f)
                verticalLineToRelative(-10.38f)
                close()
                moveTo(17.87f, 20f)
                lineTo(5.61f, 20f)
                lineToRelative(2.44f, -7f)
                horizontalLineToRelative(11.92f)
                lineToRelative(-2.1f, 7f)
                close()
            }
        }.also { _FolderOpen = it}
