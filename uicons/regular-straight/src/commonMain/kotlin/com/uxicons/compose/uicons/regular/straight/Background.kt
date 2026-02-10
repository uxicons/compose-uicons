package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Background: ImageVector? = null

val Icons.Rs.Background: ImageVector
    get() = _Background ?: UXIcon(name = "Background") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 14.59f)
                lineToRelative(-7.41f, 7.41f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(11.59f, -11.59f)
                verticalLineToRelative(4.17f)
                close()
                moveTo(2f, 9.41f)
                lineTo(9.41f, 2f)
                horizontalLineToRelative(4.17f)
                lineTo(2f, 13.59f)
                verticalLineToRelative(-4.17f)
                close()
                moveTo(2f, 16.41f)
                lineTo(16.41f, 2f)
                horizontalLineToRelative(4.17f)
                lineTo(2f, 20.59f)
                verticalLineToRelative(-4.17f)
                close()
                moveTo(22f, 3.41f)
                lineTo(22f, 7.59f)
                lineTo(7.59f, 22f)
                lineTo(3.41f, 22f)
                lineTo(22f, 3.41f)
                close()
                moveTo(3f, 2f)
                horizontalLineToRelative(3.59f)
                lineTo(2f, 6.59f)
                lineTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                close()
                moveTo(17.41f, 22f)
                lineToRelative(4.59f, -4.59f)
                verticalLineToRelative(4.59f)
                horizontalLineToRelative(-4.59f)
                close()
            }
        }.also { _Background = it}
