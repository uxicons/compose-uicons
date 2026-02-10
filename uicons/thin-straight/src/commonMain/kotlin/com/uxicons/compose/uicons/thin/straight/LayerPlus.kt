package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LayerPlus: ImageVector? = null

val Icons.Ts.LayerPlus: ImageVector
    get() = _LayerPlus ?: UXIcon(name = "LayerPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9.37f)
                verticalLineToRelative(1.17f)
                lineToRelative(-12f, 7.2f)
                lineTo(0f, 10.53f)
                verticalLineToRelative(-1.17f)
                lineToRelative(12f, 7.2f)
                lineToRelative(12f, -7.2f)
                close()
                moveTo(12f, 14.41f)
                lineTo(0.03f, 7.23f)
                lineTo(12f, 0.05f)
                lineToRelative(11.97f, 7.18f)
                lineToRelative(-11.97f, 7.18f)
                close()
                moveTo(1.97f, 7.23f)
                lineToRelative(10.03f, 6.02f)
                lineToRelative(10.03f, -6.02f)
                lineTo(12f, 1.21f)
                lineTo(1.97f, 7.23f)
                close()
                moveTo(20f, 15f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                close()
                moveTo(0f, 13.83f)
                lineToRelative(12f, 7.2f)
                verticalLineToRelative(-1.17f)
                lineTo(0f, 12.67f)
                verticalLineToRelative(1.17f)
                close()
            }
        }.also { _LayerPlus = it}
