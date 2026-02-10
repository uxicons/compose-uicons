package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaMat: ImageVector? = null

val Icons.Br.YogaMat: ImageVector
    get() = _YogaMat ?: UXIcon(name = "YogaMat") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(19.5f, 0f)
            horizontalLineToRelative(-1f)
            curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
            verticalLineToRelative(2.5f)
            horizontalLineToRelative(-6f)
            verticalLineToRelative(-1.3f)
            curveToRelative(0f, -2.35f, -1.71f, -4.45f, -4.05f, -4.68f)
            curveTo(2.27f, -0.24f, 0f, 1.87f, 0f, 4.5f)
            verticalLineToRelative(15f)
            curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
            horizontalLineToRelative(14.86f)
            curveToRelative(2.49f, 0.1f, 4.73f, -2.08f, 4.64f, -4.55f)
            lineTo(24f, 4.5f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(3f, 19.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            close()
            moveTo(4.5f, 3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            lineTo(6f, 15.28f)
            curveToRelative(-0.47f, -0.17f, -0.97f, -0.28f, -1.5f, -0.28f)
            reflectiveCurveToRelative(-1.03f, 0.11f, -1.5f, 0.28f)
            lineTo(3f, 4.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(21f, 19.52f)
            curveToRelative(0.01f, 0.8f, -0.7f, 1.5f, -1.5f, 1.48f)
            lineTo(8.72f, 21f)
            curveToRelative(0.17f, -0.47f, 0.24f, -0.99f, 0.28f, -1.5f)
            lineTo(9f, 9f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            horizontalLineToRelative(0.83f)
            curveToRelative(0.92f, 0.0f, 1.69f, 0.69f, 1.67f, 1.52f)
            close()
            moveTo(21f, 15.29f)
            curveToRelative(-0.52f, -0.19f, -1.08f, -0.29f, -1.67f, -0.29f)
            horizontalLineToRelative(-0.83f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.23f, -0.5f, -0.5f)
            lineTo(18f, 3.5f)
            curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            lineTo(21f, 15.29f)
            close()
        }
    }.also { _YogaMat = it }
