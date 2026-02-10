package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LimitSpeedometer: ImageVector? = null

val Icons.Ts.LimitSpeedometer: ImageVector
    get() = _LimitSpeedometer ?: UXIcon(name = "LimitSpeedometer") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 14f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                curveToRelative(-0.37f, 0f, -0.71f, 0.11f, -1.01f, 0.28f)
                lineToRelative(-4.64f, -4.64f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(4.64f, 4.64f)
                curveToRelative(-0.18f, 0.3f, -0.28f, 0.64f, -0.28f, 1.01f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                close()
                moveTo(13f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(7.49f, 18.94f)
                lineToRelative(0.65f, 0.76f)
                lineToRelative(-2.71f, 2.35f)
                lineToRelative(-0.32f, -0.23f)
                curveTo(1.91f, 19.57f, 0f, 15.9f, 0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                curveToRelative(0f, 1.99f, -0.5f, 3.91f, -1.41f, 5.62f)
                lineToRelative(-0.61f, -1.04f)
                curveToRelative(0.65f, -1.42f, 1.02f, -2.97f, 1.02f, -4.58f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                curveToRelative(0f, 3.44f, 1.63f, 6.69f, 4.37f, 8.77f)
                lineToRelative(2.12f, -1.83f)
                close()
                moveTo(17f, 12.01f)
                lineToRelative(7.0f, 11.99f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.75f)
                lineToRelative(-5.25f, -9.01f)
                lineToRelative(-5.25f, 9.01f)
                horizontalLineToRelative(2.75f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4.5f)
                lineToRelative(7.0f, -11.99f)
                close()
                moveTo(17.5f, 21.0f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4f)
                close()
                moveTo(18f, 23.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _LimitSpeedometer = it}
