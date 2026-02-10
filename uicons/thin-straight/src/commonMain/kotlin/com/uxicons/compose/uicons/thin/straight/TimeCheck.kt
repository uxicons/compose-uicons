package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TimeCheck: ImageVector? = null

val Icons.Ts.TimeCheck: ImageVector
    get() = _TimeCheck ?: UXIcon(name = "TimeCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.54f, 22.97f)
                lineToRelative(1.0f, 1.0f)
                curveToRelative(-0.18f, 0.01f, -0.36f, 0.03f, -0.54f, 0.03f)
                curveToRelative(-0.52f, 0f, -1.05f, -0.03f, -1.56f, -0.1f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                horizontalLineToRelative(0f)
                curveTo(4.49f, 23.12f, 0f, 18.01f, 0f, 12f)
                curveTo(0f, 5.38f, 5.38f, 0f, 12f, 0f)
                reflectiveCurveToRelative(12f, 5.38f, 12f, 12f)
                curveToRelative(0f, 1.04f, -0.15f, 2.04f, -0.4f, 3f)
                horizontalLineToRelative(-1.03f)
                curveToRelative(0.27f, -0.95f, 0.43f, -1.96f, 0.43f, -3f)
                curveToRelative(0f, -6.07f, -4.93f, -11f, -11f, -11f)
                reflectiveCurveTo(1f, 5.93f, 1f, 12f)
                curveToRelative(0f, 5.51f, 4.11f, 10.2f, 9.56f, 10.91f)
                horizontalLineToRelative(0f)
                curveToRelative(0.32f, 0.04f, 0.65f, 0.05f, 0.97f, 0.06f)
                close()
                moveTo(12f, 11.72f)
                lineToRelative(-4.76f, 2.85f)
                lineToRelative(0.52f, 0.86f)
                lineToRelative(5.24f, -3.15f)
                verticalLineToRelative(-7.28f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(6.72f)
                close()
                moveTo(17.49f, 22.56f)
                curveToRelative(-0.56f, 0.57f, -1.55f, 0.57f, -2.12f, 0f)
                lineToRelative(-3.38f, -3.38f)
                lineToRelative(-0.71f, 0.71f)
                lineToRelative(3.38f, 3.38f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.3f, -0.26f, 1.77f, -0.73f)
                lineToRelative(5.8f, -5.8f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(-5.8f, 5.8f)
                close()
            }
        }.also { _TimeCheck = it}
