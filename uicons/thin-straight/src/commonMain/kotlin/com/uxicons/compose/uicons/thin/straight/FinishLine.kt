package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FinishLine: ImageVector? = null

val Icons.Ts.FinishLine: ImageVector
    get() = _FinishLine ?: UXIcon(name = "FinishLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(13.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(23.43f, 10.01f)
                curveToRelative(-1.4f, 0.2f, -5.7f, 0.77f, -9.46f, 0.94f)
                lineToRelative(1.57f, -3.95f)
                horizontalLineToRelative(4.33f)
                lineToRelative(1.6f, -5.71f)
                lineToRelative(-0.96f, -0.27f)
                lineToRelative(-1.4f, 4.98f)
                horizontalLineToRelative(-12.74f)
                lineToRelative(-1.4f, -4.98f)
                lineToRelative(-0.96f, 0.27f)
                lineToRelative(1.6f, 5.71f)
                horizontalLineToRelative(4.35f)
                lineToRelative(-1.51f, 3.86f)
                curveToRelative(-3.81f, -0.28f, -6.64f, -0.68f, -8.46f, -0.93f)
                verticalLineToRelative(5.07f)
                curveToRelative(3.04f, 0.42f, 6.94f, 0.83f, 10.27f, 0.96f)
                lineToRelative(4.73f, 2.84f)
                verticalLineToRelative(5.2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.8f)
                lineToRelative(-3.61f, -2.21f)
                curveToRelative(3.5f, -0.04f, 8.16f, -0.53f, 11.61f, -1.0f)
                verticalLineToRelative(-5.07f)
                lineToRelative(-0.57f, 0.08f)
                close()
                moveTo(11.05f, 7f)
                horizontalLineToRelative(3.42f)
                lineToRelative(-1.59f, 3.99f)
                curveToRelative(-0.3f, 0.01f, -0.59f, 0.01f, -0.88f, 0.01f)
                curveToRelative(-0.78f, 0f, -1.62f, -0.03f, -2.49f, -0.08f)
                close()
                moveTo(23f, 14.12f)
                curveToRelative(-3.33f, 0.43f, -7.84f, 0.88f, -11f, 0.88f)
                reflectiveCurveToRelative(-7.67f, -0.44f, -11f, -0.88f)
                verticalLineToRelative(-3.05f)
                curveToRelative(2.16f, 0.29f, 7.26f, 0.93f, 11f, 0.93f)
                reflectiveCurveToRelative(8.84f, -0.63f, 11f, -0.93f)
                close()
                moveTo(9.2f, 17.65f)
                lineTo(10.06f, 18.17f)
                lineTo(9f, 21f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(5.33f)
                lineToRelative(0.87f, -2.35f)
                close()
            }
        }.also { _FinishLine = it}
