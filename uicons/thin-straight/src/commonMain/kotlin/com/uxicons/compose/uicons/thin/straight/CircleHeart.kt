package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleHeart: ImageVector? = null

val Icons.Ts.CircleHeart: ImageVector
    get() = _CircleHeart ?: UXIcon(name = "CircleHeart") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.75f, 7f)
                curveToRelative(-1.2f, 0f, -2.19f, 0.55f, -2.75f, 1.43f)
                curveToRelative(-0.56f, -0.88f, -1.55f, -1.43f, -2.75f, -1.43f)
                curveToRelative(-1.79f, 0f, -3.25f, 1.57f, -3.25f, 3.5f)
                curveToRelative(0f, 3.36f, 5.48f, 7.25f, 5.71f, 7.41f)
                lineToRelative(0.29f, 0.2f)
                lineToRelative(0.29f, -0.2f)
                curveToRelative(0.23f, -0.16f, 5.71f, -4.05f, 5.71f, -7.41f)
                curveToRelative(0f, -1.93f, -1.46f, -3.5f, -3.25f, -3.5f)
                close()
                moveTo(12f, 16.88f)
                curveToRelative(-1.63f, -1.2f, -5f, -4.16f, -5f, -6.38f)
                curveToRelative(0f, -1.38f, 1.01f, -2.5f, 2.25f, -2.5f)
                curveToRelative(1.32f, 0f, 2.25f, 0.92f, 2.25f, 2.23f)
                verticalLineToRelative(0.77f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-0.77f)
                curveToRelative(0f, -1.31f, 0.93f, -2.23f, 2.25f, -2.23f)
                curveToRelative(1.24f, 0f, 2.25f, 1.12f, 2.25f, 2.5f)
                curveToRelative(0f, 2.22f, -3.37f, 5.18f, -5f, 6.38f)
                close()
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 23f)
                curveToRelative(-6.07f, 0f, -11f, -4.93f, -11f, -11f)
                reflectiveCurveTo(5.93f, 1f, 12f, 1f)
                reflectiveCurveToRelative(11f, 4.93f, 11f, 11f)
                reflectiveCurveToRelative(-4.93f, 11f, -11f, 11f)
                close()
            }
        }.also { _CircleHeart = it}
