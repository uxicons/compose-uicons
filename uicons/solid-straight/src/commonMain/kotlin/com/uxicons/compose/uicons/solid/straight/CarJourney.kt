package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarJourney: ImageVector? = null

val Icons.Ss.CarJourney: ImageVector
    get() = _CarJourney ?: UXIcon(name = "CarJourney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 10f)
                horizontalLineToRelative(-2f)
                lineTo(18f, 0f)
                horizontalLineToRelative(2f)
                lineToRelative(4f, 2.5f)
                lineToRelative(-4f, 2.5f)
                verticalLineToRelative(5f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-7f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(7f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(12f, 20.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(-2.02f)
                curveToRelative(0.01f, 0.08f, 0.02f, 0.17f, 0.02f, 0.25f)
                curveToRelative(0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                reflectiveCurveToRelative(-1.75f, -0.78f, -1.75f, -1.75f)
                curveToRelative(0f, -0.09f, 0.01f, -0.17f, 0.02f, -0.25f)
                horizontalLineToRelative(-2.04f)
                curveToRelative(0.01f, 0.08f, 0.02f, 0.17f, 0.02f, 0.25f)
                curveToRelative(0f, 0.97f, -0.78f, 1.75f, -1.75f, 1.75f)
                reflectiveCurveToRelative(-1.75f, -0.78f, -1.75f, -1.75f)
                curveToRelative(0f, -0.09f, 0.01f, -0.17f, 0.02f, -0.25f)
                lineTo(0f, 22f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(3.2f)
                curveToRelative(0.84f, 0f, 1.61f, 0.42f, 2.08f, 1.11f)
                lineToRelative(1.92f, 2.89f)
                horizontalLineToRelative(0.8f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(2f, 19f)
                horizontalLineToRelative(5.3f)
                lineToRelative(-1.19f, -1.78f)
                curveToRelative(-0.09f, -0.14f, -0.25f, -0.22f, -0.42f, -0.22f)
                horizontalLineToRelative(-3.2f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.5f)
                close()
            }
        }.also { _CarJourney = it}
