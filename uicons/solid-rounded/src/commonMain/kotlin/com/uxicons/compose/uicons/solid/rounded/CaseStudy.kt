package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaseStudy: ImageVector? = null

val Icons.Sr.CaseStudy: ImageVector
    get() = _CaseStudy ?: UXIcon(name = "CaseStudy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.71f, 22.29f)
                lineToRelative(-2.54f, -2.54f)
                curveToRelative(0.52f, -0.79f, 0.83f, -1.74f, 0.83f, -2.75f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(1.02f, 0f, 1.96f, -0.31f, 2.75f, -0.83f)
                lineToRelative(2.54f, 2.54f)
                curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0f)
                reflectiveCurveToRelative(0.39f, -1.02f, 0f, -1.41f)
                close()
                moveTo(3f, 11f)
                curveToRelative(-0.34f, 0f, -0.68f, 0.04f, -1f, 0.11f)
                lineTo(2f, 5f)
                curveTo(2f, 2.24f, 4.24f, 0f, 7f, 0f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(6.11f)
                curveToRelative(-0.32f, -0.07f, -0.66f, -0.11f, -1f, -0.11f)
                horizontalLineToRelative(-0.41f)
                curveToRelative(-1.05f, -0.63f, -2.28f, -1f, -3.59f, -1f)
                curveToRelative(-1.91f, 0f, -3.63f, 0.76f, -4.89f, 2f)
                horizontalLineToRelative(-2.11f)
                curveToRelative(-0.73f, -0.64f, -1.66f, -1f, -2.65f, -1f)
                lineTo(3f, 11f)
                close()
                moveTo(10.08f, 18f)
                lineTo(2.5f, 18f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                lineTo(7.35f, 13f)
                curveToRelative(0.59f, 0f, 1.15f, 0.26f, 1.53f, 0.71f)
                lineToRelative(0.25f, 0.29f)
                horizontalLineToRelative(1.55f)
                curveToRelative(-0.43f, 0.91f, -0.68f, 1.93f, -0.68f, 3f)
                curveToRelative(0f, 0.34f, 0.03f, 0.67f, 0.08f, 1f)
                close()
            }
        }.also { _CaseStudy = it}
