package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Faucet: ImageVector? = null

val Icons.Br.Faucet: ImageVector
    get() = _Faucet ?: UXIcon(name = "Faucet") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.31f, 18.33f)
            reflectiveCurveToRelative(1.69f, 2.17f, 1.69f, 3.17f)
            curveToRelative(0f, 0.64f, -0.24f, 1.28f, -0.73f, 1.77f)
            curveToRelative(-0.49f, 0.49f, -1.13f, 0.73f, -1.77f, 0.73f)
            curveToRelative(-0.64f, 0f, -1.28f, -0.24f, -1.77f, -0.73f)
            reflectiveCurveToRelative(-0.73f, -1.13f, -0.73f, -1.77f)
            curveToRelative(0f, -1.0f, 1.69f, -3.17f, 1.69f, -3.17f)
            curveToRelative(0.45f, -0.44f, 1.16f, -0.44f, 1.61f, 0f)
            close()
            moveTo(24f, 14.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
            lineTo(1.5f, 14f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(6.5f)
            verticalLineToRelative(-3f)
            lineTo(1.5f, 8f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(6.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(8f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-2.5f)
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
    }.also { _Faucet = it }
