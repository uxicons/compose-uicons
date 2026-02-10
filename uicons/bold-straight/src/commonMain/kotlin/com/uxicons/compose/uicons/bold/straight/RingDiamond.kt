package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RingDiamond: ImageVector? = null

val Icons.Bs.RingDiamond: ImageVector
    get() = _RingDiamond ?: UXIcon(name = "RingDiamond") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.48f, 6.7f)
                lineToRelative(2.5f, -3.34f)
                lineToRelative(-3.36f, -3.36f)
                horizontalLineToRelative(-5.24f)
                lineToRelative(-3.36f, 3.36f)
                lineToRelative(2.5f, 3.34f)
                curveToRelative(-3.24f, 1.36f, -5.52f, 4.57f, -5.52f, 8.3f)
                curveToRelative(0f, 4.96f, 4.04f, 9f, 9f, 9f)
                reflectiveCurveToRelative(9f, -4.04f, 9f, -9f)
                curveToRelative(0f, -3.73f, -2.28f, -6.94f, -5.52f, -8.3f)
                close()
                moveTo(9.98f, 3.64f)
                lineToRelative(0.64f, -0.64f)
                horizontalLineToRelative(2.76f)
                lineToRelative(0.64f, 0.64f)
                lineToRelative(-1.77f, 2.36f)
                curveToRelative(-0.08f, -0.0f, -0.17f, -0.0f, -0.25f, -0.0f)
                reflectiveCurveToRelative(-0.17f, 0.0f, -0.25f, 0.0f)
                lineToRelative(-1.77f, -2.36f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveToRelative(2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
            }
        }.also { _RingDiamond = it}
