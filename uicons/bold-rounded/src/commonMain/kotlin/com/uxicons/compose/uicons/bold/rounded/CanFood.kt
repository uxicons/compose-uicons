package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CanFood: ImageVector? = null

val Icons.Br.CanFood: ImageVector
    get() = _CanFood ?: UXIcon(name = "CanFood") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(22f, 3f)
            curveToRelative(0f, -1.66f, -4.48f, -3f, -10f, -3f)
            reflectiveCurveTo(2f, 1.34f, 2f, 3f)
            verticalLineToRelative(16.95f)
            curveToRelative(0f, 2.99f, 5.39f, 4.05f, 10f, 4.05f)
            reflectiveCurveToRelative(10f, -1.06f, 10f, -4.05f)
            lineTo(22f, 3f)
            close()
            moveTo(19f, 14.7f)
            curveToRelative(-0.6f, 0.49f, -3.08f, 1.3f, -7f, 1.3f)
            reflectiveCurveToRelative(-6.41f, -0.82f, -7f, -1.3f)
            verticalLineToRelative(-4.7f)
            curveToRelative(1.96f, 0.71f, 4.58f, 1.0f, 7f, 1.0f)
            reflectiveCurveToRelative(5.04f, -0.3f, 7f, -1.0f)
            verticalLineToRelative(4.7f)
            close()
            moveTo(19f, 5.14f)
            verticalLineToRelative(1.56f)
            curveToRelative(-0.6f, 0.49f, -3.08f, 1.3f, -7f, 1.3f)
            reflectiveCurveToRelative(-6.41f, -0.82f, -7f, -1.3f)
            verticalLineToRelative(-1.56f)
            curveToRelative(1.8f, 0.53f, 4.27f, 0.86f, 7f, 0.86f)
            reflectiveCurveToRelative(5.2f, -0.33f, 7f, -0.86f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-3.9f, 0f, -6.39f, -0.81f, -7f, -1.3f)
            verticalLineToRelative(-1.71f)
            curveToRelative(1.96f, 0.71f, 4.58f, 1.0f, 7f, 1.0f)
            reflectiveCurveToRelative(5.04f, -0.3f, 7f, -1.0f)
            verticalLineToRelative(1.71f)
            curveToRelative(-0.61f, 0.49f, -3.1f, 1.3f, -7f, 1.3f)
            close()
        }
    }.also { _CanFood = it }
