package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LandLayers: ImageVector? = null

val Icons.Ts.LandLayers: ImageVector
    get() = _LandLayers ?: UXIcon(name = "LandLayers") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 10.83f)
                verticalLineToRelative(1.17f)
                lineToRelative(-12f, 7.2f)
                lineTo(0f, 12f)
                verticalLineToRelative(-1.17f)
                lineToRelative(12f, 7.2f)
                lineToRelative(12f, -7.2f)
                close()
                moveTo(0f, 14.13f)
                verticalLineToRelative(1.17f)
                lineToRelative(12f, 7.2f)
                lineToRelative(12f, -7.2f)
                verticalLineToRelative(-1.17f)
                lineToRelative(-12f, 7.2f)
                lineTo(0f, 14.13f)
                close()
                moveTo(12f, 15.88f)
                lineTo(0.03f, 8.7f)
                lineTo(12f, 1.51f)
                lineToRelative(11.97f, 7.18f)
                lineToRelative(-11.97f, 7.18f)
                close()
                moveTo(12f, 14.71f)
                lineToRelative(4.48f, -2.69f)
                lineToRelative(-4.44f, -2.67f)
                lineToRelative(-4.48f, 2.69f)
                lineToRelative(4.44f, 2.67f)
                close()
                moveTo(22.03f, 8.7f)
                lineToRelative(-4.44f, -2.67f)
                lineToRelative(-4.57f, 2.74f)
                lineToRelative(4.44f, 2.67f)
                lineToRelative(4.57f, -2.74f)
                close()
                moveTo(12f, 2.68f)
                lineToRelative(-4.57f, 2.74f)
                lineToRelative(4.61f, 2.77f)
                lineToRelative(4.57f, -2.74f)
                lineToRelative(-4.61f, -2.77f)
                close()
                moveTo(1.97f, 8.7f)
                lineToRelative(4.61f, 2.77f)
                lineToRelative(4.48f, -2.69f)
                lineToRelative(-4.61f, -2.77f)
                lineToRelative(-4.48f, 2.69f)
                close()
            }
        }.also { _LandLayers = it}
