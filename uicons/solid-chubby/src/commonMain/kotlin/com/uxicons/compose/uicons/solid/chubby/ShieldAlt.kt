package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldAlt: ImageVector? = null

val Icons.Sc.ShieldAlt: ImageVector
    get() = _ShieldAlt ?: UXIcon(name = "ShieldAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.04f, 18.75f)
                curveToRelative(-1.99f, 2.11f, -6.27f, 3.68f, -8.03f, 4.25f)
                lineToRelative(0.0f, -22f)
                curveToRelative(4.7f, 0.19f, 7.46f, 1.77f, 7.58f, 1.84f)
                curveToRelative(0.25f, 0.14f, 0.42f, 0.39f, 0.48f, 0.67f)
                curveToRelative(0.54f, 2.63f, 2.12f, 12.94f, -0.04f, 15.23f)
                close()
                moveTo(10.99f, 1f)
                curveToRelative(-4.7f, 0.19f, -7.46f, 1.77f, -7.58f, 1.84f)
                curveToRelative(-0.25f, 0.14f, -0.42f, 0.39f, -0.48f, 0.67f)
                curveToRelative(-0.54f, 2.63f, -2.12f, 12.94f, 0.04f, 15.23f)
                curveToRelative(1.98f, 2.1f, 6.26f, 3.67f, 8.02f, 4.25f)
                lineToRelative(0.0f, -22.0f)
                close()
            }
        }.also { _ShieldAlt = it}
