package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stars: ImageVector? = null

val Icons.Rs.Stars: ImageVector
    get() = _Stars ?: UXIcon(name = "Stars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.98f, 24f)
                lineTo(3.66f, 23f)
                lineToRelative(2.39f, -7.26f)
                lineTo(0f, 11.73f)
                lineTo(0f, 10f)
                lineTo(7.95f, 10f)
                lineToRelative(2.16f, -7f)
                horizontalLineToRelative(1.78f)
                lineToRelative(2.16f, 7f)
                lineTo(22f, 10f)
                verticalLineToRelative(1.72f)
                lineToRelative(-6.06f, 4.12f)
                lineToRelative(2.44f, 7.17f)
                lineToRelative(-1.39f, 0.96f)
                lineTo(11f, 19.35f)
                close()
                moveTo(11f, 16.82f)
                lineToRelative(4.29f, 3.32f)
                lineToRelative(-1.73f, -5.09f)
                lineTo(18.04f, 12f)
                horizontalLineToRelative(-5.46f)
                lineTo(11f, 6.89f)
                lineTo(9.42f, 12f)
                lineTo(4.03f, 12f)
                lineToRelative(4.4f, 2.92f)
                lineTo(6.71f, 20.14f)
                close()
                moveTo(17.83f, 7.93f)
                lineTo(17.35f, 7.56f)
                lineTo(18.21f, 4.85f)
                lineTo(16f, 3.62f)
                lineTo(16f, 3f)
                horizontalLineToRelative(2.9f)
                lineToRelative(0.79f, -3f)
                horizontalLineToRelative(0.65f)
                lineToRelative(0.78f, 3f)
                lineTo(24f, 3f)
                verticalLineToRelative(0.61f)
                lineTo(21.8f, 4.88f)
                lineToRelative(0.88f, 2.69f)
                lineToRelative(-0.5f, 0.35f)
                lineTo(20.01f, 6.24f)
                close()
            }
        }.also { _Stars = it}
