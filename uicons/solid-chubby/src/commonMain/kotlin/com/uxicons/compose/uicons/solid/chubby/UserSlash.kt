package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserSlash: ImageVector? = null

val Icons.Sc.UserSlash: ImageVector
    get() = _UserSlash ?: UXIcon(name = "UserSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.27f, 14.22f)
                lineToRelative(8.78f, 8.78f)
                horizontalLineToRelative(-14.02f)
                curveToRelative(-0.27f, 0f, -0.54f, -0.11f, -0.73f, -0.31f)
                reflectiveCurveToRelative(-0.29f, -0.47f, -0.27f, -0.74f)
                curveToRelative(0.24f, -4.57f, 2.2f, -7.02f, 6.24f, -7.73f)
                close()
                moveTo(22.56f, 20.44f)
                lineTo(20.07f, 17.95f)
                curveToRelative(-0.64f, -1.37f, -1.64f, -2.36f, -3.01f, -3.01f)
                lineToRelative(-2.31f, -2.31f)
                curveToRelative(2.23f, -0.73f, 3.26f, -2.54f, 3.26f, -5.62f)
                curveToRelative(0f, -4.15f, -1.85f, -6f, -6f, -6f)
                curveToRelative(-3.08f, 0f, -4.89f, 1.03f, -5.62f, 3.26f)
                lineToRelative(-2.82f, -2.82f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
                lineToRelative(19.0f, 19.0f)
                curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
                close()
            }
        }.also { _UserSlash = it}
