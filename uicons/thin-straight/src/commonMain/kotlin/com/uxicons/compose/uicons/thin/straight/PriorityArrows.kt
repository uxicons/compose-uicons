package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PriorityArrows: ImageVector? = null

val Icons.Ts.PriorityArrows: ImageVector
    get() = _PriorityArrows ?: UXIcon(name = "PriorityArrows") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                lineTo(2.5f, 0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(23f, 23f)
                lineTo(1f, 23f)
                lineTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(20.5f)
                close()
                moveTo(8.56f, 6.44f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(-3.15f, -3.15f)
                verticalLineToRelative(10.71f)
                horizontalLineToRelative(-1f)
                lineTo(7.0f, 7.29f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(3.29f, -3.29f)
                curveToRelative(0.58f, -0.58f, 1.54f, -0.58f, 2.12f, 0f)
                close()
                moveTo(20.15f, 13.56f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-3.29f, 3.29f)
                curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
                reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(3.15f, 3.15f)
                lineTo(16.0f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10.71f)
                lineToRelative(3.15f, -3.15f)
                close()
            }
        }.also { _PriorityArrows = it}
