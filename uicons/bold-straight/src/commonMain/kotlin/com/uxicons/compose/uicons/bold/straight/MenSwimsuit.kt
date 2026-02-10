package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MenSwimsuit: ImageVector? = null

val Icons.Bs.MenSwimsuit: ImageVector
    get() = _MenSwimsuit ?: UXIcon(name = "MenSwimsuit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 3f)
                verticalLineToRelative(8.59f)
                lineToRelative(8.09f, 8.63f)
                curveToRelative(0.62f, 0.29f, 1.35f, 0.73f, 3.91f, 0.78f)
                curveToRelative(2.56f, -0.05f, 3.29f, -0.49f, 3.91f, -0.78f)
                lineToRelative(8.09f, -8.63f)
                verticalLineToRelative(-8.59f)
                close()
                moveTo(21f, 9.61f)
                curveToRelative(-1.1f, 0.15f, -2.11f, 0.46f, -3f, 0.93f)
                verticalLineToRelative(-4.54f)
                horizontalLineToRelative(3f)
                close()
                moveTo(6f, 6f)
                verticalLineToRelative(4.54f)
                curveToRelative(-0.89f, -0.47f, -1.9f, -0.78f, -3f, -0.93f)
                verticalLineToRelative(-3.61f)
                close()
                moveTo(10.45f, 17.86f)
                curveToRelative(-0.15f, -1.75f, -0.65f, -3.29f, -1.45f, -4.54f)
                verticalLineToRelative(-7.32f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(7.32f)
                curveToRelative(-0.8f, 1.26f, -1.3f, 2.79f, -1.45f, 4.54f)
                curveToRelative(-0.38f, 0.07f, -0.89f, 0.14f, -1.55f, 0.14f)
                reflectiveCurveToRelative(-1.17f, -0.07f, -1.55f, -0.14f)
                close()
            }
        }.also { _MenSwimsuit = it}
