package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlaneLaunch: ImageVector? = null

val Icons.Bs.PaperPlaneLaunch: ImageVector
    get() = _PaperPlaneLaunch ?: UXIcon(name = "PaperPlaneLaunch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 5.41f)
                lineToRelative(-1.5f, -4.37f)
                curveToRelative(0f, -0.18f, 0.04f, -0.35f, 0.13f, -0.51f)
                curveToRelative(0.28f, -0.5f, 0.91f, -0.68f, 1.42f, -0.4f)
                lineToRelative(11.45f, 6.37f)
                lineToRelative(-11.46f, 6.37f)
                curveToRelative(-0.32f, 0.18f, -0.71f, 0.17f, -1.03f, -0.01f)
                curveToRelative(-0.08f, -0.04f, -0.15f, -0.1f, -0.21f, -0.16f)
                curveToRelative(-0.19f, -0.2f, -0.3f, -0.46f, -0.3f, -0.73f)
                lineToRelative(1.5f, -4.46f)
                lineToRelative(8.5f, -1f)
                lineToRelative(-8.5f, -1.09f)
                close()
                moveTo(0f, 24f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                close()
                moveTo(6f, 24f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                close()
                moveTo(19.5f, 15f)
                lineTo(6.5f, 15f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-2.5f)
                curveTo(2.92f, 5f, 0f, 7.92f, 0f, 11.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-7.5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(7.5f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                close()
            }
        }.also { _PaperPlaneLaunch = it}
