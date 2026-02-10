package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TrashPlus: ImageVector? = null

val Icons.Rs.TrashPlus: ImageVector
    get() = _TrashPlus ?: UXIcon(name = "TrashPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 4f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                lineTo(1f, 4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1.64f)
                lineToRelative(1.7f, 15.33f)
                curveToRelative(0.17f, 1.52f, 1.45f, 2.67f, 2.98f, 2.67f)
                horizontalLineToRelative(9.3f)
                curveToRelative(1.53f, 0f, 2.81f, -1.15f, 2.98f, -2.67f)
                lineToRelative(1.7f, -15.33f)
                horizontalLineToRelative(1.68f)
                verticalLineToRelative(-2f)
                close()
                moveTo(9f, 2f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(-2f)
                close()
                moveTo(17.63f, 21.11f)
                curveToRelative(-0.06f, 0.51f, -0.48f, 0.89f, -0.99f, 0.89f)
                lineTo(7.33f, 22f)
                curveToRelative(-0.51f, 0f, -0.94f, -0.38f, -0.99f, -0.89f)
                lineToRelative(-1.68f, -15.11f)
                horizontalLineToRelative(14.65f)
                lineToRelative(-1.68f, 15.11f)
                close()
                moveTo(11f, 15f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _TrashPlus = it}
