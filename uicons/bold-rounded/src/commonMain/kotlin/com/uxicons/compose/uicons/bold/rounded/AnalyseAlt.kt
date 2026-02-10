package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AnalyseAlt: ImageVector? = null

val Icons.Br.AnalyseAlt: ImageVector
    get() = _AnalyseAlt ?: UXIcon(name = "AnalyseAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15f, 12f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            lineTo(6f, 13f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            verticalLineToRelative(2f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            verticalLineToRelative(5f)
            horizontalLineToRelative(1f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            verticalLineToRelative(3f)
            curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
            close()
            moveTo(23.56f, 23.56f)
            curveToRelative(-0.29f, 0.29f, -0.68f, 0.44f, -1.06f, 0.44f)
            reflectiveCurveToRelative(-0.77f, -0.15f, -1.06f, -0.44f)
            lineToRelative(-5.51f, -5.51f)
            curveToRelative(-1.66f, 1.23f, -3.7f, 1.96f, -5.92f, 1.96f)
            curveTo(4.49f, 20.01f, 0.01f, 15.52f, 0.01f, 10.01f)
            reflectiveCurveTo(4.49f, 0.01f, 10.01f, 0.01f)
            reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
            curveToRelative(0f, 2.22f, -0.73f, 4.26f, -1.96f, 5.92f)
            lineToRelative(5.51f, 5.51f)
            curveToRelative(0.59f, 0.59f, 0.59f, 1.53f, 0f, 2.12f)
            close()
            moveTo(17f, 10f)
            curveToRelative(0f, -3.89f, -3.19f, -7.05f, -7.1f, -6.99f)
            curveToRelative(-3.71f, 0.05f, -6.84f, 3.18f, -6.9f, 6.89f)
            curveToRelative(-0.06f, 3.91f, 3.1f, 7.1f, 6.99f, 7.1f)
            curveToRelative(3.83f, 0f, 7f, -3.17f, 7f, -7f)
            close()
        }
    }.also { _AnalyseAlt = it }
