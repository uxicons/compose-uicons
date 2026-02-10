package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SmileBeam: ImageVector? = null

val Icons.Sc.SmileBeam: ImageVector
    get() = _SmileBeam ?: UXIcon(name = "SmileBeam") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.99f, 1f)
                curveTo(4.82f, 1f, 1f, 5.11f, 1f, 12.02f)
                curveToRelative(0f, 6.86f, 3.85f, 10.98f, 11.01f, 10.98f)
                reflectiveCurveToRelative(10.86f, -3.74f, 10.99f, -11.02f)
                curveToRelative(-0.12f, -7.04f, -4.03f, -10.98f, -11.01f, -10.98f)
                close()
                moveTo(6.25f, 10.39f)
                curveToRelative(0f, -1.86f, 1.09f, -3.31f, 2.49f, -3.31f)
                reflectiveCurveToRelative(2.49f, 1.46f, 2.49f, 3.31f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.84f, -0.37f, -1.28f, -0.49f, -1.31f)
                curveToRelative(-0.11f, 0.03f, -0.48f, 0.47f, -0.48f, 1.31f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                close()
                moveTo(16.16f, 16.39f)
                curveToRelative(-1.35f, 1.31f, -2.77f, 1.96f, -4.18f, 1.96f)
                reflectiveCurveToRelative(-2.82f, -0.66f, -4.15f, -1.97f)
                curveToRelative(-0.39f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.4f, 1.42f, -0.01f)
                curveToRelative(1.89f, 1.86f, 3.6f, 1.86f, 5.53f, -0.01f)
                curveToRelative(0.4f, -0.38f, 1.03f, -0.37f, 1.41f, 0.03f)
                reflectiveCurveToRelative(0.37f, 1.03f, -0.03f, 1.41f)
                close()
                moveTo(16.75f, 11.39f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -0.84f, -0.37f, -1.28f, -0.49f, -1.31f)
                curveToRelative(-0.11f, 0.03f, -0.48f, 0.47f, -0.48f, 1.31f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.86f, 1.09f, -3.31f, 2.49f, -3.31f)
                reflectiveCurveToRelative(2.49f, 1.46f, 2.49f, 3.31f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _SmileBeam = it}
