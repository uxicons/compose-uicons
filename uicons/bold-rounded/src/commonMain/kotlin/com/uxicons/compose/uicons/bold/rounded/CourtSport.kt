package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CourtSport: ImageVector? = null

val Icons.Br.CourtSport: ImageVector
    get() = _CourtSport ?: UXIcon(name = "CourtSport") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19f, 3f)
            lineTo(5f, 3f)
            curveTo(2.24f, 3f, 0f, 5.24f, 0f, 8f)
            verticalLineToRelative(8f)
            curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
            horizontalLineToRelative(14f)
            curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
            verticalLineToRelative(-8f)
            curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
            close()
            moveTo(12f, 14f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
            reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
            reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
            close()
            moveTo(3f, 16f)
            curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
            curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
            horizontalLineToRelative(5.5f)
            verticalLineToRelative(1.25f)
            curveToRelative(-2.02f, 0.64f, -3.5f, 2.51f, -3.5f, 4.75f)
            reflectiveCurveToRelative(1.48f, 4.1f, 3.5f, 4.75f)
            verticalLineToRelative(1.25f)
            horizontalLineToRelative(-5.5f)
            curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
            close()
            moveTo(19f, 18f)
            horizontalLineToRelative(-5.5f)
            verticalLineToRelative(-1.25f)
            curveToRelative(2.02f, -0.64f, 3.5f, -2.51f, 3.5f, -4.75f)
            reflectiveCurveToRelative(-1.48f, -4.1f, -3.5f, -4.75f)
            verticalLineToRelative(-1.25f)
            horizontalLineToRelative(5.5f)
            curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
            curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
            curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
            close()
        }
    }.also { _CourtSport = it }
