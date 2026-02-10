package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cube: ImageVector? = null

val Icons.Ss.Cube: ImageVector
    get() = _Cube ?: UXIcon(name = "Cube") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.0f, 11.04f)
                lineToRelative(9.75f, -5.46f)
                lineToRelative(-9.76f, -5.58f)
                lineToRelative(-9.72f, 5.56f)
                lineToRelative(9.73f, 5.48f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 12.77f)
                lineToRelative(0f, 11.23f)
                lineToRelative(0.03f, 0f)
                lineToRelative(9.73f, -5.56f)
                lineToRelative(0f, -11.13f)
                lineToRelative(-9.76f, 5.46f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 12.77f)
                lineToRelative(-9.76f, -5.5f)
                lineToRelative(0f, 11.17f)
                lineToRelative(9.73f, 5.56f)
                lineToRelative(0.03f, 0f)
                lineToRelative(0f, -11.23f)
                close()
            }
        }.also { _Cube = it}
