package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpRight: ImageVector? = null

val Icons.Ts.UpRight: ImageVector
    get() = _UpRight ?: UXIcon(name = "UpRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(7.33f, 23.04f)
                lineTo(0.96f, 16.67f)
                lineTo(11.67f, 5.96f)
                lineTo(6.81f, 1f)
                horizontalLineToRelative(13.69f)
                curveToRelative(0.67f, 0f, 1.3f, 0.26f, 1.77f, 0.73f)
                curveToRelative(0.47f, 0.47f, 0.73f, 1.1f, 0.73f, 1.77f)
                verticalLineToRelative(13.68f)
                reflectiveCurveToRelative(-4.97f, -4.86f, -4.97f, -4.86f)
                lineTo(7.33f, 23.04f)
                close()
                moveTo(2.38f, 16.68f)
                lineToRelative(4.95f, 4.95f)
                lineToRelative(10.7f, -10.7f)
                lineToRelative(3.97f, 3.89f)
                lineTo(22f, 3.51f)
                curveToRelative(0f, -0.4f, -0.15f, -0.78f, -0.44f, -1.07f)
                curveToRelative(-0.28f, -0.28f, -0.66f, -0.44f, -1.06f, -0.44f)
                lineTo(9.19f, 2f)
                lineToRelative(3.89f, 3.97f)
                lineTo(2.38f, 16.67f)
                close()
            }
        }.also { _UpRight = it}
