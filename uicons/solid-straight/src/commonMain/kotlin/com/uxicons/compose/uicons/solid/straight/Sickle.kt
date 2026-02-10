package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sickle: ImageVector? = null

val Icons.Ss.Sickle: ImageVector
    get() = _Sickle ?: UXIcon(name = "Sickle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 0f)
                curveTo(6.71f, 0f, 2f, 4.71f, 2f, 10.5f)
                curveToRelative(0f, 2.97f, 1.28f, 5.8f, 3.47f, 7.78f)
                lineToRelative(-4.26f, 4.26f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(6.13f, -6.13f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(0.09f, -0.09f, 0.09f, -0.09f)
                curveToRelative(-1.14f, -1.25f, -1.85f, -2.9f, -1.85f, -4.73f)
                curveToRelative(0f, -3.87f, 3.13f, -7f, 7f, -7f)
                curveToRelative(3.77f, 0f, 6.84f, 2.98f, 6.99f, 6.72f)
                lineToRelative(0.07f, 0.28f)
                horizontalLineToRelative(1.67f)
                reflectiveCurveToRelative(0.28f, -1.98f, 0.28f, -2.5f)
                curveTo(23f, 4.71f, 18.29f, 0f, 12.5f, 0f)
                close()
            }
        }.also { _Sickle = it}
