package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalBarsGood: ImageVector? = null

val Icons.Rs.SignalBarsGood: ImageVector
    get() = _SignalBarsGood ?: UXIcon(name = "SignalBarsGood") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15f, 5f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(14f)
                lineTo(17f, 7f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(7f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                close()
                moveTo(11f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                close()
                moveTo(15f, 22f)
                horizontalLineToRelative(-2f)
                lineTo(13f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(15f)
                close()
            }
        }.also { _SignalBarsGood = it}
