package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Whale: ImageVector? = null

val Icons.Rr.Whale: ImageVector
    get() = _Whale ?: UXIcon(name = "Whale") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 17.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(24f, 16.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                horizontalLineToRelative(-9.27f)
                curveTo(3.92f, 24f, 0f, 20.09f, 0f, 15.27f)
                curveToRelative(0f, -3.37f, 0.99f, -6.63f, 2.85f, -9.43f)
                lineToRelative(0.49f, -0.74f)
                curveTo(1.56f, 4.34f, 0.25f, 2.65f, 0.0f, 0.65f)
                curveTo(-0.04f, 0.3f, 0.23f, -0.02f, 0.59f, 0.0f)
                curveToRelative(3.67f, 0.26f, 4.91f, 2.77f, 4.91f, 2.77f)
                curveTo(5.5f, 2.77f, 6.7f, 0.26f, 10.41f, 0.0f)
                curveToRelative(0.35f, -0.02f, 0.62f, 0.3f, 0.58f, 0.65f)
                curveToRelative(-0.28f, 2.29f, -1.94f, 4.16f, -4.13f, 4.72f)
                lineToRelative(-0.46f, 2.75f)
                curveToRelative(-0.2f, 1.19f, -0.33f, 2.39f, -0.38f, 3.59f)
                curveToRelative(2.87f, -2.38f, 5.88f, -3.71f, 8.47f, -3.71f)
                horizontalLineToRelative(1.01f)
                curveToRelative(4.68f, 0.01f, 8.49f, 3.82f, 8.49f, 8.5f)
                close()
                moveTo(22f, 16.5f)
                curveToRelative(0f, -3.58f, -2.91f, -6.5f, -6.49f, -6.5f)
                horizontalLineToRelative(-1.01f)
                curveToRelative(-2.56f, 0f, -5.84f, 1.76f, -8.79f, 4.71f)
                curveToRelative(-0.29f, 0.29f, -0.72f, 0.37f, -1.09f, 0.22f)
                curveToRelative(-0.37f, -0.15f, -0.62f, -0.52f, -0.62f, -0.92f)
                verticalLineToRelative(-1.06f)
                curveToRelative(0f, -1.72f, 0.15f, -3.46f, 0.43f, -5.16f)
                lineToRelative(0.16f, -0.94f)
                curveToRelative(-1.65f, 2.47f, -2.59f, 5.45f, -2.59f, 8.43f)
                curveToRelative(0f, 3.71f, 3.02f, 6.73f, 6.73f, 6.73f)
                horizontalLineToRelative(9.27f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-1.5f)
                close()
            }
        }.also { _Whale = it}
