package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandBandageWound: ImageVector? = null

val Icons.Br.HandBandageWound: ImageVector
    get() = _HandBandageWound ?: UXIcon(name = "HandBandageWound") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22.5f, 2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(5.5f)
            horizontalLineToRelative(-2f)
            lineTo(19f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(-2f)
            lineTo(14f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(-2f)
            lineTo(9f, 3.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(12.29f)
            curveToRelative(0f, 0.04f, 0f, 0.1f, -0.1f, 0.15f)
            curveToRelative(-0.1f, 0.04f, -0.14f, -0.01f, -0.17f, -0.03f)
            curveToRelative(0f, 0f, -2.48f, -2.49f, -2.56f, -2.54f)
            curveToRelative(-0.7f, -0.48f, -1.81f, -0.56f, -2.6f, 0.23f)
            curveToRelative(-0.8f, 0.8f, -0.69f, 1.94f, -0.16f, 2.65f)
            curveToRelative(0.03f, 0.05f, 4.72f, 5.07f, 4.72f, 5.07f)
            curveToRelative(1.6f, 1.71f, 3.86f, 2.69f, 6.21f, 2.69f)
            horizontalLineToRelative(6.16f)
            curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
            lineTo(24.0f, 3.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(21f, 12.2f)
            lineToRelative(-9.65f, 8.8f)
            curveToRelative(-1.01f, 0f, -1.99f, -0.29f, -2.84f, -0.8f)
            lineToRelative(8.92f, -8.2f)
            horizontalLineToRelative(3.58f)
            verticalLineToRelative(0.2f)
            close()
            moveTo(12.99f, 12f)
            lineToRelative(-3.99f, 3.67f)
            verticalLineToRelative(-3.67f)
            horizontalLineToRelative(3.99f)
            close()
            moveTo(17.5f, 21f)
            horizontalLineToRelative(-1.68f)
            lineToRelative(5.18f, -4.74f)
            verticalLineToRelative(1.24f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            close()
        }
    }.also { _HandBandageWound = it }
