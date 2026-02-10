package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShirtTankTop: ImageVector? = null

val Icons.Br.ShirtTankTop: ImageVector
    get() = _ShirtTankTop ?: UXIcon(name = "ShirtTankTop") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.41f, 7.55f)
            curveToRelative(-0.89f, -0.55f, -1.41f, -1.5f, -1.41f, -2.55f)
            lineTo(18f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            lineTo(9f, 1.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 1.04f, -0.53f, 2.0f, -1.42f, 2.55f)
            curveToRelative(-0.98f, 0.61f, -1.58f, 1.73f, -1.58f, 2.93f)
            verticalLineToRelative(8.53f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            horizontalLineToRelative(8f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            verticalLineToRelative(-8.53f)
            curveToRelative(0f, -1.19f, -0.61f, -2.31f, -1.59f, -2.93f)
            close()
            moveTo(18f, 19f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            horizontalLineToRelative(-8f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            verticalLineToRelative(-8.53f)
            curveToRelative(0f, -0.16f, 0.07f, -0.32f, 0.17f, -0.38f)
            curveToRelative(0.71f, -0.44f, 1.31f, -1.02f, 1.77f, -1.68f)
            curveToRelative(1.07f, 0.98f, 2.5f, 1.59f, 4.06f, 1.59f)
            reflectiveCurveToRelative(2.99f, -0.6f, 4.06f, -1.59f)
            curveToRelative(0.46f, 0.66f, 1.05f, 1.24f, 1.76f, 1.68f)
            curveToRelative(0.1f, 0.07f, 0.17f, 0.22f, 0.17f, 0.38f)
            verticalLineToRelative(8.53f)
            close()
        }
    }.also { _ShirtTankTop = it }
