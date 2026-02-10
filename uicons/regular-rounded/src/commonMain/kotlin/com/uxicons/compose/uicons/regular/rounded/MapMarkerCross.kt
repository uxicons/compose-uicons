package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MapMarkerCross: ImageVector? = null

val Icons.Rr.MapMarkerCross: ImageVector
    get() = _MapMarkerCross ?: UXIcon(name = "MapMarkerCross", viewportWidth = 512f, viewportHeight = 512f) {
            path(fill = SolidColor(Color.Black)) {
                moveTo(177.85f, 284.21f)
                lineToRelative(48.78f, -48.78f)
                lineToRelative(-48.78f, -48.78f)
                curveToRelative(-8.45f, -8.16f, -8.69f, -21.63f, -0.52f, -30.08f)
                curveToRelative(8.16f, -8.45f, 21.63f, -8.69f, 30.08f, -0.52f)
                curveToRelative(0.18f, 0.17f, 0.35f, 0.35f, 0.52f, 0.52f)
                lineToRelative(48.78f, 48.78f)
                lineToRelative(48.78f, -48.78f)
                curveToRelative(8.16f, -8.45f, 21.63f, -8.68f, 30.08f, -0.52f)
                curveToRelative(8.45f, 8.16f, 8.68f, 21.63f, 0.52f, 30.08f)
                curveToRelative(-0.17f, 0.18f, -0.34f, 0.35f, -0.52f, 0.52f)
                lineToRelative(-48.78f, 48.78f)
                lineToRelative(48.78f, 48.78f)
                curveToRelative(8.45f, 8.16f, 8.68f, 21.63f, 0.52f, 30.08f)
                curveToRelative(-8.16f, 8.45f, -21.63f, 8.68f, -30.08f, 0.52f)
                curveToRelative(-0.18f, -0.17f, -0.35f, -0.34f, -0.52f, -0.52f)
                lineToRelative(-48.78f, -48.78f)
                lineToRelative(-48.78f, 48.78f)
                curveToRelative(-8.45f, 8.16f, -21.92f, 7.93f, -30.08f, -0.52f)
                curveTo(169.89f, 305.52f, 169.89f, 292.45f, 177.85f, 284.21f)
                lineTo(177.85f, 284.21f)
                close()
                moveTo(91.85f, 401.46f)
                curveTo(-0.62f, 311.19f, -2.41f, 163.05f, 87.86f, 70.57f)
                reflectiveCurveToRelative(238.41f, -94.26f, 330.88f, -3.99f)
                curveToRelative(1.15f, 1.12f, 2.29f, 2.26f, 3.41f, 3.4f)
                curveToRelative(91.37f, 91.38f, 91.37f, 239.52f, 0f, 330.9f)
                lineToRelative(-84.92f, 78.47f)
                curveToRelative(-45.06f, 43.64f, -116.68f, 43.46f, -161.51f, -0.4f)
                lineTo(91.85f, 401.46f)
                close()
                moveTo(65.26f, 235.43f)
                curveToRelative(-0.14f, 50.8f, 20.05f, 99.55f, 56.07f, 135.37f)
                lineToRelative(83.7f, 77.34f)
                curveToRelative(28.74f, 27.46f, 73.94f, 27.64f, 102.89f, 0.4f)
                lineToRelative(84.75f, -78.32f)
                curveToRelative(74.61f, -74.93f, 74.34f, -196.15f, -0.58f, -270.76f)
                reflectiveCurveToRelative(-196.15f, -74.34f, -270.76f, 0.58f)
                curveTo(85.32f, 135.88f, 65.13f, 184.63f, 65.26f, 235.43f)
                close()
            }
        }.also { _MapMarkerCross = it}
