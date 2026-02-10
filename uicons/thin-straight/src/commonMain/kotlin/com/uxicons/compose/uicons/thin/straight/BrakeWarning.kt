package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BrakeWarning: ImageVector? = null

val Icons.Ts.BrakeWarning: ImageVector
    get() = _BrakeWarning ?: UXIcon(name = "BrakeWarning") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(1f, 12f)
                curveToRelative(0f, 2.8f, 1.14f, 5.43f, 3.21f, 7.42f)
                lineToRelative(-0.69f, 0.72f)
                curveTo(1.25f, 17.97f, 0f, 15.08f, 0f, 12f)
                reflectiveCurveTo(1.25f, 6.03f, 3.52f, 3.86f)
                lineToRelative(0.69f, 0.72f)
                curveToRelative(-2.07f, 1.98f, -3.21f, 4.62f, -3.21f, 7.42f)
                close()
                moveTo(20.48f, 3.86f)
                lineToRelative(-0.69f, 0.72f)
                curveToRelative(2.07f, 1.98f, 3.21f, 4.62f, 3.21f, 7.42f)
                reflectiveCurveToRelative(-1.14f, 5.43f, -3.21f, 7.42f)
                lineToRelative(0.69f, 0.72f)
                curveToRelative(2.27f, -2.17f, 3.52f, -5.06f, 3.52f, -8.14f)
                reflectiveCurveToRelative(-1.25f, -5.97f, -3.52f, -8.14f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                reflectiveCurveTo(3f, 16.96f, 3f, 12f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                close()
                moveTo(20f, 12f)
                curveToRelative(0f, -4.41f, -3.59f, -8f, -8f, -8f)
                reflectiveCurveTo(4f, 7.59f, 4f, 12f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                reflectiveCurveToRelative(8f, -3.59f, 8f, -8f)
                close()
                moveTo(12.5f, 6f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 14f)
                horizontalLineToRelative(1f)
                lineTo(12.5f, 6f)
                close()
            }
        }.also { _BrakeWarning = it}
