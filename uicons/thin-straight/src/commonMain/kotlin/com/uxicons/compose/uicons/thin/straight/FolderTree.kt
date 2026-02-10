package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderTree: ImageVector? = null

val Icons.Ts.FolderTree: ImageVector
    get() = _FolderTree ?: UXIcon(name = "FolderTree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.29f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(-3.71f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                lineTo(1f, 5f)
                lineTo(1f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 16.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-3.29f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(-3.71f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.5f)
                lineTo(2.5f, 18f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(1f, 6f)
                lineTo(10f, 6f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(14f)
                close()
                moveTo(11f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.29f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(3.71f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                lineTo(11f, 10f)
                lineTo(11f, 2.5f)
                close()
                moveTo(11f, 15.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3.29f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(3.71f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                lineTo(11f, 23f)
                verticalLineToRelative(-7.5f)
                close()
            }
        }.also { _FolderTree = it}
