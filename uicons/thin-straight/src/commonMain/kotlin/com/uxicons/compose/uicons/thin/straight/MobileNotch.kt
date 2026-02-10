package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MobileNotch: ImageVector? = null

val Icons.Ts.MobileNotch: ImageVector
    get() = _MobileNotch ?: UXIcon(name = "MobileNotch") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(4f, 0f)
                lineTo(4f, 21.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(20f, 0f)
                lineTo(4f, 0f)
                close()
                moveTo(14.81f, 1f)
                lineToRelative(-0.67f, 2f)
                horizontalLineToRelative(-4.28f)
                lineToRelative(-0.67f, -2f)
                horizontalLineToRelative(5.61f)
                close()
                moveTo(19f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(6.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(5f, 1f)
                horizontalLineToRelative(3.14f)
                lineToRelative(1f, 3f)
                horizontalLineToRelative(5.72f)
                lineToRelative(1f, -3f)
                horizontalLineToRelative(3.14f)
                lineTo(19.0f, 21.5f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(10f, 20f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                close()
            }
        }.also { _MobileNotch = it}
