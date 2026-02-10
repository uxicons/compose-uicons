package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SubtitlesSlash: ImageVector? = null

val Icons.Rs.SubtitlesSlash: ImageVector
    get() = _SubtitlesSlash ?: UXIcon(name = "SubtitlesSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(2f, 20f)
                lineTo(2f, 6.24f)
                lineTo(0.08f, 4.33f)
                curveToRelative(-0.05f, 0.22f, -0.08f, 0.44f, -0.08f, 0.67f)
                lineTo(0f, 22f)
                lineTo(17.76f, 22f)
                lineToRelative(-2f, -2f)
                lineTo(2f, 20f)
                close()
                moveTo(4f, 18f)
                lineTo(13.76f, 18f)
                lineToRelative(-2f, -2f)
                lineTo(4f, 16f)
                verticalLineToRelative(2f)
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
                moveTo(5.41f, 4f)
                lineToRelative(7f, 7f)
                horizontalLineToRelative(7.59f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5.59f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(2.59f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-0.59f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(0.59f)
                lineTo(22f, 5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(5.41f, 4f)
                close()
            }
        }.also { _SubtitlesSlash = it}
