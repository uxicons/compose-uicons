package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeLashes: ImageVector? = null

val Icons.Bs.EyeLashes: ImageVector
    get() = _EyeLashes ?: UXIcon(name = "EyeLashes") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.8f, 13.48f)
                curveToRelative(-0.06f, -0.17f, -0.85f, -2.2f, -2.62f, -4.24f)
                lineToRelative(2.75f, -3.46f)
                lineToRelative(-2.35f, -1.87f)
                lineToRelative(-2.61f, 3.29f)
                curveToRelative(-0.4f, -0.29f, -0.82f, -0.56f, -1.27f, -0.81f)
                lineToRelative(1.35f, -3.94f)
                lineToRelative(-2.84f, -0.97f)
                lineToRelative(-1.3f, 3.81f)
                curveToRelative(-0.45f, -0.11f, -0.92f, -0.2f, -1.41f, -0.26f)
                verticalLineToRelative(-4.03f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4.03f)
                curveToRelative(-0.49f, 0.06f, -0.96f, 0.15f, -1.41f, 0.26f)
                lineToRelative(-1.3f, -3.81f)
                lineToRelative(-2.84f, 0.97f)
                lineToRelative(1.35f, 3.95f)
                curveToRelative(-0.45f, 0.25f, -0.87f, 0.52f, -1.26f, 0.81f)
                lineToRelative(-2.62f, -3.3f)
                lineToRelative(-2.35f, 1.87f)
                lineToRelative(2.75f, 3.47f)
                curveToRelative(-2.21f, 2.71f, -2.42f, 3.83f, -2.82f, 4.76f)
                curveToRelative(1.28f, 3.58f, 4.91f, 8.95f, 12.0f, 9.06f)
                curveToRelative(8.94f, -0.24f, 11.61f, -8.12f, 11.99f, -9.08f)
                lineToRelative(-0.19f, -0.51f)
                close()
                moveTo(12f, 20.06f)
                curveToRelative(-5.41f, 0f, -8.01f, -4.49f, -8.76f, -6.06f)
                curveToRelative(0.74f, -1.56f, 3.34f, -6.06f, 8.76f, -6.06f)
                reflectiveCurveToRelative(8.03f, 4.49f, 8.76f, 6.06f)
                curveToRelative(-0.74f, 1.56f, -3.34f, 6.06f, -8.76f, 6.06f)
                close()
                moveTo(16f, 14.0f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                close()
            }
        }.also { _EyeLashes = it}
