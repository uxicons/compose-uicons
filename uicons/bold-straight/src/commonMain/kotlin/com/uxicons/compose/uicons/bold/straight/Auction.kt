package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Auction: ImageVector? = null

val Icons.Bs.Auction: ImageVector
    get() = _Auction ?: UXIcon(name = "Auction") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.14f, 14.86f)
                lineToRelative(-0.7f, 0.7f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(8.02f, -8.02f)
                lineToRelative(-2.12f, -2.12f)
                lineToRelative(-0.74f, 0.74f)
                lineToRelative(-5.4f, -5.38f)
                lineToRelative(0.74f, -0.74f)
                lineTo(12.94f, 0.04f)
                lineTo(4.94f, 8.04f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(0.69f, -0.69f)
                lineToRelative(1.63f, 1.63f)
                lineTo(0.04f, 20.44f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(9.33f, -9.33f)
                lineToRelative(1.64f, 1.64f)
                close()
                moveTo(13.43f, 6.25f)
                lineToRelative(2.93f, 2.93f)
                lineToRelative(-2.33f, 2.33f)
                lineToRelative(-2.93f, -2.93f)
                lineToRelative(2.33f, -2.33f)
                close()
                moveTo(24.0f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                horizontalLineToRelative(1f)
                close()
            }
        }.also { _Auction = it}
