package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GalleryThumbnails: ImageVector? = null

val Icons.Br.GalleryThumbnails: ImageVector
    get() = _GalleryThumbnails ?: UXIcon(name = "GalleryThumbnails") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 16f)
            lineTo(4.5f, 16f)
            curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
            lineTo(0f, 4.5f)
            curveTo(0f, 2.02f, 2.02f, 0f, 4.5f, 0f)
            horizontalLineToRelative(15f)
            curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
            close()
            moveTo(4.5f, 3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(15f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            lineTo(21f, 4.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(4.5f, 3f)
            close()
            moveTo(4f, 24f)
            lineTo(2f, 24f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            close()
            moveTo(22f, 24f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            close()
            moveTo(13f, 24f)
            horizontalLineToRelative(-2f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(2f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            close()
        }
    }.also { _GalleryThumbnails = it }
