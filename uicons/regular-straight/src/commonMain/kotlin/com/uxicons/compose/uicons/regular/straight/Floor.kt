package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Floor: ImageVector? = null

val Icons.Rs.Floor: ImageVector
    get() = _Floor ?: UXIcon(name = "Floor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.02f, 7.5f)
                lineTo(12f, 0.07f)
                lineTo(-0.02f, 7.5f)
                lineToRelative(12.02f, 7.42f)
                lineToRelative(12.02f, -7.42f)
                close()
                moveTo(8.79f, 10.59f)
                lineToRelative(4.24f, -2.6f)
                lineToRelative(3.2f, 1.97f)
                lineToRelative(-4.23f, 2.61f)
                lineToRelative(-3.21f, -1.98f)
                close()
                moveTo(18.14f, 8.78f)
                lineToRelative(-3.2f, -1.96f)
                lineToRelative(2.09f, -1.28f)
                lineToRelative(3.18f, 1.97f)
                lineToRelative(-2.07f, 1.28f)
                close()
                moveTo(15.12f, 4.35f)
                lineToRelative(-4.28f, 2.63f)
                lineToRelative(-3.12f, -1.92f)
                lineToRelative(4.28f, -2.64f)
                lineToRelative(3.12f, 1.93f)
                close()
                moveTo(5.82f, 6.25f)
                lineToRelative(3.11f, 1.91f)
                lineToRelative(-2.04f, 1.25f)
                lineToRelative(-3.1f, -1.91f)
                lineToRelative(2.02f, -1.25f)
                close()
                moveTo(12.0f, 17.07f)
                lineToRelative(12f, -7.41f)
                verticalLineToRelative(2.35f)
                lineToRelative(-12f, 7.41f)
                lineTo(0f, 12.01f)
                verticalLineToRelative(-2.35f)
                lineToRelative(12f, 7.41f)
                close()
                moveTo(12.0f, 21.57f)
                lineToRelative(12f, -7.41f)
                verticalLineToRelative(2.35f)
                lineToRelative(-12f, 7.41f)
                lineTo(0f, 16.51f)
                verticalLineToRelative(-2.35f)
                lineToRelative(12f, 7.41f)
                close()
            }
        }.also { _Floor = it}
