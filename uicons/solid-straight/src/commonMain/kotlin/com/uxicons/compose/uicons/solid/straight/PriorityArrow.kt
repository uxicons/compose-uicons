package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PriorityArrow: ImageVector? = null

val Icons.Ss.PriorityArrow: ImageVector
    get() = _PriorityArrow ?: UXIcon(name = "PriorityArrow") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 15f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                close()
                moveTo(18f, 1f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(6f)
                lineTo(24f, 1f)
                horizontalLineToRelative(-6f)
                close()
                moveTo(18f, 23f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(6f)
                close()
                moveTo(16.3f, 3.37f)
                curveToRelative(0.35f, 0.35f, 0.35f, 0.91f, 0f, 1.26f)
                lineToRelative(-3.29f, 3.37f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-7f)
                curveTo(4.04f, 21f, 0f, 16.96f, 0f, 12f)
                reflectiveCurveTo(4.04f, 3f, 9f, 3f)
                horizontalLineToRelative(4f)
                lineTo(13f, 0f)
                lineToRelative(3.29f, 3.37f)
                close()
            }
        }.also { _PriorityArrow = it}
