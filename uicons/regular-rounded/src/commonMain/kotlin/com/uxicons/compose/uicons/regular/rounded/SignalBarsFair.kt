package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SignalBarsFair: ImageVector? = null

val Icons.Rr.SignalBarsFair: ImageVector
    get() = _SignalBarsFair ?: UXIcon(name = "SignalBarsFair") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 11f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(2.55f)
                curveToRelative(-0.16f, -0.03f, -0.33f, -0.05f, -0.5f, -0.05f)
                horizontalLineToRelative(-1f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(7f, 22f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(11f, 21.5f)
                curveToRelative(0f, 0.28f, -0.23f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-8.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _SignalBarsFair = it}
