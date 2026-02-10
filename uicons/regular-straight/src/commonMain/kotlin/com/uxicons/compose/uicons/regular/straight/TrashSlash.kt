package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashSlash: ImageVector? = null

val Icons.Rs.TrashSlash: ImageVector
    get() = _TrashSlash ?: UXIcon(name = "TrashSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.43f, 21.58f)
                lineToRelative(1.42f, 1.42f)
                curveToRelative(-0.55f, 0.61f, -1.34f, 1f, -2.22f, 1f)
                lineTo(7.33f, 24f)
                curveToRelative(-1.53f, 0f, -2.81f, -1.15f, -2.98f, -2.67f)
                lineToRelative(-1.6f, -14.44f)
                lineToRelative(2.26f, 2.26f)
                lineToRelative(1.33f, 11.96f)
                curveToRelative(0.06f, 0.51f, 0.48f, 0.89f, 0.99f, 0.89f)
                horizontalLineToRelative(9.3f)
                curveToRelative(0.33f, 0f, 0.62f, -0.17f, 0.8f, -0.42f)
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
                moveTo(7.41f, 6f)
                lineToRelative(10.7f, 10.7f)
                lineToRelative(1.19f, -10.7f)
                lineTo(7.41f, 6f)
                close()
            }
        }.also { _TrashSlash = it}
