package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Snowflakes: ImageVector? = null

val Icons.Bs.Snowflakes: ImageVector
    get() = _Snowflakes ?: UXIcon(name = "Snowflakes") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.14f, 15.08f)
                lineTo(17f, 15f)
                verticalLineToRelative(3f)
                horizontalLineTo(11.25f)
                lineToRelative(2.81f, 4.42f)
                lineTo(11.51f, 24f)
                lineTo(8.5f, 19.26f)
                lineTo(5.5f, 24f)
                lineToRelative(-2.55f, -1.58f)
                lineTo(5.75f, 18f)
                horizontalLineTo(0f)
                verticalLineTo(15f)
                horizontalLineTo(5.86f)
                lineTo(2.94f, 10.29f)
                lineTo(5.5f, 8.71f)
                lineTo(8.5f, 13.56f)
                lineToRelative(3.0f, -4.85f)
                lineToRelative(2.55f, 1.58f)
                close()
                moveTo(24f, 4f)
                horizontalLineTo(21.59f)
                lineToRelative(1.23f, -2.09f)
                lineTo(20.22f, 0.39f)
                lineTo(19f, 2.48f)
                lineTo(17.78f, 0.39f)
                lineTo(15.19f, 1.91f)
                lineTo(16.41f, 4f)
                horizontalLineTo(14f)
                verticalLineTo(7f)
                horizontalLineToRelative(2.35f)
                lineTo(15.19f, 8.98f)
                lineTo(17.78f, 10.5f)
                lineTo(19f, 8.41f)
                lineTo(20.22f, 10.5f)
                lineToRelative(2.59f, -1.52f)
                lineTo(21.65f, 7f)
                horizontalLineTo(24f)
                close()
            }
        }.also { _Snowflakes = it}
