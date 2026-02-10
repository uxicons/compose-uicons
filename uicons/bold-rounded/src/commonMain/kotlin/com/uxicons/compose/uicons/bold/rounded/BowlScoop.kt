package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlScoop: ImageVector? = null

val Icons.Br.BowlScoop: ImageVector
    get() = _BowlScoop ?: UXIcon(name = "BowlScoop") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(1.14f, 9.27f)
            curveTo(1.99f, 3.9f, 6.56f, 0f, 12f, 0f)
            reflectiveCurveToRelative(10.01f, 3.9f, 10.86f, 9.27f)
            curveToRelative(0.13f, 0.82f, -0.43f, 1.59f, -1.25f, 1.72f)
            curveToRelative(-0.08f, 0.01f, -0.16f, 0.02f, -0.24f, 0.02f)
            curveToRelative(-0.72f, 0f, -1.36f, -0.53f, -1.48f, -1.27f)
            curveToRelative(-0.62f, -3.9f, -3.94f, -6.73f, -7.9f, -6.73f)
            reflectiveCurveToRelative(-7.28f, 2.83f, -7.9f, 6.73f)
            curveToRelative(-0.13f, 0.82f, -0.9f, 1.38f, -1.72f, 1.25f)
            curveToRelative(-0.82f, -0.13f, -1.38f, -0.9f, -1.25f, -1.72f)
            close()
            moveTo(22.8f, 13f)
            lineTo(1.21f, 13f)
            curveToRelative(-0.85f, 0f, -1.43f, 0.85f, -1.12f, 1.64f)
            lineToRelative(0.72f, 1.86f)
            curveToRelative(1.49f, 2.48f, 4.03f, 2.54f, 6.84f, 2.5f)
            horizontalLineToRelative(2.85f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(7f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(2.85f)
            curveToRelative(2.82f, 0.04f, 5.35f, -0.02f, 6.84f, -2.5f)
            lineToRelative(0.72f, -1.86f)
            curveToRelative(0.31f, -0.79f, -0.28f, -1.64f, -1.12f, -1.64f)
            close()
        }
    }.also { _BowlScoop = it }
