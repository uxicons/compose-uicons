package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Floor: ImageVector? = null

val Icons.Bs.Floor: ImageVector
    get() = _Floor ?: UXIcon(name = "Floor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.44f, 13.55f)
                lineToRelative(2.58f, 1.84f)
                lineToRelative(-12.02f, 8.59f)
                lineTo(-0.02f, 15.39f)
                lineToRelative(2.58f, -1.84f)
                lineToRelative(9.44f, 6.75f)
                lineToRelative(9.44f, -6.75f)
                close()
                moveTo(12f, 17.34f)
                lineTo(-0.02f, 8.75f)
                lineTo(12f, 0.16f)
                lineToRelative(12.02f, 8.59f)
                lineToRelative(-12.02f, 8.59f)
                close()
                moveTo(14.69f, 8.01f)
                lineToRelative(2.61f, 1.86f)
                lineToRelative(1.56f, -1.12f)
                lineToRelative(-2.6f, -1.86f)
                lineToRelative(-1.58f, 1.12f)
                close()
                moveTo(8.38f, 6.43f)
                lineToRelative(2.54f, 1.8f)
                lineToRelative(3.62f, -2.58f)
                lineToRelative(-2.54f, -1.82f)
                lineToRelative(-3.62f, 2.59f)
                close()
                moveTo(9.19f, 9.46f)
                lineToRelative(-2.53f, -1.8f)
                lineToRelative(-1.52f, 1.09f)
                lineToRelative(2.52f, 1.8f)
                lineToRelative(1.53f, -1.09f)
                close()
                moveTo(9.38f, 11.78f)
                lineToRelative(2.62f, 1.87f)
                lineToRelative(3.58f, -2.56f)
                lineToRelative(-2.62f, -1.86f)
                lineToRelative(-3.58f, 2.54f)
                close()
            }
        }.also { _Floor = it}
