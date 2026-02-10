package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TruckContainerEmpty: ImageVector? = null

val Icons.Br.TruckContainerEmpty: ImageVector
    get() = _TruckContainerEmpty ?: UXIcon(name = "TruckContainerEmpty") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.61f, 10.52f)
            lineToRelative(-0.84f, -2.52f)
            curveToRelative(-0.61f, -1.84f, -2.33f, -3.08f, -4.27f, -3.08f)
            horizontalLineToRelative(-2.0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(10.58f)
            lineTo(1.5f, 17f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.0f, 0f, 0.01f, 0f, 0.01f)
            horizontalLineToRelative(0f)
            verticalLineToRelative(1.99f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-0.84f)
            curveToRelative(1.18f, -0.56f, 2f, -1.77f, 2f, -3.16f)
            verticalLineToRelative(-3.6f)
            curveToRelative(0f, -0.81f, -0.13f, -1.6f, -0.39f, -2.37f)
            close()
            moveTo(18.5f, 7.92f)
            curveToRelative(0.65f, 0f, 1.22f, 0.41f, 1.42f, 1.03f)
            lineToRelative(0.84f, 2.52f)
            curveToRelative(0.15f, 0.46f, 0.23f, 0.94f, 0.23f, 1.42f)
            verticalLineToRelative(0.05f)
            lineToRelative(-3f, 0.04f)
            verticalLineToRelative(-5.06f)
            horizontalLineToRelative(0.5f)
            close()
        }
    }.also { _TruckContainerEmpty = it }
