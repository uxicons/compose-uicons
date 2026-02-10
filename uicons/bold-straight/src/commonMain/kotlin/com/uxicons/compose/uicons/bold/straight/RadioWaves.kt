package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RadioWaves: ImageVector? = null

val Icons.Bs.RadioWaves: ImageVector
    get() = _RadioWaves ?: UXIcon(name = "RadioWaves") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16.84f, 10f)
                curveTo(15.77f, 2.84f, 14.37f, 0f, 12f, 0f)
                reflectiveCurveToRelative(-3.77f, 2.84f, -4.84f, 10f)
                lineTo(0f, 10f)
                verticalLineToRelative(3f)
                lineTo(24f, 13f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7.16f)
                close()
                moveTo(12f, 3.2f)
                curveToRelative(0.37f, 0.55f, 1.08f, 2.15f, 1.81f, 6.8f)
                horizontalLineToRelative(-3.62f)
                curveToRelative(0.73f, -4.65f, 1.44f, -6.26f, 1.81f, -6.8f)
                close()
                moveTo(20.73f, 15f)
                horizontalLineToRelative(3.02f)
                curveToRelative(-0.44f, 4.17f, -1.63f, 9f, -4.74f, 9f)
                curveToRelative(-2.66f, 0f, -3.69f, -3.61f, -4.49f, -9f)
                horizontalLineToRelative(3.04f)
                curveToRelative(0.37f, 2.31f, 0.89f, 4.97f, 1.51f, 5.85f)
                curveToRelative(0.47f, -0.57f, 1.26f, -2.39f, 1.67f, -5.85f)
                close()
                moveTo(6.45f, 15f)
                horizontalLineToRelative(3.04f)
                curveToRelative(-0.8f, 5.39f, -1.83f, 9f, -4.49f, 9f)
                curveTo(1.88f, 24f, 0.7f, 19.17f, 0.26f, 15f)
                lineTo(3.27f, 15f)
                curveToRelative(0.41f, 3.46f, 1.2f, 5.29f, 1.67f, 5.85f)
                curveToRelative(0.62f, -0.88f, 1.14f, -3.54f, 1.51f, -5.85f)
                close()
            }
        }.also { _RadioWaves = it}
