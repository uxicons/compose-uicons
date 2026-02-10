package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Background: ImageVector? = null

val Icons.Ss.Background: ImageVector
    get() = _Background ?: UXIcon(name = "Background") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.17f, 0f)
                lineTo(0f, 14.17f)
                verticalLineToRelative(-5.17f)
                lineTo(9f, 0f)
                horizontalLineToRelative(5.17f)
                close()
                moveTo(16f, 24f)
                lineToRelative(8f, -8f)
                verticalLineToRelative(-6.17f)
                lineToRelative(-14.17f, 14.17f)
                horizontalLineToRelative(6.17f)
                close()
                moveTo(7f, 24f)
                lineTo(24f, 7f)
                lineTo(24f, 3f)
                curveToRelative(0f, -0.46f, -0.11f, -0.89f, -0.3f, -1.29f)
                lineTo(1.41f, 24f)
                lineTo(7f, 24f)
                close()
                moveTo(18.83f, 24f)
                horizontalLineToRelative(5.17f)
                verticalLineToRelative(-5.17f)
                lineToRelative(-5.17f, 5.17f)
                close()
                moveTo(6.17f, 0f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                verticalLineToRelative(3.17f)
                lineTo(6.17f, 0f)
                close()
                moveTo(0f, 17f)
                verticalLineToRelative(5.59f)
                lineTo(22.29f, 0.3f)
                curveToRelative(-0.39f, -0.19f, -0.82f, -0.3f, -1.29f, -0.3f)
                horizontalLineToRelative(-4f)
                lineTo(0f, 17f)
                close()
            }
        }.also { _Background = it}
