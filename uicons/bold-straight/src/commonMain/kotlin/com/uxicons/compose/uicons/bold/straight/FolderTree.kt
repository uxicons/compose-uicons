package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderTree: ImageVector? = null

val Icons.Bs.FolderTree: ImageVector
    get() = _FolderTree ?: UXIcon(name = "FolderTree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-2.55f)
                lineToRelative(-1.5f, -1f)
                horizontalLineToRelative(-2.95f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                lineTo(3f, 5f)
                lineTo(3f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 17.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(6.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-2.55f)
                lineToRelative(-1.5f, -1f)
                horizontalLineToRelative(-2.95f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(1.5f)
                lineTo(3.5f, 18f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                lineTo(3f, 8f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14f)
                close()
                moveTo(13f, 3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.05f)
                lineToRelative(1.5f, 1f)
                horizontalLineToRelative(3.45f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                lineTo(13f, 8f)
                lineTo(13f, 3.5f)
                close()
                moveTo(13f, 16.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(2.05f)
                lineToRelative(1.5f, 1f)
                horizontalLineToRelative(3.45f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                lineTo(13f, 21f)
                verticalLineToRelative(-4.5f)
                close()
            }
        }.also { _FolderTree = it}
