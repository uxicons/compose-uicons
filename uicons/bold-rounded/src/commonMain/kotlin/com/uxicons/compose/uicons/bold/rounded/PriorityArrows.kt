package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PriorityArrows: ImageVector? = null

val Icons.Br.PriorityArrows: ImageVector
    get() = _PriorityArrows ?: UXIcon(name = "PriorityArrows") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(18.5f, 0f)
            lineTo(5.5f, 0f)
            curveTo(2.47f, 0f, 0f, 2.47f, 0f, 5.5f)
            verticalLineToRelative(13f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 5.5f)
            curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
            close()
            moveTo(21f, 18.5f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            lineTo(3f, 5.5f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            verticalLineToRelative(13f)
            close()
            moveTo(10f, 11.0f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-5.5f)
            horizontalLineToRelative(-1.54f)
            curveToRelative(-0.86f, 0f, -1.28f, -1.03f, -0.68f, -1.64f)
            lineToRelative(3.04f, -3.04f)
            curveToRelative(0.38f, -0.38f, 0.98f, -0.38f, 1.36f, 0f)
            lineToRelative(3.04f, 3.04f)
            curveToRelative(0.6f, 0.6f, 0.18f, 1.64f, -0.68f, 1.64f)
            horizontalLineToRelative(-1.54f)
            close()
            moveTo(19.22f, 14.64f)
            lineToRelative(-3.04f, 3.04f)
            curveToRelative(-0.38f, 0.38f, -0.98f, 0.38f, -1.36f, 0f)
            lineToRelative(-3.04f, -3.04f)
            curveToRelative(-0.6f, -0.6f, -0.18f, -1.64f, 0.68f, -1.64f)
            horizontalLineToRelative(1.54f)
            verticalLineToRelative(-5.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(5.5f)
            horizontalLineToRelative(1.54f)
            curveToRelative(0.86f, 0f, 1.28f, 1.03f, 0.68f, 1.64f)
            close()
        }
    }.also { _PriorityArrows = it }
