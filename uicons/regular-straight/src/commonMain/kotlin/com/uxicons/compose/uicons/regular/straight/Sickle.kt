package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sickle: ImageVector? = null

val Icons.Rs.Sickle: ImageVector
    get() = _Sickle ?: UXIcon(name = "Sickle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 0f)
                curveTo(6.71f, 0f, 2f, 4.71f, 2f, 10.5f)
                curveToRelative(0f, 2.97f, 1.28f, 5.8f, 3.47f, 7.78f)
                lineToRelative(-4.26f, 4.26f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(6.59f, -6.59f)
                lineToRelative(-0.38f, -0.66f)
                curveToRelative(-0.55f, -0.97f, -0.84f, -2.08f, -0.84f, -3.19f)
                curveToRelative(0f, -3.58f, 2.92f, -6.5f, 6.5f, -6.5f)
                curveToRelative(3.08f, 0f, 5.75f, 2.19f, 6.36f, 5.2f)
                lineToRelative(0.19f, 0.8f)
                horizontalLineToRelative(1.67f)
                reflectiveCurveToRelative(0.28f, -1.98f, 0.28f, -2.5f)
                curveTo(23f, 4.71f, 18.29f, 0f, 12.5f, 0f)
                close()
                moveTo(14.5f, 5f)
                curveToRelative(-4.69f, 0f, -8.5f, 3.81f, -8.5f, 8.5f)
                curveToRelative(0f, 1.06f, 0.2f, 2.1f, 0.58f, 3.09f)
                curveToRelative(-1.64f, -1.59f, -2.58f, -3.79f, -2.58f, -6.09f)
                curveToRelative(0f, -4.69f, 3.81f, -8.5f, 8.5f, -8.5f)
                curveToRelative(3.6f, 0f, 6.68f, 2.25f, 7.92f, 5.41f)
                curveToRelative(-1.55f, -1.5f, -3.65f, -2.41f, -5.92f, -2.41f)
                close()
            }
        }.also { _Sickle = it}
