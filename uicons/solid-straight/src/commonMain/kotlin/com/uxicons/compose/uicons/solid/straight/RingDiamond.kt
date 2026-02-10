package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RingDiamond: ImageVector? = null

val Icons.Ss.RingDiamond: ImageVector
    get() = _RingDiamond ?: UXIcon(name = "RingDiamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.58f, 6.15f)
                lineToRelative(2.92f, -3.9f)
                lineToRelative(-2.25f, -2.25f)
                horizontalLineToRelative(-4.5f)
                lineToRelative(-2.25f, 2.25f)
                lineToRelative(2.92f, 3.9f)
                curveToRelative(-4.21f, 0.75f, -7.42f, 4.43f, -7.42f, 8.85f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -4.42f, -3.21f, -8.1f, -7.42f, -8.85f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
                reflectiveCurveToRelative(3.14f, -7f, 7f, -7f)
                reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                close()
            }
        }.also { _RingDiamond = it}
