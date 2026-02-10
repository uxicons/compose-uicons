package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsStrokeRight: ImageVector? = null

val Icons.Br.MarsStrokeRight: ImageVector
    get() = _MarsStrokeRight ?: UXIcon(name = "MarsStrokeRight") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.72f, 11.31f)
            lineToRelative(-3.06f, -3.06f)
            curveToRelative(-0.61f, -0.61f, -1.65f, -0.18f, -1.65f, 0.69f)
            verticalLineToRelative(1.56f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-1f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(1f)
            horizontalLineToRelative(-1.17f)
            curveToRelative(-0.69f, -3.14f, -3.49f, -5.5f, -6.83f, -5.5f)
            curveTo(3.14f, 5f, 0f, 8.14f, 0f, 12f)
            reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
            curveToRelative(3.35f, 0f, 6.14f, -2.36f, 6.83f, -5.5f)
            horizontalLineToRelative(1.17f)
            verticalLineToRelative(1f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-1f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(1.56f)
            curveToRelative(0f, 0.86f, 1.04f, 1.29f, 1.65f, 0.69f)
            lineToRelative(3.06f, -3.06f)
            curveToRelative(0.38f, -0.38f, 0.38f, -0.99f, 0f, -1.37f)
            close()
            moveTo(7f, 16f)
            curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
            reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
            reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
            reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
            close()
        }
    }.also { _MarsStrokeRight = it }
