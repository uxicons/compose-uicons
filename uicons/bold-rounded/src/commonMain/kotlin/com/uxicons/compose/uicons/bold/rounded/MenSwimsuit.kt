package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MenSwimsuit: ImageVector? = null

val Icons.Br.MenSwimsuit: ImageVector
    get() = _MenSwimsuit ?: UXIcon(name = "MenSwimsuit") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(19.5f, 3f)
            horizontalLineToRelative(-15f)
            curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
            verticalLineToRelative(1.52f)
            curveToRelative(0f, 1.66f, 0.62f, 3.24f, 1.76f, 4.45f)
            lineToRelative(5.61f, 5.99f)
            curveToRelative(0.63f, 0.68f, 1.43f, 1.13f, 2.31f, 1.32f)
            curveToRelative(0.71f, 0.15f, 1.49f, 0.23f, 2.32f, 0.23f)
            reflectiveCurveToRelative(1.61f, -0.08f, 2.32f, -0.23f)
            curveToRelative(0.88f, -0.19f, 1.68f, -0.64f, 2.31f, -1.32f)
            lineToRelative(5.61f, -5.99f)
            curveToRelative(1.13f, -1.21f, 1.76f, -2.79f, 1.76f, -4.45f)
            verticalLineToRelative(-1.52f)
            curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
            close()
            moveTo(21f, 7.5f)
            verticalLineToRelative(1.52f)
            curveToRelative(0f, 0.2f, -0.02f, 0.4f, -0.06f, 0.6f)
            curveToRelative(-1.08f, 0.16f, -2.07f, 0.48f, -2.94f, 0.94f)
            verticalLineToRelative(-4.56f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
            close()
            moveTo(3f, 7.5f)
            curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
            horizontalLineToRelative(1.5f)
            verticalLineToRelative(4.56f)
            curveToRelative(-0.88f, -0.47f, -1.86f, -0.79f, -2.94f, -0.94f)
            curveToRelative(-0.03f, -0.2f, -0.06f, -0.39f, -0.06f, -0.6f)
            close()
            moveTo(10.44f, 17.86f)
            curveToRelative(-0.15f, -1.73f, -0.65f, -3.25f, -1.44f, -4.51f)
            verticalLineToRelative(-7.35f)
            horizontalLineToRelative(6f)
            verticalLineToRelative(7.35f)
            curveToRelative(-0.8f, 1.25f, -1.29f, 2.78f, -1.44f, 4.51f)
            curveToRelative(-0.95f, 0.18f, -2.16f, 0.18f, -3.11f, 0f)
            close()
        }
    }.also { _MenSwimsuit = it }
