package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RiskAlt: ImageVector? = null

val Icons.Sr.RiskAlt: ImageVector
    get() = _RiskAlt ?: UXIcon(name = "RiskAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(10f, 6f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(23.71f, 23.71f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-5.97f, -5.97f)
                curveToRelative(-1.73f, 1.41f, -3.93f, 2.26f, -6.32f, 2.26f)
                curveTo(4.49f, 20f, 0f, 15.51f, 0f, 10f)
                reflectiveCurveTo(4.49f, 0f, 10f, 0f)
                reflectiveCurveToRelative(10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.4f, -0.85f, 4.6f, -2.26f, 6.32f)
                lineToRelative(5.97f, 5.97f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(15.4f, 11.87f)
                lineToRelative(-4.18f, -7.17f)
                curveToRelative(-0.55f, -0.94f, -1.9f, -0.94f, -2.45f, 0f)
                lineToRelative(-4.18f, 7.17f)
                curveToRelative(-0.55f, 0.94f, 0.13f, 2.13f, 1.22f, 2.13f)
                horizontalLineToRelative(8.36f)
                curveToRelative(1.09f, 0f, 1.77f, -1.19f, 1.22f, -2.13f)
                close()
            }
        }.also { _RiskAlt = it}
