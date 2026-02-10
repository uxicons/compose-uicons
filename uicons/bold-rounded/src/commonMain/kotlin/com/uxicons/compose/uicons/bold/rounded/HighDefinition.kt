package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HighDefinition: ImageVector? = null

val Icons.Br.HighDefinition: ImageVector
    get() = _HighDefinition ?: UXIcon(name = "HighDefinition") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(17.5f, 2f)
            lineTo(6.5f, 2f)
            curveTo(2.92f, 2f, 0f, 4.92f, 0f, 8.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 3.58f, 2.92f, 6.5f, 6.5f, 6.5f)
            horizontalLineToRelative(11f)
            curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
            close()
            moveTo(21f, 15.5f)
            curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
            lineTo(6.5f, 19f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            verticalLineToRelative(-7f)
            curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(11f)
            curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
            verticalLineToRelative(7f)
            close()
            moveTo(11f, 8f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            close()
            moveTo(15.5f, 7f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            horizontalLineToRelative(0.5f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
            close()
            moveTo(17f, 13.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-0.5f)
            reflectiveCurveToRelative(0f, -6f, 0f, -6f)
            horizontalLineToRelative(0.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(3f)
            close()
        }
    }.also { _HighDefinition = it }
