package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TorchInspirationLeader: ImageVector? = null

val Icons.Bs.TorchInspirationLeader: ImageVector
    get() = _TorchInspirationLeader ?: UXIcon(name = "TorchInspirationLeader") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                close()
                moveTo(18.26f, 10.73f)
                lineToRelative(-2.61f, 1.27f)
                lineTo(6f, 12f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(3.35f)
                lineToRelative(4.1f, -2f)
                horizontalLineToRelative(0.05f)
                lineToRelative(0.73f, -7f)
                horizontalLineToRelative(-3.46f)
                lineToRelative(0.49f, 4.73f)
                close()
                moveTo(19.5f, 0f)
                curveToRelative(-1.08f, 1.16f, 0.04f, 3f, -1.19f, 3f)
                curveToRelative(-0.58f, 0f, -0.44f, -1.59f, -0.44f, -1.59f)
                curveToRelative(-0.45f, 0.47f, -1.09f, 1.07f, -1.09f, 1.85f)
                curveToRelative(0f, 0.66f, 0.25f, 1.26f, 0.64f, 1.73f)
                horizontalLineToRelative(4.17f)
                curveToRelative(0.39f, -0.47f, 0.64f, -1.07f, 0.64f, -1.73f)
                curveToRelative(0f, -1.58f, -1.86f, -2.41f, -2.72f, -3.27f)
                close()
            }
        }.also { _TorchInspirationLeader = it}
