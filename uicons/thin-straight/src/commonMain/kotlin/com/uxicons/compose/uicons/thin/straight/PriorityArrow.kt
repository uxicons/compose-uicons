package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PriorityArrow: ImageVector? = null

val Icons.Ts.PriorityArrow: ImageVector
    get() = _PriorityArrow ?: UXIcon(name = "PriorityArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 15f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                close()
                moveTo(19f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                close()
                moveTo(18f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                lineTo(24f, 1f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(23f, 6f)
                horizontalLineToRelative(-4f)
                lineTo(19f, 2f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(18f, 23f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                close()
                moveTo(19f, 18f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                close()
                moveTo(12.28f, 6.35f)
                lineToRelative(2.35f, -2.35f)
                horizontalLineToRelative(-5.63f)
                curveTo(4.59f, 4f, 1f, 7.59f, 1f, 12f)
                reflectiveCurveToRelative(3.59f, 8f, 8f, 8f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-7f)
                curveTo(4.04f, 21f, 0f, 16.96f, 0f, 12f)
                reflectiveCurveTo(4.04f, 3f, 9f, 3f)
                horizontalLineToRelative(5.57f)
                lineToRelative(-2.29f, -2.29f)
                lineTo(12.99f, 0.01f)
                lineToRelative(2.64f, 2.64f)
                curveToRelative(0.24f, 0.23f, 0.37f, 0.55f, 0.37f, 0.88f)
                reflectiveCurveToRelative(-0.13f, 0.65f, -0.37f, 0.88f)
                lineToRelative(-2.64f, 2.64f)
                lineToRelative(-0.71f, -0.71f)
                close()
            }
        }.also { _PriorityArrow = it}
