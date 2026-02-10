package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Algorithm: ImageVector? = null

val Icons.Ts.Algorithm: ImageVector
    get() = _Algorithm ?: UXIcon(name = "Algorithm") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 11f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                reflectiveCurveToRelative(3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                close()
                moveTo(14f, 11f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(21f, 6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                reflectiveCurveToRelative(-1.35f, -3f, -3f, -3f)
                curveToRelative(-1.3f, 0f, -2.4f, 0.84f, -2.82f, 2f)
                lineTo(5.82f, 2f)
                curveToRelative(-0.41f, -1.16f, -1.51f, -2f, -2.82f, -2f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                curveToRelative(0f, 1.3f, 0.84f, 2.4f, 2f, 2.82f)
                verticalLineToRelative(10.37f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                curveToRelative(1.3f, 0f, 2.4f, -0.84f, 2.82f, -2f)
                horizontalLineToRelative(15.89f)
                lineToRelative(-3.15f, 3.15f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(3.29f, -3.29f)
                curveToRelative(0.58f, -0.58f, 0.58f, -1.54f, 0f, -2.12f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.15f, 3.15f)
                lineTo(6f, 19f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 6f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                horizontalLineToRelative(12f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                close()
                moveTo(21f, 1f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                close()
                moveTo(5f, 19f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(3f, 5f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveTo(1.9f, 1f, 3f, 1f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                close()
            }
        }.also { _Algorithm = it}
