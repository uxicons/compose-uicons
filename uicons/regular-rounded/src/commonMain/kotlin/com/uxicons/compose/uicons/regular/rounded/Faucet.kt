package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Faucet: ImageVector? = null

val Icons.Rr.Faucet: ImageVector
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
                moveTo(24f, 14f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(1f, 13f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-4f)
                lineTo(1f, 7f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(10f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
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
