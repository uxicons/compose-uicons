package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ThermometerEmpty: ImageVector? = null

val Icons.Rr.ThermometerEmpty: ImageVector
    get() = _ThermometerEmpty ?: UXIcon(name = "ThermometerEmpty") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.5f, 14f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                close()
                moveTo(11.5f, 18f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(16.5f, 12.11f)
                verticalLineToRelative(-7.11f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                reflectiveCurveToRelative(-5f, 2.24f, -5f, 5f)
                verticalLineToRelative(7.11f)
                curveToRelative(-1.28f, 1.3f, -2f, 3.06f, -2f, 4.89f)
                curveToRelative(0f, 3.86f, 3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -1.83f, -0.72f, -3.58f, -2f, -4.89f)
                close()
                moveTo(11.5f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                curveToRelative(0f, -1.41f, 0.61f, -2.77f, 1.67f, -3.72f)
                curveToRelative(0.21f, -0.19f, 0.33f, -0.46f, 0.33f, -0.74f)
                verticalLineToRelative(-7.54f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                verticalLineToRelative(7.54f)
                curveToRelative(0f, 0.28f, 0.12f, 0.55f, 0.33f, 0.74f)
                curveToRelative(1.06f, 0.95f, 1.67f, 2.31f, 1.67f, 3.72f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                close()
            }
        }.also { _ThermometerEmpty = it}
