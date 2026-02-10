package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bird: ImageVector? = null

val Icons.Rr.Bird: ImageVector
    get() = _Bird ?: UXIcon(name = "Bird") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.31f, 6.21f)
                lineToRelative(-1.37f, -0.59f)
                curveToRelative(-0.43f, -3.17f, -3.15f, -5.62f, -6.44f, -5.62f)
                curveToRelative(-3.58f, 0f, -6.5f, 2.92f, -6.5f, 6.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                reflectiveCurveToRelative(-3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 5.03f, 3.39f, 9.28f, 8f, 10.58f)
                verticalLineToRelative(1.42f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.05f)
                curveToRelative(0.33f, 0.03f, 0.66f, 0.05f, 1f, 0.05f)
                reflectiveCurveToRelative(0.67f, -0.02f, 1f, -0.05f)
                verticalLineToRelative(1.05f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.42f)
                curveToRelative(4.61f, -1.31f, 8f, -5.56f, 8f, -10.58f)
                verticalLineToRelative(-2.14f)
                lineToRelative(1.31f, -0.56f)
                curveToRelative(0.42f, -0.18f, 0.69f, -0.59f, 0.69f, -1.04f)
                reflectiveCurveToRelative(-0.27f, -0.87f, -0.69f, -1.04f)
                close()
                moveTo(5.5f, 13f)
                curveToRelative(1.33f, 0f, 2.55f, -0.47f, 3.5f, -1.26f)
                verticalLineToRelative(0.76f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                horizontalLineToRelative(-0.2f)
                curveToRelative(-1.27f, -1.42f, -2.1f, -3.23f, -2.27f, -5.23f)
                curveToRelative(0.95f, 0.77f, 2.15f, 1.23f, 3.47f, 1.23f)
                close()
                moveTo(20f, 11f)
                curveToRelative(0f, 4.96f, -4.04f, 9f, -9f, 9f)
                curveToRelative(-1.69f, 0f, -3.27f, -0.47f, -4.62f, -1.28f)
                curveToRelative(2.67f, -0.81f, 4.62f, -3.29f, 4.62f, -6.22f)
                verticalLineToRelative(-6f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(4.5f)
                close()
                moveTo(18f, 5.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _Bird = it}
