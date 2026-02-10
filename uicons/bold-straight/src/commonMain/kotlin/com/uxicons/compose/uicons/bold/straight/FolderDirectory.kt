package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderDirectory: ImageVector? = null

val Icons.Bs.FolderDirectory: ImageVector
    get() = _FolderDirectory ?: UXIcon(name = "FolderDirectory") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 6.5f)
                lineTo(24f, 23f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(5f)
                lineTo(21f, 8f)
                lineTo(3f, 8f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(3.31f)
                curveToRelative(0.34f, 1.11f, 0.96f, 2.15f, 1.86f, 3f)
                lineTo(0f, 23f)
                lineTo(0f, 4.5f)
                curveTo(0f, 2.57f, 1.57f, 1f, 3.5f, 1f)
                horizontalLineToRelative(4.85f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(11f, 18f)
                curveToRelative(0f, -0.97f, 0.8f, -2.03f, 2.57f, -3.43f)
                lineToRelative(2.43f, 2.43f)
                verticalLineToRelative(-5.91f)
                curveToRelative(0f, -0.6f, -0.49f, -1.09f, -1.09f, -1.09f)
                horizontalLineToRelative(-5.91f)
                lineToRelative(2.43f, 2.43f)
                curveToRelative(-1.93f, 1.56f, -3.43f, 3.34f, -3.43f, 5.57f)
                curveToRelative(0f, 2.01f, 1.47f, 5f, 5.5f, 5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-2.21f, 0f, -2.48f, -1.41f, -2.5f, -2f)
                close()
            }
        }.also { _FolderDirectory = it}
