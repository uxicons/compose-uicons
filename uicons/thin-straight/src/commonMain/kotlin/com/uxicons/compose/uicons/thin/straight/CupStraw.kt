package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupStraw: ImageVector? = null

val Icons.Ts.CupStraw: ImageVector
    get() = _CupStraw ?: UXIcon(name = "CupStraw") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 5f)
                horizontalLineToRelative(-9.38f)
                lineToRelative(0.5f, -4f)
                horizontalLineToRelative(5.88f)
                lineTo(20f, 0f)
                horizontalLineToRelative(-6.88f)
                lineToRelative(-0.63f, 5f)
                lineTo(1f, 5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1.56f)
                lineToRelative(1.86f, 15.79f)
                curveToRelative(0.15f, 1.26f, 1.22f, 2.21f, 2.48f, 2.21f)
                horizontalLineToRelative(10.2f)
                curveToRelative(1.27f, 0f, 2.33f, -0.95f, 2.48f, -2.21f)
                lineToRelative(1.86f, -15.79f)
                horizontalLineToRelative(1.56f)
                verticalLineToRelative(-1f)
                close()
                moveTo(18.59f, 21.68f)
                curveToRelative(-0.09f, 0.75f, -0.73f, 1.32f, -1.49f, 1.32f)
                lineTo(6.9f, 23f)
                curveToRelative(-0.76f, 0f, -1.4f, -0.57f, -1.49f, -1.32f)
                lineToRelative(-1.85f, -15.68f)
                horizontalLineToRelative(16.88f)
                lineToRelative(-1.85f, 15.68f)
                close()
            }
        }.also { _CupStraw = it}
