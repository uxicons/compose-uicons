package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowUpToArc: ImageVector? = null

val Icons.Bs.ArrowUpToArc: ImageVector
    get() = _ArrowUpToArc ?: UXIcon(name = "ArrowUpToArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.85f, 7.76f)
                lineToRelative(5.22f, 5.17f)
                lineToRelative(-2.11f, 2.13f)
                lineToRelative(-3.44f, -3.42f)
                verticalLineToRelative(12.35f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-12.35f)
                lineToRelative(-3.44f, 3.42f)
                lineToRelative(-2.11f, -2.13f)
                lineToRelative(5.22f, -5.18f)
                curveToRelative(0.97f, -0.97f, 2.69f, -0.98f, 3.68f, 0.01f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                horizontalLineToRelative(3f)
                curveTo(3f, 7.04f, 7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                horizontalLineToRelative(3f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
            }
        }.also { _ArrowUpToArc = it}
