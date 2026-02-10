package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupStraw: ImageVector? = null

val Icons.Sr.CupStraw: ImageVector
    get() = _CupStraw ?: UXIcon(name = "CupStraw") {
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
                horizontalLineTo(2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(0.61f)
                lineToRelative(1.49f, 12.59f)
                curveToRelative(0.3f, 2.52f, 2.43f, 4.41f, 4.97f, 4.41f)
                horizontalLineToRelative(5.88f)
                curveToRelative(2.53f, 0f, 4.67f, -1.9f, 4.97f, -4.41f)
                lineToRelative(1.49f, -12.59f)
                horizontalLineToRelative(0.61f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _CupStraw = it}
