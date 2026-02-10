package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlyingKite: ImageVector? = null

val Icons.Ts.FlyingKite: ImageVector
    get() = _FlyingKite ?: UXIcon(name = "FlyingKite") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.5f, 7f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
                moveTo(9.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(9.97f, 8.85f)
                curveToRelative(-0.46f, -0.53f, -1.21f, -0.85f, -1.95f, -0.85f)
                horizontalLineToRelative(-0.36f)
                curveToRelative(-1.02f, 0f, -1.93f, 0.61f, -2.32f, 1.58f)
                lineToRelative(-1.15f, 3.38f)
                curveToRelative(-0.46f, 1.12f, -0.05f, 2.41f, 1.0f, 3.07f)
                lineToRelative(4.84f, 2.75f)
                verticalLineToRelative(5.21f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-5.79f)
                lineToRelative(-3.43f, -1.95f)
                lineToRelative(2.08f, -6.11f)
                lineToRelative(2.09f, 2.85f)
                horizontalLineToRelative(3.23f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-2.72f)
                lineToRelative(-2.31f, -3.15f)
                close()
                moveTo(5.7f, 15.18f)
                curveToRelative(-0.62f, -0.39f, -0.86f, -1.16f, -0.57f, -1.86f)
                lineToRelative(1.15f, -3.38f)
                curveToRelative(0.23f, -0.56f, 0.78f, -0.93f, 1.39f, -0.93f)
                horizontalLineToRelative(0.36f)
                curveToRelative(0.32f, 0f, 0.65f, 0.1f, 0.9f, 0.26f)
                lineToRelative(-2.21f, 6.49f)
                close()
                moveTo(24f, 6.27f)
                verticalLineToRelative(-6.27f)
                horizontalLineToRelative(-6.27f)
                lineToRelative(-1.14f, 6.97f)
                curveToRelative(-0.39f, 0.58f, -0.59f, 1.08f, -0.59f, 1.53f)
                curveToRelative(0f, 1.33f, 1.56f, 1.55f, 2.93f, 1.75f)
                curveToRelative(0.92f, 0.13f, 2.07f, 0.29f, 2.07f, 0.76f)
                curveToRelative(0f, 0.37f, -0.52f, 1f, -4f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(1.5f, 0f, 5f, 0f, 5f, -2f)
                curveToRelative(0f, -1.33f, -1.56f, -1.55f, -2.93f, -1.75f)
                curveToRelative(-0.92f, -0.13f, -2.07f, -0.29f, -2.07f, -0.76f)
                curveToRelative(0f, -0.17f, 0.09f, -0.54f, 0.56f, -1.17f)
                lineToRelative(6.45f, -1.05f)
                close()
                moveTo(18.58f, 1f)
                horizontalLineToRelative(4.42f)
                verticalLineToRelative(4.42f)
                lineToRelative(-5.29f, 0.87f)
                lineToRelative(0.87f, -5.29f)
                close()
                moveTo(4.44f, 17.91f)
                lineTo(5.33f, 18.42f)
                lineTo(4.67f, 20f)
                horizontalLineToRelative(-4.67f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(3.99f)
                close()
            }
        }.also { _FlyingKite = it}
