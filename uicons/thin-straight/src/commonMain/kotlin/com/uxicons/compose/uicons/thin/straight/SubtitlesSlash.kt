package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SubtitlesSlash: ImageVector? = null

val Icons.Ts.SubtitlesSlash: ImageVector
    get() = _SubtitlesSlash ?: UXIcon(name = "SubtitlesSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.46f, 21f)
                lineToRelative(1f, 1f)
                lineTo(0f, 22f)
                lineTo(0f, 4.5f)
                curveToRelative(0f, -0.29f, 0.06f, -0.56f, 0.15f, -0.82f)
                lineToRelative(0.85f, 0.85f)
                lineTo(1f, 21f)
                lineTo(17.46f, 21f)
                close()
                moveTo(24f, 22f)
                horizontalLineToRelative(-1.29f)
                lineToRelative(1.25f, 1.25f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(0.05f, 0.75f)
                lineTo(0.75f, 0.05f)
                lineToRelative(1.95f, 1.95f)
                lineTo(21.5f, 2f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                lineTo(24f, 22f)
                close()
                moveTo(23f, 4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(3.71f, 3f)
                lineTo(12.71f, 12f)
                horizontalLineToRelative(7.29f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-6.29f)
                lineToRelative(3f, 3f)
                horizontalLineToRelative(3.29f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2.29f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(1.29f)
                lineTo(23f, 4.5f)
                close()
                moveTo(4f, 12f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(4f, 17f)
                lineTo(13.46f, 17f)
                lineToRelative(-1f, -1f)
                lineTo(4f, 16f)
                verticalLineToRelative(1f)
                close()
            }
        }.also { _SubtitlesSlash = it}
