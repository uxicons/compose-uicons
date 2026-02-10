package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RiskAlt: ImageVector? = null

val Icons.Br.RiskAlt: ImageVector
    get() = _RiskAlt ?: UXIcon(name = "RiskAlt") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(15.4f, 11.87f)
            lineToRelative(-4.18f, -7.17f)
            curveToRelative(-0.55f, -0.94f, -1.9f, -0.94f, -2.45f, 0f)
            lineToRelative(-4.18f, 7.17f)
            curveToRelative(-0.55f, 0.94f, 0.13f, 2.13f, 1.22f, 2.13f)
            horizontalLineToRelative(8.36f)
            curveToRelative(1.09f, 0f, 1.77f, -1.19f, 1.22f, -2.13f)
            close()
            moveTo(10f, 13f)
            curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
            reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
            close()
            moveTo(11f, 9f)
            curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
            verticalLineToRelative(2f)
            close()
            moveTo(23.56f, 21.44f)
            lineToRelative(-5.52f, -5.52f)
            curveToRelative(1.23f, -1.66f, 1.96f, -3.7f, 1.96f, -5.92f)
            curveTo(20f, 4.49f, 15.51f, 0f, 10f, 0f)
            reflectiveCurveTo(0f, 4.49f, 0f, 10f)
            reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
            curveToRelative(2.22f, 0f, 4.26f, -0.73f, 5.92f, -1.96f)
            lineToRelative(5.52f, 5.52f)
            curveToRelative(0.29f, 0.29f, 0.68f, 0.44f, 1.06f, 0.44f)
            reflectiveCurveToRelative(0.77f, -0.15f, 1.06f, -0.44f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            close()
            moveTo(3f, 10f)
            curveToRelative(0f, -3.86f, 3.14f, -7f, 7f, -7f)
            reflectiveCurveToRelative(7f, 3.14f, 7f, 7f)
            curveToRelative(0f, 1.91f, -0.77f, 3.65f, -2.02f, 4.91f)
            curveToRelative(-0.01f, 0.01f, -0.03f, 0.01f, -0.04f, 0.03f)
            reflectiveCurveToRelative(-0.01f, 0.03f, -0.03f, 0.04f)
            curveToRelative(-1.26f, 1.25f, -3f, 2.02f, -4.91f, 2.02f)
            curveToRelative(-3.86f, 0f, -7f, -3.14f, -7f, -7f)
            close()
        }
    }.also { _RiskAlt = it }
