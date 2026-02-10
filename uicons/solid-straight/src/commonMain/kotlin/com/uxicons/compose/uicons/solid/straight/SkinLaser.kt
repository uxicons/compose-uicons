package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SkinLaser: ImageVector? = null

val Icons.Ss.SkinLaser: ImageVector
    get() = _SkinLaser ?: UXIcon(name = "SkinLaser") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 17f)
                curveToRelative(0f, 3.86f, -3.14f, 7f, -7f, 7f)
                verticalLineToRelative(-2f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(18.73f, 10.27f)
                lineToRelative(-8.45f, 8.46f)
                lineToRelative(-0.66f, -0.66f)
                curveToRelative(-2.85f, -2.85f, -3.96f, -4.09f, -6.43f, -7.39f)
                curveToRelative(-1.48f, -1.98f, -1.56f, -4.52f, -0.32f, -6.39f)
                lineTo(0.07f, 1.49f)
                lineTo(1.49f, 0.07f)
                lineToRelative(2.79f, 2.79f)
                curveToRelative(1.84f, -1.23f, 4.33f, -1.16f, 6.39f, 0.28f)
                curveToRelative(2.76f, 1.94f, 4.44f, 3.49f, 7.4f, 6.45f)
                lineToRelative(0.66f, 0.66f)
                close()
                moveTo(11f, 9.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                reflectiveCurveToRelative(0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(19.23f, 12.6f)
                lineToRelative(-6.63f, 6.64f)
                curveToRelative(1.38f, 1.04f, 2.49f, 1.8f, 2.49f, 1.8f)
                lineToRelative(5.94f, -5.94f)
                reflectiveCurveToRelative(-0.76f, -1.12f, -1.8f, -2.5f)
                close()
            }
        }.also { _SkinLaser = it}
