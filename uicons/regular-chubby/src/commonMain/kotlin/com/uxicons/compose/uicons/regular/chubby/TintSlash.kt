package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TintSlash: ImageVector? = null

val Icons.Rc.TintSlash: ImageVector
    get() = _TintSlash ?: UXIcon(name = "TintSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16.43f, 20.52f)
                curveToRelative(0.27f, 0.48f, 0.09f, 1.09f, -0.39f, 1.36f)
                curveToRelative(-1.3f, 0.72f, -2.7f, 1.1f, -4.04f, 1.12f)
                curveToRelative(-4.82f, -0.09f, -9.51f, -4.79f, -9.51f, -9.5f)
                curveToRelative(0f, -1.26f, 0.34f, -2.59f, 1.0f, -3.94f)
                curveToRelative(0.24f, -0.49f, 0.84f, -0.7f, 1.34f, -0.46f)
                curveToRelative(0.5f, 0.24f, 0.7f, 0.84f, 0.46f, 1.34f)
                curveToRelative(-0.53f, 1.07f, -0.8f, 2.1f, -0.8f, 3.06f)
                curveToRelative(0f, 3.58f, 3.86f, 7.43f, 7.52f, 7.5f)
                curveToRelative(0.99f, -0.01f, 2.06f, -0.32f, 3.07f, -0.88f)
                curveToRelative(0.48f, -0.27f, 1.09f, -0.09f, 1.36f, 0.39f)
                close()
                moveTo(22.71f, 22.71f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                lineToRelative(-20f, -20f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                reflectiveCurveToRelative(1.02f, -0.39f, 1.41f, 0f)
                lineToRelative(3.94f, 3.94f)
                curveToRelative(2.11f, -2.21f, 4.34f, -3.75f, 4.8f, -4.06f)
                curveToRelative(0.34f, -0.23f, 0.78f, -0.23f, 1.12f, 0f)
                curveToRelative(0.09f, 0.06f, 8.81f, 6.01f, 8.92f, 12.31f)
                curveToRelative(-0.05f, 1.69f, -0.64f, 3.39f, -1.66f, 4.91f)
                lineToRelative(2.9f, 2.9f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                close()
                moveTo(8.05f, 6.64f)
                lineTo(18.36f, 16.95f)
                curveToRelative(0.68f, -1.12f, 1.08f, -2.32f, 1.12f, -3.48f)
                curveToRelative(-0.07f, -3.91f, -4.99f, -8.39f, -7.48f, -10.24f)
                curveToRelative(-0.85f, 0.62f, -2.43f, 1.83f, -3.94f, 3.42f)
                close()
            }
        }.also { _TintSlash = it}
