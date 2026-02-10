package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PointerLoading: ImageVector? = null

val Icons.Br.PointerLoading: ImageVector
    get() = _PointerLoading ?: UXIcon(name = "PointerLoading") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 19.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(5.5f, 18f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(9.5f, 18f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(24f, 6.21f)
            verticalLineToRelative(10.79f)
            curveToRelative(0f, 0.6f, -0.36f, 1.15f, -0.92f, 1.39f)
            curveToRelative(-0.19f, 0.08f, -0.38f, 0.12f, -0.58f, 0.12f)
            curveToRelative(-0.39f, 0f, -0.77f, -0.15f, -1.06f, -0.43f)
            lineToRelative(-2.57f, -2.54f)
            lineToRelative(-2.2f, 4.28f)
            curveToRelative(-0.39f, 0.76f, -1.16f, 1.19f, -1.96f, 1.19f)
            curveToRelative(-0.33f, 0f, -0.66f, -0.07f, -0.97f, -0.23f)
            curveToRelative(-0.53f, -0.27f, -0.92f, -0.72f, -1.1f, -1.28f)
            curveToRelative(-0.18f, -0.56f, -0.14f, -1.16f, 0.13f, -1.68f)
            lineToRelative(2.2f, -4.33f)
            lineToRelative(-3.66f, -0.49f)
            curveToRelative(-0.59f, -0.08f, -1.08f, -0.51f, -1.25f, -1.08f)
            curveToRelative(-0.16f, -0.58f, 0.04f, -1.2f, 0.5f, -1.57f)
            lineTo(18.74f, 3.75f)
            curveToRelative(0.93f, -0.8f, 2.24f, -0.98f, 3.39f, -0.45f)
            curveToRelative(1.15f, 0.53f, 1.87f, 1.65f, 1.87f, 2.92f)
            close()
            moveTo(21f, 6.21f)
            curveToRelative(0f, -0.04f, 0f, -0.13f, -0.12f, -0.19f)
            curveToRelative(-0.12f, -0.06f, -0.19f, 0.01f, -0.22f, 0.03f)
            lineToRelative(-5.5f, 4.42f)
            lineToRelative(2.84f, 0.38f)
            curveToRelative(0.32f, 0.04f, 0.62f, 0.19f, 0.85f, 0.42f)
            lineToRelative(2.15f, 2.12f)
            lineTo(21f, 6.21f)
            close()
        }
    }.also { _PointerLoading = it }
