package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Auction: ImageVector? = null

val Icons.Ss.Auction: ImageVector
    get() = _Auction ?: UXIcon(name = "Auction") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.05f)
                curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.45f, -2f)
                horizontalLineToRelative(8f)
                curveToRelative(1.21f, 0f, 2.22f, 0.86f, 2.45f, 2f)
                horizontalLineToRelative(1.05f)
                close()
                moveTo(14.49f, 1.44f)
                lineTo(13.07f, 0.03f)
                lineToRelative(-7.89f, 7.89f)
                lineToRelative(1.41f, 1.41f)
                lineTo(14.49f, 1.44f)
                close()
                moveTo(13.26f, 13.95f)
                lineToRelative(5.87f, -5.87f)
                lineToRelative(-4.22f, -4.22f)
                lineToRelative(-5.87f, 5.87f)
                lineToRelative(1.41f, 1.41f)
                lineTo(0.02f, 21.56f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(10.43f, -10.43f)
                lineToRelative(1.4f, 1.4f)
                close()
                moveTo(15.09f, 17.83f)
                lineToRelative(7.89f, -7.89f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-7.89f, 7.89f)
                lineToRelative(1.41f, 1.41f)
                close()
            }
        }.also { _Auction = it}
