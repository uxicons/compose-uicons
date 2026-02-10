package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleBookOpen: ImageVector? = null

val Icons.Ts.CircleBookOpen: ImageVector
    get() = _CircleBookOpen ?: UXIcon(name = "CircleBookOpen") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.04f, 6.48f)
                curveToRelative(-0.61f, -0.46f, -1.38f, -0.6f, -2.11f, -0.39f)
                lineToRelative(-1.45f, 0.42f)
                curveToRelative(-0.62f, 0.18f, -1.14f, 0.56f, -1.49f, 1.07f)
                curveToRelative(-0.35f, -0.5f, -0.87f, -0.89f, -1.49f, -1.07f)
                lineToRelative(-1.45f, -0.42f)
                curveToRelative(-0.73f, -0.21f, -1.5f, -0.07f, -2.11f, 0.39f)
                reflectiveCurveToRelative(-0.96f, 1.16f, -0.96f, 1.92f)
                verticalLineToRelative(7.9f)
                lineToRelative(6f, 1.72f)
                lineToRelative(6f, -1.72f)
                verticalLineToRelative(-7.9f)
                curveToRelative(0f, -0.76f, -0.35f, -1.46f, -0.96f, -1.92f)
                close()
                moveTo(11.5f, 16.84f)
                lineToRelative(-4.5f, -1.29f)
                verticalLineToRelative(-7.15f)
                curveToRelative(0f, -0.44f, 0.2f, -0.85f, 0.56f, -1.12f)
                curveToRelative(0.35f, -0.27f, 0.8f, -0.35f, 1.23f, -0.23f)
                lineToRelative(1.45f, 0.42f)
                curveToRelative(0.74f, 0.21f, 1.26f, 0.91f, 1.26f, 1.68f)
                verticalLineToRelative(7.68f)
                close()
                moveTo(17f, 15.54f)
                lineToRelative(-4.5f, 1.29f)
                verticalLineToRelative(-7.68f)
                curveToRelative(0f, -0.78f, 0.52f, -1.47f, 1.26f, -1.68f)
                lineToRelative(1.45f, -0.42f)
                curveToRelative(0.43f, -0.13f, 0.87f, -0.04f, 1.23f, 0.23f)
                curveToRelative(0.35f, 0.27f, 0.56f, 0.67f, 0.56f, 1.12f)
                verticalLineToRelative(7.15f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
            }
        }.also { _CircleBookOpen = it}
