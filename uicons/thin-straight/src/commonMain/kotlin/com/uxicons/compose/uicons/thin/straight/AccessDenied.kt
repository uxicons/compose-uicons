package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AccessDenied: ImageVector? = null

val Icons.Ts.AccessDenied: ImageVector
    get() = _AccessDenied ?: UXIcon(name = "AccessDenied") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 18f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
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
                moveTo(19.49f, 14.8f)
                lineTo(17.5f, 16.79f)
                lineTo(15.51f, 14.8f)
                lineTo(14.8f, 15.51f)
                lineTo(16.79f, 17.5f)
                lineTo(14.8f, 19.49f)
                lineTo(15.51f, 20.2f)
                lineTo(17.5f, 18.21f)
                lineTo(19.49f, 20.2f)
                lineTo(20.2f, 19.49f)
                lineTo(18.21f, 17.5f)
                lineTo(20.2f, 15.51f)
                close()
                moveTo(10.3f, 23f)
                curveToRelative(0.32f, 0.36f, 0.67f, 0.7f, 1.04f, 1f)
                horizontalLineToRelative(-8.85f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-13.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-18f)
                verticalLineToRelative(12.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                close()
                moveTo(4f, 8f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -3.03f, -2.47f, -5.5f, -5.5f, -5.5f)
                reflectiveCurveToRelative(-5.5f, 2.47f, -5.5f, 5.5f)
                close()
            }
        }.also { _AccessDenied = it}
