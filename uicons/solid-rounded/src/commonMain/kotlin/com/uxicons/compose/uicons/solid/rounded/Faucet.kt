package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Faucet: ImageVector? = null

val Icons.Sr.Faucet: ImageVector
    get() = _Faucet ?: UXIcon(name = "Faucet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.65f, 18.27f)
                reflectiveCurveToRelative(1.85f, 2.23f, 1.85f, 3.23f)
                curveToRelative(0f, 0.64f, -0.24f, 1.28f, -0.73f, 1.77f)
                reflectiveCurveToRelative(-1.13f, 0.73f, -1.77f, 0.73f)
                curveToRelative(-0.64f, 0f, -1.28f, -0.24f, -1.77f, -0.73f)
                reflectiveCurveToRelative(-0.73f, -1.13f, -0.73f, -1.77f)
                curveToRelative(0f, -1f, 1.85f, -3.23f, 1.85f, -3.23f)
                curveToRelative(0.36f, -0.35f, 0.94f, -0.35f, 1.3f, 0f)
                close()
                moveTo(15f, 2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(5f, 0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(3f)
                lineTo(1f, 5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(10f)
                lineTo(11f, 2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(15f, 5f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                close()
            }
        }.also { _Faucet = it}
