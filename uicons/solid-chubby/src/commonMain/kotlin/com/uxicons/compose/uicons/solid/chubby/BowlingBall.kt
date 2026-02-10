package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BowlingBall: ImageVector? = null

val Icons.Sc.BowlingBall: ImageVector
    get() = _BowlingBall ?: UXIcon(name = "BowlingBall") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 1f)
                curveTo(6.88f, 1f, 1f, 2.25f, 1f, 12f)
                reflectiveCurveToRelative(5.88f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -1.25f, 11f, -11f)
                reflectiveCurveTo(17.12f, 1f, 12f, 1f)
                close()
                moveTo(6.21f, 12.3f)
                curveToRelative(-0.82f, 0f, -1.48f, -0.66f, -1.48f, -1.48f)
                reflectiveCurveToRelative(0.66f, -1.48f, 1.48f, -1.48f)
                reflectiveCurveToRelative(1.48f, 0.66f, 1.48f, 1.48f)
                reflectiveCurveToRelative(-0.66f, 1.48f, -1.48f, 1.48f)
                close()
                moveTo(8.85f, 8.39f)
                curveToRelative(-0.82f, 0f, -1.48f, -0.66f, -1.48f, -1.48f)
                reflectiveCurveToRelative(0.66f, -1.48f, 1.48f, -1.48f)
                reflectiveCurveToRelative(1.48f, 0.66f, 1.48f, 1.48f)
                reflectiveCurveToRelative(-0.66f, 1.48f, -1.48f, 1.48f)
                close()
                moveTo(11.48f, 12.3f)
                curveToRelative(-0.82f, 0f, -1.48f, -0.66f, -1.48f, -1.48f)
                reflectiveCurveToRelative(0.66f, -1.48f, 1.48f, -1.48f)
                reflectiveCurveToRelative(1.48f, 0.66f, 1.48f, 1.48f)
                reflectiveCurveToRelative(-0.66f, 1.48f, -1.48f, 1.48f)
                close()
            }
        }.also { _BowlingBall = it}
