package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BarsProgress: ImageVector? = null

val Icons.Ts.BarsProgress: ImageVector
    get() = _BarsProgress ?: UXIcon(name = "BarsProgress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 3f)
                lineTo(2.5f, 3f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(21.5f, 11f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 8.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(14f, 4f)
                verticalLineToRelative(6f)
                lineTo(2.5f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(23f, 8.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-6.5f)
                lineTo(15f, 4f)
                horizontalLineToRelative(6.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3f)
                close()
                moveTo(21.5f, 13f)
                lineTo(2.5f, 13f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(21.5f, 21f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 18.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(5.5f)
                verticalLineToRelative(6f)
                lineTo(2.5f, 20f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                close()
                moveTo(23f, 18.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(9f, 20f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(12.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _BarsProgress = it}
