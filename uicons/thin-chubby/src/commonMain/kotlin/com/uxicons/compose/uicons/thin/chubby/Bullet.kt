package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bullet: ImageVector? = null

val Icons.Tc.Bullet: ImageVector
    get() = _Bullet ?: UXIcon(name = "Bullet") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 7f)
                curveToRelative(-3.5f, 0f, -5f, 1.5f, -5f, 5f)
                reflectiveCurveToRelative(1.5f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -1.5f, 5f, -5f)
                reflectiveCurveToRelative(-1.5f, -5f, -5f, -5f)
                close()
                moveTo(12f, 16f)
                curveToRelative(-2.95f, 0f, -4f, -1.05f, -4f, -4f)
                reflectiveCurveToRelative(1.05f, -4f, 4f, -4f)
                reflectiveCurveToRelative(4f, 1.05f, 4f, 4f)
                reflectiveCurveToRelative(-1.05f, 4f, -4f, 4f)
                close()
            }
        }.also { _Bullet = it}
