package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pig: ImageVector? = null

val Icons.Br.Pig: ImageVector
    get() = _Pig ?: UXIcon(name = "Pig") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17f, 10.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(24f, 11f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            horizontalLineToRelative(-0.08f)
            curveToRelative(-0.74f, 1.83f, -2.15f, 3.33f, -3.92f, 4.19f)
            verticalLineToRelative(0.31f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            curveToRelative(-1.21f, 0f, -2.22f, -0.86f, -2.45f, -2f)
            horizontalLineToRelative(-4.1f)
            curveToRelative(-0.23f, 1.14f, -1.24f, 2f, -2.45f, 2f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-0.57f)
            curveTo(1.61f, 17.54f, 0f, 14.96f, 0f, 12f)
            curveTo(0f, 10.57f, 0.38f, 9.23f, 1.03f, 8.07f)
            curveTo(0.43f, 7.13f, 0.09f, 5.96f, 0.01f, 4.58f)
            curveToRelative(-0.04f, -0.83f, 0.59f, -1.53f, 1.42f, -1.58f)
            curveToRelative(0.82f, -0.04f, 1.53f, 0.59f, 1.58f, 1.42f)
            curveToRelative(0.02f, 0.44f, 0.09f, 0.84f, 0.18f, 1.19f)
            curveToRelative(1.34f, -1.01f, 3.0f, -1.61f, 4.8f, -1.61f)
            horizontalLineToRelative(5.12f)
            curveToRelative(0.35f, -1.41f, 1.39f, -2.6f, 2.74f, -2.97f)
            curveToRelative(0.57f, -0.16f, 1.14f, 0.28f, 1.14f, 0.88f)
            verticalLineToRelative(2.49f)
            curveToRelative(2.23f, 0.74f, 4.04f, 2.43f, 4.92f, 4.6f)
            horizontalLineToRelative(0.08f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            close()
            moveTo(14.5f, 7f)
            horizontalLineToRelative(-6.54f)
            curveToRelative(-2.74f, 0f, -4.96f, 2.26f, -4.96f, 5f)
            curveToRelative(0f, 2.73f, 2.21f, 5f, 4.93f, 5f)
            horizontalLineToRelative(6.34f)
            curveToRelative(2.61f, 0f, 4.95f, -1.9f, 5.2f, -4.5f)
            curveToRelative(0.29f, -2.98f, -2.05f, -5.5f, -4.98f, -5.5f)
            close()
        }
    }.also { _Pig = it }
