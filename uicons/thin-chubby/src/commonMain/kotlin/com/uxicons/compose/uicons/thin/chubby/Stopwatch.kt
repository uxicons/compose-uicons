package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stopwatch: ImageVector? = null

val Icons.Tc.Stopwatch: ImageVector
    get() = _Stopwatch ?: UXIcon(name = "Stopwatch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 12.1f)
                verticalLineToRelative(-2.2f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(2.2f)
                curveToRelative(-0.78f, 0.22f, -1.36f, 0.94f, -1.36f, 1.79f)
                curveToRelative(0f, 1.02f, 0.83f, 1.85f, 1.86f, 1.85f)
                reflectiveCurveToRelative(1.86f, -0.83f, 1.86f, -1.85f)
                curveToRelative(0f, -0.85f, -0.57f, -1.57f, -1.36f, -1.79f)
                close()
                moveTo(12f, 14.74f)
                curveToRelative(-0.47f, 0f, -0.86f, -0.38f, -0.86f, -0.85f)
                reflectiveCurveToRelative(0.38f, -0.85f, 0.86f, -0.85f)
                reflectiveCurveToRelative(0.86f, 0.38f, 0.86f, 0.85f)
                reflectiveCurveToRelative(-0.38f, 0.85f, -0.86f, 0.85f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.85f, 6.63f)
                lineToRelative(0.55f, 0.55f)
                curveToRelative(0.27f, 0.28f, 0.61f, 0.1f, 0.71f, 0f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                lineToRelative(-1.88f, -1.88f)
                curveToRelative(-0.2f, -0.19f, -0.51f, -0.2f, -0.71f, 0f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(0.62f, 0.62f)
                lineToRelative(-0.85f, 0.85f)
                curveToRelative(-1.15f, -0.98f, -2.64f, -1.62f, -4.45f, -1.87f)
                curveToRelative(0.34f, -0.41f, 0.55f, -0.94f, 0.55f, -1.52f)
                curveToRelative(0f, -1.32f, -1.07f, -2.39f, -2.39f, -2.39f)
                reflectiveCurveToRelative(-2.39f, 1.07f, -2.39f, 2.39f)
                curveToRelative(0f, 0.57f, 0.2f, 1.1f, 0.54f, 1.51f)
                curveToRelative(-1.83f, 0.25f, -3.32f, 0.87f, -4.47f, 1.85f)
                lineToRelative(-0.82f, -0.82f)
                lineToRelative(0.62f, -0.62f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-1.88f, 1.88f)
                curveToRelative(-0.2f, 0.2f, -0.2f, 0.51f, 0f, 0.71f)
                curveToRelative(0.1f, 0.1f, 0.4f, 0.27f, 0.71f, 0f)
                lineToRelative(0.55f, -0.55f)
                lineToRelative(0.82f, 0.82f)
                curveToRelative(-1.34f, 1.52f, -2.1f, 3.67f, -2.1f, 6.43f)
                curveToRelative(0f, 5.76f, 3.06f, 9.12f, 9.13f, 9.12f)
                curveToRelative(5.95f, 0f, 9.02f, -3.1f, 9.13f, -9.12f)
                curveToRelative(-0.05f, -2.72f, -0.78f, -4.87f, -2.13f, -6.4f)
                lineToRelative(0.85f, -0.85f)
                close()
                moveTo(12f, 2f)
                curveToRelative(0.77f, 0f, 1.39f, 0.62f, 1.39f, 1.39f)
                reflectiveCurveToRelative(-0.62f, 1.39f, -1.39f, 1.39f)
                reflectiveCurveToRelative(-1.39f, -0.62f, -1.39f, -1.39f)
                reflectiveCurveToRelative(0.62f, -1.39f, 1.39f, -1.39f)
                close()
                moveTo(12.0f, 22f)
                curveToRelative(-5.37f, -0.03f, -8.03f, -2.69f, -8.13f, -8.11f)
                curveToRelative(0.1f, -5.43f, 2.76f, -8.08f, 8.13f, -8.11f)
                curveToRelative(5.3f, 0.04f, 8.04f, 2.77f, 8.13f, 8.11f)
                curveToRelative(-0.1f, 5.43f, -2.76f, 8.09f, -8.13f, 8.12f)
                close()
            }
        }.also { _Stopwatch = it}
