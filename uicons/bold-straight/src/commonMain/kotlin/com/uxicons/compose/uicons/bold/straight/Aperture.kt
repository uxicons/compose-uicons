package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Aperture: ImageVector? = null

val Icons.Bs.Aperture: ImageVector
    get() = _Aperture ?: UXIcon(name = "Aperture") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(13.68f, 15f)
                horizontalLineToRelative(-3.4f)
                lineToRelative(-1.74f, -3.1f)
                lineToRelative(1.77f, -2.9f)
                horizontalLineToRelative(3.37f)
                lineToRelative(1.82f, 3.0f)
                lineToRelative(-1.83f, 3.0f)
                close()
                moveTo(3f, 12f)
                curveToRelative(0f, -1.03f, 0.17f, -2.02f, 0.5f, -2.95f)
                lineToRelative(3.35f, 5.95f)
                horizontalLineToRelative(-3.33f)
                curveToRelative(-0.33f, -0.94f, -0.52f, -1.95f, -0.52f, -3f)
                close()
                moveTo(17.2f, 9f)
                horizontalLineToRelative(3.29f)
                curveToRelative(0.33f, 0.94f, 0.52f, 1.95f, 0.52f, 3f)
                curveToRelative(0f, 0.91f, -0.14f, 1.79f, -0.39f, 2.62f)
                lineToRelative(-3.41f, -5.62f)
                close()
                moveTo(18.7f, 6f)
                horizontalLineToRelative(-6.56f)
                lineToRelative(1.71f, -2.81f)
                curveToRelative(1.91f, 0.4f, 3.59f, 1.41f, 4.85f, 2.81f)
                close()
                moveTo(10.37f, 3.15f)
                lineToRelative(-3.51f, 5.76f)
                lineToRelative(-1.61f, -2.85f)
                curveToRelative(1.31f, -1.48f, 3.1f, -2.53f, 5.12f, -2.9f)
                close()
                moveTo(5.3f, 18f)
                horizontalLineToRelative(6.56f)
                lineToRelative(-1.71f, 2.81f)
                curveToRelative(-1.91f, -0.4f, -3.59f, -1.41f, -4.85f, -2.81f)
                close()
                moveTo(13.63f, 20.85f)
                lineToRelative(3.63f, -5.96f)
                lineToRelative(1.7f, 2.8f)
                curveToRelative(-1.32f, 1.62f, -3.2f, 2.77f, -5.33f, 3.16f)
                close()
            }
        }.also { _Aperture = it}
