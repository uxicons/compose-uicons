package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EndlessLoop: ImageVector? = null

val Icons.Ts.EndlessLoop: ImageVector
    get() = _EndlessLoop ?: UXIcon(name = "EndlessLoop") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 14.5f)
                curveToRelative(0f, 4.14f, -3.36f, 7.5f, -7.5f, 7.5f)
                horizontalLineTo(7.5f)
                curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
                reflectiveCurveToRelative(3.36f, -7.5f, 7.5f, -7.5f)
                horizontalLineToRelative(6.25f)
                lineTo(8.14f, 1.35f)
                lineToRelative(0.71f, -0.7f)
                lineToRelative(5.68f, 5.72f)
                curveToRelative(0.62f, 0.62f, 0.62f, 1.64f, -0.0f, 2.26f)
                lineToRelative(-5.68f, 5.72f)
                lineToRelative(-0.71f, -0.7f)
                lineToRelative(5.61f, -5.65f)
                horizontalLineToRelative(-6.25f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(9f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                curveToRelative(0f, -3.42f, -2.65f, -6.22f, -6f, -6.47f)
                verticalLineToRelative(-1f)
                curveToRelative(3.9f, 0.26f, 7f, 3.51f, 7f, 7.47f)
                close()
            }
        }.also { _EndlessLoop = it}
