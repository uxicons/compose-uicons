package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CarOil: ImageVector? = null

val Icons.Rr.CarOil: ImageVector
    get() = _CarOil ?: UXIcon(name = "CarOil") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.19f, 10.49f)
                curveToRelative(-0.65f, -0.65f, -1.72f, -0.65f, -2.38f, 0.01f)
                lineToRelative(-1.63f, 1.67f)
                curveToRelative(-1.56f, 1.56f, -1.56f, 4.1f, 0f, 5.66f)
                curveToRelative(1.49f, 1.55f, 4.17f, 1.55f, 5.66f, 0f)
                curveToRelative(1.55f, -1.48f, 1.55f, -4.17f, 0.01f, -5.65f)
                close()
                moveTo(13.41f, 16.41f)
                curveToRelative(-0.76f, 0.76f, -2.07f, 0.76f, -2.83f, 0f)
                curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.01f, -2.84f)
                lineToRelative(1.41f, -1.44f)
                lineToRelative(1.41f, 1.45f)
                curveToRelative(0.78f, 0.74f, 0.78f, 2.08f, 0f, 2.83f)
                close()
                moveTo(20.5f, 5.5f)
                lineTo(21.12f, 4.88f)
                curveToRelative(0.51f, -0.51f, 0.51f, -1.34f, 0f, -1.85f)
                lineToRelative(-1.65f, -1.65f)
                curveToRelative(-0.51f, -0.51f, -1.34f, -0.51f, -1.85f, 0f)
                lineToRelative(-0.6f, 0.6f)
                lineToRelative(-0.23f, -0.23f)
                curveToRelative(-1.13f, -1.13f, -2.64f, -1.76f, -4.24f, -1.76f)
                horizontalLineToRelative(-5.54f)
                curveToRelative(-2.76f, -0.0f, -5f, 2.24f, -5f, 5.0f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-9.54f)
                curveToRelative(0f, -1.47f, -0.53f, -2.86f, -1.5f, -3.96f)
                close()
                moveTo(7f, 2f)
                horizontalLineToRelative(5.54f)
                curveToRelative(0.15f, 0f, 0.3f, 0.03f, 0.45f, 0.04f)
                curveToRelative(-0.02f, 1.63f, -1.36f, 2.96f, -3.0f, 2.96f)
                horizontalLineToRelative(-6f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                close()
                moveTo(20f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-10f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(6f)
                curveToRelative(2.48f, 0f, 4.53f, -1.82f, 4.92f, -4.2f)
                curveToRelative(0.16f, 0.12f, 0.31f, 0.23f, 0.45f, 0.37f)
                lineToRelative(3.46f, 3.46f)
                curveToRelative(0.76f, 0.76f, 1.17f, 1.76f, 1.17f, 2.83f)
                close()
            }
        }.also { _CarOil = it}
