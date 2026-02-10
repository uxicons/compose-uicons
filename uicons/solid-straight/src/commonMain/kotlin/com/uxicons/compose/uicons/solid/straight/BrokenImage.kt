package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrokenImage: ImageVector? = null

val Icons.Ss.BrokenImage: ImageVector
    get() = _BrokenImage ?: UXIcon(name = "BrokenImage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.41f, 5f)
                horizontalLineToRelative(-4.41f)
                lineTo(17f, 0.59f)
                lineToRelative(4.41f, 4.41f)
                close()
                moveTo(7.52f, 11.08f)
                lineToRelative(4.5f, 4.5f)
                lineToRelative(4.5f, -4.5f)
                lineToRelative(5.48f, 5.48f)
                lineTo(22f, 7f)
                horizontalLineToRelative(-7f)
                lineTo(15f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(13.6f)
                lineToRelative(5.52f, -5.52f)
                close()
                moveTo(16.52f, 13.91f)
                lineToRelative(-4.5f, 4.5f)
                lineToRelative(-4.5f, -4.5f)
                lineToRelative(-5.52f, 5.52f)
                verticalLineToRelative(4.57f)
                lineTo(22f, 24f)
                verticalLineToRelative(-4.61f)
                lineToRelative(-5.48f, -5.48f)
                close()
            }
        }.also { _BrokenImage = it}
