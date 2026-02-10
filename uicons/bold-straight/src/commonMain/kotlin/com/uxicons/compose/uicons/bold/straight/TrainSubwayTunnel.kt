package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainSubwayTunnel: ImageVector? = null

val Icons.Bs.TrainSubwayTunnel: ImageVector
    get() = _TrainSubwayTunnel ?: UXIcon(name = "TrainSubwayTunnel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-3f)
                lineTo(21f, 12f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                reflectiveCurveTo(3f, 7.04f, 3f, 12f)
                verticalLineToRelative(12f)
                lineTo(0f, 24f)
                lineTo(0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(19f, 11.5f)
                verticalLineToRelative(9.5f)
                horizontalLineToRelative(-2.49f)
                lineToRelative(1.84f, 3f)
                horizontalLineToRelative(-3.01f)
                lineToRelative(-1.84f, -3f)
                horizontalLineToRelative(-3f)
                lineToRelative(-1.84f, 3f)
                horizontalLineToRelative(-3.01f)
                lineToRelative(1.84f, -3f)
                horizontalLineToRelative(-2.49f)
                lineTo(5f, 11.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(5f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                close()
                moveTo(11f, 17.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(16f, 17.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(16f, 11.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2.5f)
                close()
            }
        }.also { _TrainSubwayTunnel = it}
