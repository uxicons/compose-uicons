package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Faucet: ImageVector? = null

val Icons.Bs.Faucet: ImageVector
    get() = _Faucet ?: UXIcon(name = "Faucet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.27f, 19.73f)
                curveToRelative(0.98f, 0.98f, 0.98f, 2.56f, 0f, 3.54f)
                curveToRelative(-0.49f, 0.49f, -1.13f, 0.73f, -1.77f, 0.73f)
                curveToRelative(-0.64f, 0f, -1.28f, -0.24f, -1.77f, -0.73f)
                curveToRelative(-0.98f, -0.98f, -0.98f, -2.56f, 0f, -3.54f)
                lineToRelative(1.77f, -1.73f)
                lineToRelative(1.77f, 1.73f)
                close()
                moveTo(24f, 14.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(0f, 14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                lineTo(0f, 8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                lineTo(4f, 0f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3.5f)
                curveToRelative(5.24f, 0f, 9.5f, 4.26f, 9.5f, 9.5f)
                close()
                moveTo(20.98f, 14f)
                curveToRelative(-0.26f, -3.35f, -3.06f, -6f, -6.48f, -6f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.76f, 0f, 3.22f, 1.31f, 3.46f, 3f)
                horizontalLineToRelative(3.02f)
                close()
            }
        }.also { _Faucet = it}
