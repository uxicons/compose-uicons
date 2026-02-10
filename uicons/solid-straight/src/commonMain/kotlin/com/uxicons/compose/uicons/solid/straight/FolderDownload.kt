package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderDownload: ImageVector? = null

val Icons.Ss.FolderDownload: ImageVector
    get() = _FolderDownload ?: UXIcon(name = "FolderDownload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 23f)
                lineTo(24f, 23f)
                lineTo(24f, 9f)
                lineTo(0f, 9f)
                verticalLineToRelative(14f)
                close()
                moveTo(8.71f, 15.71f)
                lineToRelative(2.29f, 2.29f)
                verticalLineToRelative(-7.0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7.01f)
                lineToRelative(2.29f, -2.3f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.19f, -1.41f, -0.58f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(24f, 6f)
                verticalLineToRelative(1f)
                lineTo(0f, 7f)
                verticalLineToRelative(-3f)
                curveTo(0f, 2.35f, 1.35f, 1f, 3f, 1f)
                horizontalLineToRelative(5.24f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(8.76f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                close()
            }
        }.also { _FolderDownload = it}
