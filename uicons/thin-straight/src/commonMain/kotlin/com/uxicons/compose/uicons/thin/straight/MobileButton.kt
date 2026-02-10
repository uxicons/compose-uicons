package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileButton: ImageVector? = null

val Icons.Ts.MobileButton: ImageVector
    get() = _MobileButton ?: UXIcon(name = "MobileButton") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 24f)
                horizontalLineTo(6.5f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineTo(0f)
                horizontalLineTo(20f)
                verticalLineTo(21.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                close()
                moveTo(5f, 1f)
                verticalLineTo(21.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(11f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineTo(1f)
                horizontalLineTo(5f)
                close()
                moveTo(14f, 20f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _MobileButton = it}
