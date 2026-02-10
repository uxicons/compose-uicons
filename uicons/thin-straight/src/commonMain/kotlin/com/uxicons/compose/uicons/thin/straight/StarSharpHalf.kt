package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarSharpHalf: ImageVector? = null

val Icons.Ts.StarSharpHalf: ImageVector
    get() = _StarSharpHalf ?: UXIcon(name = "StarSharpHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.18f, 9f)
                lineTo(-0.07f, 9f)
                lineToRelative(7.46f, 5.44f)
                lineToRelative(-2.85f, 8.82f)
                lineToRelative(8.45f, -6.01f)
                lineTo(13f, -0.07f)
                lineToRelative(-3.82f, 9.07f)
                close()
                moveTo(12f, 16.74f)
                lineToRelative(-5.58f, 3.96f)
                lineToRelative(2.15f, -6.64f)
                lineToRelative(-5.57f, -4.06f)
                horizontalLineToRelative(6.84f)
                lineToRelative(2.15f, -5.11f)
                verticalLineToRelative(11.86f)
                close()
            }
        }.also { _StarSharpHalf = it}
