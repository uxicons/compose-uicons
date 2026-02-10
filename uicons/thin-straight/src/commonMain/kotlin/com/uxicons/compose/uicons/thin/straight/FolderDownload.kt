package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderDownload: ImageVector? = null

val Icons.Ts.FolderDownload: ImageVector
    get() = _FolderDownload ?: UXIcon(name = "FolderDownload") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 3f)
                lineTo(12.12f, 3f)
                lineTo(8.12f, 1f)
                lineTo(2.5f, 1f)
                curveTo(1.12f, 1f, 0f, 2.12f, 0f, 3.5f)
                lineTo(0f, 23f)
                lineTo(8.35f, 23f)
                lineToRelative(-1f, -1f)
                lineTo(1f, 22f)
                lineTo(1f, 8f)
                lineTo(23f, 8f)
                verticalLineToRelative(14f)
                horizontalLineToRelative(-6.37f)
                lineToRelative(-1f, 1f)
                horizontalLineToRelative(8.37f)
                lineTo(24f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 7f)
                lineTo(1f, 3.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(7.88f, 2f)
                lineToRelative(4f, 2f)
                horizontalLineToRelative(9.62f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 7f)
                close()
                moveTo(16.6f, 19.22f)
                lineToRelative(-3.2f, 3.2f)
                curveToRelative(-0.38f, 0.38f, -0.89f, 0.58f, -1.39f, 0.58f)
                reflectiveCurveToRelative(-1.01f, -0.19f, -1.39f, -0.58f)
                lineToRelative(-3.2f, -3.2f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.2f, 3.2f)
                curveToRelative(0.06f, 0.06f, 0.12f, 0.11f, 0.19f, 0.15f)
                lineTo(11.5f, 12f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(9.86f)
                curveToRelative(0.07f, -0.04f, 0.13f, -0.09f, 0.19f, -0.15f)
                lineToRelative(3.2f, -3.2f)
                lineToRelative(0.71f, 0.71f)
                close()
            }
        }.also { _FolderDownload = it}
