package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UfoBeam: ImageVector? = null

val Icons.Bs.UfoBeam: ImageVector
    get() = _UfoBeam ?: UXIcon(name = "UfoBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.16f, 15.2f)
                lineToRelative(3.56f, 8.8f)
                horizontalLineToRelative(-3.24f)
                lineToRelative(-3.33f, -8.25f)
                curveToRelative(1.04f, -0.13f, 2.06f, -0.31f, 3.01f, -0.55f)
                close()
                moveTo(1.29f, 24f)
                horizontalLineToRelative(3.24f)
                lineToRelative(3.33f, -8.25f)
                curveToRelative(-1.04f, -0.13f, -2.06f, -0.31f, -3.01f, -0.55f)
                lineToRelative(-3.56f, 8.8f)
                close()
                moveTo(24f, 9f)
                curveToRelative(0f, 3.45f, -6.03f, 5f, -12f, 5f)
                reflectiveCurveTo(0f, 12.45f, 0f, 9f)
                curveToRelative(0f, -2.07f, 2.18f, -3.63f, 6.18f, -4.45f)
                curveTo(6.83f, 1.94f, 9.19f, 0f, 12f, 0f)
                reflectiveCurveToRelative(5.17f, 1.94f, 5.82f, 4.55f)
                curveToRelative(4.0f, 0.81f, 6.18f, 2.38f, 6.18f, 4.45f)
                close()
                moveTo(9.02f, 5.62f)
                curveToRelative(0.52f, 0.18f, 1.45f, 0.39f, 2.98f, 0.39f)
                reflectiveCurveToRelative(2.46f, -0.21f, 2.98f, -0.39f)
                curveToRelative(-0.19f, -1.47f, -1.45f, -2.62f, -2.98f, -2.62f)
                reflectiveCurveToRelative(-2.79f, 1.14f, -2.98f, 2.62f)
                close()
                moveTo(20.95f, 9.0f)
                curveToRelative(-0.28f, -0.33f, -1.33f, -0.97f, -3.4f, -1.44f)
                curveToRelative(-0.34f, 0.34f, -1.75f, 1.44f, -5.56f, 1.44f)
                reflectiveCurveToRelative(-5.21f, -1.09f, -5.56f, -1.44f)
                curveToRelative(-2.07f, 0.47f, -3.12f, 1.1f, -3.4f, 1.44f)
                curveToRelative(0.52f, 0.65f, 3.57f, 2.0f, 8.96f, 2.0f)
                reflectiveCurveToRelative(8.43f, -1.35f, 8.96f, -2.0f)
                close()
            }
        }.also { _UfoBeam = it}
