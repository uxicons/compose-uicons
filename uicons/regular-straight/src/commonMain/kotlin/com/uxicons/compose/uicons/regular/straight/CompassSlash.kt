package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassSlash: ImageVector? = null

val Icons.Rs.CompassSlash: ImageVector
    get() = _CompassSlash ?: UXIcon(name = "CompassSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                curveToRelative(-2.86f, 0f, -5.58f, 1.0f, -7.75f, 2.84f)
                lineTo(1.46f, 0.04f)
                lineTo(0.04f, 1.46f)
                lineToRelative(22.5f, 22.5f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(-2.79f, -2.79f)
                curveToRelative(1.83f, -2.17f, 2.84f, -4.89f, 2.84f, -7.75f)
                close()
                moveTo(13.45f, 12.04f)
                lineToRelative(-1.3f, -1.3f)
                lineToRelative(2.27f, -1.07f)
                lineToRelative(-0.97f, 2.37f)
                close()
                moveTo(14.98f, 13.57f)
                lineToRelative(3.25f, -7.9f)
                lineToRelative(-7.58f, 3.57f)
                lineToRelative(-4.98f, -4.98f)
                curveToRelative(1.78f, -1.46f, 4.0f, -2.26f, 6.33f, -2.26f)
                curveToRelative(5.51f, 0f, 10f, 4.49f, 10f, 10f)
                curveToRelative(0f, 2.33f, -0.8f, 4.55f, -2.26f, 6.33f)
                lineToRelative(-4.76f, -4.76f)
                close()
                moveTo(16.62f, 20.86f)
                lineToRelative(1.47f, 1.47f)
                curveToRelative(-1.82f, 1.08f, -3.9f, 1.67f, -6.09f, 1.67f)
                curveTo(5.38f, 24f, 0f, 18.62f, 0f, 12f)
                curveToRelative(0f, -2.19f, 0.58f, -4.27f, 1.67f, -6.09f)
                lineToRelative(1.47f, 1.47f)
                curveToRelative(-0.74f, 1.41f, -1.14f, 2.98f, -1.14f, 4.62f)
                curveToRelative(0f, 5.51f, 4.49f, 10f, 10f, 10f)
                curveToRelative(1.64f, 0f, 3.21f, -0.4f, 4.62f, -1.14f)
                close()
                moveTo(8.26f, 12.5f)
                lineToRelative(3.31f, 3.31f)
                lineToRelative(-5.8f, 2.39f)
                lineToRelative(2.49f, -5.7f)
                close()
            }
        }.also { _CompassSlash = it}
