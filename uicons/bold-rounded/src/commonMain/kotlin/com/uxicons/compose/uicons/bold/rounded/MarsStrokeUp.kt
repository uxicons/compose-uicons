package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsStrokeUp: ImageVector? = null

val Icons.Br.MarsStrokeUp: ImageVector
    get() = _MarsStrokeUp ?: UXIcon(name = "MarsStrokeUp") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13.5f, 10.17f)
            verticalLineToRelative(-1.17f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(1.56f)
            curveToRelative(0.86f, 0f, 1.29f, -1.04f, 0.69f, -1.65f)
            lineTo(12.69f, 0.28f)
            curveToRelative(-0.38f, -0.38f, -0.99f, -0.38f, -1.37f, 0f)
            lineToRelative(-3.06f, 3.06f)
            curveToRelative(-0.61f, 0.61f, -0.18f, 1.65f, 0.69f, 1.65f)
            horizontalLineToRelative(1.56f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(1.17f)
            curveToRelative(-3.14f, 0.69f, -5.5f, 3.49f, -5.5f, 6.83f)
            curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
            curveToRelative(0f, -3.35f, -2.36f, -6.14f, -5.5f, -6.83f)
            close()
            moveTo(12f, 21f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            close()
        }
    }.also { _MarsStrokeUp = it }
