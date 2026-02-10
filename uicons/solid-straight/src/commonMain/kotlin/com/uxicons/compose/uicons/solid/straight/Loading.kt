package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Loading: ImageVector? = null

val Icons.Ss.Loading: ImageVector
    get() = _Loading ?: UXIcon(name = "Loading") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                close()
                moveTo(4f, 11f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(24f, 11f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                close()
                moveTo(22.88f, 17.16f)
                lineTo(19.42f, 15.15f)
                lineTo(18.41f, 16.88f)
                lineTo(21.87f, 18.89f)
                close()
                moveTo(18.89f, 2.13f)
                lineTo(17.16f, 1.13f)
                lineTo(15.15f, 4.58f)
                lineTo(16.88f, 5.58f)
                close()
                moveTo(22.88f, 6.83f)
                lineTo(21.88f, 5.09f)
                lineTo(18.42f, 7.11f)
                lineTo(19.43f, 8.84f)
                close()
                moveTo(18.92f, 21.86f)
                lineTo(16.9f, 18.41f)
                lineTo(15.17f, 19.42f)
                lineTo(17.18f, 22.87f)
                close()
                moveTo(5.6f, 16.88f)
                lineTo(4.6f, 15.15f)
                lineTo(1.14f, 17.16f)
                lineTo(2.14f, 18.89f)
                close()
                moveTo(8.86f, 4.58f)
                lineTo(6.85f, 1.12f)
                lineTo(5.13f, 2.12f)
                lineTo(7.14f, 5.58f)
                close()
                moveTo(5.6f, 7.11f)
                lineTo(2.14f, 5.09f)
                lineTo(1.13f, 6.82f)
                lineTo(4.59f, 8.84f)
                close()
                moveTo(8.84f, 19.42f)
                lineTo(7.11f, 18.41f)
                lineTo(5.1f, 21.86f)
                lineTo(6.83f, 22.87f)
                close()
            }
        }.also { _Loading = it}
