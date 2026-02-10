package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSlash: ImageVector? = null

val Icons.Rs.PenSlash: ImageVector
    get() = _PenSlash ?: UXIcon(name = "PenSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.18f, 15.18f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-7.4f, 7.4f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.19f)
                lineToRelative(7.4f, -7.4f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-6.82f, 6.82f)
                verticalLineToRelative(2.37f)
                horizontalLineToRelative(2.37f)
                lineToRelative(6.82f, -6.82f)
                close()
                moveTo(15.3f, 13.89f)
                lineToRelative(8.65f, 8.65f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(8.65f, 8.65f)
                lineToRelative(7.62f, -7.62f)
                curveToRelative(1.43f, -1.43f, 3.76f, -1.43f, 5.19f, 0f)
                curveToRelative(1.43f, 1.43f, 1.43f, 3.76f, 0f, 5.19f)
                lineToRelative(-7.62f, 7.62f)
                close()
                moveTo(16.77f, 4.86f)
                lineToRelative(2.37f, 2.37f)
                lineToRelative(2.37f, -2.37f)
                curveToRelative(0.65f, -0.65f, 0.65f, -1.71f, 0f, -2.37f)
                curveToRelative(-0.65f, -0.65f, -1.71f, -0.65f, -2.37f, 0f)
                lineToRelative(-2.37f, 2.37f)
                close()
                moveTo(11.53f, 10.11f)
                lineToRelative(2.37f, 2.37f)
                lineToRelative(3.84f, -3.84f)
                lineToRelative(-2.37f, -2.37f)
                lineToRelative(-3.84f, 3.84f)
                close()
            }
        }.also { _PenSlash = it}
