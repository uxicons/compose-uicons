package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderTree: ImageVector? = null

val Icons.Ss.FolderTree: ImageVector
    get() = _FolderTree ?: UXIcon(name = "FolderTree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                verticalLineTo(5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2.59f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(-3.41f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineTo(2f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                verticalLineTo(17f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2.59f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(-3.41f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineTo(3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineTo(7f)
                horizontalLineTo(10f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(14f)
                close()
            }
        }.also { _FolderTree = it}
