package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserBasket: ImageVector? = null

val Icons.Br.UserBasket: ImageVector
    get() = _UserBasket ?: UXIcon(name = "UserBasket") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 12f)
            curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
            reflectiveCurveTo(12.31f, 0f, 9f, 0f)
            reflectiveCurveTo(3f, 2.69f, 3f, 6f)
            reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
            close()
            moveTo(9f, 3f)
            curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
            reflectiveCurveToRelative(-1.35f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.35f, -3f, -3f)
            reflectiveCurveToRelative(1.35f, -3f, 3f, -3f)
            close()
            moveTo(23.35f, 14.93f)
            curveToRelative(-0.51f, -0.59f, -1.25f, -0.93f, -2.02f, -0.93f)
            horizontalLineToRelative(-1.43f)
            lineToRelative(1.44f, -2.82f)
            curveToRelative(0.38f, -0.74f, 0.08f, -1.64f, -0.66f, -2.02f)
            curveToRelative(-0.74f, -0.38f, -1.64f, -0.08f, -2.02f, 0.66f)
            lineToRelative(-2.13f, 4.18f)
            horizontalLineToRelative(-2.95f)
            curveToRelative(-1.58f, -0.04f, -2.91f, 1.5f, -2.64f, 3.06f)
            lineToRelative(0.45f, 3.09f)
            curveToRelative(0.32f, 2.19f, 2.24f, 3.85f, 4.45f, 3.85f)
            horizontalLineToRelative(3.21f)
            curveToRelative(2.22f, 0f, 4.13f, -1.65f, 4.45f, -3.85f)
            lineToRelative(0.46f, -3.1f)
            curveToRelative(0.11f, -0.77f, -0.11f, -1.55f, -0.62f, -2.13f)
            close()
            moveTo(20.55f, 19.72f)
            curveToRelative(-0.11f, 0.73f, -0.75f, 1.28f, -1.48f, 1.28f)
            horizontalLineToRelative(-3.21f)
            curveToRelative(-0.74f, 0f, -1.38f, -0.55f, -1.48f, -1.28f)
            lineToRelative(-0.4f, -2.72f)
            horizontalLineToRelative(3.48f)
            reflectiveCurveToRelative(0.0f, 0f, 0.0f, 0f)
            curveToRelative(0.0f, 0f, 0.0f, 0f, 0.0f, 0f)
            horizontalLineToRelative(3.49f)
            lineToRelative(-0.4f, 2.72f)
            close()
            moveTo(8.97f, 15.35f)
            curveToRelative(0.17f, 0.81f, -0.36f, 1.6f, -1.17f, 1.77f)
            curveToRelative(-2.64f, 0.54f, -4.61f, 2.79f, -4.79f, 5.48f)
            curveToRelative(-0.05f, 0.83f, -0.78f, 1.46f, -1.59f, 1.4f)
            curveToRelative(-0.83f, -0.05f, -1.45f, -0.77f, -1.4f, -1.59f)
            curveToRelative(0.27f, -4.04f, 3.22f, -7.42f, 7.18f, -8.22f)
            curveToRelative(0.81f, -0.16f, 1.6f, 0.36f, 1.77f, 1.17f)
            close()
        }
    }.also { _UserBasket = it }
