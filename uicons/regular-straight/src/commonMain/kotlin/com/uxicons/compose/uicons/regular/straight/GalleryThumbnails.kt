package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GalleryThumbnails: ImageVector? = null

val Icons.Rs.GalleryThumbnails: ImageVector
    get() = _GalleryThumbnails ?: UXIcon(name = "GalleryThumbnails") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 15f)
                lineTo(0f, 15f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(24f, 15f)
                close()
                moveTo(2f, 13f)
                lineTo(22f, 13f)
                lineTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(2f, 13f)
                close()
                moveTo(6f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-6f)
                lineTo(6f, 18f)
                verticalLineToRelative(6f)
                close()
                moveTo(2f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                lineTo(2f, 20f)
                verticalLineToRelative(2f)
                close()
                moveTo(24f, 24f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                close()
                moveTo(20f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(15f, 24f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(6f)
                close()
                moveTo(11f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _GalleryThumbnails = it}
