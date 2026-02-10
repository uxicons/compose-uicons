package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bird: ImageVector? = null

val Icons.Rs.Bird: ImageVector
    get() = _Bird ?: UXIcon(name = "Bird") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 5.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 6.5f)
                verticalLineToRelative(1.5f)
                lineToRelative(-2f, 0.86f)
                verticalLineToRelative(2.14f)
                curveToRelative(0f, 5.03f, -3.39f, 9.28f, -8f, 10.58f)
                verticalLineToRelative(2.42f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.05f)
                curveToRelative(-0.33f, 0.03f, -0.66f, 0.05f, -1f, 0.05f)
                reflectiveCurveToRelative(-0.67f, -0.02f, -1f, -0.05f)
                verticalLineToRelative(2.05f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2.42f)
                curveTo(3.39f, 20.27f, 0f, 16.03f, 0f, 11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
                curveToRelative(3.29f, 0f, 6.01f, 2.45f, 6.44f, 5.62f)
                lineToRelative(2.06f, 0.88f)
                close()
                moveTo(4.3f, 17f)
                horizontalLineToRelative(0.2f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-0.76f)
                curveToRelative(-0.95f, 0.79f, -2.17f, 1.26f, -3.5f, 1.26f)
                curveToRelative(-1.31f, 0f, -2.52f, -0.46f, -3.47f, -1.23f)
                curveToRelative(0.17f, 2.0f, 1.0f, 3.82f, 2.27f, 5.23f)
                close()
                moveTo(20f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                reflectiveCurveToRelative(-4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.93f, -1.95f, 5.41f, -4.61f, 6.22f)
                curveToRelative(1.35f, 0.81f, 2.92f, 1.28f, 4.61f, 1.28f)
                curveToRelative(4.96f, 0f, 9f, -4.04f, 9f, -9f)
                verticalLineToRelative(-4.5f)
                close()
            }
        }.also { _Bird = it}
