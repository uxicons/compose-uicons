package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupStraw: ImageVector? = null

val Icons.Bs.CupStraw: ImageVector
    get() = _CupStraw ?: UXIcon(name = "CupStraw") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 5f)
                horizontalLineToRelative(-7.95f)
                lineToRelative(0.27f, -2f)
                horizontalLineToRelative(4.68f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-7.32f)
                lineToRelative(-0.66f, 5f)
                lineTo(1f, 5f)
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
                moveTo(17.33f, 20.56f)
                curveToRelative(-0.03f, 0.25f, -0.24f, 0.44f, -0.5f, 0.44f)
                lineTo(7.17f, 21f)
                curveToRelative(-0.25f, 0f, -0.47f, -0.19f, -0.5f, -0.44f)
                lineToRelative(-1.48f, -12.56f)
                horizontalLineToRelative(13.63f)
                lineToRelative(-1.48f, 12.56f)
                close()
            }
        }.also { _CupStraw = it}
