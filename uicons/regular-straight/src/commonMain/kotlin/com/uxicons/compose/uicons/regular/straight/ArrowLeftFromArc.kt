package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftFromArc: ImageVector? = null

val Icons.Rs.ArrowLeftFromArc: ImageVector
    get() = _ArrowLeftFromArc ?: UXIcon(name = "ArrowLeftFromArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.95f, 13f)
                lineToRelative(4.76f, 4.8f)
                lineToRelative(-1.42f, 1.41f)
                lineTo(0.61f, 13.48f)
                curveToRelative(-0.82f, -0.82f, -0.82f, -2.15f, 0.0f, -2.97f)
                lineToRelative(5.67f, -5.72f)
                lineToRelative(1.42f, 1.41f)
                lineToRelative(-4.76f, 4.8f)
                horizontalLineToRelative(14.05f)
                verticalLineToRelative(2f)
                horizontalLineTo(2.95f)
                close()
                moveTo(12f, 0f)
                verticalLineToRelative(2f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                reflectiveCurveToRelative(-4.49f, 10f, -10f, 10f)
                verticalLineToRelative(2f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
            }
        }.also { _ArrowLeftFromArc = it}
