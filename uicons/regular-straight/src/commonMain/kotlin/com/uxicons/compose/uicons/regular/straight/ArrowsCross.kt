package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsCross: ImageVector? = null

val Icons.Rs.ArrowsCross: ImageVector
    get() = _ArrowsCross ?: UXIcon(name = "ArrowsCross") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.16f, 10.58f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineTo(10.58f, 9.16f)
                lineToRelative(-1.41f, 1.41f)
                close()
                moveTo(22f, 20.59f)
                lineToRelative(-7.16f, -7.16f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(7.16f, 7.16f)
                horizontalLineToRelative(-4.59f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4.59f)
                close()
                moveTo(22f, 0f)
                horizontalLineToRelative(-6f)
                lineTo(16f, 2f)
                horizontalLineToRelative(4.59f)
                lineTo(0.04f, 22.54f)
                lineToRelative(1.41f, 1.41f)
                lineTo(22f, 3.41f)
                verticalLineToRelative(4.59f)
                horizontalLineToRelative(2f)
                lineTo(24f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
            }
        }.also { _ArrowsCross = it}
