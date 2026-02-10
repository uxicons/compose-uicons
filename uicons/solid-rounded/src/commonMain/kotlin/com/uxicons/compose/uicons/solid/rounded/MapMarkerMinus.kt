package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerMinus: ImageVector? = null

val Icons.Sr.MapMarkerMinus: ImageVector
    get() = _MapMarkerMinus ?: UXIcon(name = "MapMarkerMinus", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(422.15f, 70f)
                curveToRelative(-90.59f, -92.15f, -238.73f, -93.41f, -330.87f, -2.82f)
                reflectiveCurveTo(-2.14f, 305.9f, 88.45f, 398.05f)
                curveToRelative(1.13f, 1.14f, 2.26f, 2.28f, 3.41f, 3.4f)
                lineToRelative(83.87f, 77.49f)
                curveToRelative(44.84f, 43.86f, 116.45f, 44.04f, 161.5f, 0.4f)
                lineToRelative(84.91f, -78.46f)
                curveTo(513.51f, 309.5f, 513.51f, 161.37f, 422.15f, 70f)
                close()
                moveTo(341.79f, 256.7f)
                horizontalLineTo(171.63f)
                curveToRelative(-11.75f, 0f, -21.27f, -9.52f, -21.27f, -21.27f)
                reflectiveCurveToRelative(9.52f, -21.27f, 21.27f, -21.27f)
                horizontalLineToRelative(170.16f)
                curveToRelative(11.75f, 0f, 21.27f, 9.52f, 21.27f, 21.27f)
                reflectiveCurveTo(353.54f, 256.7f, 341.79f, 256.7f)
                close()
            }
        }.also { _MapMarkerMinus = it}
