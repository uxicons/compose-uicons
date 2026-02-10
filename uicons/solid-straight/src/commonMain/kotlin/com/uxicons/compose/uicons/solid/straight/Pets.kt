package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Pets: ImageVector? = null

val Icons.Ss.Pets: ImageVector
    get() = _Pets ?: UXIcon(name = "Pets") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 6f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                horizontalLineToRelative(-1.31f)
                curveToRelative(-0.38f, -0.29f, -1.59f, -0.92f, -1.69f, -0.97f)
                verticalLineToRelative(-4.03f)
                horizontalLineToRelative(-2f)
                curveToRelative(-2.43f, 0f, -4.46f, 1.75f, -4.91f, 4.05f)
                curveToRelative(-3.26f, 2.04f, -6.7f, 5.15f, -7.05f, 10.95f)
                lineTo(0f, 24f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(6.95f)
                lineToRelative(4.05f, -6.29f)
                verticalLineToRelative(-0.71f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.23f)
                curveToRelative(1.43f, 0f, 2.77f, 0.63f, 3.68f, 1.72f)
                lineToRelative(0.23f, 0.28f)
                curveToRelative(0.53f, 0.64f, 1.31f, 1.0f, 2.14f, 1.0f)
                horizontalLineToRelative(2.73f)
                close()
                moveTo(16.58f, 15.06f)
                curveToRelative(-0.21f, -0.1f, -0.86f, -0.45f, -1.58f, -0.72f)
                verticalLineToRelative(-3.33f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(0.26f)
                curveToRelative(-3.03f, 1.71f, -6.58f, 4.4f, -6.96f, 9.74f)
                horizontalLineToRelative(12.83f)
                curveToRelative(0.98f, 0f, 1.82f, -0.71f, 1.98f, -1.68f)
                lineToRelative(0.28f, -1.75f)
                reflectiveCurveToRelative(-1.16f, -1.9f, -1.23f, -2.44f)
                curveToRelative(-0.19f, -1.51f, -1.0f, -2.46f, -2.32f, -3.08f)
                close()
            }
        }.also { _Pets = it}
