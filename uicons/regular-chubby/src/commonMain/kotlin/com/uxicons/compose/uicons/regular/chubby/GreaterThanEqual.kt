package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GreaterThanEqual: ImageVector? = null

val Icons.Rc.GreaterThanEqual: ImageVector
    get() = _GreaterThanEqual ?: UXIcon(name = "GreaterThanEqual") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.97f, 22.12f)
                curveToRelative(-0.11f, 0.46f, -0.52f, 0.77f, -0.97f, 0.77f)
                curveToRelative(-0.08f, 0f, -0.16f, -0.01f, -0.23f, -0.03f)
                curveToRelative(-1.33f, -0.32f, -4.12f, -0.86f, -7.77f, -0.86f)
                reflectiveCurveToRelative(-6.43f, 0.54f, -7.77f, 0.86f)
                curveToRelative(-0.54f, 0.13f, -1.08f, -0.2f, -1.21f, -0.74f)
                curveToRelative(-0.13f, -0.54f, 0.2f, -1.08f, 0.74f, -1.21f)
                curveToRelative(1.42f, -0.34f, 4.38f, -0.92f, 8.23f, -0.92f)
                reflectiveCurveToRelative(6.81f, 0.57f, 8.23f, 0.92f)
                curveToRelative(0.54f, 0.13f, 0.87f, 0.67f, 0.74f, 1.21f)
                close()
                moveTo(3.0f, 17.02f)
                curveToRelative(0.04f, 0.55f, 0.54f, 0.96f, 1.08f, 0.92f)
                curveToRelative(9.46f, -0.77f, 16.34f, -7.5f, 16.62f, -7.79f)
                curveToRelative(0.19f, -0.19f, 0.3f, -0.44f, 0.3f, -0.71f)
                reflectiveCurveToRelative(-0.11f, -0.52f, -0.3f, -0.71f)
                curveToRelative(-0.29f, -0.29f, -7.17f, -7.02f, -16.62f, -7.79f)
                curveToRelative(-0.54f, -0.05f, -1.03f, 0.36f, -1.08f, 0.92f)
                curveToRelative(-0.04f, 0.55f, 0.36f, 1.03f, 0.92f, 1.08f)
                curveToRelative(6.96f, 0.57f, 12.58f, 4.8f, 14.59f, 6.5f)
                curveToRelative(-2.0f, 1.71f, -7.62f, 5.94f, -14.59f, 6.5f)
                curveToRelative(-0.55f, 0.04f, -0.96f, 0.53f, -0.92f, 1.08f)
                close()
            }
        }.also { _GreaterThanEqual = it}
