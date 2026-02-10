package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftFromArc: ImageVector? = null

val Icons.Bs.ArrowLeftFromArc: ImageVector
    get() = _ArrowLeftFromArc ?: UXIcon(name = "ArrowLeftFromArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4.65f, 13.5f)
                lineToRelative(3.42f, 3.44f)
                lineToRelative(-2.13f, 2.11f)
                lineTo(0.76f, 13.84f)
                curveToRelative(-1.01f, -1.01f, -1.01f, -2.66f, 0.0f, -3.68f)
                lineToRelative(5.17f, -5.22f)
                lineToRelative(2.13f, 2.11f)
                lineToRelative(-3.42f, 3.44f)
                horizontalLineToRelative(12.35f)
                verticalLineToRelative(3f)
                horizontalLineTo(4.65f)
                close()
                moveTo(12f, 0f)
                verticalLineToRelative(3f)
                curveToRelative(4.96f, 0f, 9f, 4.04f, 9f, 9f)
                reflectiveCurveToRelative(-4.04f, 9f, -9f, 9f)
                verticalLineToRelative(3f)
                curveToRelative(6.62f, 0f, 12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
            }
        }.also { _ArrowLeftFromArc = it}
