package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FolderHeart: ImageVector? = null

val Icons.Bs.FolderHeart: ImageVector
    get() = _FolderHeart ?: UXIcon(name = "FolderHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 3f)
                lineTo(12.35f, 3f)
                lineTo(8.35f, 1f)
                lineTo(3.5f, 1f)
                curveTo(1.57f, 1f, 0f, 2.57f, 0f, 4.5f)
                lineTo(0f, 23f)
                lineTo(24f, 23f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3f, 20f)
                lineTo(3f, 8f)
                lineTo(21f, 8f)
                verticalLineToRelative(12f)
                lineTo(3f, 20f)
                close()
                moveTo(16.5f, 12.47f)
                curveToRelative(0f, 2.59f, -4.5f, 5.62f, -4.5f, 5.62f)
                curveToRelative(0f, 0f, -4.5f, -3.03f, -4.5f, -5.62f)
                curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
                reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
                curveToRelative(0f, -1.37f, 1.01f, -2.48f, 2.25f, -2.48f)
                reflectiveCurveToRelative(2.25f, 1.11f, 2.25f, 2.48f)
                close()
            }
        }.also { _FolderHeart = it}
