package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LayerMinus: ImageVector? = null

val Icons.Ts.LayerMinus: ImageVector
    get() = _LayerMinus ?: UXIcon(name = "LayerMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 10.53f)
                lineToRelative(-12f, 7.2f)
                lineTo(0f, 10.53f)
                verticalLineToRelative(-1.17f)
                lineToRelative(12f, 7.2f)
                lineToRelative(12f, -7.2f)
                verticalLineToRelative(1.17f)
                close()
                moveTo(23.97f, 7.23f)
                lineTo(12f, 0.05f)
                lineTo(0.03f, 7.23f)
                lineToRelative(11.97f, 7.18f)
                lineToRelative(11.97f, -7.18f)
                close()
                moveTo(12f, 1.21f)
                lineToRelative(10.03f, 6.02f)
                lineToRelative(-10.03f, 6.02f)
                lineTo(1.97f, 7.23f)
                lineTo(12f, 1.21f)
                close()
                moveTo(24f, 19f)
                lineTo(15f, 19f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(-1f)
                close()
                moveTo(12f, 19.87f)
                lineTo(0f, 12.67f)
                verticalLineToRelative(1.17f)
                lineToRelative(12f, 7.2f)
                verticalLineToRelative(-1.17f)
                close()
            }
        }.also { _LayerMinus = it}
