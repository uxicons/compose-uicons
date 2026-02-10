package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Launch: ImageVector? = null

val Icons.Br.Launch: ImageVector
    get() = _Launch ?: UXIcon(name = "Launch") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 21f)
            verticalLineToRelative(1.15f)
            curveToRelative(0f, 1.02f, -0.83f, 1.85f, -1.85f, 1.85f)
            horizontalLineToRelative(-20.31f)
            curveToRelative(-1.02f, 0f, -1.85f, -0.83f, -1.85f, -1.85f)
            verticalLineToRelative(-1.15f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -1.58f, 0.68f, -3.08f, 1.86f, -4.12f)
            curveToRelative(0.62f, -0.55f, 1.57f, -0.49f, 2.12f, 0.13f)
            curveToRelative(0.55f, 0.62f, 0.49f, 1.57f, -0.13f, 2.12f)
            curveToRelative(-0.54f, 0.47f, -0.85f, 1.16f, -0.85f, 1.88f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(3.31f)
            lineToRelative(0.92f, 1f)
            horizontalLineToRelative(5.54f)
            lineToRelative(0.92f, -1f)
            horizontalLineToRelative(3.31f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -0.72f, -0.31f, -1.4f, -0.85f, -1.88f)
            curveToRelative(-0.62f, -0.55f, -0.68f, -1.5f, -0.13f, -2.12f)
            reflectiveCurveToRelative(1.5f, -0.68f, 2.12f, -0.13f)
            curveToRelative(1.18f, 1.04f, 1.86f, 2.55f, 1.86f, 4.12f)
            verticalLineToRelative(7.5f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
            moveTo(7.37f, 13.37f)
            curveToRelative(-0.23f, -0.23f, -0.37f, -0.55f, -0.35f, -0.88f)
            curveToRelative(0.07f, -1.74f, 0.51f, -3.04f, 1.73f, -4.25f)
            curveToRelative(0.15f, -3.01f, 1.14f, -5.49f, 2.06f, -7.47f)
            curveToRelative(0.31f, -0.66f, 1.1f, -0.95f, 1.76f, -0.64f)
            curveToRelative(0.28f, 0.13f, 0.51f, 0.36f, 0.64f, 0.64f)
            curveToRelative(0.93f, 1.99f, 1.92f, 4.53f, 2.07f, 7.51f)
            curveToRelative(1.19f, 1.19f, 1.65f, 2.48f, 1.72f, 4.21f)
            curveToRelative(0.01f, 0.33f, -0.12f, 0.65f, -0.35f, 0.89f)
            curveToRelative(-0.43f, 0.43f, -1.12f, 0.47f, -1.6f, 0.1f)
            lineToRelative(-0.92f, -0.72f)
            horizontalLineToRelative(-0.62f)
            verticalLineToRelative(0.76f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-0.76f)
            horizontalLineToRelative(-0.62f)
            lineToRelative(-0.92f, 0.72f)
            curveToRelative(-0.48f, 0.38f, -1.17f, 0.34f, -1.6f, -0.1f)
            close()
            moveTo(10.5f, 8.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            close()
        }
    }.also { _Launch = it }
