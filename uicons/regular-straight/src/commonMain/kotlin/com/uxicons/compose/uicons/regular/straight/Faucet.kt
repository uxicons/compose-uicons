package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Faucet: ImageVector? = null

val Icons.Rs.Faucet: ImageVector
    get() = _Faucet ?: UXIcon(name = "Faucet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.77f, 19.73f)
                curveToRelative(0.98f, 0.98f, 0.98f, 2.56f, 0f, 3.54f)
                curveToRelative(-0.49f, 0.49f, -1.13f, 0.73f, -1.77f, 0.73f)
                curveToRelative(-0.64f, 0f, -1.28f, -0.24f, -1.77f, -0.73f)
                curveToRelative(-0.98f, -0.98f, -0.98f, -2.56f, 0f, -3.54f)
                lineToRelative(1.77f, -1.73f)
                lineToRelative(1.77f, 1.73f)
                close()
                moveTo(24f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(0f, 13f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-4f)
                lineTo(0f, 7f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-5f)
                lineTo(4f, 0f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                close()
                moveTo(22f, 14f)
                curveToRelative(0f, -3.86f, -3.14f, -7f, -7f, -7f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                horizontalLineToRelative(4f)
                close()
            }
        }.also { _Faucet = it}
