package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeartUpsideDown: ImageVector? = null

val Icons.Bs.HeartUpsideDown: ImageVector
    get() = _HeartUpsideDown ?: UXIcon(name = "HeartUpsideDown") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.87f, 1.28f)
                lineToRelative(-0.87f, -0.62f)
                lineToRelative(-0.87f, 0.62f)
                curveTo(9.27f, 2.61f, 0f, 9.57f, 0f, 16.25f)
                curveToRelative(0f, 3.72f, 3.03f, 6.75f, 6.75f, 6.75f)
                curveToRelative(2.12f, 0f, 4.01f, -1.02f, 5.25f, -2.6f)
                curveToRelative(1.24f, 1.59f, 3.13f, 2.6f, 5.25f, 2.6f)
                curveToRelative(3.72f, 0f, 6.75f, -3.03f, 6.75f, -6.75f)
                curveToRelative(0f, -6.68f, -9.27f, -13.64f, -11.13f, -14.97f)
                close()
                moveTo(17.25f, 20f)
                curveToRelative(-2.07f, 0f, -3.75f, -1.79f, -3.75f, -4f)
                horizontalLineToRelative(-3f)
                curveToRelative(0f, 2.21f, -1.68f, 4f, -3.75f, 4f)
                reflectiveCurveToRelative(-3.75f, -1.68f, -3.75f, -3.75f)
                curveToRelative(0f, -4.0f, 5.3f, -9.07f, 9f, -11.89f)
                curveToRelative(3.7f, 2.81f, 9f, 7.89f, 9f, 11.89f)
                curveToRelative(0f, 2.07f, -1.68f, 3.75f, -3.75f, 3.75f)
                close()
            }
        }.also { _HeartUpsideDown = it}
