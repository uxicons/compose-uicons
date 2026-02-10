package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftFromArc: ImageVector? = null

val Icons.Ts.ArrowLeftFromArc: ImageVector
    get() = _ArrowLeftFromArc ?: UXIcon(name = "ArrowLeftFromArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1.25f, 12.5f)
                lineToRelative(6.11f, 6.15f)
                lineToRelative(-0.71f, 0.7f)
                lineTo(0.47f, 13.13f)
                curveToRelative(-0.62f, -0.62f, -0.62f, -1.64f, 0.0f, -2.27f)
                lineToRelative(6.18f, -6.22f)
                lineToRelative(0.71f, 0.7f)
                lineTo(1.25f, 11.5f)
                horizontalLineToRelative(15.75f)
                verticalLineToRelative(1f)
                horizontalLineTo(1.25f)
                close()
                moveTo(12f, 0f)
                verticalLineToRelative(1f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                verticalLineToRelative(1f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
            }
        }.also { _ArrowLeftFromArc = it}
