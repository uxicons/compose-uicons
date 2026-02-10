package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CaseStudy: ImageVector? = null

val Icons.Bs.CaseStudy: ImageVector
    get() = _CaseStudy ?: UXIcon(name = "CaseStudy") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.68f, 14f)
                curveToRelative(-0.43f, 0.91f, -0.68f, 1.93f, -0.68f, 3f)
                curveToRelative(0f, 0.34f, 0.03f, 0.67f, 0.08f, 1f)
                lineTo(3f, 18f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                verticalLineToRelative(-2f)
                lineTo(2f, 13f)
                lineTo(2f, 0f)
                lineTo(22f, 0f)
                lineTo(22f, 12.11f)
                curveToRelative(-0.82f, -0.84f, -1.85f, -1.47f, -3f, -1.81f)
                lineTo(19f, 3f)
                lineTo(5f, 3f)
                lineTo(5f, 13f)
                horizontalLineToRelative(3.31f)
                lineToRelative(0.92f, 1f)
                horizontalLineToRelative(1.45f)
                close()
                moveTo(21.79f, 23.91f)
                lineToRelative(-2.49f, -2.49f)
                curveToRelative(-0.69f, 0.36f, -1.46f, 0.58f, -2.29f, 0.58f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 0.83f, -0.22f, 1.6f, -0.58f, 2.29f)
                lineToRelative(2.49f, 2.49f)
                lineToRelative(-2.12f, 2.12f)
                close()
                moveTo(19f, 17f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                reflectiveCurveToRelative(-2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                close()
            }
        }.also { _CaseStudy = it}
