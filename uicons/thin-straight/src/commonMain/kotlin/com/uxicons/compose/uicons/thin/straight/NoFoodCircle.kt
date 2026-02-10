package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _NoFoodCircle: ImageVector? = null

val Icons.Ts.NoFoodCircle: ImageVector
    get() = _NoFoodCircle ?: UXIcon(name = "NoFoodCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 0f)
                curveToRelative(-6.62f, 0f, -12f, 5.38f, -12f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveToRelative(-5.38f, -12f, -12f, -12f)
                close()
                moveTo(1f, 12f)
                curveToRelative(0f, -2.85f, 1.1f, -5.45f, 2.89f, -7.4f)
                lineToRelative(15.52f, 15.52f)
                curveToRelative(-1.96f, 1.79f, -4.55f, 2.89f, -7.4f, 2.89f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                close()
                moveTo(13.5f, 8f)
                curveToRelative(0.14f, 0f, 0.27f, 0.06f, 0.37f, 0.17f)
                reflectiveCurveToRelative(0.14f, 0.24f, 0.13f, 0.39f)
                lineToRelative(-0.31f, 3.44f)
                horizontalLineToRelative(-0.98f)
                lineToRelative(-4f, -4f)
                close()
                moveTo(16.71f, 16f)
                horizontalLineToRelative(1.29f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 0.23f, -0.05f, 0.45f, -0.15f, 0.64f)
                close()
                moveTo(18f, 15f)
                horizontalLineToRelative(-2.29f)
                lineToRelative(-2f, -2f)
                horizontalLineToRelative(2.79f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(20.11f, 19.4f)
                lineTo(18.58f, 17.87f)
                curveToRelative(0.27f, -0.41f, 0.42f, -0.88f, 0.42f, -1.37f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.81f)
                lineToRelative(0.3f, -3.35f)
                curveToRelative(0.04f, -0.42f, -0.1f, -0.84f, -0.38f, -1.16f)
                reflectiveCurveToRelative(-0.69f, -0.49f, -1.11f, -0.49f)
                horizontalLineToRelative(-2.31f)
                lineToRelative(0.25f, -2f)
                horizontalLineToRelative(2.56f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3.44f)
                lineToRelative(-0.38f, 3f)
                horizontalLineToRelative(-2.48f)
                lineToRelative(-3.11f, -3.11f)
                curveToRelative(1.96f, -1.79f, 4.55f, -2.89f, 7.4f, -2.89f)
                curveToRelative(6.07f, 0f, 11f, 4.93f, 11f, 11f)
                curveToRelative(0f, 2.85f, -1.1f, 5.45f, -2.89f, 7.4f)
                close()
                moveTo(15.46f, 19f)
                horizontalLineToRelative(-9.53f)
                reflectiveCurveToRelative(-0.93f, -10.42f, -0.93f, -10.46f)
                lineToRelative(1.09f, 1.09f)
                lineToRelative(0.75f, 8.36f)
                horizontalLineToRelative(3.66f)
                curveToRelative(-0.32f, -0.42f, -0.51f, -0.94f, -0.51f, -1.5f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.29f, 0.06f, -0.56f, 0.15f, -0.82f)
                lineToRelative(0.85f, 0.85f)
                verticalLineToRelative(1.96f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(1.96f)
                lineToRelative(1f, 1f)
                close()
            }
        }.also { _NoFoodCircle = it}
