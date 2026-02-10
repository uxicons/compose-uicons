package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RedoAlt: ImageVector? = null

val Icons.Ts.RedoAlt: ImageVector
    get() = _RedoAlt ?: UXIcon(name = "RedoAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.71f, 8.21f)
                curveToRelative(0.06f, -0.06f, 0.1f, -0.14f, 0.14f, -0.21f)
                lineToRelative(-20.34f, -0.01f)
                curveToRelative(-0.84f, 0f, -1.5f, 0.66f, -1.5f, 1.5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 0.84f, 0.66f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(19.5f)
                verticalLineToRelative(1f)
                horizontalLineTo(2.5f)
                curveToRelative(-1.4f, 0f, -2.5f, -1.1f, -2.5f, -2.5f)
                verticalLineToRelative(-12f)
                curveToRelative(0f, -1.4f, 1.1f, -2.5f, 2.5f, -2.5f)
                lineToRelative(20.34f, 0.01f)
                curveToRelative(-0.04f, -0.07f, -0.08f, -0.15f, -0.14f, -0.21f)
                lineToRelative(-4.95f, -4.95f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.95f, 4.95f)
                curveToRelative(0.38f, 0.38f, 0.59f, 0.88f, 0.59f, 1.41f)
                reflectiveCurveToRelative(-0.21f, 1.04f, -0.59f, 1.42f)
                lineToRelative(-4.95f, 4.95f)
                lineToRelative(-0.71f, -0.71f)
                lineToRelative(4.95f, -4.95f)
                close()
            }
        }.also { _RedoAlt = it}
