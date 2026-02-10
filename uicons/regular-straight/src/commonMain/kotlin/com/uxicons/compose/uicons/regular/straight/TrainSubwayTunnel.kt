package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainSubwayTunnel: ImageVector? = null

val Icons.Rs.TrainSubwayTunnel: ImageVector
    get() = _TrainSubwayTunnel ?: UXIcon(name = "TrainSubwayTunnel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 7f)
                lineTo(8f, 7f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(3.49f)
                lineToRelative(-1.84f, 3f)
                horizontalLineToRelative(2.35f)
                lineToRelative(1.84f, -3f)
                horizontalLineToRelative(4.33f)
                lineToRelative(1.84f, 3f)
                horizontalLineToRelative(2.35f)
                lineToRelative(-1.84f, -3f)
                horizontalLineToRelative(3.49f)
                lineTo(20.0f, 11f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                close()
                moveTo(18f, 11f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                close()
                moveTo(8f, 9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(4f)
                lineTo(6f, 13f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                close()
                moveTo(6f, 19f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(4f)
                lineTo(6f, 19f)
                close()
                moveTo(24f, 12f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 12f)
                curveToRelative(0f, -5.51f, -4.49f, -10f, -10f, -10f)
                reflectiveCurveTo(2f, 6.49f, 2f, 12f)
                verticalLineToRelative(12f)
                lineTo(0f, 24f)
                lineTo(0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
            }
        }.also { _TrainSubwayTunnel = it}
