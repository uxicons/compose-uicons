package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lambda: ImageVector? = null

val Icons.Rr.Lambda: ImageVector
    get() = _Lambda ?: UXIcon(name = "Lambda") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-1.03f)
                curveToRelative(-1.91f, 0f, -3.62f, -1.06f, -4.47f, -2.76f)
                lineToRelative(-6.11f, -12.22f)
                lineToRelative(-7.5f, 14.44f)
                curveToRelative(-0.18f, 0.34f, -0.53f, 0.54f, -0.89f, 0.54f)
                curveToRelative(-0.15f, 0f, -0.31f, -0.04f, -0.46f, -0.11f)
                curveToRelative(-0.49f, -0.26f, -0.68f, -0.86f, -0.43f, -1.35f)
                lineTo(10.29f, 6.81f)
                lineToRelative(-1.57f, -3.15f)
                curveToRelative(-0.51f, -1.02f, -1.54f, -1.66f, -2.68f, -1.66f)
                horizontalLineToRelative(-1.03f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.03f)
                curveToRelative(1.91f, 0f, 3.62f, 1.06f, 4.47f, 2.76f)
                lineToRelative(8.79f, 17.58f)
                curveToRelative(0.51f, 1.02f, 1.54f, 1.66f, 2.68f, 1.66f)
                horizontalLineToRelative(1.03f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Lambda = it}
