package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Circle7: ImageVector? = null

val Icons.Rr.Circle7: ImageVector
    get() = _Circle7 ?: UXIcon(name = "Circle7") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 24f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                reflectiveCurveToRelative(-5.38f, 12f, -12f, 12f)
                close()
                moveTo(12f, 2f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                reflectiveCurveTo(17.51f, 2f, 12f, 2f)
                close()
                moveTo(10.87f, 17.5f)
                lineToRelative(4.92f, -8.6f)
                curveToRelative(0.31f, -0.62f, 0.28f, -1.35f, -0.09f, -1.95f)
                curveToRelative(-0.37f, -0.59f, -1.0f, -0.95f, -1.7f, -0.95f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                lineToRelative(5.03f, -0.05f)
                lineToRelative(-4.89f, 8.55f)
                curveToRelative(-0.27f, 0.48f, -0.11f, 1.09f, 0.37f, 1.36f)
                curveToRelative(0.16f, 0.09f, 0.33f, 0.13f, 0.5f, 0.13f)
                curveToRelative(0.35f, 0f, 0.68f, -0.18f, 0.87f, -0.5f)
                close()
            }
        }.also { _Circle7 = it}
