package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TorchInspirationLeader: ImageVector? = null

val Icons.Ss.TorchInspirationLeader: ImageVector
    get() = _TorchInspirationLeader ?: UXIcon(name = "TorchInspirationLeader") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 11f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                reflectiveCurveTo(10.76f, 1f, 8f, 1f)
                reflectiveCurveTo(3f, 3.24f, 3f, 6f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                close()
                moveTo(18.77f, 6f)
                lineToRelative(0.6f, 5.78f)
                lineToRelative(-2.6f, 1.22f)
                lineTo(5.5f, 13f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                verticalLineToRelative(7.5f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-8f)
                lineToRelative(4.22f, -1f)
                lineToRelative(4.33f, -2.04f)
                lineToRelative(0.68f, -6.96f)
                horizontalLineToRelative(-3.46f)
                close()
                moveTo(23.22f, 3.27f)
                curveToRelative(0f, 0.66f, -0.25f, 1.26f, -0.64f, 1.73f)
                horizontalLineToRelative(-4.17f)
                curveToRelative(-0.39f, -0.47f, -0.64f, -1.07f, -0.64f, -1.73f)
                curveToRelative(0f, -0.78f, 0.64f, -1.39f, 1.09f, -1.85f)
                curveToRelative(0f, 0f, -0.14f, 1.59f, 0.44f, 1.59f)
                curveToRelative(1.23f, 0f, 0.11f, -1.84f, 1.19f, -3f)
                curveToRelative(0.86f, 0.86f, 2.72f, 1.69f, 2.72f, 3.27f)
                close()
            }
        }.also { _TorchInspirationLeader = it}
