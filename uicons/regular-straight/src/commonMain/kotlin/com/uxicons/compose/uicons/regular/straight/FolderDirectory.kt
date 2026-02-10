package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderDirectory: ImageVector? = null

val Icons.Rs.FolderDirectory: ImageVector
    get() = _FolderDirectory ?: UXIcon(name = "FolderDirectory") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                lineTo(12.24f, 3f)
                lineTo(8.24f, 1f)
                lineTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                lineTo(0f, 23f)
                lineTo(8.83f, 23f)
                curveToRelative(-0.58f, -0.6f, -1.01f, -1.29f, -1.31f, -2f)
                lineTo(2f, 21f)
                lineTo(2f, 9f)
                lineTo(22f, 9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                lineTo(24f, 6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 7f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(7.76f, 3f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.24f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                lineTo(2f, 7f)
                close()
                moveTo(16f, 13f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3.51f)
                curveToRelative(-2.11f, 1.62f, -3f, 2.82f, -3f, 4.01f)
                curveToRelative(0.01f, 0.41f, 0.19f, 2.5f, 3f, 2.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-3.96f, 0f, -5f, -2.94f, -5f, -4.5f)
                curveToRelative(0f, -2.1f, 1.43f, -3.77f, 3.66f, -5.5f)
                horizontalLineToRelative(-3.66f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(5f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
            }
        }.also { _FolderDirectory = it}
