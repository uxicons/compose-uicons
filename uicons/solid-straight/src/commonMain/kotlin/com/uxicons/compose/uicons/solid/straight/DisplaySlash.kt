package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DisplaySlash: ImageVector? = null

val Icons.Ss.DisplaySlash: ImageVector
    get() = _DisplaySlash ?: UXIcon(name = "DisplaySlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.77f, 20f)
                lineToRelative(1.23f, 1.23f)
                verticalLineToRelative(0.77f)
                lineTo(7f, 22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                lineTo(0f, 19f)
                lineTo(0f, 6f)
                curveToRelative(0f, -0.51f, 0.14f, -0.98f, 0.36f, -1.41f)
                lineToRelative(14.4f, 14.4f)
                horizontalLineToRelative(-1.77f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.77f)
                close()
                moveTo(24f, 6f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                lineTo(4.41f, 3f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-3.54f, -3.54f)
                horizontalLineToRelative(3.59f)
                lineTo(24f, 6f)
                close()
            }
        }.also { _DisplaySlash = it}
