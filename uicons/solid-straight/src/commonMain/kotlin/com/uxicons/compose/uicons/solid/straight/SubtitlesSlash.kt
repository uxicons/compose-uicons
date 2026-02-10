package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SubtitlesSlash: ImageVector? = null

val Icons.Ss.SubtitlesSlash: ImageVector
    get() = _SubtitlesSlash ?: UXIcon(name = "SubtitlesSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.76f, 18f)
                lineToRelative(4f, 4f)
                lineTo(0f, 22f)
                lineTo(0f, 5f)
                curveToRelative(0f, -0.23f, 0.03f, -0.46f, 0.08f, -0.67f)
                lineToRelative(6.67f, 6.67f)
                horizontalLineToRelative(-2.76f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.76f)
                lineToRelative(4.76f, 4.76f)
                lineTo(4f, 16f)
                verticalLineToRelative(2f)
                lineTo(13.76f, 18f)
                close()
                moveTo(24.01f, 22.59f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(-0.01f, 1.41f)
                lineTo(1.41f, -0.01f)
                lineTo(3.41f, 2f)
                lineTo(21f, 2f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                lineTo(24f, 22f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(0.59f, 0.59f)
                close()
                moveTo(20f, 18f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.59f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(0.59f)
                close()
                moveTo(20f, 11f)
                horizontalLineToRelative(-7.59f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(5.59f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _SubtitlesSlash = it}
