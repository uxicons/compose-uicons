package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Background: ImageVector? = null

val Icons.Rr.Background: ImageVector
    get() = _Background ?: UXIcon(name = "Background") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 0f)
                lineTo(5f, 0f)
                curveTo(2.24f, 0f, 0f, 2.24f, 0f, 5f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 5f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(22f, 14.59f)
                lineToRelative(-7.41f, 7.41f)
                horizontalLineToRelative(-4.17f)
                lineToRelative(11.59f, -11.59f)
                verticalLineToRelative(4.17f)
                close()
                moveTo(20.29f, 2.3f)
                lineTo(2.29f, 20.29f)
                curveToRelative(-0.19f, -0.39f, -0.29f, -0.83f, -0.29f, -1.29f)
                verticalLineToRelative(-2.59f)
                lineTo(16.41f, 2f)
                horizontalLineToRelative(2.59f)
                curveToRelative(0.46f, 0f, 0.9f, 0.11f, 1.29f, 0.29f)
                close()
                moveTo(2f, 9.41f)
                lineTo(9.41f, 2f)
                horizontalLineToRelative(4.17f)
                lineTo(2f, 13.59f)
                verticalLineToRelative(-4.17f)
                close()
                moveTo(5f, 2f)
                horizontalLineToRelative(1.59f)
                lineTo(2f, 6.59f)
                verticalLineToRelative(-1.59f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(3.71f, 21.71f)
                lineTo(21.71f, 3.71f)
                curveToRelative(0.19f, 0.39f, 0.29f, 0.83f, 0.29f, 1.29f)
                verticalLineToRelative(2.59f)
                lineTo(7.59f, 22f)
                horizontalLineToRelative(-2.59f)
                curveToRelative(-0.46f, 0f, -0.9f, -0.11f, -1.29f, -0.29f)
                close()
                moveTo(19f, 22f)
                horizontalLineToRelative(-1.59f)
                lineToRelative(4.59f, -4.59f)
                verticalLineToRelative(1.59f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
            }
        }.also { _Background = it}
