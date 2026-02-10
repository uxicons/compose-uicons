package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkinLaser: ImageVector? = null

val Icons.Bs.SkinLaser: ImageVector
    get() = _SkinLaser ?: UXIcon(name = "SkinLaser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                verticalLineToRelative(-3f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(14.57f, 19.93f)
                reflectiveCurveToRelative(-0.91f, -0.62f, -2.08f, -1.49f)
                lineToRelative(-1.65f, 1.65f)
                lineToRelative(-1.06f, -1.06f)
                curveToRelative(-2.87f, -2.87f, -4.0f, -4.12f, -6.48f, -7.45f)
                curveToRelative(-1.53f, -2.05f, -1.68f, -4.66f, -0.53f, -6.69f)
                lineTo(0.06f, 2.18f)
                lineTo(2.18f, 0.06f)
                lineToRelative(2.71f, 2.71f)
                curveToRelative(1.99f, -1.14f, 4.54f, -1.01f, 6.67f, 0.49f)
                curveToRelative(2.8f, 1.97f, 4.49f, 3.53f, 7.47f, 6.51f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(-1.65f, 1.66f)
                curveToRelative(0.88f, 1.17f, 1.5f, 2.08f, 1.5f, 2.08f)
                lineToRelative(-5.36f, 5.36f)
                close()
                moveTo(10.84f, 15.84f)
                lineToRelative(5.0f, -5.01f)
                curveToRelative(-2.14f, -2.11f, -3.65f, -3.46f, -6.01f, -5.12f)
                curveToRelative(-0.61f, -0.43f, -1.37f, -0.71f, -2.12f, -0.71f)
                curveToRelative(-0.68f, 0f, -1.35f, 0.23f, -1.91f, 0.79f)
                curveToRelative(-1.04f, 1.04f, -1.08f, 2.69f, -0.1f, 4.0f)
                curveToRelative(2.06f, 2.76f, 3.1f, 3.98f, 5.14f, 6.05f)
                close()
                moveTo(9.5f, 8.0f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _SkinLaser = it}
