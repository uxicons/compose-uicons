package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HighDefinition: ImageVector? = null

val Icons.Ts.HighDefinition: ImageVector
    get() = _HighDefinition ?: UXIcon(name = "HighDefinition") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-4.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(-1f)
                lineTo(4f, 7f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-4.5f)
                close()
                moveTo(24f, 4.5f)
                verticalLineToRelative(17.5f)
                lineTo(0f, 22f)
                lineTo(0f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(19f)
                curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(23f, 4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(2.5f, 3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(16.5f)
                horizontalLineToRelative(22f)
                lineTo(23f, 4.5f)
                close()
                moveTo(20f, 10.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-3.5f)
                lineTo(13f, 7f)
                horizontalLineToRelative(3.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(19f, 10.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-3f)
                close()
            }
        }.also { _HighDefinition = it}
