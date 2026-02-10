package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Loading: ImageVector? = null

val Icons.Bs.Loading: ImageVector
    get() = _Loading ?: UXIcon(name = "Loading") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.5f, 4f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(13.5f, 20f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(3f)
                close()
                moveTo(4f, 10.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(24f, 10.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(4f)
                close()
                moveTo(23.13f, 16.73f)
                lineTo(19.67f, 14.72f)
                lineTo(18.16f, 17.32f)
                lineTo(21.62f, 19.33f)
                close()
                moveTo(19.33f, 2.38f)
                lineTo(16.73f, 0.87f)
                lineTo(14.72f, 4.33f)
                lineTo(17.31f, 5.84f)
                close()
                moveTo(23.14f, 7.25f)
                lineTo(21.63f, 4.66f)
                lineTo(18.17f, 6.68f)
                lineTo(19.68f, 9.27f)
                close()
                moveTo(19.35f, 21.61f)
                lineTo(17.34f, 18.16f)
                lineTo(14.74f, 19.67f)
                lineTo(16.76f, 23.12f)
                close()
                moveTo(5.86f, 17.31f)
                lineTo(4.35f, 14.72f)
                lineTo(0.89f, 16.73f)
                lineTo(2.4f, 19.33f)
                close()
                moveTo(9.3f, 4.33f)
                lineTo(7.29f, 0.87f)
                lineTo(4.69f, 2.38f)
                lineTo(6.7f, 5.84f)
                close()
                moveTo(5.85f, 6.68f)
                lineTo(2.39f, 4.66f)
                lineTo(0.88f, 7.25f)
                lineTo(4.34f, 9.27f)
                close()
                moveTo(9.27f, 19.67f)
                lineTo(6.68f, 18.16f)
                lineTo(4.67f, 21.61f)
                lineTo(7.26f, 23.12f)
                close()
            }
        }.also { _Loading = it}
