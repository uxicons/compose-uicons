package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bullet: ImageVector? = null

val Icons.Rc.Bullet: ImageVector
    get() = _Bullet ?: UXIcon(name = "Bullet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 7f)
                curveToRelative(-3.41f, 0f, -5f, 1.59f, -5f, 5f)
                reflectiveCurveToRelative(1.59f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -1.59f, 5f, -5f)
                reflectiveCurveToRelative(-1.59f, -5f, -5f, -5f)
                close()
                moveTo(12f, 15f)
                curveToRelative(-2.3f, 0f, -3f, -0.7f, -3f, -3f)
                reflectiveCurveToRelative(0.7f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 0.7f, 3f, 3f)
                reflectiveCurveToRelative(-0.7f, 3f, -3f, 3f)
                close()
            }
        }.also { _Bullet = it}
