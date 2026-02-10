package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownFromArc: ImageVector? = null

val Icons.Bs.ArrowDownFromArc: ImageVector
    get() = _ArrowDownFromArc ?: UXIcon(name = "ArrowDownFromArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.94f, 15.94f)
                lineToRelative(2.11f, 2.13f)
                lineToRelative(-5.22f, 5.18f)
                curveToRelative(-0.51f, 0.5f, -1.17f, 0.76f, -1.83f, 0.76f)
                reflectiveCurveToRelative(-1.33f, -0.25f, -1.84f, -0.76f)
                lineToRelative(-5.22f, -5.17f)
                lineToRelative(2.11f, -2.13f)
                lineToRelative(3.44f, 3.42f)
                verticalLineTo(7f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(12.35f)
                lineToRelative(3.44f, -3.42f)
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
        }.also { _ArrowDownFromArc = it}
