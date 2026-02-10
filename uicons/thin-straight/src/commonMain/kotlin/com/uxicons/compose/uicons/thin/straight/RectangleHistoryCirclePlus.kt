package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleHistoryCirclePlus: ImageVector? = null

val Icons.Ts.RectangleHistoryCirclePlus: ImageVector
    get() = _RectangleHistoryCirclePlus ?: UXIcon(name = "RectangleHistoryCirclePlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 1f)
                lineTo(6f, 1f)
                lineTo(6f, 0f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                close()
                moveTo(21f, 5f)
                lineTo(3f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(18f)
                verticalLineToRelative(-1f)
                close()
                moveTo(24f, 17.5f)
                curveToRelative(0f, 3.58f, -2.92f, 6.5f, -6.5f, 6.5f)
                reflectiveCurveToRelative(-6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                close()
                moveTo(23f, 17.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                reflectiveCurveToRelative(2.47f, 5.5f, 5.5f, 5.5f)
                reflectiveCurveToRelative(5.5f, -2.47f, 5.5f, -5.5f)
                close()
                moveTo(18f, 14.5f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(2.5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(2.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-2.5f)
                close()
                moveTo(1f, 23f)
                verticalLineToRelative(-10.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(9.53f)
                curveToRelative(0.45f, -0.38f, 0.95f, -0.72f, 1.47f, -1f)
                lineTo(2.5f, 10f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(11.5f)
                horizontalLineToRelative(12.03f)
                curveToRelative(-0.36f, -0.3f, -0.7f, -0.64f, -1.0f, -1f)
                lineTo(1f, 23f)
                close()
            }
        }.also { _RectangleHistoryCirclePlus = it}
