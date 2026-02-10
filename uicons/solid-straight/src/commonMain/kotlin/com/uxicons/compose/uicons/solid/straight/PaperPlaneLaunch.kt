package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlaneLaunch: ImageVector? = null

val Icons.Ss.PaperPlaneLaunch: ImageVector
    get() = _PaperPlaneLaunch ?: UXIcon(name = "PaperPlaneLaunch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                lineTo(0f, 24f)
                verticalLineToRelative(-2f)
                close()
                moveTo(6f, 24f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                close()
                moveTo(20f, 16f)
                lineTo(6f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(19.5f, 7f)
                lineToRelative(-8.23f, 1.29f)
                lineToRelative(-1.27f, 3.74f)
                curveToRelative(-0.0f, 0.51f, 0f, 1.97f, 1.88f, 1.97f)
                curveToRelative(0.33f, 0f, 0.65f, -0.09f, 0.94f, -0.27f)
                lineToRelative(11.1f, -6.74f)
                lineTo(12.83f, 0.27f)
                curveTo(12.57f, 0.11f, 12.29f, 0.0f, 12f, 0.0f)
                curveTo(10f, 0.0f, 10f, 1.64f, 10f, 1.96f)
                lineToRelative(1.26f, 3.78f)
                lineToRelative(8.24f, 1.26f)
                close()
            }
        }.also { _PaperPlaneLaunch = it}
