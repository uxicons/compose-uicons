package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowDownFromArc: ImageVector? = null

val Icons.Rs.ArrowDownFromArc: ImageVector
    get() = _ArrowDownFromArc ?: UXIcon(name = "ArrowDownFromArc") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.8f, 16.29f)
                lineToRelative(1.41f, 1.42f)
                lineToRelative(-5.72f, 5.68f)
                curveToRelative(-0.41f, 0.41f, -0.94f, 0.61f, -1.48f, 0.61f)
                reflectiveCurveToRelative(-1.08f, -0.2f, -1.49f, -0.61f)
                lineToRelative(-5.72f, -5.67f)
                lineToRelative(1.41f, -1.42f)
                lineToRelative(4.8f, 4.76f)
                verticalLineTo(7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(14.05f)
                lineToRelative(4.8f, -4.76f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                horizontalLineToRelative(2f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                horizontalLineToRelative(2f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
            }
        }.also { _ArrowDownFromArc = it}
