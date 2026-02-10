package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HandDryer: ImageVector? = null

val Icons.Br.HandDryer: ImageVector
    get() = _HandDryer ?: UXIcon(name = "HandDryer") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 7f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
            reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            close()
            moveTo(16f, 8.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            close()
            moveTo(5.5f, 5f)
            horizontalLineToRelative(13f)
            curveToRelative(1.93f, 0f, 3.5f, -1.57f, 3.5f, -3.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
            close()
            moveTo(5f, 8.5f)
            verticalLineToRelative(0.61f)
            curveToRelative(1.13f, 0.22f, 2.17f, 0.76f, 3f, 1.58f)
            verticalLineToRelative(-2.19f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
            close()
            moveTo(19.5f, 14f)
            horizontalLineToRelative(-7.86f)
            curveToRelative(-0.94f, 0f, -1.79f, 0.37f, -2.44f, 0.96f)
            lineToRelative(-2.45f, -2.69f)
            curveToRelative(-1.37f, -1.57f, -3.98f, -1.7f, -5.49f, -0.26f)
            curveToRelative(-1.57f, 1.43f, -1.69f, 3.87f, -0.28f, 5.46f)
            lineToRelative(5.44f, 6.03f)
            curveToRelative(0.56f, 0.62f, 1.5f, 0.66f, 2.12f, 0.11f)
            curveToRelative(0.61f, -0.56f, 0.66f, -1.5f, 0.11f, -2.12f)
            lineToRelative(-5.43f, -6.02f)
            curveToRelative(-0.32f, -0.36f, -0.29f, -0.92f, 0.06f, -1.24f)
            curveToRelative(0.34f, -0.33f, 0.94f, -0.3f, 1.25f, 0.06f)
            lineToRelative(3.51f, 3.86f)
            curveToRelative(0.23f, 1.58f, 1.47f, 2.87f, 3.08f, 3.1f)
            lineToRelative(5.16f, 0.74f)
            curveToRelative(0.82f, 0.12f, 1.58f, -0.45f, 1.7f, -1.27f)
            curveToRelative(0.12f, -0.82f, -0.45f, -1.58f, -1.27f, -1.7f)
            lineToRelative(-5.16f, -0.74f)
            curveToRelative(-0.31f, -0.04f, -0.55f, -0.32f, -0.55f, -0.64f)
            curveToRelative(0f, -0.35f, 0.29f, -0.64f, 0.64f, -0.64f)
            horizontalLineToRelative(7.86f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            verticalLineToRelative(4f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-4f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
        }
    }.also { _HandDryer = it }
