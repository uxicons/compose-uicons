package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CediSign: ImageVector? = null

val Icons.Br.CediSign: ImageVector
    get() = _CediSign ?: UXIcon(name = "CediSign") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(20.14f, 15.4f)
            curveToRelative(-0.74f, -0.38f, -1.64f, -0.09f, -2.02f, 0.64f)
            curveToRelative(-0.8f, 1.55f, -2.37f, 2.63f, -4.12f, 2.89f)
            lineTo(14f, 5.06f)
            curveToRelative(1.78f, 0.26f, 3.36f, 1.37f, 4.16f, 2.97f)
            curveToRelative(0.37f, 0.74f, 1.27f, 1.05f, 2.01f, 0.67f)
            curveToRelative(0.74f, -0.37f, 1.04f, -1.27f, 0.68f, -2.01f)
            curveToRelative(-1.3f, -2.61f, -3.92f, -4.37f, -6.84f, -4.65f)
            verticalLineToRelative(-0.54f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(0.51f)
            curveToRelative(-4.45f, 0.24f, -8f, 3.93f, -8f, 8.44f)
            verticalLineToRelative(3.09f)
            curveToRelative(0f, 4.51f, 3.55f, 8.2f, 8f, 8.44f)
            verticalLineToRelative(0.51f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-0.54f)
            curveToRelative(2.87f, -0.28f, 5.47f, -2f, 6.78f, -4.54f)
            curveToRelative(0.38f, -0.74f, 0.09f, -1.64f, -0.64f, -2.02f)
            close()
            moveTo(6f, 13.54f)
            verticalLineToRelative(-3.09f)
            curveToRelative(0f, -2.85f, 2.2f, -5.2f, 5f, -5.43f)
            verticalLineToRelative(13.96f)
            curveToRelative(-2.8f, -0.23f, -5f, -2.58f, -5f, -5.43f)
            close()
        }
    }.also { _CediSign = it }
