package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CompassSlash: ImageVector? = null

val Icons.Bs.CompassSlash: ImageVector
    get() = _CompassSlash ?: UXIcon(name = "CompassSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.1f, 14.43f)
                lineToRelative(1.47f, 1.47f)
                lineToRelative(-2.57f, 1.1f)
                lineToRelative(1.1f, -2.57f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                curveToRelative(0f, -0.81f, 0.12f, -1.6f, 0.32f, -2.36f)
                lineTo(0.96f, 7.29f)
                curveToRelative(-0.63f, 1.47f, -0.96f, 3.06f, -0.96f, 4.71f)
                curveToRelative(0f, 6.62f, 5.38f, 12f, 12f, 12f)
                curveToRelative(1.65f, 0f, 3.24f, -0.34f, 4.71f, -0.96f)
                lineToRelative(-2.35f, -2.35f)
                curveToRelative(-0.76f, 0.2f, -1.55f, 0.32f, -2.36f, 0.32f)
                close()
                moveTo(21.48f, 19.36f)
                lineToRelative(2.48f, 2.48f)
                lineToRelative(-2.12f, 2.12f)
                lineTo(0.04f, 2.16f)
                lineTo(2.16f, 0.04f)
                lineToRelative(2.48f, 2.48f)
                curveTo(6.74f, 0.89f, 9.3f, 0f, 12f, 0f)
                curveToRelative(6.62f, 0f, 12f, 5.38f, 12f, 12f)
                curveToRelative(0f, 2.7f, -0.89f, 5.26f, -2.52f, 7.36f)
                close()
                moveTo(6.78f, 4.66f)
                lineToRelative(4.7f, 4.7f)
                lineToRelative(5.51f, -2.36f)
                lineToRelative(-2.36f, 5.51f)
                lineToRelative(4.7f, 4.7f)
                curveToRelative(1.08f, -1.51f, 1.66f, -3.32f, 1.66f, -5.22f)
                curveToRelative(0f, -4.96f, -4.04f, -9f, -9f, -9f)
                curveToRelative(-1.89f, 0f, -3.7f, 0.58f, -5.22f, 1.66f)
                close()
            }
        }.also { _CompassSlash = it}
