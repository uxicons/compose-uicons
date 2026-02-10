package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PriorityArrow: ImageVector? = null

val Icons.Br.PriorityArrow: ImageVector
    get() = _PriorityArrow ?: UXIcon(name = "PriorityArrow") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(24f, 10.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(22.5f, 1f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(22.5f, 17f)
            horizontalLineToRelative(-3f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(3f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(13.49f, 1.13f)
            curveToRelative(-0.55f, -0.55f, -1.49f, -0.16f, -1.49f, 0.62f)
            verticalLineToRelative(1.26f)
            horizontalLineToRelative(-3.0f)
            curveTo(4.04f, 3f, 0f, 7.04f, 0f, 12f)
            reflectiveCurveToRelative(4.04f, 9f, 9f, 9f)
            horizontalLineToRelative(5.5f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-5.5f)
            curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
            reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
            horizontalLineToRelative(3.0f)
            verticalLineToRelative(1.26f)
            curveToRelative(0f, 0.78f, 0.94f, 1.17f, 1.49f, 0.62f)
            lineToRelative(2.76f, -2.76f)
            curveToRelative(0.34f, -0.34f, 0.34f, -0.89f, 0f, -1.23f)
            lineToRelative(-2.76f, -2.76f)
            close()
        }
    }.also { _PriorityArrow = it }
