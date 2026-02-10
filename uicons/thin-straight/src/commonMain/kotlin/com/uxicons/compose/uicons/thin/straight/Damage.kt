package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Damage: ImageVector? = null

val Icons.Ts.Damage: ImageVector
    get() = _Damage ?: UXIcon(name = "Damage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 0f)
                horizontalLineTo(2.5f)
                curveTo(1.12f, 0f, 0f, 1.12f, 0f, 2.5f)
                verticalLineToRelative(21.5f)
                horizontalLineToRelative(24f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 21.8f)
                lineToRelative(10.39f, -5.43f)
                lineToRelative(-0.46f, -0.89f)
                lineToRelative(-3.92f, 2.05f)
                verticalLineToRelative(-4.54f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(5.06f)
                lineToRelative(-5f, 2.62f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(4.83f)
                lineToRelative(3.1f, 6f)
                horizontalLineToRelative(3.28f)
                lineToRelative(2.36f, 4.24f)
                lineToRelative(0.87f, -0.48f)
                lineToRelative(-2.09f, -3.76f)
                horizontalLineToRelative(4.15f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7.96f)
                lineToRelative(-2.58f, -5f)
                horizontalLineToRelative(13.05f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(19.91f)
                lineToRelative(-6.67f, -5.78f)
                lineToRelative(-0.66f, 0.76f)
                lineToRelative(6.49f, 5.62f)
                horizontalLineTo(1f)
                verticalLineToRelative(-1.2f)
                close()
            }
        }.also { _Damage = it}
