package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Background: ImageVector? = null

val Icons.Tr.Background: ImageVector
    get() = _Background ?: UXIcon(name = "Background") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 14.29f)
                lineToRelative(-8.71f, 8.71f)
                horizontalLineToRelative(-5.59f)
                lineToRelative(14.29f, -14.29f)
                verticalLineToRelative(5.59f)
                close()
                moveTo(1f, 9.21f)
                lineTo(9.21f, 1f)
                horizontalLineToRelative(6.09f)
                lineTo(1f, 15.29f)
                verticalLineToRelative(-6.09f)
                close()
                moveTo(4.5f, 1f)
                horizontalLineToRelative(3.29f)
                lineTo(1f, 7.79f)
                verticalLineToRelative(-3.29f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                close()
                moveTo(1f, 16.71f)
                lineTo(16.71f, 1f)
                horizontalLineToRelative(2.79f)
                curveToRelative(0.78f, 0f, 1.51f, 0.26f, 2.09f, 0.7f)
                lineTo(1.7f, 21.59f)
                curveToRelative(-0.44f, -0.58f, -0.7f, -1.31f, -0.7f, -2.09f)
                verticalLineToRelative(-2.79f)
                close()
                moveTo(2.41f, 22.3f)
                lineTo(22.3f, 2.4f)
                curveToRelative(0.44f, 0.58f, 0.7f, 1.31f, 0.7f, 2.1f)
                verticalLineToRelative(2.79f)
                lineTo(7.29f, 23f)
                horizontalLineToRelative(-2.79f)
                curveToRelative(-0.78f, 0f, -1.51f, -0.26f, -2.09f, -0.7f)
                close()
                moveTo(19.5f, 23f)
                horizontalLineToRelative(-3.79f)
                lineToRelative(7.29f, -7.29f)
                verticalLineToRelative(3.79f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _Background = it}
