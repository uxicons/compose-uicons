package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseCircleCheck: ImageVector? = null

val Icons.Ts.HouseCircleCheck: ImageVector
    get() = _HouseCircleCheck ?: UXIcon(name = "HouseCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9.99f)
                verticalLineToRelative(2.04f)
                curveToRelative(-0.3f, -0.36f, -0.64f, -0.7f, -1f, -1.0f)
                verticalLineToRelative(-1.04f)
                curveToRelative(0f, -0.52f, -0.24f, -1.01f, -0.65f, -1.33f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                horizontalLineToRelative(0f)
                reflectiveCurveTo(13.04f, 1.36f, 13.04f, 1.36f)
                curveToRelative(-0.61f, -0.48f, -1.47f, -0.48f, -2.08f, 0f)
                lineTo(1.65f, 8.65f)
                curveToRelative(-0.41f, 0.32f, -0.65f, 0.82f, -0.65f, 1.33f)
                verticalLineToRelative(13.01f)
                horizontalLineToRelative(10.03f)
                curveToRelative(0.31f, 0.36f, 0.64f, 0.69f, 1.0f, 1f)
                lineTo(0f, 24f)
                verticalLineToRelative(-14.01f)
                curveToRelative(0f, -0.82f, 0.39f, -1.61f, 1.03f, -2.12f)
                lineTo(10.34f, 0.57f)
                curveToRelative(0.98f, -0.77f, 2.34f, -0.77f, 3.32f, 0f)
                lineToRelative(9.31f, 7.29f)
                horizontalLineToRelative(0f)
                curveToRelative(0.65f, 0.51f, 1.03f, 1.3f, 1.03f, 2.12f)
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
                moveTo(16.98f, 18.95f)
                curveToRelative(-0.06f, 0.06f, -0.18f, 0.06f, -0.24f, -0.01f)
                lineToRelative(-1.86f, -1.8f)
                lineToRelative(-0.7f, 0.72f)
                lineToRelative(1.85f, 1.79f)
                curveToRelative(0.22f, 0.22f, 0.51f, 0.34f, 0.82f, 0.34f)
                reflectiveCurveToRelative(0.6f, -0.12f, 0.82f, -0.34f)
                lineToRelative(3.46f, -3.4f)
                lineToRelative(-0.7f, -0.71f)
                lineToRelative(-3.46f, 3.4f)
                close()
            }
        }.also { _HouseCircleCheck = it}
