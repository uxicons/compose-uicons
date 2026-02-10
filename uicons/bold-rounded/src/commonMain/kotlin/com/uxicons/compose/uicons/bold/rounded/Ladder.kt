package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ladder: ImageVector? = null

val Icons.Br.Ladder: ImageVector
    get() = _Ladder ?: UXIcon(name = "Ladder") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(-10f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(21f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.5f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-21f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(17f, 12f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-10f)
            verticalLineToRelative(-2f)
            close()
            moveTo(7f, 19f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(2f)
            close()
            moveTo(8.23f, 3.6f)
            curveToRelative(-0.21f, -0.18f, -0.29f, -0.48f, -0.19f, -0.74f)
            curveToRelative(0.1f, -0.26f, 0.35f, -0.44f, 0.63f, -0.44f)
            horizontalLineToRelative(2.0f)
            lineToRelative(0.71f, -1.99f)
            curveToRelative(0.1f, -0.26f, 0.35f, -0.43f, 0.62f, -0.43f)
            reflectiveCurveToRelative(0.53f, 0.17f, 0.62f, 0.43f)
            lineToRelative(0.71f, 1.99f)
            horizontalLineToRelative(2.0f)
            curveToRelative(0.28f, 0f, 0.53f, 0.17f, 0.63f, 0.44f)
            reflectiveCurveToRelative(0.02f, 0.56f, -0.2f, 0.74f)
            lineToRelative(-1.58f, 1.28f)
            lineToRelative(0.65f, 1.99f)
            curveToRelative(0.09f, 0.27f, -0.0f, 0.56f, -0.23f, 0.74f)
            reflectiveCurveToRelative(-0.53f, 0.18f, -0.77f, 0.03f)
            lineToRelative(-1.84f, -1.2f)
            lineToRelative(-1.8f, 1.21f)
            curveToRelative(-0.23f, 0.16f, -0.54f, 0.15f, -0.77f, -0.02f)
            reflectiveCurveToRelative(-0.32f, -0.46f, -0.24f, -0.73f)
            lineToRelative(0.63f, -2.01f)
            lineToRelative(-1.58f, -1.29f)
            close()
        }
    }.also { _Ladder = it }
