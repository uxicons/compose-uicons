package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarExclamation: ImageVector? = null

val Icons.Bs.StarExclamation: ImageVector
    get() = _StarExclamation ?: UXIcon(name = "StarExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.5f, 11f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-6f)
                close()
                moveTo(10.5f, 22f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(24f, 11.42f)
                lineToRelative(-1f, -4.47f)
                horizontalLineToRelative(-6.73f)
                lineTo(14.05f, 0f)
                horizontalLineToRelative(-4.09f)
                lineToRelative(-2.23f, 6.96f)
                lineTo(1f, 6.96f)
                lineToRelative(-1f, 4.47f)
                lineToRelative(5.1f, 3.73f)
                lineToRelative(-2.53f, 7.86f)
                lineToRelative(4.33f, 0.98f)
                lineToRelative(2.11f, -1.56f)
                verticalLineToRelative(-3.73f)
                lineToRelative(-2.49f, 1.83f)
                lineToRelative(2.1f, -6.53f)
                lineToRelative(-5.52f, -4.01f)
                horizontalLineToRelative(6.82f)
                lineToRelative(2.08f, -6.55f)
                lineToRelative(2.08f, 6.55f)
                horizontalLineToRelative(6.82f)
                lineToRelative(-5.52f, 4.01f)
                lineToRelative(2.1f, 6.53f)
                lineToRelative(-2.49f, -1.83f)
                verticalLineToRelative(3.73f)
                lineToRelative(2.11f, 1.56f)
                lineToRelative(4.32f, -0.99f)
                lineToRelative(-2.53f, -7.86f)
                lineToRelative(5.1f, -3.73f)
                close()
            }
        }.also { _StarExclamation = it}
