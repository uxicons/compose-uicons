package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drink: ImageVector? = null

val Icons.Ts.Drink: ImageVector
    get() = _Drink ?: UXIcon(name = "Drink") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 0f)
                verticalLineTo(0.5f)
                curveToRelative(0f, 1.47f, 0.62f, 2.88f, 1.71f, 3.87f)
                lineTo(11.5f, 13.27f)
                verticalLineToRelative(9.73f)
                horizontalLineTo(6f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-5.5f)
                verticalLineTo(13.27f)
                lineTo(22.29f, 4.37f)
                curveToRelative(1.09f, -0.99f, 1.71f, -2.4f, 1.71f, -3.87f)
                verticalLineTo(0f)
                horizontalLineTo(0f)
                close()
                moveTo(21.62f, 3.63f)
                lineTo(12f, 12.37f)
                lineTo(2.79f, 4f)
                horizontalLineToRelative(15.71f)
                lineToRelative(1f, -1f)
                horizontalLineTo(1.82f)
                curveToRelative(-0.43f, -0.59f, -0.7f, -1.28f, -0.79f, -2f)
                horizontalLineTo(22.97f)
                curveToRelative(-0.12f, 1.0f, -0.6f, 1.94f, -1.35f, 2.63f)
                close()
            }
        }.also { _Drink = it}
