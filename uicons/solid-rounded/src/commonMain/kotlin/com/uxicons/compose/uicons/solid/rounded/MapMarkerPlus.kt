package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerPlus: ImageVector? = null

val Icons.Sr.MapMarkerPlus: ImageVector
    get() = _MapMarkerPlus ?: UXIcon(name = "MapMarkerPlus", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(422.19f, 69.94f)
                curveToRelative(-90.61f, -92.17f, -238.79f, -93.44f, -330.97f, -2.82f)
                reflectiveCurveToRelative(-93.44f, 238.79f, -2.82f, 330.97f)
                curveToRelative(1.13f, 1.15f, 2.26f, 2.28f, 3.41f, 3.4f)
                lineToRelative(83.89f, 77.51f)
                curveToRelative(44.85f, 43.87f, 116.48f, 44.05f, 161.55f, 0.4f)
                lineToRelative(84.93f, -78.49f)
                curveTo(513.59f, 309.52f, 513.59f, 161.34f, 422.19f, 69.94f)
                close()
                moveTo(341.81f, 256.7f)
                horizontalLineToRelative(-63.83f)
                verticalLineToRelative(63.83f)
                curveToRelative(0f, 11.75f, -9.53f, 21.28f, -21.28f, 21.28f)
                reflectiveCurveToRelative(-21.28f, -9.53f, -21.28f, -21.28f)
                verticalLineToRelative(-63.83f)
                horizontalLineToRelative(-63.83f)
                curveToRelative(-11.75f, 0f, -21.28f, -9.53f, -21.28f, -21.28f)
                reflectiveCurveToRelative(9.53f, -21.28f, 21.28f, -21.28f)
                horizontalLineToRelative(63.83f)
                verticalLineToRelative(-63.83f)
                curveToRelative(0f, -11.75f, 9.53f, -21.28f, 21.28f, -21.28f)
                reflectiveCurveToRelative(21.28f, 9.53f, 21.28f, 21.28f)
                verticalLineToRelative(63.83f)
                horizontalLineToRelative(63.83f)
                curveToRelative(11.75f, 0f, 21.28f, 9.53f, 21.28f, 21.28f)
                reflectiveCurveTo(353.56f, 256.7f, 341.81f, 256.7f)
                close()
            }
        }.also { _MapMarkerPlus = it}
