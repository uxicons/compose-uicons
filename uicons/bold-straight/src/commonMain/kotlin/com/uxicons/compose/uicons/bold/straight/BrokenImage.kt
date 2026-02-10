package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrokenImage: ImageVector? = null

val Icons.Bs.BrokenImage: ImageVector
    get() = _BrokenImage ?: UXIcon(name = "BrokenImage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.38f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 5.66f)
                lineTo(16.38f, 0f)
                close()
                moveTo(14f, 3f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(5.36f)
                lineToRelative(-2.98f, -2.98f)
                lineToRelative(-4f, 4f)
                lineToRelative(-4f, -4f)
                lineToRelative(-3.02f, 3.02f)
                lineTo(5f, 3f)
                lineTo(14f, 3f)
                close()
                moveTo(5f, 21f)
                verticalLineToRelative(-3.36f)
                lineToRelative(3.02f, -3.02f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
                lineToRelative(2.98f, 2.98f)
                verticalLineToRelative(3.4f)
                lineTo(5f, 21f)
                close()
            }
        }.also { _BrokenImage = it}
