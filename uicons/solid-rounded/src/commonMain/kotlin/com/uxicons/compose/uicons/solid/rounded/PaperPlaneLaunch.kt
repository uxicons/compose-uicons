package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaperPlaneLaunch: ImageVector? = null

val Icons.Sr.PaperPlaneLaunch: ImageVector
    get() = _PaperPlaneLaunch ?: UXIcon(name = "PaperPlaneLaunch") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 23f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(1f, 24f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(9f, 22f)
                horizontalLineToRelative(-2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
                moveTo(20f, 16f)
                lineTo(6f, 16f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(2f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-2f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                horizontalLineToRelative(14f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(7f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(18.7f, 7.37f)
                lineToRelative(-7.46f, 1.09f)
                lineToRelative(-1.11f, 2.45f)
                curveToRelative(-0.32f, 0.92f, -0.05f, 1.91f, 0.69f, 2.54f)
                curveToRelative(0.44f, 0.37f, 0.97f, 0.55f, 1.5f, 0.55f)
                curveToRelative(0.38f, 0f, 0.75f, -0.09f, 1.08f, -0.28f)
                lineToRelative(9.42f, -4.69f)
                curveToRelative(0.73f, -0.43f, 1.17f, -1.19f, 1.17f, -2.04f)
                curveToRelative(0f, -0.85f, -0.44f, -1.61f, -1.23f, -2.06f)
                lineTo(13.45f, 0.3f)
                curveToRelative(-0.85f, -0.48f, -1.88f, -0.38f, -2.62f, 0.25f)
                curveToRelative(-0.74f, 0.62f, -1.01f, 1.62f, -0.66f, 2.62f)
                lineToRelative(1.07f, 2.37f)
                lineToRelative(7.46f, 1.09f)
                curveToRelative(0.4f, 0.08f, 0.4f, 0.66f, 0f, 0.74f)
                close()
            }
        }.also { _PaperPlaneLaunch = it}
