package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrokenImage: ImageVector? = null

val Icons.Rs.BrokenImage: ImageVector
    get() = _BrokenImage ?: UXIcon(name = "BrokenImage") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.41f, 0f)
                lineTo(5f, 0f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                lineTo(2f, 24f)
                lineTo(22f, 24f)
                lineTo(22f, 7.59f)
                lineTo(14.41f, 0f)
                close()
                moveTo(15f, 3.41f)
                lineToRelative(3.59f, 3.59f)
                horizontalLineToRelative(-3.59f)
                lineTo(15f, 3.41f)
                close()
                moveTo(5f, 2f)
                lineTo(13f, 2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(6.07f)
                lineToRelative(-3.98f, -3.98f)
                lineToRelative(-4f, 4f)
                lineToRelative(-4f, -4f)
                lineToRelative(-4.02f, 4.02f)
                lineTo(4f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(4f, 22f)
                verticalLineToRelative(-4.07f)
                lineToRelative(4.02f, -4.02f)
                lineToRelative(4f, 4f)
                lineToRelative(4f, -4f)
                lineToRelative(3.98f, 3.98f)
                verticalLineToRelative(4.1f)
                lineTo(4f, 21.99f)
                close()
            }
        }.also { _BrokenImage = it}
