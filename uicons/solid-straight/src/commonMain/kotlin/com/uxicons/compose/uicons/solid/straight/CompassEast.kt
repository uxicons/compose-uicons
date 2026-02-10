package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassEast: ImageVector? = null

val Icons.Ss.CompassEast: ImageVector
    get() = _CompassEast ?: UXIcon(name = "CompassEast") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 7.79f)
                lineToRelative(7.06f, 4.22f)
                lineToRelative(-7.04f, 4.23f)
                lineToRelative(1.8f, -4.24f)
                lineToRelative(-1.82f, -4.21f)
                horizontalLineToRelative(0.0f)
                close()
                moveTo(24f, 12.0f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(19.95f, 12.0f)
                lineTo(10.0f, 6.05f)
                lineToRelative(-0.02f, -0.01f)
                curveToRelative(-0.61f, -0.34f, -1.34f, -0.34f, -1.95f, -0.01f)
                curveToRelative(-0.96f, 0.53f, -1.32f, 1.75f, -0.83f, 2.63f)
                lineToRelative(1.44f, 3.34f)
                lineToRelative(-1.41f, 3.32f)
                curveToRelative(-0.3f, 0.59f, -0.29f, 1.31f, 0.04f, 1.9f)
                curveToRelative(0.36f, 0.65f, 1.04f, 1.01f, 1.74f, 1.01f)
                curveToRelative(0.34f, 0f, 0.69f, -0.09f, 1.01f, -0.27f)
                lineToRelative(9.92f, -5.96f)
                close()
            }
        }.also { _CompassEast = it}
