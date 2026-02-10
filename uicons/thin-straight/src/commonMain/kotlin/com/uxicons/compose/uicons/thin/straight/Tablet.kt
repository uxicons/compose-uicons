package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tablet: ImageVector? = null

val Icons.Ts.Tablet: ImageVector
    get() = _Tablet ?: UXIcon(name = "Tablet") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(2f, 0f)
                lineTo(2f, 21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(22f, 0f)
                lineTo(2f, 0f)
                close()
                moveTo(21f, 1f)
                lineTo(21f, 18f)
                lineTo(3f, 18f)
                lineTo(3f, 1f)
                lineTo(21f, 1f)
                close()
                moveTo(19.5f, 23f)
                lineTo(4.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-2.5f)
                lineTo(11.5f, 19f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(8.5f)
                verticalLineToRelative(2.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Tablet = it}
