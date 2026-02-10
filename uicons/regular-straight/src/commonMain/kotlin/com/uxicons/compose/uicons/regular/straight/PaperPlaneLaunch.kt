package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlaneLaunch: ImageVector? = null

val Icons.Rs.PaperPlaneLaunch: ImageVector
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
                moveTo(11.5f, 6.66f)
                lineToRelative(-1.5f, -4.7f)
                curveToRelative(0f, -1.19f, 0.89f, -1.75f, 1.38f, -1.89f)
                curveToRelative(0.49f, -0.14f, 1.0f, -0.07f, 1.44f, 0.2f)
                lineToRelative(11.1f, 6.73f)
                lineToRelative(-11.1f, 6.74f)
                curveToRelative(-0.29f, 0.18f, -0.62f, 0.27f, -0.94f, 0.27f)
                curveToRelative(-1.88f, 0f, -1.88f, -1.46f, -1.88f, -1.97f)
                lineToRelative(1.5f, -4.69f)
                verticalLineToRelative(-0.68f)
                close()
                moveTo(12.13f, 2.18f)
                lineToRelative(1.24f, 3.75f)
                lineToRelative(4.63f, 1.07f)
                lineToRelative(-4.63f, 1.07f)
                lineToRelative(-1.24f, 3.75f)
                lineToRelative(7.95f, -4.82f)
                lineToRelative(-7.95f, -4.82f)
                close()
            }
        }.also { _PaperPlaneLaunch = it}
