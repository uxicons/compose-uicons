package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderDownload: ImageVector? = null

val Icons.Rs.FolderDownload: ImageVector
    get() = _FolderDownload ?: UXIcon(name = "FolderDownload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 3f)
                lineTo(12.24f, 3f)
                lineTo(8.24f, 1f)
                lineTo(3f, 1f)
                curveTo(1.35f, 1f, 0f, 2.35f, 0f, 4f)
                lineTo(0f, 23f)
                lineTo(8.14f, 23f)
                lineToRelative(-2f, -2f)
                lineTo(2f, 21f)
                lineTo(2f, 9f)
                lineTo(22f, 9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-4.14f)
                lineToRelative(-2f, 2f)
                horizontalLineToRelative(8.14f)
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
                moveTo(16.7f, 19.12f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.38f, 0.38f, -0.88f, 0.58f, -1.41f, 0.58f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.53f, 0f, -1.03f, -0.21f, -1.41f, -0.58f)
                lineToRelative(-3.3f, -3.3f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.29f, 2.29f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8.01f)
                lineToRelative(2.29f, -2.3f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _FolderDownload = it}
