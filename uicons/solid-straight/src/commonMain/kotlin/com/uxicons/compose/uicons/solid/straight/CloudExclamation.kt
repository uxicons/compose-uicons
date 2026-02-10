package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CloudExclamation: ImageVector? = null

val Icons.Ss.CloudExclamation: ImageVector
    get() = _CloudExclamation ?: UXIcon(name = "CloudExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.8f, 7.2f)
                curveToRelative(-0.82f, -3.58f, -4.05f, -6.2f, -7.8f, -6.2f)
                curveTo(5.59f, 1f, 2f, 4.59f, 2f, 9f)
                curveToRelative(0f, 1.29f, 0.3f, 2.54f, 0.88f, 3.66f)
                curveToRelative(-1.75f, 0.94f, -2.88f, 2.79f, -2.88f, 4.84f)
                curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
                horizontalLineToRelative(10.5f)
                curveToRelative(4.41f, 0f, 8f, -3.59f, 8f, -8f)
                curveToRelative(0f, -3.74f, -2.62f, -6.97f, -6.2f, -7.8f)
                close()
                moveTo(13f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 16f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _CloudExclamation = it}
