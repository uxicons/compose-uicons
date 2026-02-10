package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarExclamation: ImageVector? = null

val Icons.Ss.StarExclamation: ImageVector
    get() = _StarExclamation ?: UXIcon(name = "StarExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.06f, 10.26f)
                curveToRelative(-0.38f, -1.15f, -0.36f, -1.11f, -0.74f, -2.26f)
                horizontalLineToRelative(-7.7f)
                lineTo(13.25f, 0.6f)
                horizontalLineToRelative(-2.38f)
                lineToRelative(-2.37f, 7.4f)
                lineTo(0.8f, 8f)
                curveToRelative(-0.38f, 1.15f, -0.36f, 1.11f, -0.74f, 2.26f)
                lineToRelative(6.24f, 4.56f)
                lineToRelative(-2.39f, 7.4f)
                curveToRelative(0.98f, 0.71f, 0.95f, 0.68f, 1.93f, 1.39f)
                lineToRelative(6.16f, -4.62f)
                lineToRelative(6.28f, 4.62f)
                curveToRelative(0.98f, -0.71f, 0.95f, -0.68f, 1.93f, -1.39f)
                lineToRelative(-2.39f, -7.4f)
                lineToRelative(6.24f, -4.56f)
                close()
                moveTo(13f, 17f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(13f, 13f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                close()
            }
        }.also { _StarExclamation = it}
