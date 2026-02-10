package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlyingKite: ImageVector? = null

val Icons.Bs.FlyingKite: ImageVector
    get() = _FlyingKite ?: UXIcon(name = "FlyingKite") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(11.57f, 9.2f)
                curveToRelative(-0.66f, -0.75f, -1.67f, -1.2f, -2.7f, -1.2f)
                horizontalLineToRelative(-0.36f)
                curveToRelative(-1.43f, 0f, -2.7f, 0.85f, -3.26f, 2.24f)
                lineToRelative(-1.01f, 2.85f)
                curveToRelative(-0.65f, 1.57f, -0.07f, 3.38f, 1.43f, 4.32f)
                lineToRelative(4.33f, 2.47f)
                verticalLineToRelative(4.13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-5.87f)
                lineToRelative(-4.47f, -2.54f)
                lineToRelative(1.25f, -3.85f)
                lineToRelative(1.86f, 2.27f)
                horizontalLineToRelative(3.36f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1.94f)
                lineToRelative(-1.48f, -1.8f)
                close()
                moveTo(3.39f, 18.03f)
                lineTo(2.99f, 19f)
                horizontalLineToRelative(-2.99f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(5f)
                lineToRelative(0.89f, -2.16f)
                lineToRelative(-1.22f, -0.69f)
                curveToRelative(-0.5f, -0.31f, -0.92f, -0.7f, -1.28f, -1.12f)
                close()
                moveTo(24f, 5.85f)
                verticalLineToRelative(-5.85f)
                horizontalLineToRelative(-5.85f)
                lineToRelative(-0.89f, 5.43f)
                curveToRelative(-0.72f, 0.86f, -1.26f, 1.77f, -1.26f, 2.57f)
                curveToRelative(0f, 1.71f, 1.91f, 2.11f, 3.3f, 2.4f)
                curveToRelative(0.51f, 0.11f, 1.43f, 0.3f, 1.7f, 0.5f)
                curveToRelative(-0.14f, 0.54f, -2.15f, 1.1f, -3.99f, 1.1f)
                verticalLineToRelative(2f)
                curveToRelative(2.23f, 0f, 6f, -0.67f, 6f, -3.16f)
                curveToRelative(0f, -1.71f, -1.91f, -2.11f, -3.3f, -2.4f)
                curveToRelative(-0.51f, -0.11f, -1.44f, -0.3f, -1.7f, -0.5f)
                curveToRelative(0.04f, -0.27f, 0.33f, -0.71f, 0.79f, -1.23f)
                lineToRelative(5.21f, -0.85f)
                close()
            }
        }.also { _FlyingKite = it}
