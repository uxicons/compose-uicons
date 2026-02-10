package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Whale: ImageVector? = null

val Icons.Br.Whale: ImageVector
    get() = _Whale ?: UXIcon(name = "Whale") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 15.51f)
            verticalLineToRelative(3.0f)
            curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
            horizontalLineToRelative(-8.95f)
            curveTo(4.28f, 24f, 0f, 19.72f, 0f, 14.45f)
            curveToRelative(0f, -2.88f, 0.84f, -5.67f, 2.44f, -8.07f)
            lineToRelative(0.87f, -1.3f)
            curveTo(1.61f, 4.34f, 0.33f, 2.79f, 0.01f, 0.91f)
            curveTo(-0.08f, 0.4f, 0.37f, -0.05f, 0.88f, 0.01f)
            curveToRelative(3.44f, 0.38f, 4.62f, 2.76f, 4.62f, 2.76f)
            curveTo(5.5f, 2.77f, 6.64f, 0.38f, 10.12f, 0.01f)
            curveToRelative(0.51f, -0.06f, 0.96f, 0.39f, 0.87f, 0.9f)
            curveToRelative(-0.38f, 2.23f, -2.1f, 4.01f, -4.29f, 4.5f)
            lineToRelative(-1.76f, 2.64f)
            curveToRelative(-1.27f, 1.9f, -1.94f, 4.12f, -1.94f, 6.41f)
            curveToRelative(0f, 3.61f, 2.94f, 6.55f, 6.55f, 6.55f)
            horizontalLineToRelative(8.95f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-3.0f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            lineToRelative(-2.0f, -0.0f)
            curveToRelative(-0.01f, 0f, -3.06f, 0.12f, -7.0f, 3.62f)
            curveToRelative(-0.62f, 0.55f, -1.57f, 0.49f, -2.12f, -0.12f)
            curveToRelative(-0.55f, -0.62f, -0.49f, -1.57f, 0.12f, -2.12f)
            curveToRelative(4.87f, -4.33f, 8.83f, -4.38f, 9.0f, -4.38f)
            lineToRelative(2.0f, 0.0f)
            curveToRelative(4.13f, 0.0f, 7.5f, 3.37f, 7.5f, 7.5f)
            close()
            moveTo(16f, 17.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            close()
        }
    }.also { _Whale = it }
