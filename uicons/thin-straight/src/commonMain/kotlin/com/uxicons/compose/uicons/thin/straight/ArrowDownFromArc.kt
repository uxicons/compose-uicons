package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownFromArc: ImageVector? = null

val Icons.Ts.ArrowDownFromArc: ImageVector
    get() = _ArrowDownFromArc ?: UXIcon(name = "ArrowDownFromArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.65f, 16.65f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(-6.22f, 6.18f)
                curveToRelative(-0.31f, 0.31f, -0.72f, 0.47f, -1.13f, 0.47f)
                reflectiveCurveToRelative(-0.82f, -0.16f, -1.13f, -0.47f)
                lineToRelative(-6.22f, -6.18f)
                lineToRelative(0.7f, -0.71f)
                lineToRelative(6.15f, 6.1f)
                verticalLineTo(7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(15.75f)
                lineToRelative(6.15f, -6.1f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                horizontalLineToRelative(1f)
                curveTo(1f, 5.93f, 5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                horizontalLineToRelative(1f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
            }
        }.also { _ArrowDownFromArc = it}
