package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashSlash: ImageVector? = null

val Icons.Ss.TrashSlash: ImageVector
    get() = _TrashSlash ?: UXIcon(name = "TrashSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.86f, 23f)
                curveToRelative(-0.55f, 0.61f, -1.34f, 1f, -2.22f, 1f)
                lineTo(7.33f, 24f)
                curveToRelative(-1.53f, 0f, -2.81f, -1.15f, -2.98f, -2.67f)
                lineToRelative(-1.6f, -14.44f)
                lineToRelative(16.11f, 16.11f)
                close()
                moveTo(23.96f, 22.54f)
                lineToRelative(-1.41f, 1.41f)
                lineTo(0.04f, 1.46f)
                lineTo(1.46f, 0.04f)
                lineToRelative(3.96f, 3.96f)
                horizontalLineToRelative(1.59f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                horizontalLineToRelative(6f)
                curveToRelative(1.1f, 0f, 2f, 0.9f, 2f, 2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1.68f)
                lineToRelative(-1.39f, 12.51f)
                lineToRelative(4.03f, 4.03f)
                close()
                moveTo(9f, 4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _TrashSlash = it}
