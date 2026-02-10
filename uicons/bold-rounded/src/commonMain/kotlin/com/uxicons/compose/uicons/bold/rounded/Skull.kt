package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Skull: ImageVector? = null

val Icons.Br.Skull: ImageVector
    get() = _Skull ?: UXIcon(name = "Skull") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12.75f, 0.02f)
            curveToRelative(-3.08f, -0.2f, -6.01f, 0.84f, -8.26f, 2.94f)
            curveTo(2.27f, 5.04f, 1f, 7.97f, 1f, 11f)
            verticalLineToRelative(3.5f)
            curveToRelative(0f, 2.52f, 1.7f, 4.64f, 4.01f, 5.29f)
            curveToRelative(0.15f, 2.35f, 2.11f, 4.21f, 4.49f, 4.21f)
            horizontalLineToRelative(5f)
            curveToRelative(2.38f, 0f, 4.34f, -1.86f, 4.49f, -4.21f)
            curveToRelative(2.31f, -0.65f, 4.01f, -2.78f, 4.01f, -5.29f)
            verticalLineToRelative(-3.17f)
            curveTo(23f, 5.38f, 18.5f, 0.41f, 12.75f, 0.02f)
            close()
            moveTo(20f, 14.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-3.5f)
            curveToRelative(0f, -2.23f, 0.9f, -4.31f, 2.54f, -5.84f)
            curveToRelative(1.5f, -1.4f, 3.42f, -2.16f, 5.46f, -2.16f)
            curveToRelative(0.18f, 0f, 0.37f, 0.01f, 0.55f, 0.02f)
            curveToRelative(4.18f, 0.28f, 7.45f, 3.93f, 7.45f, 8.32f)
            verticalLineToRelative(3.17f)
            close()
            moveTo(8f, 9f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
            close()
            moveTo(16f, 9f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
            reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
            reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
            close()
            moveTo(14f, 17f)
            curveToRelative(0f, 1.1f, -0.9f, 1f, -2f, 1f)
            reflectiveCurveToRelative(-2f, 0.1f, -2f, -1f)
            reflectiveCurveToRelative(0.9f, -3f, 2f, -3f)
            reflectiveCurveToRelative(2f, 1.9f, 2f, 3f)
            close()
        }
    }.also { _Skull = it }
