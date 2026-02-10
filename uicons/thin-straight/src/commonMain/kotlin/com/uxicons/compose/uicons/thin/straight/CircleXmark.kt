package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleXmark: ImageVector? = null

val Icons.Ts.CircleXmark: ImageVector
    get() = _CircleXmark ?: UXIcon(name = "CircleXmark") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.54f, 8.17f)
                lineToRelative(-3.83f, 3.83f)
                lineToRelative(3.83f, 3.83f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.83f, -3.83f)
                lineToRelative(-3.83f, 3.83f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.83f, -3.83f)
                lineToRelative(-3.83f, -3.83f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.83f, 3.83f)
                lineToRelative(3.83f, -3.83f)
                lineToRelative(0.71f, 0.71f)
                close()
                moveTo(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                close()
                moveTo(23f, 12f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                reflectiveCurveToRelative(4.93f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -4.93f, 11f, -11f)
                close()
            }
        }.also { _CircleXmark = it}
