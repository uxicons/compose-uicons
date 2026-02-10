package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hurricane: ImageVector? = null

val Icons.Ts.Hurricane: ImageVector
    get() = _Hurricane ?: UXIcon(name = "Hurricane") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 15f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.35f, 3f, 3f)
                reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
                close()
                moveTo(12f, 10f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                close()
                moveTo(9.91f, 24f)
                horizontalLineToRelative(-2.91f)
                verticalLineToRelative(-1f)
                curveToRelative(2.58f, 0f, 3.97f, -1.21f, 4.62f, -2.01f)
                curveToRelative(-5.25f, -0.21f, -9.62f, -4.7f, -9.62f, -9.99f)
                curveTo(2f, 4.63f, 7.08f, 0f, 14.09f, 0f)
                horizontalLineToRelative(2.91f)
                lineTo(17f, 1f)
                curveToRelative(-2.58f, 0f, -3.97f, 1.21f, -4.62f, 2.01f)
                curveToRelative(5.25f, 0.21f, 9.62f, 4.7f, 9.62f, 9.99f)
                curveToRelative(0f, 6.37f, -5.08f, 11f, -12.09f, 11f)
                close()
                moveTo(13.13f, 1.03f)
                curveTo(7.2f, 1.43f, 3f, 5.5f, 3f, 11f)
                curveToRelative(0f, 4.88f, 4.12f, 9f, 9f, 9f)
                horizontalLineToRelative(1.29f)
                lineToRelative(-0.32f, 0.7f)
                curveToRelative(-0.04f, 0.08f, -0.61f, 1.33f, -2.11f, 2.26f)
                curveToRelative(5.92f, -0.4f, 10.13f, -4.47f, 10.13f, -9.97f)
                curveToRelative(0f, -4.88f, -4.12f, -9f, -9f, -9f)
                horizontalLineToRelative(-1.29f)
                lineToRelative(0.32f, -0.7f)
                curveToRelative(0.04f, -0.08f, 0.61f, -1.33f, 2.11f, -2.26f)
                close()
            }
        }.also { _Hurricane = it}
