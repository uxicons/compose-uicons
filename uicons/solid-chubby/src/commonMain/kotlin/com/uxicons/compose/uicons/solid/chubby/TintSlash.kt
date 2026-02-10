package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TintSlash: ImageVector? = null

val Icons.Sc.TintSlash: ImageVector
    get() = _TintSlash ?: UXIcon(name = "TintSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(3.9f, 8.81f)
                lineToRelative(12.7f, 12.7f)
                curveToRelative(-1.42f, 0.91f, -3.02f, 1.47f, -4.65f, 1.48f)
                curveToRelative(-4.79f, -0.09f, -9.48f, -4.79f, -9.48f, -9.5f)
                curveToRelative(0f, -1.63f, 0.57f, -3.22f, 1.43f, -4.69f)
                close()
                moveTo(22.56f, 20.44f)
                lineTo(20.08f, 17.96f)
                curveToRelative(0.83f, -1.36f, 1.34f, -2.88f, 1.39f, -4.43f)
                curveToRelative(-0.1f, -6.25f, -8.82f, -12.29f, -8.91f, -12.36f)
                curveToRelative(-0.17f, -0.12f, -0.37f, -0.17f, -0.56f, -0.17f)
                curveToRelative(-0.2f, 0f, -0.39f, 0.06f, -0.56f, 0.17f)
                curveToRelative(-0.43f, 0.29f, -2.44f, 1.68f, -4.45f, 3.71f)
                lineToRelative(-3.44f, -3.44f)
                curveToRelative(-0.59f, -0.59f, -1.53f, -0.59f, -2.12f, 0f)
                curveToRelative(-0.59f, 0.58f, -0.59f, 1.54f, 0f, 2.12f)
                lineToRelative(19.0f, 19.0f)
                curveToRelative(0.59f, 0.59f, 1.53f, 0.59f, 2.12f, 0f)
                curveToRelative(0.59f, -0.58f, 0.59f, -1.54f, 0f, -2.12f)
                close()
            }
        }.also { _TintSlash = it}
