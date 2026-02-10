package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ForwardFast: ImageVector? = null

val Icons.Bs.ForwardFast: ImageVector
    get() = _ForwardFast ?: UXIcon(name = "ForwardFast") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 0f)
                verticalLineToRelative(8.74f)
                lineTo(8f, 0.12f)
                verticalLineToRelative(5.59f)
                lineTo(0f, 0f)
                verticalLineToRelative(23.61f)
                lineToRelative(8f, -5.71f)
                verticalLineToRelative(5.71f)
                lineToRelative(13f, -9.28f)
                verticalLineToRelative(9.67f)
                horizontalLineToRelative(3f)
                lineTo(24f, 0f)
                horizontalLineToRelative(-3f)
                close()
                moveTo(19.44f, 11.76f)
                lineToRelative(-8.44f, 6.02f)
                verticalLineToRelative(-5.71f)
                lineToRelative(-8f, 5.71f)
                lineTo(3f, 5.83f)
                lineToRelative(8f, 5.71f)
                verticalLineToRelative(-5.83f)
                lineToRelative(8.44f, 5.59f)
                curveToRelative(0.07f, 0.05f, 0.12f, 0.14f, 0.12f, 0.23f)
                curveToRelative(0f, 0.09f, -0.04f, 0.17f, -0.12f, 0.23f)
                close()
            }
        }.also { _ForwardFast = it}
