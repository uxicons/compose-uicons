package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaseStudy: ImageVector? = null

val Icons.Ss.CaseStudy: ImageVector
    get() = _CaseStudy ?: UXIcon(name = "CaseStudy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23.96f, 22.55f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(0.52f, -0.79f, 0.83f, -1.74f, 0.83f, -2.75f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                reflectiveCurveToRelative(2.24f, 5f, 5f, 5f)
                curveToRelative(1.02f, 0f, 1.96f, -0.31f, 2.75f, -0.83f)
                lineToRelative(2.79f, 2.79f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(8.65f, 12f)
                lineTo(2f, 12f)
                lineTo(2f, 0f)
                lineTo(22f, 0f)
                lineTo(22f, 12f)
                horizontalLineToRelative(-0.11f)
                curveToRelative(-1.26f, -1.24f, -2.99f, -2f, -4.89f, -2f)
                curveToRelative(-2.37f, 0f, -4.47f, 1.19f, -5.74f, 3f)
                horizontalLineToRelative(-1.76f)
                lineToRelative(-0.85f, -1f)
                close()
                moveTo(10.08f, 18f)
                lineTo(3f, 18f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-1f)
                lineTo(7.72f, 14f)
                lineToRelative(0.85f, 1f)
                horizontalLineToRelative(1.73f)
                curveToRelative(-0.19f, 0.63f, -0.29f, 1.3f, -0.29f, 2f)
                curveToRelative(0f, 0.34f, 0.03f, 0.67f, 0.08f, 1f)
                close()
            }
        }.also { _CaseStudy = it}
