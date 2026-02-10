package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadVr: ImageVector? = null

val Icons.Ts.HeadVr: ImageVector
    get() = _HeadVr ?: UXIcon(name = "HeadVr") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 5f)
                horizontalLineToRelative(-3.85f)
                curveToRelative(-0.15f, -0.23f, -0.29f, -0.43f, -0.43f, -0.6f)
                curveTo(17.11f, 0.92f, 12.82f, -0.66f, 8.53f, 0.26f)
                curveTo(4.14f, 1.21f, 0.84f, 4.71f, 0.14f, 9.19f)
                curveToRelative(-0.51f, 3.27f, 0.33f, 6.51f, 2.31f, 8.9f)
                curveToRelative(0.36f, 0.43f, 0.56f, 0.99f, 0.56f, 1.56f)
                verticalLineToRelative(4.35f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2.36f)
                curveToRelative(1.19f, 0f, 2.22f, -0.85f, 2.45f, -2.01f)
                lineToRelative(0.79f, -3.99f)
                horizontalLineToRelative(2.4f)
                verticalLineToRelative(-1.5f)
                reflectiveCurveToRelative(-0.42f, -1.06f, -0.6f, -1.5f)
                horizontalLineToRelative(0.6f)
                lineTo(24f, 5f)
                close()
                moveTo(23f, 11f)
                lineTo(14.5f, 11f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(5f)
                close()
                moveTo(8.74f, 1.24f)
                curveToRelative(3.9f, -0.84f, 7.79f, 0.6f, 10.18f, 3.76f)
                horizontalLineToRelative(-4.42f)
                curveToRelative(-1.76f, 0f, -3.22f, 1.31f, -3.46f, 3f)
                lineTo(1.43f, 8f)
                curveToRelative(1.02f, -3.41f, 3.77f, -6.0f, 7.31f, -6.76f)
                close()
                moveTo(23f, 13.61f)
                verticalLineToRelative(0.4f)
                horizontalLineToRelative(-2.22f)
                lineToRelative(-0.95f, 4.79f)
                curveToRelative(-0.14f, 0.7f, -0.76f, 1.21f, -1.47f, 1.21f)
                horizontalLineToRelative(-3.36f)
                verticalLineToRelative(3f)
                lineTo(4f, 23f)
                verticalLineToRelative(-3.35f)
                curveToRelative(0f, -0.81f, -0.28f, -1.59f, -0.79f, -2.2f)
                curveTo(1.42f, 15.28f, 0.66f, 12.33f, 1.13f, 9.34f)
                curveToRelative(0.02f, -0.11f, 0.04f, -0.23f, 0.06f, -0.34f)
                lineTo(11.04f, 9f)
                curveToRelative(0.24f, 1.69f, 1.7f, 3f, 3.46f, 3f)
                horizontalLineToRelative(7.81f)
                curveToRelative(0.23f, 0.55f, 0.46f, 1.09f, 0.69f, 1.6f)
                close()
            }
        }.also { _HeadVr = it}
