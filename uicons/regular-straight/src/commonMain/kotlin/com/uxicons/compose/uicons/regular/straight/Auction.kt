package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Auction: ImageVector? = null

val Icons.Rs.Auction: ImageVector
    get() = _Auction ?: UXIcon(name = "Auction") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.71f, 15.39f)
                lineToRelative(-1.02f, 1.02f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(7.89f, -7.89f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-0.99f, 0.99f)
                lineToRelative(-7.08f, -7.08f)
                lineToRelative(0.99f, -0.99f)
                lineTo(13.07f, 0.03f)
                lineToRelative(-7.89f, 7.89f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(1.02f, -1.02f)
                lineToRelative(2.83f, 2.83f)
                lineTo(0.02f, 21.56f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(10.43f, -10.43f)
                lineToRelative(2.84f, 2.84f)
                close()
                moveTo(11.78f, 9.63f)
                lineToRelative(3.04f, -3.04f)
                lineToRelative(1.67f, 1.67f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(-1.67f, -1.67f)
                close()
                moveTo(16.12f, 13.97f)
                lineToRelative(-1.25f, -1.25f)
                lineToRelative(3.04f, -3.04f)
                lineToRelative(1.25f, 1.25f)
                lineToRelative(-3.04f, 3.04f)
                close()
                moveTo(12.08f, 3.85f)
                lineToRelative(1.33f, 1.33f)
                lineToRelative(-3.04f, 3.04f)
                lineToRelative(-1.33f, -1.33f)
                lineToRelative(3.04f, -3.04f)
                close()
                moveTo(24f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.05f)
                curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.45f, -2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.21f, 0f, 2.22f, 0.86f, 2.45f, 2f)
                horizontalLineToRelative(1.05f)
                close()
            }
        }.also { _Auction = it}
