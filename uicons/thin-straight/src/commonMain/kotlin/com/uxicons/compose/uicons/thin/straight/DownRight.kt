package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownRight: ImageVector? = null

val Icons.Ts.DownRight: ImageVector
    get() = _DownRight ?: UXIcon(name = "DownRight") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.5f, 23f)
                lineTo(6.81f, 23f)
                lineToRelative(4.86f, -4.96f)
                lineTo(0.96f, 7.33f)
                lineTo(7.33f, 0.96f)
                lineToRelative(10.71f, 10.71f)
                lineToRelative(4.96f, -4.86f)
                verticalLineToRelative(13.68f)
                curveToRelative(0f, 0.67f, -0.25f, 1.3f, -0.73f, 1.77f)
                curveToRelative(-0.47f, 0.47f, -1.1f, 0.73f, -1.77f, 0.73f)
                close()
                moveTo(9.19f, 22f)
                horizontalLineToRelative(11.31f)
                curveToRelative(0.4f, 0f, 0.78f, -0.16f, 1.06f, -0.44f)
                curveToRelative(0.28f, -0.29f, 0.44f, -0.66f, 0.44f, -1.07f)
                lineTo(22f, 9.19f)
                reflectiveCurveToRelative(-3.98f, 3.89f, -3.98f, 3.89f)
                lineTo(7.33f, 2.38f)
                lineTo(2.38f, 7.33f)
                lineToRelative(10.7f, 10.7f)
                lineToRelative(-3.89f, 3.97f)
                close()
            }
        }.also { _DownRight = it}
