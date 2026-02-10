package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Percentage: ImageVector? = null

val Icons.Tc.Percentage: ImageVector
    get() = _Percentage ?: UXIcon(name = "Percentage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.85f, 1.85f)
                lineToRelative(-21f, 21f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(21.0f, -21.0f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, 0.51f, 0f, 0.71f)
                close()
                moveTo(23f, 19f)
                curveToRelative(0f, 2.77f, -1.23f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.23f, -4f, -4f)
                reflectiveCurveToRelative(1.23f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.23f, 4f, 4f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, -2.21f, -0.79f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 0.79f, -3f, 3f)
                reflectiveCurveToRelative(0.79f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -0.79f, 3f, -3f)
                close()
                moveTo(1f, 5f)
                curveToRelative(0f, -2.77f, 1.23f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.23f, 4f, 4f)
                reflectiveCurveToRelative(-1.23f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.23f, -4f, -4f)
                close()
                moveTo(2f, 5f)
                curveToRelative(0f, 2.21f, 0.79f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -0.79f, 3f, -3f)
                reflectiveCurveToRelative(-0.79f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 0.79f, -3f, 3f)
                close()
            }
        }.also { _Percentage = it}
