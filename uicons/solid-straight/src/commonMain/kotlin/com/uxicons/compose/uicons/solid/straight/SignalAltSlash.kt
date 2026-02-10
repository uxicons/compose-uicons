package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalAltSlash: ImageVector? = null

val Icons.Ss.SignalAltSlash: ImageVector
    get() = _SignalAltSlash ?: UXIcon(name = "SignalAltSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 22.59f)
                lineToRelative(-1.41f, 1.42f)
                lineTo(0.0f, 1.46f)
                lineTo(1.42f, 0.04f)
                lineToRelative(11.58f, 11.56f)
                verticalLineToRelative(-6.11f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(10.1f)
                lineToRelative(2f, 2.0f)
                lineTo(19f, 1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.09f)
                lineToRelative(1.0f, 1.0f)
                close()
                moveTo(3.5f, 17f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(7f, 24f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-8.74f)
                lineToRelative(-4f, -3.99f)
                verticalLineToRelative(12.73f)
                close()
                moveTo(13f, 24f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2.75f)
                lineToRelative(-4f, -3.99f)
                verticalLineToRelative(6.74f)
                close()
            }
        }.also { _SignalAltSlash = it}
