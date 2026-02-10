package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GalleryThumbnails: ImageVector? = null

val Icons.Bs.GalleryThumbnails: ImageVector
    get() = _GalleryThumbnails ?: UXIcon(name = "GalleryThumbnails") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 15f)
                lineTo(0f, 15f)
                lineTo(0f, 3.5f)
                curveTo(0f, 1.57f, 1.57f, 0f, 3.5f, 0f)
                lineTo(20.5f, 0f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                lineTo(24f, 15f)
                close()
                moveTo(3f, 12f)
                lineTo(21f, 12f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(3.5f, 3f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                lineTo(3f, 12f)
                close()
                moveTo(6f, 18f)
                lineTo(0f, 18f)
                verticalLineToRelative(6f)
                lineTo(6f, 24f)
                verticalLineToRelative(-6f)
                close()
                moveTo(24f, 18f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
                moveTo(15f, 18f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                close()
            }
        }.also { _GalleryThumbnails = it}
