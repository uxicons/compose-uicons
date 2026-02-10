package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlaneLaunch: ImageVector? = null

val Icons.Br.PaperPlaneLaunch: ImageVector
    get() = _PaperPlaneLaunch ?: UXIcon(name = "PaperPlaneLaunch") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(20.99f, 6.5f)
            horizontalLineToRelative(0.01f)
            lineToRelative(-8.5f, -1.09f)
            lineToRelative(-1.42f, -3.51f)
            curveToRelative(-0.44f, -1.24f, 0.89f, -2.35f, 2.04f, -1.71f)
            lineToRelative(10.15f, 5.04f)
            curveToRelative(0.97f, 0.56f, 0.97f, 1.97f, 0f, 2.54f)
            lineToRelative(-10.15f, 5.04f)
            curveToRelative(-1.14f, 0.64f, -2.47f, -0.47f, -2.04f, -1.71f)
            lineToRelative(1.42f, -3.51f)
            lineToRelative(8.49f, -1.09f)
            close()
            moveTo(2.5f, 21f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
            moveTo(19.5f, 15f)
            lineTo(6.5f, 15f)
            curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
            reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-1f)
            curveTo(2.92f, 5f, 0f, 7.92f, 0f, 11.5f)
            reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
            horizontalLineToRelative(13f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-6f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(6f)
            curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
            reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(8.5f, 21f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _PaperPlaneLaunch = it }
