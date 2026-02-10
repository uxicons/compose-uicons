package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stars: ImageVector? = null

val Icons.Ss.Stars: ImageVector
    get() = _Stars ?: UXIcon(name = "Stars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4.98f, 24f)
                lineTo(3.66f, 23f)
                lineToRelative(2.39f, -7.26f)
                lineTo(0f, 11.73f)
                verticalLineTo(10f)
                horizontalLineTo(7.95f)
                lineToRelative(2.16f, -7f)
                horizontalLineToRelative(1.78f)
                lineToRelative(2.16f, 7f)
                horizontalLineTo(22f)
                verticalLineToRelative(1.72f)
                lineToRelative(-6.06f, 4.12f)
                lineToRelative(2.44f, 7.17f)
                lineToRelative(-1.39f, 0.96f)
                lineTo(11f, 19.35f)
                close()
                moveTo(17.83f, 7.93f)
                lineToRelative(-0.48f, -0.36f)
                lineToRelative(0.87f, -2.72f)
                lineTo(16f, 3.62f)
                verticalLineTo(3f)
                horizontalLineToRelative(2.9f)
                lineToRelative(0.79f, -3f)
                horizontalLineToRelative(0.65f)
                lineToRelative(0.78f, 3f)
                horizontalLineTo(24f)
                verticalLineToRelative(0.61f)
                lineTo(21.8f, 4.88f)
                lineToRelative(0.88f, 2.69f)
                lineToRelative(-0.5f, 0.35f)
                lineTo(20.01f, 6.24f)
                close()
            }
        }.also { _Stars = it}
