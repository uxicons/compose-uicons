package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Microscope: ImageVector? = null

val Icons.Br.Microscope: ImageVector
    get() = _Microscope ?: UXIcon(name = "Microscope") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 13f)
            curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
            horizontalLineToRelative(-0.76f)
            curveToRelative(-0.54f, -0.8f, -1.32f, -1.42f, -2.24f, -1.74f)
            verticalLineToRelative(-0.76f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.76f)
            curveToRelative(-1.75f, 0.62f, -3f, 2.29f, -3f, 4.24f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(6f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-6.5f)
            curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
            curveToRelative(0f, 2.97f, -2.17f, 5.44f, -5f, 5.92f)
            verticalLineToRelative(-0.42f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            lineTo(6.5f, 17f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            horizontalLineToRelative(-2.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(0.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(9f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1.01f)
            curveToRelative(3.49f, -1.24f, 6f, -4.57f, 6f, -8.48f)
            close()
            moveTo(12f, 12f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(5.5f)
            close()
        }
    }.also { _Microscope = it }
