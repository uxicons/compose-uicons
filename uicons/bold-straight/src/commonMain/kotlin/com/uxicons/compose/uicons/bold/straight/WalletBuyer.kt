package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletBuyer: ImageVector? = null

val Icons.Bs.WalletBuyer: ImageVector
    get() = _WalletBuyer ?: UXIcon(name = "WalletBuyer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 15f)
                curveToRelative(0f, -2.04f, -1.24f, -3.8f, -3f, -4.58f)
                verticalLineToRelative(-2.39f)
                lineToRelative(-17.0f, -0.04f)
                curveToRelative(-0.35f, 0f, -0.68f, -0.06f, -1.0f, -0.14f)
                verticalLineToRelative(10.14f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(9.03f)
                curveToRelative(-0.64f, 0.84f, -1.03f, 1.87f, -1.03f, 3f)
                lineTo(4f, 22f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                lineTo(0f, 4f)
                curveTo(0f, 1.78f, 1.78f, 0.02f, 4.06f, 0f)
                horizontalLineToRelative(19.94f)
                verticalLineToRelative(3f)
                lineTo(4.07f, 3f)
                curveToRelative(-0.6f, 0.01f, -1.07f, 0.44f, -1.07f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineToRelative(20.0f, 0.04f)
                lineToRelative(-0.0f, 9.96f)
                close()
                moveTo(21f, 19f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 15f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                close()
            }
        }.also { _WalletBuyer = it}
