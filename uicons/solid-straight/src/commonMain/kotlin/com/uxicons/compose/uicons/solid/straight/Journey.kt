package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Journey: ImageVector? = null

val Icons.Ss.Journey: ImageVector
    get() = _Journey ?: UXIcon(name = "Journey") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 16.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(20.03f, 4f)
                lineToRelative(-1.08f, -4f)
                horizontalLineToRelative(-0.89f)
                lineToRelative(-1.08f, 4f)
                horizontalLineToRelative(-3.99f)
                verticalLineToRelative(0.84f)
                lineToRelative(3.05f, 1.69f)
                lineToRelative(-1.2f, 3.74f)
                lineToRelative(0.66f, 0.5f)
                lineToRelative(3.0f, -2.32f)
                lineToRelative(2.99f, 2.31f)
                lineToRelative(0.69f, -0.48f)
                lineToRelative(-1.22f, -3.69f)
                lineToRelative(3.02f, -1.75f)
                verticalLineToRelative(-0.84f)
                horizontalLineToRelative(-3.97f)
                close()
                moveTo(5f, 20f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(20f, 14f)
                horizontalLineToRelative(-9f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(1.82f)
                lineToRelative(0.65f, -2f)
                horizontalLineToRelative(-2.47f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(9f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-11.54f)
                curveToRelative(0.34f, 0.59f, 0.54f, 1.27f, 0.54f, 2f)
                horizontalLineToRelative(11f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
            }
        }.also { _Journey = it}
