package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Up: ImageVector? = null

val Icons.Rs.Up: ImageVector
    get() = _Up ?: UXIcon(name = "Up") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.99f, 24f)
                lineTo(6.99f, 24f)
                lineTo(6.99f, 11f)
                lineTo(0.06f, 11f)
                lineTo(9.86f, 0.88f)
                curveTo(10.43f, 0.31f, 11.18f, 0f, 11.99f, 0f)
                horizontalLineToRelative(0f)
                curveToRelative(0.8f, 0f, 1.56f, 0.31f, 2.13f, 0.88f)
                lineToRelative(9.82f, 10.12f)
                horizontalLineToRelative(-6.95f)
                verticalLineToRelative(13f)
                close()
                moveTo(8.99f, 22f)
                horizontalLineToRelative(6f)
                lineTo(14.99f, 9f)
                horizontalLineToRelative(4.22f)
                lineTo(12.69f, 2.29f)
                curveToRelative(-0.18f, -0.18f, -0.43f, -0.29f, -0.7f, -0.29f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.27f, 0f, -0.52f, 0.1f, -0.7f, 0.29f)
                lineToRelative(-6.5f, 6.71f)
                horizontalLineToRelative(4.21f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _Up = it}
