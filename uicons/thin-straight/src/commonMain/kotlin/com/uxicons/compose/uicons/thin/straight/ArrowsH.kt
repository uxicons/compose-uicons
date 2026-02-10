package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowsH: ImageVector? = null

val Icons.Ts.ArrowsH: ImageVector
    get() = _ArrowsH ?: UXIcon(name = "ArrowsH") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.72f, 7.03f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.77f, 3.77f)
                horizontalLineTo(1.22f)
                lineToRelative(3.77f, -3.77f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(0.49f, 10.82f)
                curveToRelative(-0.32f, 0.32f, -0.49f, 0.73f, -0.49f, 1.18f)
                reflectiveCurveToRelative(0.17f, 0.86f, 0.49f, 1.18f)
                lineToRelative(3.79f, 3.79f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-3.77f, -3.77f)
                horizontalLineTo(22.78f)
                lineToRelative(-3.77f, 3.77f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.79f, -3.79f)
                curveToRelative(0.32f, -0.32f, 0.49f, -0.73f, 0.49f, -1.18f)
                reflectiveCurveToRelative(-0.17f, -0.86f, -0.49f, -1.18f)
                lineToRelative(-3.79f, -3.79f)
                close()
            }
        }.also { _ArrowsH = it}
