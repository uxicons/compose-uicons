package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHeart: ImageVector? = null

val Icons.Ss.CircleHeart: ImageVector
    get() = _CircleHeart ?: UXIcon(name = "CircleHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12.57f, 17.82f)
                lineToRelative(-0.57f, 0.4f)
                lineToRelative(-0.57f, -0.4f)
                curveToRelative(-0.56f, -0.39f, -5.43f, -3.87f, -5.43f, -7.12f)
                curveToRelative(0f, -2.04f, 1.57f, -3.7f, 3.5f, -3.7f)
                curveToRelative(1f, 0f, 1.87f, 0.37f, 2.5f, 0.99f)
                curveToRelative(0.63f, -0.62f, 1.5f, -0.99f, 2.5f, -0.99f)
                curveToRelative(1.93f, 0f, 3.5f, 1.66f, 3.5f, 3.7f)
                curveToRelative(0f, 3.26f, -4.87f, 6.74f, -5.43f, 7.12f)
                close()
                moveTo(16f, 10.7f)
                curveToRelative(0f, 1.5f, -2.26f, 3.73f, -4f, 5.06f)
                curveToRelative(-1.74f, -1.33f, -4f, -3.56f, -4f, -5.06f)
                curveToRelative(0f, -0.94f, 0.67f, -1.7f, 1.5f, -1.7f)
                curveToRelative(0.75f, 0f, 1.5f, 0.45f, 1.5f, 1.45f)
                verticalLineToRelative(0.55f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-0.55f)
                curveToRelative(0f, -1f, 0.75f, -1.45f, 1.5f, -1.45f)
                curveToRelative(0.83f, 0f, 1.5f, 0.76f, 1.5f, 1.7f)
                close()
            }
        }.also { _CircleHeart = it}
