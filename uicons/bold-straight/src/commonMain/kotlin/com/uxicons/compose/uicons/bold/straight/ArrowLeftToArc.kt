package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftToArc: ImageVector? = null

val Icons.Bs.ArrowLeftToArc: ImageVector
    get() = _ArrowLeftToArc ?: UXIcon(name = "ArrowLeftToArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 13.5f)
                horizontalLineToRelative(-12.35f)
                lineToRelative(3.42f, 3.44f)
                lineToRelative(-2.13f, 2.11f)
                lineToRelative(-5.18f, -5.22f)
                curveToRelative(-1.01f, -1.01f, -1.01f, -2.66f, 0.0f, -3.68f)
                lineToRelative(5.17f, -5.22f)
                lineToRelative(2.13f, 2.11f)
                lineToRelative(-3.42f, 3.44f)
                horizontalLineToRelative(12.35f)
                verticalLineToRelative(3f)
                close()
                moveTo(3f, 12f)
                curveTo(3f, 7.04f, 7.04f, 3f, 12f, 3f)
                lineTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                verticalLineToRelative(-3f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                close()
            }
        }.also { _ArrowLeftToArc = it}
