package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tap: ImageVector? = null

val Icons.Ss.Tap: ImageVector
    get() = _Tap ?: UXIcon(name = "Tap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.06f, 24f)
                lineToRelative(-5.42f, -5.59f)
                curveToRelative(-0.71f, -0.71f, -0.88f, -1.87f, -0.28f, -2.68f)
                curveToRelative(0.63f, -0.84f, 1.74f, -1.03f, 2.58f, -0.56f)
                curveToRelative(0.2f, 0.13f, 0.35f, 0.24f, 0.44f, 0.33f)
                lineToRelative(2.6f, 2.65f)
                verticalLineTo(5.5f)
                curveToRelative(0f, -0.91f, 0.81f, -1.63f, 1.75f, -1.48f)
                curveToRelative(0.74f, 0.12f, 1.25f, 0.81f, 1.25f, 1.56f)
                verticalLineToRelative(6.92f)
                lineToRelative(12f, 3f)
                verticalLineToRelative(8.5f)
                horizontalLineTo(7.06f)
                close()
                moveTo(8.5f, 0f)
                curveTo(4.92f, 0f, 2f, 2.92f, 2f, 6.5f)
                curveToRelative(0f, 2.29f, 1.2f, 4.31f, 3f, 5.47f)
                verticalLineToRelative(-2.67f)
                curveToRelative(-0.62f, -0.77f, -1f, -1.73f, -1f, -2.79f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                curveToRelative(0f, 1.06f, -0.38f, 2.02f, -1f, 2.79f)
                verticalLineToRelative(2.67f)
                curveToRelative(1.8f, -1.16f, 3f, -3.17f, 3f, -5.47f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                close()
            }
        }.also { _Tap = it}
