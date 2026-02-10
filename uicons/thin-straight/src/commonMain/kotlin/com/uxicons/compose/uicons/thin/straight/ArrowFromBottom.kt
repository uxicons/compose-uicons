package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowFromBottom: ImageVector? = null

val Icons.Ts.ArrowFromBottom: ImageVector
    get() = _ArrowFromBottom ?: UXIcon(name = "ArrowFromBottom") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 23f)
                verticalLineToRelative(1f)
                horizontalLineTo(5f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(6.5f)
                verticalLineTo(1.16f)
                curveToRelative(-0.07f, 0.04f, -0.15f, 0.08f, -0.21f, 0.14f)
                lineToRelative(-4.95f, 4.95f)
                lineToRelative(-0.71f, -0.71f)
                lineTo(10.59f, 0.59f)
                curveToRelative(0.76f, -0.76f, 2.07f, -0.76f, 2.83f, 0f)
                lineToRelative(4.95f, 4.95f)
                lineToRelative(-0.71f, 0.71f)
                lineTo(12.71f, 1.29f)
                curveToRelative(-0.06f, -0.06f, -0.14f, -0.1f, -0.21f, -0.14f)
                verticalLineToRelative(21.84f)
                horizontalLineToRelative(6.5f)
                close()
            }
        }.also { _ArrowFromBottom = it}
