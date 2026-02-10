package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Perfume: ImageVector? = null

val Icons.Bs.Perfume: ImageVector
    get() = _Perfume ?: UXIcon(name = "Perfume") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                curveToRelative(-2.52f, -0.01f, -4.62f, 2.13f, -4.48f, 4.66f)
                curveToRelative(-1.09f, 0.34f, -2.1f, 0.59f, -3.02f, 0.72f)
                verticalLineToRelative(-0.37f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3.52f)
                curveToRelative(-3.49f, 1.24f, -6f, 4.57f, -6f, 8.47f)
                curveToRelative(-0.01f, 2.7f, 1.26f, 5.26f, 3.33f, 7f)
                horizontalLineToRelative(11.35f)
                curveToRelative(2.06f, -1.74f, 3.34f, -4.3f, 3.33f, -7f)
                curveToRelative(0f, -3.91f, -2.51f, -7.24f, -6f, -8.47f)
                verticalLineToRelative(-0.12f)
                curveToRelative(1.25f, -0.14f, 2.63f, -0.48f, 4.13f, -0.96f)
                curveToRelative(0.82f, 0.94f, 2.02f, 1.55f, 3.37f, 1.55f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(15f, 17f)
                curveToRelative(0f, 1.5f, -0.54f, 2.9f, -1.54f, 4f)
                horizontalLineToRelative(-8.93f)
                curveToRelative(-0.99f, -1.1f, -1.54f, -2.5f, -1.54f, -4f)
                curveToRelative(0f, -3.31f, 2.69f, -6f, 6f, -6f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                close()
                moveTo(19.5f, 6f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Perfume = it}
