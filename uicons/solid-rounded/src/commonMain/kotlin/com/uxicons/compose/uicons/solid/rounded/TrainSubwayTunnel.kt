package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrainSubwayTunnel: ImageVector? = null

val Icons.Sr.TrainSubwayTunnel: ImageVector
    get() = _TrainSubwayTunnel ?: UXIcon(name = "TrainSubwayTunnel") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 8f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                lineTo(6f, 13f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(18f, 13f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                close()
                moveTo(16.44f, 24f)
                lineToRelative(-1.84f, -3f)
                horizontalLineToRelative(-5.21f)
                lineToRelative(-1.84f, 3f)
                horizontalLineToRelative(8.88f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                lineTo(5.21f, 24f)
                lineToRelative(1.9f, -3.11f)
                curveToRelative(-1.78f, -0.4f, -3.12f, -1.99f, -3.12f, -3.89f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(6f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.9f, -1.34f, 3.49f, -3.12f, 3.89f)
                lineToRelative(1.9f, 3.11f)
                horizontalLineToRelative(4.21f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                lineTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(8f, 19f)
                horizontalLineToRelative(8f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
            }
        }.also { _TrainSubwayTunnel = it}
