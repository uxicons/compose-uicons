package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaucetDrip: ImageVector? = null

val Icons.Bs.FaucetDrip: ImageVector
    get() = _FaucetDrip ?: UXIcon(name = "FaucetDrip") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.5f, 8f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                lineTo(4f, 3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(0f, 8f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(3f)
                lineTo(0f, 14f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(14.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -5.24f, -4.26f, -9.5f, -9.5f, -9.5f)
                close()
                moveTo(17.96f, 17f)
                curveToRelative(-0.24f, -1.69f, -1.71f, -3f, -3.46f, -3f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(3.42f, 0f, 6.22f, 2.65f, 6.48f, 6f)
                horizontalLineToRelative(-3.02f)
                close()
            }
        }.also { _FaucetDrip = it}
