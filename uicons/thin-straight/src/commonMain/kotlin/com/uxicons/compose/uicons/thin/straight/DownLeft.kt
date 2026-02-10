package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DownLeft: ImageVector? = null

val Icons.Ts.DownLeft: ImageVector
    get() = _DownLeft ?: UXIcon(name = "DownLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(3.5f, 23f)
                curveToRelative(-0.67f, 0f, -1.29f, -0.26f, -1.77f, -0.73f)
                curveToRelative(-0.47f, -0.47f, -0.73f, -1.1f, -0.73f, -1.77f)
                lineTo(1f, 6.81f)
                reflectiveCurveToRelative(4.96f, 4.85f, 4.96f, 4.85f)
                lineTo(16.84f, 0.79f)
                lineToRelative(6.36f, 6.36f)
                lineToRelative(-10.88f, 10.88f)
                lineToRelative(4.87f, 4.97f)
                lineTo(3.5f, 23f)
                close()
                moveTo(2f, 9.19f)
                verticalLineToRelative(11.31f)
                curveToRelative(0f, 0.4f, 0.15f, 0.78f, 0.44f, 1.07f)
                curveToRelative(0.28f, 0.28f, 0.66f, 0.44f, 1.06f, 0.44f)
                lineTo(14.81f, 22.01f)
                lineToRelative(-3.89f, -3.98f)
                lineTo(21.79f, 7.15f)
                lineToRelative(-4.95f, -4.95f)
                lineTo(5.97f, 13.07f)
                lineToRelative(-3.97f, -3.88f)
                close()
            }
        }.also { _DownLeft = it}
