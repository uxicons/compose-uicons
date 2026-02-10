package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EmailHeart: ImageVector? = null

val Icons.Br.EmailHeart: ImageVector
    get() = _EmailHeart ?: UXIcon(name = "EmailHeart") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(12f, 3f)
            curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
            curveToRelative(0f, 2.63f, -3.39f, 5.4f, -5.07f, 6.69f)
            curveToRelative(-0.55f, 0.42f, -1.31f, 0.42f, -1.85f, 0f)
            curveToRelative(-1.68f, -1.28f, -5.07f, -4.06f, -5.07f, -6.69f)
            close()
            moveTo(22.5f, 10f)
            curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
            verticalLineToRelative(7.01f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-13f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            verticalLineToRelative(-7.22f)
            lineToRelative(5.11f, 5.11f)
            curveToRelative(1.07f, 1.07f, 2.48f, 1.61f, 3.89f, 1.61f)
            reflectiveCurveToRelative(2.82f, -0.54f, 3.89f, -1.61f)
            lineToRelative(1.88f, -1.88f)
            curveToRelative(0.59f, -0.59f, 0.59f, -1.53f, 0f, -2.12f)
            reflectiveCurveToRelative(-1.54f, -0.59f, -2.12f, 0f)
            lineToRelative(-1.88f, 1.88f)
            curveToRelative(-0.97f, 0.97f, -2.56f, 0.97f, -3.54f, 0f)
            lineToRelative(-6.93f, -6.93f)
            curveToRelative(0.42f, -0.79f, 1.24f, -1.34f, 2.2f, -1.34f)
            horizontalLineToRelative(3.06f)
            curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
            reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
            horizontalLineToRelative(-3.06f)
            curveToRelative(-3.03f, 0.0f, -5.5f, 2.47f, -5.5f, 5.5f)
            verticalLineToRelative(10f)
            curveToRelative(0f, 3.03f, 2.47f, 5.49f, 5.5f, 5.49f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.46f, 5.5f, -5.49f)
            verticalLineToRelative(-7.01f)
            curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
            close()
        }
    }.also { _EmailHeart = it }
