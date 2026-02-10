package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderTree: ImageVector? = null

val Icons.Rs.FolderTree: ImageVector
    get() = _FolderTree ?: UXIcon(name = "FolderTree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11f)
                lineTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2.59f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(-3.41f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                lineTo(2f, 5f)
                lineTo(2f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 17f)
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
                lineTo(3f, 18f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(2f, 7f)
                lineTo(10f, 7f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(14f)
                close()
                moveTo(12f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.59f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(3.41f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                lineTo(12f, 9f)
                lineTo(12f, 3f)
                close()
                moveTo(12f, 16f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.59f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(3.41f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                lineTo(12f, 22f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _FolderTree = it}
