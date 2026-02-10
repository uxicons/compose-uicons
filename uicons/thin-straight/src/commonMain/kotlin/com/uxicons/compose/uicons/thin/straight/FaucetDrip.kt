package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaucetDrip: ImageVector? = null

val Icons.Ts.FaucetDrip: ImageVector
    get() = _FaucetDrip ?: UXIcon(name = "FaucetDrip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.5f, 9f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1f)
                lineTo(4f, 4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                lineTo(0f, 9f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(5f)
                lineTo(0f, 15f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(15.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -4.69f, -3.81f, -8.5f, -8.5f, -8.5f)
                close()
                moveTo(23f, 19f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(4.14f, 0f, 7.5f, 3.36f, 7.5f, 7.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _FaucetDrip = it}
