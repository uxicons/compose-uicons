package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Ts5: ImageVector? = null

val Icons.Ts.Ts5: ImageVector
    get() = _Ts5 ?: UXIcon(name = "Ts5") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12.5f, 24f)
                horizontalLineTo(4f)
                verticalLineToRelative(-1f)
                horizontalLineTo(12.5f)
                curveToRelative(1.77f, 0f, 3.43f, -0.7f, 4.67f, -1.97f)
                curveToRelative(1.23f, -1.27f, 1.89f, -2.95f, 1.83f, -4.73f)
                curveToRelative(-0.1f, -3.47f, -3.15f, -6.3f, -6.79f, -6.3f)
                horizontalLineTo(4f)
                verticalLineTo(2.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(12.5f)
                verticalLineTo(1f)
                horizontalLineTo(6.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                horizontalLineToRelative(7.21f)
                curveToRelative(4.17f, 0f, 7.67f, 3.26f, 7.79f, 7.27f)
                curveToRelative(0.06f, 2.05f, -0.69f, 3.98f, -2.11f, 5.45f)
                curveToRelative(-1.43f, 1.47f, -3.34f, 2.28f, -5.38f, 2.28f)
                close()
            }
        }.also { _Ts5 = it}
