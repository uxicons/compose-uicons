package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CupStraw: ImageVector? = null

val Icons.Ss.CupStraw: ImageVector
    get() = _CupStraw ?: UXIcon(name = "CupStraw") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 5f)
                horizontalLineToRelative(-8.49f)
                lineToRelative(0.38f, -3f)
                horizontalLineToRelative(5.12f)
                verticalLineTo(0f)
                horizontalLineToRelative(-6.88f)
                lineToRelative(-0.63f, 5f)
                horizontalLineTo(1f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.61f)
                lineToRelative(1.7f, 14.35f)
                curveToRelative(0.18f, 1.51f, 1.46f, 2.65f, 2.98f, 2.65f)
                horizontalLineToRelative(9.43f)
                curveToRelative(1.52f, 0f, 2.8f, -1.14f, 2.98f, -2.65f)
                lineToRelative(1.7f, -14.35f)
                horizontalLineToRelative(1.61f)
                verticalLineToRelative(-2f)
                close()
            }
        }.also { _CupStraw = it}
