package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Anchor: ImageVector? = null

val Icons.Ts.Anchor: ImageVector
    get() = _Anchor ?: UXIcon(name = "Anchor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 13f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.99f)
                curveToRelative(-0.29f, 5.47f, -5.39f, 8.78f, -10.49f, 8.98f)
                verticalLineToRelative(-8.98f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(-5.05f)
                curveToRelative(1.97f, -0.25f, 3.5f, -1.92f, 3.5f, -3.95f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                curveToRelative(0f, 2.03f, 1.53f, 3.7f, 3.5f, 3.95f)
                verticalLineToRelative(5.05f)
                horizontalLineToRelative(-3.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.5f)
                verticalLineToRelative(8.98f)
                curveToRelative(-5.09f, -0.2f, -10.19f, -3.51f, -10.49f, -8.98f)
                horizontalLineToRelative(3.99f)
                verticalLineToRelative(-1f)
                horizontalLineTo(0f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 6.57f, 6.1f, 10.5f, 12f, 10.5f)
                reflectiveCurveToRelative(12f, -3.93f, 12f, -10.5f)
                verticalLineToRelative(-0.5f)
                horizontalLineToRelative(-5f)
                close()
                moveTo(9f, 4f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
                close()
            }
        }.also { _Anchor = it}
