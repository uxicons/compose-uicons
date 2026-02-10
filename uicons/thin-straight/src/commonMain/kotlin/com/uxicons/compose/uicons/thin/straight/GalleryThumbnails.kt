package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GalleryThumbnails: ImageVector? = null

val Icons.Ts.GalleryThumbnails: ImageVector
    get() = _GalleryThumbnails ?: UXIcon(name = "GalleryThumbnails") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 15f)
                lineTo(0f, 15f)
                lineTo(0f, 2.5f)
                curveTo(0f, 1.12f, 1.12f, 0f, 2.5f, 0f)
                lineTo(21.5f, 0f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                lineTo(24f, 15f)
                close()
                moveTo(1f, 14f)
                lineTo(23f, 14f)
                lineTo(23f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                lineTo(1f, 14f)
                close()
                moveTo(6f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-6f)
                lineTo(6f, 18f)
                verticalLineToRelative(6f)
                close()
                moveTo(1f, 23f)
                lineTo(5f, 23f)
                verticalLineToRelative(-4f)
                lineTo(1f, 19f)
                verticalLineToRelative(4f)
                close()
                moveTo(24f, 24f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                close()
                moveTo(19f, 23f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                close()
                moveTo(15f, 24f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                close()
                moveTo(10f, 23f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _GalleryThumbnails = it}
