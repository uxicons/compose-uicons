package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pi: ImageVector? = null

val Icons.Ts.Pi: ImageVector
    get() = _Pi ?: UXIcon(name = "Pi") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 1f)
                verticalLineToRelative(19.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineTo(1f)
                horizontalLineToRelative(-9f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 4.75f, -3.02f, 7.87f, -3.14f, 8.0f)
                lineToRelative(-0.71f, -0.7f)
                curveToRelative(0.03f, -0.03f, 2.86f, -2.97f, 2.86f, -7.3f)
                verticalLineTo(1f)
                horizontalLineToRelative(-0.5f)
                curveTo(1.08f, 1f, 1f, 6.76f, 1f, 7f)
                horizontalLineTo(0f)
                curveToRelative(0f, -0.07f, 0.07f, -7f, 6.5f, -7f)
                horizontalLineToRelative(17.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _Pi = it}
