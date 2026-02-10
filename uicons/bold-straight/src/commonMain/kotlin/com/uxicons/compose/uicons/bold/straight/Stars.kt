package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Stars: ImageVector? = null

val Icons.Bs.Stars: ImageVector
    get() = _Stars ?: UXIcon(name = "Stars") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.29f, 24.04f)
                lineTo(3.37f, 22.59f)
                lineToRelative(2.26f, -6.51f)
                lineTo(0f, 12.51f)
                verticalLineTo(10f)
                horizontalLineTo(7.68f)
                lineTo(9.73f, 3f)
                horizontalLineTo(12.27f)
                lineToRelative(2.05f, 7f)
                horizontalLineTo(22f)
                verticalLineToRelative(2.5f)
                lineToRelative(-5.62f, 3.67f)
                lineToRelative(2.31f, 6.45f)
                lineToRelative(-2.01f, 1.39f)
                lineTo(11f, 19.63f)
                close()
                moveTo(6.37f, 13f)
                lineToRelative(2.87f, 1.82f)
                lineTo(8.11f, 18.07f)
                lineTo(11f, 15.83f)
                lineToRelative(2.86f, 2.21f)
                lineToRelative(-1.1f, -3.09f)
                lineTo(15.74f, 13f)
                horizontalLineTo(12.08f)
                lineTo(11f, 9.33f)
                lineTo(9.92f, 13f)
                close()
                moveTo(17.83f, 7.94f)
                lineToRelative(-0.48f, -0.36f)
                lineToRelative(0.87f, -2.72f)
                lineTo(16f, 3.63f)
                verticalLineTo(3f)
                horizontalLineToRelative(2.9f)
                lineToRelative(0.79f, -3f)
                horizontalLineToRelative(0.65f)
                lineToRelative(0.78f, 3f)
                horizontalLineTo(24f)
                verticalLineToRelative(0.62f)
                lineTo(21.8f, 4.9f)
                lineToRelative(0.88f, 2.69f)
                lineToRelative(-0.5f, 0.35f)
                lineTo(20.01f, 6.25f)
                close()
            }
        }.also { _Stars = it}
