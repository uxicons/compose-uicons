package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondTurnRight: ImageVector? = null

val Icons.Ss.DiamondTurnRight: ImageVector
    get() = _DiamondTurnRight ?: UXIcon(name = "DiamondTurnRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.83f, 8.87f)
                lineTo(13.84f, 0.88f)
                curveToRelative(-1.17f, -1.17f, -3.07f, -1.17f, -4.24f, 0f)
                lineTo(1.65f, 8.82f)
                curveToRelative(-0.34f, 0.34f, -0.64f, 0.75f, -0.78f, 1.22f)
                curveToRelative(-0.35f, 1.14f, -0.05f, 2.29f, 0.73f, 3.07f)
                lineToRelative(10.12f, 10.12f)
                lineToRelative(10.06f, -10.06f)
                curveToRelative(0.34f, -0.34f, 0.64f, -0.75f, 0.78f, -1.22f)
                curveToRelative(0.35f, -1.14f, 0.06f, -2.29f, -0.73f, -3.08f)
                close()
                moveTo(17.46f, 11.29f)
                lineToRelative(-2.76f, 2.76f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(1.64f, -1.64f)
                horizontalLineToRelative(-3.93f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5.59f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(-3.58f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(3.93f)
                lineToRelative(-1.64f, -1.64f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(2.76f, 2.76f)
                curveToRelative(0.34f, 0.34f, 0.54f, 0.8f, 0.54f, 1.29f)
                reflectiveCurveToRelative(-0.19f, 0.95f, -0.54f, 1.29f)
                close()
            }
        }.also { _DiamondTurnRight = it}
