package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ForwardFast: ImageVector? = null

val Icons.Rs.ForwardFast: ImageVector
    get() = _ForwardFast ?: UXIcon(name = "ForwardFast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 0f)
                verticalLineToRelative(9.05f)
                lineTo(9.0f, 0.1f)
                verticalLineToRelative(6.39f)
                lineTo(0f, 0.06f)
                verticalLineToRelative(23.89f)
                lineToRelative(9.0f, -6.43f)
                verticalLineToRelative(6.39f)
                lineToRelative(13.0f, -8.95f)
                verticalLineToRelative(9.05f)
                horizontalLineToRelative(2f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(21.6f, 12.8f)
                lineToRelative(-10.59f, 7.29f)
                verticalLineToRelative(-6.47f)
                lineToRelative(-9.0f, 6.43f)
                lineTo(2.0f, 3.94f)
                lineToRelative(9.0f, 6.43f)
                lineTo(11.0f, 3.9f)
                lineToRelative(10.58f, 7.28f)
                curveToRelative(0.26f, 0.19f, 0.42f, 0.49f, 0.42f, 0.81f)
                reflectiveCurveToRelative(-0.16f, 0.63f, -0.4f, 0.8f)
                close()
            }
        }.also { _ForwardFast = it}
