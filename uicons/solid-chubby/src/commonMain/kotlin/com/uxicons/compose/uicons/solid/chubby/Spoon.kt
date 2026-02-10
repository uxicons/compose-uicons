package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spoon: ImageVector? = null

val Icons.Sc.Spoon: ImageVector
    get() = _Spoon ?: UXIcon(name = "Spoon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.75f, 7.69f)
                curveToRelative(-0.03f, -2.02f, -0.65f, -3.76f, -1.7f, -4.78f)
                curveTo(18.81f, 0.74f, 12.54f, 0.4f, 8.42f, 4.41f)
                curveToRelative(-2.64f, 2.77f, -2.77f, 6.22f, -0.3f, 9.31f)
                lineTo(1.19f, 20.64f)
                curveToRelative(-0.59f, 0.59f, -0.59f, 1.53f, 0f, 2.12f)
                curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
                reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
                lineToRelative(6.95f, -6.95f)
                curveToRelative(5.45f, 4.21f, 9.31f, -0.29f, 9.31f, -0.3f)
                curveToRelative(2.06f, -2.11f, 3.21f, -4.96f, 3.17f, -7.82f)
                close()
            }
        }.also { _Spoon = it}
