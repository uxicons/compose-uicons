package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HundredPoints: ImageVector? = null

val Icons.Ts.HundredPoints: ImageVector
    get() = _HundredPoints ?: UXIcon(name = "HundredPoints") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2.55f, 7.12f)
                lineToRelative(-0.71f, -0.7f)
                lineToRelative(2.37f, -2.42f)
                horizontalLineToRelative(0.8f)
                verticalLineToRelative(11f)
                horizontalLineToRelative(-1f)
                lineTo(4f, 5.64f)
                lineToRelative(-1.45f, 1.48f)
                close()
                moveTo(16f, 7.5f)
                lineTo(16f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(17f, 7.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(22f, 3.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(4f)
                close()
                moveTo(7f, 9.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                close()
                moveTo(8f, 9.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(4f)
                close()
                moveTo(23.64f, 13.97f)
                lineTo(0.14f, 19.05f)
                lineToRelative(0.21f, 0.98f)
                lineToRelative(23.5f, -5.08f)
                lineToRelative(-0.21f, -0.98f)
                close()
                moveTo(23.68f, 19.54f)
                lineToRelative(-14.79f, 3.47f)
                lineToRelative(0.23f, 0.97f)
                lineToRelative(14.79f, -3.47f)
                lineToRelative(-0.23f, -0.97f)
                close()
            }
        }.also { _HundredPoints = it}
