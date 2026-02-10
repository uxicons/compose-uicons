package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GuaraniSign: ImageVector? = null

val Icons.Br.GuaraniSign: ImageVector
    get() = _GuaraniSign ?: UXIcon(name = "GuaraniSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(21.43f, 12.58f)
            curveToRelative(-0.65f, -0.99f, -1.74f, -1.58f, -2.93f, -1.58f)
            horizontalLineToRelative(-5f)
            lineTo(13.5f, 5.16f)
            curveToRelative(1.95f, 0.4f, 3.74f, 1.56f, 4.73f, 3.14f)
            curveToRelative(0.44f, 0.7f, 1.37f, 0.92f, 2.07f, 0.48f)
            curveToRelative(0.7f, -0.44f, 0.92f, -1.36f, 0.48f, -2.07f)
            curveToRelative(-1.53f, -2.45f, -4.29f, -4.16f, -7.27f, -4.6f)
            verticalLineToRelative(-0.61f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.61f)
            curveTo(5.7f, 2.84f, 2.01f, 7f, 2.01f, 12f)
            reflectiveCurveToRelative(3.69f, 9.17f, 8.49f, 9.89f)
            verticalLineToRelative(0.61f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.61f)
            curveToRelative(3.59f, -0.52f, 6.84f, -2.83f, 8.21f, -5.98f)
            curveToRelative(0.47f, -1.09f, 0.37f, -2.33f, -0.28f, -3.33f)
            close()
            moveTo(5.01f, 12f)
            curveToRelative(0f, -3.34f, 2.35f, -6.14f, 5.49f, -6.84f)
            verticalLineToRelative(13.67f)
            curveToRelative(-3.14f, -0.69f, -5.49f, -3.49f, -5.49f, -6.84f)
            close()
            moveTo(18.96f, 14.71f)
            curveToRelative(-0.9f, 2.06f, -3.06f, 3.65f, -5.46f, 4.14f)
            verticalLineToRelative(-4.85f)
            horizontalLineToRelative(5f)
            curveToRelative(0.24f, 0f, 0.36f, 0.14f, 0.42f, 0.23f)
            curveToRelative(0.06f, 0.09f, 0.14f, 0.26f, 0.04f, 0.48f)
            close()
        }
    }.also { _GuaraniSign = it }
