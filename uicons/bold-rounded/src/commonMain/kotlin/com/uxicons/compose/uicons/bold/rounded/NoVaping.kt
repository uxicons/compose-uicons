package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoVaping: ImageVector? = null

val Icons.Br.NoVaping: ImageVector
    get() = _NoVaping ?: UXIcon(name = "NoVaping") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(9.5f, 21f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-9.5f)
            horizontalLineToRelative(7.5f)
            curveToRelative(0.91f, 0f, 1.75f, 0.49f, 2.19f, 1.29f)
            curveToRelative(0.4f, 0.72f, 1.31f, 0.98f, 2.04f, 0.58f)
            curveToRelative(0.72f, -0.4f, 0.99f, -1.31f, 0.58f, -2.04f)
            curveToRelative(-0.97f, -1.75f, -2.81f, -2.84f, -4.81f, -2.84f)
            horizontalLineToRelative(-3.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.5f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(14.5f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(4f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18f, 12f)
            curveToRelative(-3.31f, 0.0f, -6.0f, 2.69f, -6f, 6f)
            curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
            curveToRelative(3.32f, 0.08f, 6.05f, -2.68f, 6f, -6f)
            curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
            close()
            moveTo(18f, 21f)
            curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
            curveToRelative(0f, -0.27f, 0.05f, -0.52f, 0.11f, -0.77f)
            lineToRelative(3.65f, 3.65f)
            curveToRelative(-0.25f, 0.07f, -0.5f, 0.11f, -0.77f, 0.11f)
            close()
            moveTo(20.89f, 18.77f)
            lineTo(17.23f, 15.11f)
            curveToRelative(0.25f, -0.07f, 0.5f, -0.11f, 0.77f, -0.11f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            curveToRelative(0f, 0.27f, -0.05f, 0.52f, -0.11f, 0.77f)
            close()
        }
    }.also { _NoVaping = it }
