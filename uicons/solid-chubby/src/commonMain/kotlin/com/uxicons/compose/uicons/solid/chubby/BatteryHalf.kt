package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BatteryHalf: ImageVector? = null

val Icons.Sc.BatteryHalf: ImageVector
    get() = _BatteryHalf ?: UXIcon(name = "BatteryHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.32f, 8.58f)
                curveToRelative(-0.13f, -0.28f, -0.38f, -0.48f, -0.68f, -0.55f)
                curveToRelative(-0.04f, -0.01f, -0.34f, -0.08f, -0.89f, -0.16f)
                curveToRelative(-0.3f, -1.46f, -0.66f, -2.37f, -0.69f, -2.44f)
                curveToRelative(-0.12f, -0.31f, -0.39f, -0.54f, -0.72f, -0.61f)
                curveToRelative(-0.16f, -0.03f, -3.87f, -0.83f, -8.26f, -0.83f)
                reflectiveCurveToRelative(-8.1f, 0.79f, -8.26f, 0.83f)
                curveToRelative(-0.33f, 0.07f, -0.6f, 0.3f, -0.72f, 0.61f)
                curveToRelative(-0.05f, 0.12f, -1.11f, 2.88f, -1.11f, 6.56f)
                curveToRelative(0f, 3.71f, 1.07f, 6.45f, 1.12f, 6.56f)
                curveToRelative(0.12f, 0.31f, 0.39f, 0.54f, 0.72f, 0.61f)
                curveToRelative(0.16f, 0.03f, 3.87f, 0.83f, 8.26f, 0.83f)
                reflectiveCurveToRelative(8.1f, -0.79f, 8.26f, -0.83f)
                curveToRelative(0.33f, -0.07f, 0.6f, -0.3f, 0.72f, -0.61f)
                curveToRelative(0.03f, -0.07f, 0.38f, -0.98f, 0.68f, -2.43f)
                curveToRelative(0.55f, -0.08f, 0.85f, -0.15f, 0.89f, -0.16f)
                curveToRelative(0.3f, -0.07f, 0.55f, -0.28f, 0.68f, -0.56f)
                curveToRelative(0.03f, -0.06f, 0.68f, -1.51f, 0.68f, -3.42f)
                curveToRelative(0f, -1.92f, -0.66f, -3.36f, -0.69f, -3.42f)
                close()
                moveTo(12.5f, 15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-1.57f, 0f, -3.25f, -0.12f, -4.98f, -0.34f)
                curveToRelative(-0.43f, -0.06f, -0.78f, -0.39f, -0.85f, -0.82f)
                curveToRelative(-0.15f, -0.86f, -0.17f, -1.88f, -0.17f, -2.84f)
                reflectiveCurveToRelative(0.01f, -1.98f, 0.17f, -2.84f)
                curveToRelative(0.08f, -0.43f, 0.42f, -0.76f, 0.85f, -0.81f)
                curveToRelative(1.73f, -0.23f, 3.41f, -0.34f, 4.98f, -0.34f)
                horizontalLineToRelative(0.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 12f)
                curveToRelative(0f, 0.6f, 0.01f, 1.22f, 0.05f, 1.77f)
                curveToRelative(1.19f, 0.13f, 2.35f, 0.21f, 3.45f, 0.23f)
                verticalLineToRelative(-3.99f)
                curveToRelative(-1.1f, 0.02f, -2.26f, 0.09f, -3.45f, 0.23f)
                curveToRelative(-0.04f, 0.56f, -0.05f, 1.17f, -0.05f, 1.77f)
                close()
            }
        }.also { _BatteryHalf = it}
