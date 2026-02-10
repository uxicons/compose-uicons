package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SuitcaseAlt: ImageVector? = null

val Icons.Br.SuitcaseAlt: ImageVector
    get() = _SuitcaseAlt ?: UXIcon(name = "SuitcaseAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18.5f, 3f)
            horizontalLineToRelative(-0.63f)
            curveToRelative(-0.45f, -1.72f, -2.01f, -3f, -3.87f, -3f)
            horizontalLineToRelative(-4f)
            curveToRelative(-1.86f, 0f, -3.43f, 1.28f, -3.87f, 3f)
            horizontalLineToRelative(-0.63f)
            curveTo(2.47f, 3f, 0f, 5.47f, 0f, 8.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 8.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-0.5f)
            lineTo(18f, 9.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(11.5f)
            horizontalLineToRelative(-6f)
            lineTo(9f, 9.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(11.5f)
            horizontalLineToRelative(-0.5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 8.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(10f)
            close()
        }
    }.also { _SuitcaseAlt = it }
