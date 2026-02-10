package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupStrawSwoosh: ImageVector? = null

val Icons.Rr.CupStrawSwoosh: ImageVector
    get() = _CupStrawSwoosh ?: UXIcon(name = "CupStrawSwoosh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 5f)
                horizontalLineToRelative(-7.49f)
                lineToRelative(0.27f, -2.12f)
                curveToRelative(0.06f, -0.5f, 0.49f, -0.88f, 0.99f, -0.88f)
                horizontalLineToRelative(3.23f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-3.23f)
                curveToRelative(-1.51f, 0f, -2.79f, 1.13f, -2.98f, 2.63f)
                lineToRelative(-0.3f, 2.37f)
                lineTo(2f, 5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.61f)
                lineToRelative(1.49f, 12.59f)
                curveToRelative(0.3f, 2.52f, 2.43f, 4.41f, 4.97f, 4.41f)
                horizontalLineToRelative(5.88f)
                curveToRelative(2.53f, 0f, 4.67f, -1.9f, 4.96f, -4.41f)
                lineToRelative(1.49f, -12.59f)
                horizontalLineToRelative(0.61f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(14.94f, 22f)
                horizontalLineToRelative(-5.88f)
                curveToRelative(-1.52f, 0f, -2.8f, -1.14f, -2.98f, -2.65f)
                lineToRelative(-0.46f, -3.93f)
                curveToRelative(0.84f, -0.57f, 2.3f, -1.42f, 3.38f, -1.42f)
                curveToRelative(0.76f, 0f, 1.63f, 0.43f, 2.55f, 0.9f)
                curveToRelative(1.09f, 0.54f, 2.21f, 1.1f, 3.45f, 1.1f)
                curveToRelative(1.19f, 0f, 2.46f, -0.54f, 3.44f, -1.1f)
                lineToRelative(-0.53f, 4.45f)
                curveToRelative(-0.18f, 1.51f, -1.46f, 2.65f, -2.98f, 2.65f)
                close()
                moveTo(18.75f, 12.32f)
                curveToRelative(-0.7f, 0.53f, -2.49f, 1.68f, -3.75f, 1.68f)
                curveToRelative(-0.76f, 0f, -1.63f, -0.43f, -2.55f, -0.9f)
                curveToRelative(-1.09f, -0.54f, -2.21f, -1.1f, -3.45f, -1.1f)
                curveToRelative(-1.28f, 0f, -2.64f, 0.62f, -3.64f, 1.21f)
                lineToRelative(-0.73f, -6.21f)
                horizontalLineToRelative(14.75f)
                lineToRelative(-0.63f, 5.32f)
                close()
            }
        }.also { _CupStrawSwoosh = it}
