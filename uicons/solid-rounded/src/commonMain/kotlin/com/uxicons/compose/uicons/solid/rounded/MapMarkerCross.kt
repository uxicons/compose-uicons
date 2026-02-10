package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerCross: ImageVector? = null

val Icons.Sr.MapMarkerCross: ImageVector
    get() = _MapMarkerCross ?: UXIcon(name = "MapMarkerCross", viewportWidth = 512f, viewportHeight = 512f) {
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
                moveTo(335.58f, 284.21f)
                curveToRelative(8.45f, 8.16f, 8.69f, 21.63f, 0.52f, 30.08f)
                reflectiveCurveToRelative(-21.63f, 8.69f, -30.08f, 0.52f)
                curveToRelative(-0.18f, -0.17f, -0.35f, -0.34f, -0.52f, -0.52f)
                lineToRelative(-48.79f, -48.79f)
                lineTo(207.92f, 314.3f)
                curveToRelative(-8.45f, 8.16f, -21.92f, 7.93f, -30.08f, -0.52f)
                curveToRelative(-7.96f, -8.24f, -7.96f, -21.32f, 0f, -29.56f)
                lineToRelative(48.79f, -48.79f)
                lineToRelative(-48.79f, -48.79f)
                curveToRelative(-8.45f, -8.16f, -8.69f, -21.63f, -0.52f, -30.08f)
                reflectiveCurveToRelative(21.63f, -8.69f, 30.08f, -0.52f)
                curveToRelative(0.18f, 0.17f, 0.35f, 0.35f, 0.52f, 0.52f)
                lineToRelative(48.79f, 48.79f)
                lineToRelative(48.79f, -48.79f)
                curveToRelative(8.16f, -8.45f, 21.63f, -8.69f, 30.08f, -0.52f)
                reflectiveCurveToRelative(8.69f, 21.63f, 0.52f, 30.08f)
                curveToRelative(-0.17f, 0.18f, -0.34f, 0.35f, -0.52f, 0.52f)
                lineToRelative(-48.79f, 48.79f)
                lineTo(335.58f, 284.21f)
                close()
            }
        }.also { _MapMarkerCross = it}
