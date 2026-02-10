package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupStrawSwoosh: ImageVector? = null

val Icons.Bs.CupStrawSwoosh: ImageVector
    get() = _CupStrawSwoosh ?: UXIcon(name = "CupStrawSwoosh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 5f)
                horizontalLineToRelative(-7.95f)
                lineToRelative(0.27f, -2f)
                horizontalLineToRelative(4.68f)
                lineTo(20.0f, 0f)
                horizontalLineToRelative(-7.32f)
                lineToRelative(-0.66f, 5f)
                lineTo(1.0f, 5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1.17f)
                lineToRelative(1.52f, 12.91f)
                curveToRelative(0.21f, 1.76f, 1.7f, 3.09f, 3.48f, 3.09f)
                horizontalLineToRelative(9.67f)
                curveToRelative(1.77f, 0f, 3.27f, -1.33f, 3.48f, -3.09f)
                lineToRelative(1.52f, -12.91f)
                horizontalLineToRelative(1.17f)
                verticalLineToRelative(-3f)
                close()
                moveTo(16.83f, 21f)
                lineTo(7.17f, 21f)
                curveToRelative(-0.25f, 0f, -0.47f, -0.19f, -0.5f, -0.44f)
                lineToRelative(-0.52f, -4.39f)
                curveToRelative(0.84f, -0.54f, 2.02f, -1.16f, 2.85f, -1.16f)
                curveToRelative(0.65f, 0f, 1.46f, 0.41f, 2.33f, 0.84f)
                curveToRelative(1.09f, 0.54f, 2.32f, 1.16f, 3.67f, 1.16f)
                curveToRelative(0.96f, 0f, 1.96f, -0.33f, 2.83f, -0.73f)
                lineToRelative(-0.51f, 4.29f)
                curveToRelative(-0.03f, 0.25f, -0.24f, 0.44f, -0.5f, 0.44f)
                close()
                moveTo(18.27f, 12.55f)
                curveToRelative(-0.81f, 0.58f, -2.29f, 1.45f, -3.27f, 1.45f)
                curveToRelative(-0.65f, 0f, -1.46f, -0.41f, -2.33f, -0.84f)
                curveToRelative(-1.09f, -0.54f, -2.32f, -1.16f, -3.67f, -1.16f)
                curveToRelative(-1.11f, 0f, -2.27f, 0.43f, -3.23f, 0.93f)
                lineToRelative(-0.58f, -4.93f)
                horizontalLineToRelative(13.62f)
                lineToRelative(-0.54f, 4.55f)
                close()
            }
        }.also { _CupStrawSwoosh = it}
