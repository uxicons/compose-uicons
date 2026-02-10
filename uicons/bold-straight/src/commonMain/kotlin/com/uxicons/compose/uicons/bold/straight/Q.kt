package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Q: ImageVector? = null

val Icons.Bs.Q: ImageVector
    get() = _Q ?: UXIcon(name = "Q") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.97f, 21.85f)
                lineToRelative(-2.53f, -2.53f)
                curveToRelative(0.99f, -1.56f, 1.56f, -3.42f, 1.56f, -5.41f)
                verticalLineToRelative(-3.82f)
                curveTo(22f, 4.53f, 17.51f, 0f, 12f, 0f)
                reflectiveCurveTo(2f, 4.53f, 2f, 10.09f)
                verticalLineToRelative(3.82f)
                curveToRelative(0f, 5.56f, 4.49f, 10.09f, 10f, 10.09f)
                curveToRelative(2.47f, 0f, 4.73f, -0.91f, 6.47f, -2.41f)
                lineToRelative(2.38f, 2.38f)
                lineToRelative(2.12f, -2.12f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-3.86f, 0f, -7f, -3.18f, -7f, -7.09f)
                verticalLineToRelative(-3.82f)
                curveToRelative(0f, -3.91f, 3.14f, -7.09f, 7f, -7.09f)
                reflectiveCurveToRelative(7f, 3.18f, 7f, 7.09f)
                verticalLineToRelative(3.82f)
                curveToRelative(0f, 1.16f, -0.27f, 2.25f, -0.76f, 3.21f)
                lineToRelative(-2.06f, -2.06f)
                lineToRelative(-2.12f, 2.12f)
                lineToRelative(2.29f, 2.29f)
                curveToRelative(-1.19f, 0.96f, -2.7f, 1.53f, -4.34f, 1.53f)
                close()
            }
        }.also { _Q = it}
