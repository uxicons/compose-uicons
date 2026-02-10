package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftToArc: ImageVector? = null

val Icons.Ts.ArrowLeftToArc: ImageVector
    get() = _ArrowLeftToArc ?: UXIcon(name = "ArrowLeftToArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12.5f)
                horizontalLineToRelative(-15.75f)
                lineToRelative(6.11f, 6.15f)
                lineToRelative(-0.71f, 0.7f)
                lineToRelative(-6.18f, -6.22f)
                curveToRelative(-0.62f, -0.62f, -0.62f, -1.64f, 0.0f, -2.27f)
                lineToRelative(6.18f, -6.22f)
                lineToRelative(0.71f, 0.7f)
                lineToRelative(-6.1f, 6.15f)
                horizontalLineToRelative(15.75f)
                verticalLineToRelative(1f)
                close()
                moveTo(1f, 12f)
                curveTo(1f, 5.93f, 5.93f, 1f, 12f, 1f)
                lineTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                verticalLineToRelative(-1f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                close()
            }
        }.also { _ArrowLeftToArc = it}
