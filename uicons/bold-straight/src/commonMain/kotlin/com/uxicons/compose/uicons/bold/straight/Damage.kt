package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Damage: ImageVector? = null

val Icons.Bs.Damage: ImageVector
    get() = _Damage ?: UXIcon(name = "Damage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                horizontalLineTo(3.5f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(3.5f, 3f)
                horizontalLineToRelative(2.22f)
                lineToRelative(3.1f, 6f)
                horizontalLineToRelative(3.3f)
                lineToRelative(2.07f, 3.73f)
                lineToRelative(2.62f, -1.46f)
                lineToRelative(-1.26f, -2.27f)
                horizontalLineToRelative(2.45f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-7.36f)
                lineToRelative(-1.55f, -3f)
                horizontalLineToRelative(11.4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(14.77f)
                lineToRelative(-4.03f, -3.41f)
                lineToRelative(-1.94f, 2.29f)
                lineToRelative(4.56f, 3.85f)
                horizontalLineTo(4.32f)
                lineToRelative(7.51f, -3.73f)
                lineToRelative(-1.33f, -2.69f)
                lineToRelative(-2.5f, 1.24f)
                lineToRelative(0.01f, -2.82f)
                lineToRelative(-3f, -0.01f)
                lineToRelative(-0.01f, 4.32f)
                lineToRelative(-1.99f, 0.99f)
                verticalLineTo(3.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                close()
            }
        }.also { _Damage = it}
