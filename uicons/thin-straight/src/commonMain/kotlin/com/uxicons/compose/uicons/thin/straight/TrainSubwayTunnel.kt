package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainSubwayTunnel: ImageVector? = null

val Icons.Ts.TrainSubwayTunnel: ImageVector
    get() = _TrainSubwayTunnel ?: UXIcon(name = "TrainSubwayTunnel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.5f, 7f)
                lineTo(7.5f, 7f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(3.51f)
                lineToRelative(-1.84f, 3f)
                horizontalLineToRelative(1.17f)
                lineToRelative(1.84f, -3f)
                horizontalLineToRelative(6.64f)
                lineToRelative(1.84f, 3f)
                horizontalLineToRelative(1.17f)
                lineToRelative(-1.84f, -3f)
                horizontalLineToRelative(3.51f)
                lineTo(20.0f, 10.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(5f, 10.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(6f)
                lineTo(5f, 14f)
                verticalLineToRelative(-3.5f)
                close()
                moveTo(19f, 20f)
                lineTo(5f, 20f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(5f)
                close()
                moveTo(19f, 14f)
                horizontalLineToRelative(-6.5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(4f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                verticalLineToRelative(3.5f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-1f)
                lineTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                verticalLineToRelative(12f)
                lineTo(0f, 24f)
                lineTo(0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
            }
        }.also { _TrainSubwayTunnel = it}
