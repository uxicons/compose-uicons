package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SubtitlesSlash: ImageVector? = null

val Icons.Bs.SubtitlesSlash: ImageVector
    get() = _SubtitlesSlash ?: UXIcon(name = "SubtitlesSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.05f, 19f)
                lineToRelative(3f, 3f)
                lineTo(0f, 22f)
                lineTo(0f, 5.5f)
                curveToRelative(0f, -0.17f, 0.03f, -0.34f, 0.05f, -0.5f)
                lineToRelative(2.95f, 2.95f)
                verticalLineToRelative(11.05f)
                lineTo(14.05f, 19.0f)
                close()
                moveTo(5f, 17f)
                horizontalLineToRelative(7.05f)
                lineToRelative(-3f, -3f)
                lineTo(5f, 14f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 5.5f)
                lineTo(24f, 21.8f)
                lineToRelative(-2.16f, 2.16f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineToRelative(1.96f, 1.96f)
                lineTo(20.5f, 2f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(21f, 5.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(7.12f, 5f)
                lineToRelative(4f, 4f)
                horizontalLineToRelative(7.88f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4.88f)
                lineToRelative(2f, 2f)
                horizontalLineToRelative(2.88f)
                verticalLineToRelative(2.88f)
                lineToRelative(2f, 2f)
                lineTo(21f, 5.5f)
                close()
                moveTo(5f, 12f)
                horizontalLineToRelative(2.05f)
                lineToRelative(-2.05f, -2.05f)
                verticalLineToRelative(2.05f)
                close()
            }
        }.also { _SubtitlesSlash = it}
