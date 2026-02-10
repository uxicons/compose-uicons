package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pillar: ImageVector? = null

val Icons.Br.Pillar: ImageVector
    get() = _Pillar ?: UXIcon(name = "Pillar") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 5f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            horizontalLineToRelative(-14f)
            curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
            reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
            verticalLineToRelative(11f)
            horizontalLineToRelative(-1.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(17f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1.5f)
            verticalLineToRelative(-11f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            close()
            moveTo(3f, 5f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(14f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            curveToRelative(-0.99f, 0f, -1.84f, -0.74f, -1.98f, -1.71f)
            curveToRelative(-0.12f, -0.82f, -0.88f, -1.39f, -1.7f, -1.27f)
            curveToRelative(-0.82f, 0.12f, -1.39f, 0.88f, -1.27f, 1.7f)
            curveToRelative(0.07f, 0.46f, 0.21f, 0.88f, 0.39f, 1.29f)
            horizontalLineToRelative(-4.88f)
            curveToRelative(0.18f, -0.41f, 0.33f, -0.83f, 0.39f, -1.29f)
            curveToRelative(0.12f, -0.82f, -0.45f, -1.58f, -1.27f, -1.7f)
            curveToRelative(-0.82f, -0.11f, -1.58f, 0.45f, -1.7f, 1.27f)
            curveToRelative(-0.14f, 0.98f, -0.99f, 1.71f, -1.98f, 1.71f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            close()
            moveTo(13.5f, 21f)
            verticalLineToRelative(-7.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(7.5f)
            horizontalLineToRelative(-2.5f)
            verticalLineToRelative(-11f)
            horizontalLineToRelative(8f)
            verticalLineToRelative(11f)
            close()
        }
    }.also { _Pillar = it }
