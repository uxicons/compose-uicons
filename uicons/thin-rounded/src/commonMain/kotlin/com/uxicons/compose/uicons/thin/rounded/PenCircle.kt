package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenCircle: ImageVector? = null

val Icons.Tr.PenCircle: ImageVector
    get() = _PenCircle ?: UXIcon(name = "PenCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
                moveTo(14.24f, 5.82f)
                lineToRelative(-6.93f, 6.93f)
                curveToRelative(-0.85f, 0.85f, -1.32f, 1.98f, -1.32f, 3.18f)
                verticalLineToRelative(1.57f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(1.57f)
                curveToRelative(1.2f, 0f, 2.33f, -0.47f, 3.18f, -1.32f)
                lineToRelative(6.93f, -6.93f)
                curveToRelative(0.53f, -0.53f, 0.82f, -1.23f, 0.82f, -1.97f)
                reflectiveCurveToRelative(-0.29f, -1.44f, -0.82f, -1.97f)
                curveToRelative(-1.05f, -1.05f, -2.89f, -1.05f, -3.94f, 0f)
                close()
                moveTo(10.55f, 15.97f)
                curveToRelative(-0.66f, 0.66f, -1.54f, 1.02f, -2.48f, 1.02f)
                horizontalLineToRelative(-1.07f)
                verticalLineToRelative(-1.07f)
                curveToRelative(0f, -0.94f, 0.36f, -1.81f, 1.02f, -2.48f)
                lineToRelative(5.11f, -5.11f)
                lineToRelative(2.52f, 2.52f)
                lineToRelative(-5.11f, 5.11f)
                close()
                moveTo(17.48f, 9.05f)
                lineToRelative(-1.11f, 1.11f)
                lineToRelative(-2.52f, -2.52f)
                lineToRelative(1.11f, -1.11f)
                curveToRelative(0.68f, -0.68f, 1.85f, -0.68f, 2.52f, 0f)
                curveToRelative(0.34f, 0.34f, 0.52f, 0.79f, 0.52f, 1.26f)
                reflectiveCurveToRelative(-0.19f, 0.93f, -0.52f, 1.26f)
                close()
            }
        }.also { _PenCircle = it}
