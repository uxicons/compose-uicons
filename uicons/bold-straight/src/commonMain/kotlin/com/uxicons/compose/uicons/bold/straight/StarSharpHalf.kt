package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StarSharpHalf: ImageVector? = null

val Icons.Bs.StarSharpHalf: ImageVector
    get() = _StarSharpHalf ?: UXIcon(name = "StarSharpHalf") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.95f, 0f)
                lineToRelative(-2.23f, 6.96f)
                lineTo(1f, 6.96f)
                lineToRelative(-1f, 4.47f)
                lineToRelative(5.1f, 3.73f)
                lineToRelative(-2.53f, 7.86f)
                lineToRelative(4.33f, 0.98f)
                lineToRelative(6.11f, -4.52f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-3.05f)
                close()
                moveTo(6.51f, 20.55f)
                lineToRelative(1.44f, -4.47f)
                lineToRelative(0.66f, -2.06f)
                lineToRelative(-1.75f, -1.28f)
                lineToRelative(-3.51f, -2.57f)
                lineToRelative(0.05f, -0.21f)
                horizontalLineToRelative(6.6f)
                verticalLineToRelative(8.01f)
                lineToRelative(-3.49f, 2.58f)
                close()
            }
        }.also { _StarSharpHalf = it}
