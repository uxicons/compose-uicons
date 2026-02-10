package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cubes: ImageVector? = null

val Icons.Ss.Cubes: ImageVector
    get() = _Cubes ?: UXIcon(name = "Cubes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 4.93f)
                lineToRelative(4.93f, -2.47f)
                lineToRelative(-4.93f, -2.46f)
                lineToRelative(-4.93f, 2.46f)
                lineToRelative(4.93f, 2.47f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(5f, 17.48f)
                lineToRelative(-5f, -2.49f)
                lineToRelative(0f, 6.12f)
                lineToRelative(5f, 2.87f)
                lineToRelative(0f, -6.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 23.98f)
                lineToRelative(5f, -2.87f)
                lineToRelative(0f, -6.12f)
                lineToRelative(-5f, 2.49f)
                lineToRelative(0f, 6.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 12.09f)
                lineToRelative(0f, -5.5f)
                lineToRelative(-5f, -2.49f)
                lineToRelative(0f, 5.42f)
                lineToRelative(5f, 2.57f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.89f, 11.2f)
                lineToRelative(-4.01f, 2.01f)
                lineToRelative(5.12f, 2.52f)
                lineToRelative(3.89f, -1.96f)
                lineToRelative(-5f, -2.57f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(18f, 9.52f)
                lineToRelative(0f, -5.42f)
                lineToRelative(-5f, 2.49f)
                lineToRelative(0f, 5.49f)
                lineToRelative(5f, -2.56f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.11f, 11.2f)
                lineToRelative(-5.01f, 2.57f)
                lineToRelative(3.9f, 1.96f)
                lineToRelative(5.12f, -2.52f)
                lineToRelative(-4.01f, -2.01f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 15.48f)
                lineToRelative(-4f, 1.95f)
                lineToRelative(0f, 6.5f)
                lineToRelative(4f, -2.25f)
                lineToRelative(0f, -6.2f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 15.47f)
                lineToRelative(0f, 6.2f)
                lineToRelative(4f, 2.24f)
                lineToRelative(0f, -6.5f)
                lineToRelative(-4f, -1.94f)
                close()
            }
        }.also { _Cubes = it}
