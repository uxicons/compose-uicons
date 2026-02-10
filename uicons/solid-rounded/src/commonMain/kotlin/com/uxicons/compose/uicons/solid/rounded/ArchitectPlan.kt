package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArchitectPlan: ImageVector? = null

val Icons.Sr.ArchitectPlan: ImageVector
    get() = _ArchitectPlan ?: UXIcon(name = "ArchitectPlan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5f, 6f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.24f, -2.63f, 2.34f, -4.74f, 4.98f, -4.98f)
                verticalLineToRelative(2.98f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2.98f)
                curveToRelative(2.63f, 0.24f, 4.74f, 2.34f, 4.98f, 4.98f)
                horizontalLineToRelative(0.02f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-12f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(19.28f, 15.09f)
                lineTo(16.28f, 15.83f)
                curveToRelative(-1.9f, 0.35f, -3.28f, 2.0f, -3.28f, 3.94f)
                verticalLineToRelative(3.23f)
                curveToRelative(0f, 0.55f, 0.45f, 1.0f, 1.0f, 1f)
                lineToRelative(8.0f, 0.01f)
                curveToRelative(0.55f, 0f, 1.0f, -0.45f, 1.0f, -1f)
                verticalLineToRelative(-5.0f)
                curveToRelative(0.0f, -1.95f, -1.83f, -3.38f, -3.72f, -2.91f)
                close()
                moveTo(7.71f, 15.83f)
                lineTo(4.72f, 15.09f)
                curveToRelative(-1.89f, -0.47f, -3.72f, 0.96f, -3.72f, 2.91f)
                verticalLineToRelative(4.99f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(8.0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.23f)
                curveToRelative(0f, -1.93f, -1.38f, -3.59f, -3.28f, -3.94f)
                close()
                moveTo(18f, 9f)
                horizontalLineToRelative(-12f)
                curveToRelative(0.08f, 3.24f, 2.74f, 6f, 6f, 6f)
                curveToRelative(3.31f, 0.0f, 6.0f, -2.71f, 6f, -6f)
                close()
            }
        }.also { _ArchitectPlan = it}
