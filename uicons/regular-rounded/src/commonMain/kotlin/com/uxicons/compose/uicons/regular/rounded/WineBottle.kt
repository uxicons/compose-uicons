package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WineBottle: ImageVector? = null

val Icons.Rr.WineBottle: ImageVector
    get() = _WineBottle ?: UXIcon(name = "WineBottle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.34f, 9.19f)
                lineToRelative(-3.33f, -2.22f)
                lineTo(15.01f, 1.0f)
                curveTo(15.01f, 0.45f, 14.56f, 0.01f, 14.01f, 0.01f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(5.96f)
                lineToRelative(-3.33f, 2.22f)
                curveToRelative(-1.67f, 1.11f, -2.67f, 2.98f, -2.67f, 4.99f)
                verticalLineToRelative(4.82f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(8.0f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-4.82f)
                curveToRelative(0f, -2.01f, -1.0f, -3.88f, -2.67f, -4.99f)
                close()
                moveTo(19.01f, 19.0f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                horizontalLineToRelative(-8.0f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-4.0f)
                horizontalLineToRelative(11.0f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1.0f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                lineTo(5.18f, 13.0f)
                curveToRelative(0.27f, -0.87f, 0.83f, -1.63f, 1.61f, -2.15f)
                lineToRelative(3.77f, -2.52f)
                curveToRelative(0.28f, -0.19f, 0.45f, -0.5f, 0.45f, -0.83f)
                verticalLineToRelative(-3.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3.5f)
                curveToRelative(0f, 0.33f, 0.17f, 0.65f, 0.45f, 0.83f)
                lineToRelative(3.77f, 2.52f)
                curveToRelative(1.11f, 0.74f, 1.78f, 1.99f, 1.78f, 3.33f)
                verticalLineToRelative(4.82f)
                close()
            }
        }.also { _WineBottle = it}
