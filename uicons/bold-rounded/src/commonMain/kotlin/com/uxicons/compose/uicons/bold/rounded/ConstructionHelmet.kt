package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ConstructionHelmet: ImageVector? = null

val Icons.Br.ConstructionHelmet: ImageVector
    get() = _ConstructionHelmet ?: UXIcon(name = "ConstructionHelmet") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23f, 15.09f)
            verticalLineToRelative(-2.32f)
            curveToRelative(0f, -4.8f, -3.27f, -9.04f, -7.97f, -10.35f)
            curveToRelative(-0.73f, -0.86f, -1.81f, -1.42f, -3.03f, -1.42f)
            reflectiveCurveToRelative(-2.3f, 0.56f, -3.03f, 1.42f)
            curveToRelative(-4.7f, 1.32f, -7.97f, 5.55f, -7.97f, 10.35f)
            verticalLineToRelative(2.32f)
            curveToRelative(-0.58f, 0.21f, -1f, 0.76f, -1f, 1.41f)
            curveToRelative(-0.01f, 0.92f, 0.5f, 1.5f, 1.72f, 1.5f)
            lineToRelative(0.96f, 1.37f)
            curveToRelative(1.59f, 2.27f, 4.19f, 3.63f, 6.96f, 3.63f)
            horizontalLineToRelative(4.71f)
            curveToRelative(2.77f, 0f, 5.38f, -1.35f, 6.96f, -3.62f)
            lineToRelative(0.96f, -1.38f)
            curveToRelative(1.22f, 0f, 1.73f, -0.58f, 1.72f, -1.5f)
            curveToRelative(0f, -0.65f, -0.42f, -1.2f, -1f, -1.41f)
            close()
            moveTo(8f, 6.07f)
            verticalLineToRelative(5.43f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-6.5f)
            curveToRelative(0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f)
            reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
            verticalLineToRelative(-5.43f)
            curveToRelative(2.42f, 1.37f, 4f, 3.89f, 4f, 6.71f)
            verticalLineToRelative(2.23f)
            horizontalLineToRelative(-16f)
            verticalLineToRelative(-2.23f)
            curveToRelative(0f, -2.81f, 1.58f, -5.34f, 4f, -6.71f)
            close()
            moveTo(14.36f, 20f)
            horizontalLineToRelative(-4.71f)
            curveToRelative(-1.65f, 0f, -3.19f, -0.74f, -4.23f, -2f)
            horizontalLineToRelative(13.17f)
            curveToRelative(-1.04f, 1.26f, -2.59f, 2f, -4.23f, 2f)
            close()
        }
    }.also { _ConstructionHelmet = it }
