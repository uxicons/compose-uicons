package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Floor: ImageVector? = null

val Icons.Ts.Floor: ImageVector
    get() = _Floor ?: UXIcon(name = "Floor") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.95f, 7.5f)
                lineTo(12f, 0.12f)
                lineTo(0.05f, 7.5f)
                lineToRelative(11.95f, 7.38f)
                lineToRelative(11.95f, -7.38f)
                close()
                moveTo(9.35f, 12.07f)
                lineToRelative(7.22f, -4.43f)
                lineToRelative(2.64f, 1.62f)
                lineToRelative(-7.21f, 4.45f)
                lineToRelative(-2.65f, -1.64f)
                close()
                moveTo(10.14f, 6.67f)
                lineToRelative(3.04f, 1.86f)
                lineToRelative(-4.79f, 2.94f)
                lineToRelative(-3.03f, -1.87f)
                lineToRelative(4.78f, -2.93f)
                close()
                moveTo(14.14f, 7.95f)
                lineToRelative(-3.04f, -1.86f)
                lineToRelative(4.35f, -2.67f)
                lineToRelative(3.03f, 1.87f)
                lineToRelative(-4.34f, 2.66f)
                close()
                moveTo(20.16f, 8.66f)
                lineToRelative(-2.63f, -1.62f)
                lineToRelative(1.9f, -1.17f)
                lineToRelative(2.62f, 1.62f)
                lineToRelative(-1.89f, 1.17f)
                close()
                moveTo(14.49f, 2.83f)
                lineToRelative(-7.11f, 4.37f)
                lineToRelative(-2.48f, -1.52f)
                lineTo(12f, 1.29f)
                lineToRelative(2.49f, 1.54f)
                close()
                moveTo(3.95f, 6.26f)
                lineToRelative(2.48f, 1.52f)
                lineToRelative(-2.01f, 1.24f)
                lineToRelative(-2.46f, -1.52f)
                lineToRelative(2.0f, -1.23f)
                close()
                moveTo(12f, 19.82f)
                lineToRelative(12f, -7.45f)
                verticalLineToRelative(1.18f)
                lineToRelative(-12f, 7.45f)
                lineTo(0f, 13.55f)
                verticalLineToRelative(-1.18f)
                lineToRelative(12f, 7.45f)
                close()
                moveTo(24f, 9.37f)
                verticalLineToRelative(1.18f)
                lineToRelative(-12f, 7.45f)
                lineTo(0f, 10.55f)
                verticalLineToRelative(-1.18f)
                lineToRelative(12f, 7.45f)
                lineToRelative(12f, -7.45f)
                close()
                moveTo(12f, 22.82f)
                lineToRelative(12f, -7.45f)
                verticalLineToRelative(1.18f)
                lineToRelative(-12f, 7.45f)
                lineTo(0f, 16.55f)
                verticalLineToRelative(-1.18f)
                lineToRelative(12f, 7.46f)
                close()
            }
        }.also { _Floor = it}
