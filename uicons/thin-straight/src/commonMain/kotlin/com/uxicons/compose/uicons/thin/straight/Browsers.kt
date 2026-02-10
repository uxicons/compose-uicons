package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Browsers: ImageVector? = null

val Icons.Ts.Browsers: ImageVector
    get() = _Browsers ?: UXIcon(name = "Browsers") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2f)
                lineTo(7.5f, 2f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(13.5f)
                lineTo(24f, 18f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(7.5f, 3f)
                horizontalLineToRelative(14f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(1.5f)
                lineTo(6f, 6f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(6f, 17f)
                lineTo(6f, 7f)
                lineTo(23f, 7f)
                verticalLineToRelative(10f)
                lineTo(6f, 17f)
                close()
                moveTo(1f, 21f)
                lineTo(19f, 21f)
                verticalLineToRelative(1f)
                lineTo(0f, 22f)
                lineTo(0f, 8.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(0.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(12.5f)
                close()
            }
        }.also { _Browsers = it}
