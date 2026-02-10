package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CoffeeTime: ImageVector? = null

val Icons.Sr.CoffeeTime: ImageVector
    get() = _CoffeeTime ?: UXIcon(name = "CoffeeTime") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.92f, 17.02f)
                curveToRelative(0.02f, -0.15f, 0.05f, -0.28f, 0.06f, -0.44f)
                curveToRelative(0.07f, -0.66f, -0.15f, -1.33f, -0.6f, -1.82f)
                curveToRelative(-0.44f, -0.49f, -1.07f, -0.77f, -1.72f, -0.77f)
                lineToRelative(-9.34f, -0.0f)
                curveToRelative(-0.66f, 0f, -1.28f, 0.28f, -1.72f, 0.77f)
                curveToRelative(-0.45f, 0.49f, -0.66f, 1.15f, -0.6f, 1.82f)
                curveToRelative(0.21f, 2.09f, 0.76f, 3.85f, 1.65f, 5.21f)
                curveToRelative(0.9f, 1.39f, 2.45f, 2.21f, 4.15f, 2.21f)
                horizontalLineToRelative(2.38f)
                curveToRelative(1.12f, 0f, 2.16f, -0.36f, 3.01f, -1f)
                horizontalLineToRelative(2.4f)
                curveToRelative(1.84f, 0f, 3.4f, -1.5f, 3.4f, -3.29f)
                curveToRelative(0f, -1.58f, -1.18f, -2.59f, -3.08f, -2.69f)
                close()
                moveTo(20.6f, 21f)
                horizontalLineToRelative(-0.82f)
                curveToRelative(0.31f, -0.6f, 0.56f, -1.27f, 0.76f, -2f)
                horizontalLineToRelative(0.07f)
                curveToRelative(0.93f, 0f, 1.4f, 0.24f, 1.4f, 0.71f)
                curveToRelative(0f, 0.69f, -0.65f, 1.29f, -1.4f, 1.29f)
                close()
                moveTo(10f, 0f)
                curveToRelative(-5.52f, 0f, -10f, 4.48f, -10f, 10f)
                curveToRelative(0f, 3.85f, 2.18f, 7.19f, 5.37f, 8.86f)
                curveToRelative(-0.15f, -0.66f, -0.27f, -1.35f, -0.35f, -2.08f)
                curveToRelative(-0.12f, -1.23f, 0.28f, -2.45f, 1.1f, -3.36f)
                curveToRelative(0.82f, -0.9f, 1.99f, -1.42f, 3.2f, -1.42f)
                lineToRelative(9.34f, 0.0f)
                curveToRelative(0.37f, 0f, 0.73f, 0.06f, 1.09f, 0.16f)
                curveToRelative(0.15f, -0.7f, 0.24f, -1.42f, 0.24f, -2.16f)
                curveToRelative(0.0f, -5.52f, -4.48f, -10f, -10.0f, -10f)
                close()
                moveTo(11f, 10f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _CoffeeTime = it}
