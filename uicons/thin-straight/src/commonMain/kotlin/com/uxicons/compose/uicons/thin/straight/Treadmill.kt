package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Treadmill: ImageVector? = null

val Icons.Ts.Treadmill: ImageVector
    get() = _Treadmill ?: UXIcon(name = "Treadmill") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(10.5f, 1f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(3.83f, 19f)
                lineTo(0f, 19f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.17f)
                lineToRelative(0.69f, -1.61f)
                curveToRelative(0.11f, 0.09f, 0.22f, 0.18f, 0.34f, 0.26f)
                lineToRelative(0.51f, 0.3f)
                lineToRelative(-0.88f, 2.05f)
                close()
                moveTo(23.04f, 8.32f)
                lineToRelative(-1.05f, 2.68f)
                horizontalLineToRelative(-3.98f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3.59f)
                lineToRelative(-3.93f, 10f)
                horizontalLineToRelative(-6.66f)
                verticalLineToRelative(-4.78f)
                lineToRelative(-3.17f, -1.9f)
                lineToRelative(2.78f, -6.52f)
                lineToRelative(1.93f, 3.2f)
                horizontalLineToRelative(3.46f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.9f)
                lineToRelative(-2.28f, -3.79f)
                curveToRelative(-0.45f, -0.75f, -1.27f, -1.21f, -2.14f, -1.21f)
                lineTo(3.03f, 6f)
                lineToRelative(-1.82f, 3.64f)
                lineToRelative(0.9f, 0.45f)
                lineToRelative(1.54f, -3.09f)
                horizontalLineToRelative(2.62f)
                lineToRelative(-2.03f, 4.86f)
                curveToRelative(-0.46f, 1.12f, -0.05f, 2.41f, 0.99f, 3.07f)
                lineToRelative(4.77f, 2.85f)
                verticalLineToRelative(4.22f)
                lineTo(0f, 22.0f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(2.34f)
                lineToRelative(5.62f, -14.32f)
                lineToRelative(-0.93f, -0.36f)
                close()
                moveTo(5.75f, 14.08f)
                curveToRelative(-0.62f, -0.39f, -0.86f, -1.16f, -0.59f, -1.83f)
                lineToRelative(2.19f, -5.24f)
                horizontalLineToRelative(1.32f)
                curveToRelative(0.51f, 0f, 0.98f, 0.26f, 1.25f, 0.68f)
                lineToRelative(-2.98f, 7.11f)
                lineToRelative(-1.2f, -0.72f)
                close()
            }
        }.also { _Treadmill = it}
