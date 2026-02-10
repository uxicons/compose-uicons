package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FaucetDrip: ImageVector? = null

val Icons.Br.FaucetDrip: ImageVector
    get() = _FaucetDrip ?: UXIcon(name = "FaucetDrip") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(14.5f, 8f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(5.5f, 3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(2.5f)
            verticalLineToRelative(2f)
            lineTo(1.5f, 8f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(6.5f)
            verticalLineToRelative(3f)
            lineTo(1.5f, 14f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(13f)
            curveToRelative(0.28f, 0f, 0.5f, 0.23f, 0.5f, 0.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            horizontalLineToRelative(4f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
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
    }.also { _FaucetDrip = it }
