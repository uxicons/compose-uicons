package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AdForbidden: ImageVector? = null

val Icons.Ts.AdForbidden: ImageVector
    get() = _AdForbidden ?: UXIcon(name = "AdForbidden") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(1f, 12f)
                curveToRelative(0f, -2.85f, 1.1f, -5.45f, 2.89f, -7.4f)
                lineToRelative(2.76f, 2.76f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(-2.76f, -2.76f)
                curveToRelative(1.96f, -1.79f, 4.55f, -2.89f, 7.4f, -2.89f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 2.85f, -1.1f, 5.45f, -2.89f, 7.4f)
                lineToRelative(-2.28f, -2.28f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(2.28f, 2.28f)
                curveToRelative(-1.96f, 1.79f, -4.55f, 2.89f, -7.4f, 2.89f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                close()
                moveTo(9.26f, 8.0f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.76f, 0f, -1.28f, 0.59f, -1.39f, 1.17f)
                lineToRelative(-1.37f, 6.83f)
                horizontalLineToRelative(1.01f)
                lineToRelative(0.41f, -2f)
                horizontalLineToRelative(2.66f)
                lineToRelative(0.41f, 2f)
                horizontalLineToRelative(1.01f)
                lineToRelative(-1.4f, -6.81f)
                curveToRelative(-0.12f, -0.67f, -0.59f, -1.19f, -1.35f, -1.19f)
                close()
                moveTo(8.12f, 13f)
                lineToRelative(0.74f, -3.66f)
                curveToRelative(0.02f, -0.11f, 0.14f, -0.34f, 0.4f, -0.34f)
                horizontalLineToRelative(0f)
                curveToRelative(0.1f, 0f, 0.29f, 0f, 0.37f, 0.39f)
                lineToRelative(0.74f, 3.61f)
                horizontalLineToRelative(-2.25f)
                close()
                moveTo(17.6f, 10.3f)
                curveToRelative(0f, -1.27f, -1.03f, -2.3f, -2.3f, -2.3f)
                horizontalLineToRelative(-2.3f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2.3f)
                curveToRelative(1.27f, 0f, 2.3f, -1.03f, 2.3f, -2.3f)
                verticalLineToRelative(-3.4f)
                close()
                moveTo(16.6f, 13.7f)
                curveToRelative(0f, 0.72f, -0.58f, 1.3f, -1.3f, 1.3f)
                horizontalLineToRelative(-1.3f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(1.3f)
                curveToRelative(0.72f, 0f, 1.3f, 0.58f, 1.3f, 1.3f)
                verticalLineToRelative(3.4f)
                close()
            }
        }.also { _AdForbidden = it}
