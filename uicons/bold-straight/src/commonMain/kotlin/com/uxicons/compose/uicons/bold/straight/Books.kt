package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Books: ImageVector? = null

val Icons.Bs.Books: ImageVector
    get() = _Books ?: UXIcon(name = "Books") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 16f)
                lineTo(7f, 16f)
                lineTo(7f, 8f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(8f)
                close()
                moveTo(5f, 8f)
                lineTo(0f, 8f)
                verticalLineToRelative(8f)
                lineTo(5f, 16f)
                lineTo(5f, 8f)
                close()
                moveTo(12f, 5f)
                lineTo(12f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-3f)
                lineTo(7f, 5f)
                horizontalLineToRelative(5f)
                close()
                moveTo(7f, 19f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                lineTo(7f, 19f)
                close()
                moveTo(0f, 19f)
                verticalLineToRelative(5f)
                lineTo(5f, 24f)
                verticalLineToRelative(-5f)
                lineTo(0f, 19f)
                close()
                moveTo(5f, 5f)
                lineTo(5f, 0f)
                lineTo(2f, 0f)
                curveTo(0.9f, 0f, 0f, 0.9f, 0f, 2f)
                verticalLineToRelative(3f)
                lineTo(5f, 5f)
                close()
                moveTo(19.12f, 7.24f)
                lineToRelative(-4.76f, 1.52f)
                lineToRelative(2.62f, 8.1f)
                lineToRelative(4.76f, -1.52f)
                lineToRelative(-2.62f, -8.1f)
                close()
                moveTo(18.21f, 4.38f)
                lineToRelative(-0.92f, -2.86f)
                curveToRelative(-0.34f, -1.05f, -1.46f, -1.63f, -2.52f, -1.29f)
                lineToRelative(-0.95f, 0.3f)
                curveToRelative(-1.05f, 0.34f, -1.63f, 1.46f, -1.29f, 2.52f)
                lineToRelative(0.92f, 2.86f)
                lineToRelative(4.76f, -1.52f)
                close()
                moveTo(17.89f, 19.72f)
                lineToRelative(1.35f, 4.28f)
                lineToRelative(4.76f, -1.52f)
                lineToRelative(-1.35f, -4.28f)
                lineToRelative(-4.76f, 1.52f)
                close()
            }
        }.also { _Books = it}
