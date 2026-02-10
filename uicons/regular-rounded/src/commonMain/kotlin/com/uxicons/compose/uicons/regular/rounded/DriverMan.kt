package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DriverMan: ImageVector? = null

val Icons.Rr.DriverMan: ImageVector
    get() = _DriverMan ?: UXIcon(name = "DriverMan") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 12f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(15.31f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                reflectiveCurveToRelative(-1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                close()
                moveTo(21.94f, 22.89f)
                curveToRelative(0.06f, 0.55f, -0.3f, 1.11f, -1.0f, 1.11f)
                curveToRelative(-0.5f, 0f, -0.94f, -0.38f, -0.99f, -0.89f)
                curveToRelative(-0.45f, -4.05f, -3.87f, -7.11f, -7.95f, -7.11f)
                reflectiveCurveToRelative(-7.5f, 3.06f, -7.95f, 7.11f)
                curveToRelative(-0.06f, 0.55f, -0.56f, 0.95f, -1.1f, 0.88f)
                curveToRelative(-0.55f, -0.06f, -0.94f, -0.56f, -0.88f, -1.1f)
                curveToRelative(0.56f, -5.07f, 4.83f, -8.89f, 9.94f, -8.89f)
                reflectiveCurveToRelative(9.38f, 3.82f, 9.94f, 8.89f)
                close()
                moveTo(17.88f, 22.8f)
                curveToRelative(0.11f, 0.54f, -0.24f, 1.07f, -0.78f, 1.18f)
                curveToRelative(-0.07f, 0.01f, -0.13f, 0.02f, -0.2f, 0.02f)
                curveToRelative(-0.47f, 0f, -0.88f, -0.33f, -0.98f, -0.8f)
                curveToRelative(-0.38f, -1.85f, -2.02f, -3.2f, -3.92f, -3.2f)
                reflectiveCurveToRelative(-3.54f, 1.34f, -3.92f, 3.2f)
                curveToRelative(-0.11f, 0.54f, -0.63f, 0.89f, -1.18f, 0.78f)
                curveToRelative(-0.54f, -0.11f, -0.89f, -0.64f, -0.78f, -1.18f)
                curveToRelative(0.56f, -2.78f, 3.04f, -4.8f, 5.88f, -4.8f)
                reflectiveCurveToRelative(5.31f, 2.02f, 5.88f, 4.8f)
                close()
            }
        }.also { _DriverMan = it}
