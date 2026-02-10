package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EndlessLoop: ImageVector? = null

val Icons.Rs.EndlessLoop: ImageVector
    get() = _EndlessLoop ?: UXIcon(name = "EndlessLoop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 14.5f)
                curveToRelative(0f, 4.14f, -3.36f, 7.5f, -7.5f, 7.5f)
                horizontalLineTo(7.5f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                reflectiveCurveToRelative(3.36f, -7.5f, 7.5f, -7.5f)
                horizontalLineToRelative(5.55f)
                lineToRelative(-4.76f, -4.79f)
                lineToRelative(1.42f, -1.41f)
                lineToRelative(5.68f, 5.72f)
                curveToRelative(0.82f, 0.82f, 0.82f, 2.15f, -0.0f, 2.97f)
                lineToRelative(-5.67f, 5.72f)
                lineToRelative(-1.42f, -1.41f)
                lineToRelative(4.76f, -4.79f)
                horizontalLineToRelative(-5.55f)
                curveToRelative(-3.03f, 0f, -5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(9f)
                curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
                curveToRelative(0f, -2.51f, -1.7f, -4.63f, -4f, -5.29f)
                verticalLineToRelative(-2.06f)
                curveToRelative(3.42f, 0.7f, 6f, 3.73f, 6f, 7.35f)
                close()
            }
        }.also { _EndlessLoop = it}
