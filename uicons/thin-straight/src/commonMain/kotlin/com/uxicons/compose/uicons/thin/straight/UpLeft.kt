package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UpLeft: ImageVector? = null

val Icons.Ts.UpLeft: ImageVector
    get() = _UpLeft ?: UXIcon(name = "UpLeft") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.92f, 23.29f)
                lineTo(5.97f, 12.34f)
                lineTo(1f, 17.19f)
                verticalLineTo(3.51f)
                curveToRelative(0f, -0.67f, 0.25f, -1.3f, 0.73f, -1.77f)
                curveToRelative(0.47f, -0.47f, 1.1f, -0.73f, 1.77f, -0.73f)
                horizontalLineToRelative(13.69f)
                lineToRelative(-4.85f, 4.97f)
                lineToRelative(10.95f, 10.95f)
                lineToRelative(-6.36f, 6.36f)
                close()
                moveTo(5.98f, 10.93f)
                lineToRelative(10.94f, 10.94f)
                lineToRelative(4.95f, -4.95f)
                lineTo(10.93f, 5.98f)
                lineToRelative(3.89f, -3.98f)
                horizontalLineTo(3.5f)
                curveToRelative(-0.4f, 0f, -0.78f, 0.16f, -1.06f, 0.44f)
                curveToRelative(-0.28f, 0.29f, -0.44f, 0.66f, -0.44f, 1.07f)
                verticalLineTo(14.81f)
                reflectiveCurveToRelative(3.98f, -3.88f, 3.98f, -3.88f)
                close()
            }
        }.also { _UpLeft = it}
