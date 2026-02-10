package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SupplyChainSteps: ImageVector? = null

val Icons.Bs.SupplyChainSteps: ImageVector
    get() = _SupplyChainSteps ?: UXIcon(name = "SupplyChainSteps") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.65f, 7.27f)
                lineToRelative(-2.79f, -2.79f)
                lineToRelative(2.12f, -2.12f)
                lineToRelative(2.44f, 2.44f)
                lineTo(21.86f, 0.35f)
                lineToRelative(2.12f, 2.12f)
                lineToRelative(-4.79f, 4.79f)
                curveToRelative(-0.97f, 0.97f, -2.56f, 0.97f, -3.54f, 0f)
                close()
                moveTo(5.42f, 8.0f)
                curveToRelative(0.64f, 0f, 1.28f, -0.24f, 1.77f, -0.73f)
                lineTo(11.98f, 2.48f)
                lineTo(9.86f, 0.35f)
                lineTo(5.42f, 4.79f)
                lineTo(2.98f, 2.35f)
                lineTo(0.85f, 4.47f)
                lineToRelative(2.79f, 2.79f)
                curveToRelative(0.49f, 0.49f, 1.13f, 0.73f, 1.77f, 0.73f)
                close()
                moveTo(23.98f, 18.5f)
                lineToRelative(-4.12f, 5.5f)
                lineTo(3f, 24f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(0.86f)
                lineToRelative(4.12f, 5.5f)
                close()
                moveTo(3.5f, 21f)
                horizontalLineToRelative(4.86f)
                lineToRelative(1.88f, -2.5f)
                lineToRelative(-1.88f, -2.5f)
                lineTo(3.5f, 16f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                close()
                moveTo(20.23f, 18.5f)
                lineToRelative(-1.88f, -2.5f)
                horizontalLineToRelative(-6.25f)
                lineToRelative(1.88f, 2.5f)
                lineToRelative(-1.88f, 2.5f)
                horizontalLineToRelative(6.25f)
                lineToRelative(1.88f, -2.5f)
                close()
            }
        }.also { _SupplyChainSteps = it}
