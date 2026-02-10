package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarExclamation: ImageVector? = null

val Icons.Rs.StarExclamation: ImageVector
    get() = _StarExclamation ?: UXIcon(name = "StarExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11f, 11f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                close()
                moveTo(11f, 22f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                close()
                moveTo(24.06f, 10.26f)
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
                lineToRelative(3.16f, -2.32f)
                verticalLineToRelative(-2.48f)
                lineToRelative(-2.47f, 1.82f)
                lineToRelative(2.12f, -6.57f)
                lineToRelative(-5.56f, -4.06f)
                horizontalLineToRelative(6.86f)
                lineToRelative(2.11f, -6.56f)
                lineToRelative(2.11f, 6.56f)
                horizontalLineToRelative(6.86f)
                lineToRelative(-5.56f, 4.06f)
                lineToRelative(2.12f, 6.57f)
                lineToRelative(-2.6f, -1.91f)
                verticalLineToRelative(2.48f)
                lineToRelative(3.28f, 2.41f)
                curveToRelative(0.98f, -0.71f, 0.95f, -0.68f, 1.93f, -1.39f)
                lineToRelative(-2.39f, -7.4f)
                lineToRelative(6.24f, -4.56f)
                close()
            }
        }.also { _StarExclamation = it}
