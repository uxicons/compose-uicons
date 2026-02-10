package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Aperture: ImageVector? = null

val Icons.Ts.Aperture: ImageVector
    get() = _Aperture ?: UXIcon(name = "Aperture") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(14.74f, 17f)
                horizontalLineToRelative(-5.5f)
                lineToRelative(-2.9f, -5.16f)
                lineToRelative(2.95f, -4.84f)
                horizontalLineToRelative(5.46f)
                lineToRelative(3.04f, 5.0f)
                lineToRelative(-3.04f, 5.0f)
                close()
                moveTo(15.92f, 7f)
                horizontalLineToRelative(5.88f)
                curveToRelative(0.77f, 1.5f, 1.2f, 3.2f, 1.2f, 5f)
                curveToRelative(0f, 1.73f, -0.4f, 3.37f, -1.11f, 4.82f)
                lineToRelative(-5.97f, -9.82f)
                close()
                moveTo(21.21f, 6f)
                horizontalLineToRelative(-11.31f)
                lineToRelative(3.02f, -4.96f)
                curveToRelative(3.47f, 0.29f, 6.49f, 2.2f, 8.29f, 4.96f)
                close()
                moveTo(11.78f, 1.0f)
                lineToRelative(-6.0f, 9.84f)
                lineToRelative(-2.85f, -5.06f)
                curveTo(4.88f, 2.95f, 8.11f, 1.08f, 11.78f, 1.0f)
                close()
                moveTo(2.33f, 6.76f)
                lineToRelative(5.77f, 10.24f)
                lineTo(2.2f, 17f)
                curveToRelative(-0.77f, -1.5f, -1.2f, -3.2f, -1.2f, -5f)
                curveToRelative(0f, -1.9f, 0.48f, -3.68f, 1.33f, -5.24f)
                close()
                moveTo(2.79f, 18f)
                horizontalLineToRelative(11.35f)
                lineToRelative(-3.03f, 4.96f)
                curveToRelative(-3.48f, -0.28f, -6.51f, -2.19f, -8.32f, -4.96f)
                close()
                moveTo(12.26f, 23.0f)
                lineToRelative(6.11f, -10.03f)
                lineToRelative(2.95f, 4.86f)
                curveToRelative(-1.9f, 3.04f, -5.25f, 5.08f, -9.07f, 5.17f)
                close()
            }
        }.also { _Aperture = it}
