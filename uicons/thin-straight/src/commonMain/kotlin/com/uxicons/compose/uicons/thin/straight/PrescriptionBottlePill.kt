package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PrescriptionBottlePill: ImageVector? = null

val Icons.Ts.PrescriptionBottlePill: ImageVector
    get() = _PrescriptionBottlePill ?: UXIcon(name = "PrescriptionBottlePill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.5f, 11f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                reflectiveCurveToRelative(2.92f, 6.5f, 6.5f, 6.5f)
                reflectiveCurveToRelative(6.5f, -2.92f, 6.5f, -6.5f)
                reflectiveCurveToRelative(-2.92f, -6.5f, -6.5f, -6.5f)
                close()
                moveTo(12f, 17.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                curveToRelative(1.34f, 0f, 2.56f, 0.48f, 3.52f, 1.28f)
                lineToRelative(-7.74f, 7.74f)
                curveToRelative(-0.8f, -0.95f, -1.28f, -2.18f, -1.28f, -3.52f)
                close()
                moveTo(17.5f, 23f)
                curveToRelative(-1.34f, 0f, -2.56f, -0.48f, -3.52f, -1.28f)
                lineToRelative(7.74f, -7.74f)
                curveToRelative(0.8f, 0.95f, 1.28f, 2.18f, 1.28f, 3.52f)
                curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                close()
                moveTo(11.03f, 23f)
                horizontalLineToRelative(-6.53f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                lineTo(3f, 17f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                lineTo(3f, 13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                lineTo(3f, 9f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(4.14f)
                curveToRelative(0.34f, 0.06f, 0.68f, 0.14f, 1f, 0.23f)
                verticalLineToRelative(-4.38f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                lineTo(2.5f, -0f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(16.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(7.53f)
                curveToRelative(-0.36f, -0.3f, -0.7f, -0.64f, -1.0f, -1f)
                close()
                moveTo(1f, 2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(1f, 4f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }.also { _PrescriptionBottlePill = it}
