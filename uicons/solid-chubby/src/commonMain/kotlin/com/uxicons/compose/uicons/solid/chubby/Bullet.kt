package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bullet: ImageVector? = null

val Icons.Sc.Bullet: ImageVector
    get() = _Bullet ?: UXIcon(name = "Bullet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 12f)
                curveToRelative(0f, 3.41f, -1.59f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -1.59f, -5f, -5f)
                reflectiveCurveToRelative(1.59f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 1.59f, 5f, 5f)
                close()
            }
        }.also { _Bullet = it}
