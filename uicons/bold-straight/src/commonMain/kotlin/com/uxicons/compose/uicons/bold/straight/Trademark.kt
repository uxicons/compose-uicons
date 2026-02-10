package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Trademark: ImageVector? = null

val Icons.Bs.Trademark: ImageVector
    get() = _Trademark ?: UXIcon(name = "Trademark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 5f)
                lineTo(9f, 5f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(11f)
                lineTo(3f, 19f)
                lineTo(3f, 8f)
                lineTo(0f, 8f)
                verticalLineToRelative(-3f)
                close()
                moveTo(22.48f, 5.09f)
                curveToRelative(-0.91f, -0.27f, -1.89f, 0.09f, -2.45f, 0.95f)
                lineToRelative(-2.53f, 4.13f)
                lineToRelative(-2.55f, -4.17f)
                curveToRelative(-0.54f, -0.82f, -1.51f, -1.18f, -2.42f, -0.91f)
                curveToRelative(-0.91f, 0.27f, -1.52f, 1.13f, -1.52f, 2.13f)
                verticalLineToRelative(11.78f)
                horizontalLineToRelative(3f)
                lineTo(14.01f, 10.2f)
                lineToRelative(3.5f, 5.73f)
                lineToRelative(3.5f, -5.73f)
                verticalLineToRelative(8.8f)
                horizontalLineToRelative(3f)
                lineTo(24.01f, 7.22f)
                curveToRelative(0f, -1f, -0.61f, -1.86f, -1.52f, -2.13f)
                close()
            }
        }.also { _Trademark = it}
