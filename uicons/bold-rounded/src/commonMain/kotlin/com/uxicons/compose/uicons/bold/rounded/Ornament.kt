package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ornament: ImageVector? = null

val Icons.Br.Ornament: ImageVector
    get() = _Ornament ?: UXIcon(name = "Ornament") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.99f, 4.83f)
            curveToRelative(-0.09f, -1.02f, -0.95f, -1.83f, -1.99f, -1.83f)
            horizontalLineToRelative(-0.27f)
            curveToRelative(0.17f, -0.29f, 0.27f, -0.64f, 0.27f, -1f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
            curveToRelative(0f, 0.36f, 0.1f, 0.71f, 0.27f, 1f)
            horizontalLineToRelative(-0.27f)
            curveToRelative(-1.05f, 0f, -1.91f, 0.81f, -1.99f, 1.83f)
            curveToRelative(-3.53f, 1.54f, -6.01f, 5.07f, -6.01f, 9.17f)
            curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
            reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
            curveToRelative(0f, -4.1f, -2.48f, -7.62f, -6.01f, -9.17f)
            close()
            moveTo(12f, 7f)
            curveToRelative(3.67f, 0f, 6.69f, 2.84f, 6.98f, 6.44f)
            lineToRelative(-1.73f, -1.73f)
            curveToRelative(-0.9f, -0.9f, -2.38f, -0.9f, -3.28f, 0.01f)
            lineToRelative(-1.97f, 1.99f)
            lineToRelative(-1.98f, -2.0f)
            curveToRelative(-0.91f, -0.9f, -2.38f, -0.9f, -3.28f, 0f)
            lineToRelative(-1.72f, 1.72f)
            curveToRelative(0.29f, -3.6f, 3.31f, -6.44f, 6.98f, -6.44f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-2.78f, 0f, -5.19f, -1.63f, -6.32f, -3.98f)
            lineToRelative(2.69f, -2.69f)
            lineToRelative(1.98f, 2.0f)
            curveToRelative(0.88f, 0.88f, 2.4f, 0.88f, 3.29f, -0.01f)
            lineToRelative(1.98f, -2.0f)
            lineToRelative(2.7f, 2.7f)
            curveToRelative(-1.13f, 2.35f, -3.54f, 3.98f, -6.32f, 3.98f)
            close()
        }
    }.also { _Ornament = it }
