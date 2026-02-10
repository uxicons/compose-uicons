package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookmarkSlash: ImageVector? = null

val Icons.Ts.BookmarkSlash: ImageVector
    get() = _BookmarkSlash ?: UXIcon(name = "BookmarkSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.99f, 14.52f)
                lineToRelative(0.66f, 0.66f)
                lineTo(3f, 24f)
                lineTo(3f, 6.54f)
                lineToRelative(1f, 1f)
                verticalLineToRelative(14.02f)
                lineToRelative(6.99f, -7.03f)
                close()
                moveTo(24.0f, 23.3f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(-0.0f, 0.7f)
                lineTo(0.7f, -0.0f)
                lineToRelative(2.31f, 2.31f)
                curveToRelative(0.1f, -1.29f, 1.18f, -2.3f, 2.49f, -2.3f)
                horizontalLineToRelative(13f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(17.79f)
                lineToRelative(3.0f, 3.0f)
                close()
                moveTo(4f, 3.29f)
                lineToRelative(16f, 16f)
                lineTo(20f, 2.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(5.5f, 1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.79f)
                close()
            }
        }.also { _BookmarkSlash = it}
