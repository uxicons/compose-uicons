package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletArrow: ImageVector? = null

val Icons.Bs.WalletArrow: ImageVector
    get() = _WalletArrow ?: UXIcon(name = "WalletArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 14f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(16f, 10f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.98f)
                horizontalLineToRelative(2.48f)
                lineToRelative(-3.16f, -3.65f)
                curveToRelative(-0.44f, -0.49f, -1.22f, -0.49f, -1.66f, 0f)
                lineToRelative(-3.18f, 3.65f)
                horizontalLineToRelative(2.52f)
                verticalLineToRelative(5.98f)
                close()
                moveTo(21f, 7f)
                verticalLineToRelative(14f)
                lineTo(4f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-10.14f)
                curveToRelative(0.32f, 0.08f, 0.65f, 0.14f, 1f, 0.14f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-3f)
                lineTo(4f, 7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(5.98f)
                lineToRelative(2.62f, -3f)
                lineTo(4f, 2f)
                curveTo(1.79f, 2f, 0f, 3.79f, 0f, 6f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(20f)
                lineTo(24f, 7f)
                horizontalLineToRelative(-3f)
                close()
            }
        }.also { _WalletArrow = it}
