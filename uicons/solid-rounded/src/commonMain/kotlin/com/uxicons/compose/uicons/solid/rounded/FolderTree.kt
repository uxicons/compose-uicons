package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderTree: ImageVector? = null

val Icons.Sr.FolderTree: ImageVector
    get() = _FolderTree ?: UXIcon(name = "FolderTree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 8f)
                verticalLineToRelative(-1f)
                horizontalLineTo(2f)
                verticalLineTo(15f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2.59f)
                curveToRelative(0.53f, 0f, 1.04f, 0.21f, 1.41f, 0.59f)
                lineToRelative(1.41f, 1.41f)
                horizontalLineToRelative(2.59f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineTo(13f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-1f)
                horizontalLineTo(5f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineTo(1f)
                curveTo(0.01f, -0.31f, 2.0f, -0.31f, 2f, 1f)
                verticalLineTo(5f)
                horizontalLineTo(10f)
                verticalLineTo(3f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(2.59f)
                curveToRelative(0.53f, 0f, 1.04f, 0.21f, 1.41f, 0.59f)
                lineToRelative(1.41f, 1.41f)
                horizontalLineToRelative(2.59f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineTo(13f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                close()
            }
        }.also { _FolderTree = it}
