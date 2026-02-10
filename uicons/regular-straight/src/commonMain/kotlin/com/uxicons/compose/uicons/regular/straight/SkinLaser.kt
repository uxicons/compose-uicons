package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkinLaser: ImageVector? = null

val Icons.Rs.SkinLaser: ImageVector
    get() = _SkinLaser ?: UXIcon(name = "SkinLaser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                verticalLineToRelative(-2f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(21.4f, 14.86f)
                lineToRelative(-6.53f, 6.53f)
                lineToRelative(-0.69f, -0.47f)
                curveToRelative(-0.06f, -0.04f, -1.18f, -0.81f, -2.54f, -1.84f)
                lineToRelative(-0.79f, 0.79f)
                lineToRelative(-0.71f, -0.71f)
                curveToRelative(-3.04f, -3.05f, -4.24f, -4.37f, -6.87f, -7.89f)
                curveToRelative(-1.59f, -2.13f, -1.67f, -4.88f, -0.3f, -6.89f)
                lineTo(0.07f, 1.49f)
                lineTo(1.49f, 0.07f)
                lineToRelative(2.89f, 2.9f)
                curveToRelative(1.97f, -1.36f, 4.67f, -1.29f, 6.88f, 0.26f)
                curveToRelative(2.95f, 2.08f, 4.75f, 3.73f, 7.91f, 6.9f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(-0.79f, 0.8f)
                curveToRelative(1.04f, 1.36f, 1.81f, 2.49f, 1.85f, 2.55f)
                lineToRelative(0.47f, 0.68f)
                close()
                moveTo(10.85f, 17.05f)
                lineToRelative(6.2f, -6.21f)
                curveToRelative(-2.65f, -2.63f, -4.33f, -4.14f, -6.93f, -5.97f)
                curveToRelative(-0.75f, -0.53f, -1.69f, -0.88f, -2.62f, -0.88f)
                curveToRelative(-0.87f, 0f, -1.73f, 0.3f, -2.46f, 1.02f)
                curveToRelative(-1.33f, 1.33f, -1.4f, 3.42f, -0.16f, 5.07f)
                curveToRelative(2.36f, 3.17f, 3.48f, 4.45f, 5.98f, 6.97f)
                close()
                moveTo(18.8f, 14.63f)
                curveToRelative(-0.29f, -0.4f, -0.69f, -0.96f, -1.15f, -1.56f)
                lineToRelative(-4.59f, 4.6f)
                curveToRelative(0.6f, 0.46f, 1.16f, 0.86f, 1.56f, 1.14f)
                lineToRelative(4.18f, -4.18f)
                close()
                moveTo(9.5f, 8f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _SkinLaser = it}
