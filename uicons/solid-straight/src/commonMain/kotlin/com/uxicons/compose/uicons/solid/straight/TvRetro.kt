package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TvRetro: ImageVector? = null

val Icons.Ss.TvRetro: ImageVector
    get() = _TvRetro ?: UXIcon(name = "TvRetro") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21f, 6f)
                horizontalLineToRelative(-6.86f)
                lineToRelative(4.58f, -4.58f)
                lineTo(17.3f, 0.01f)
                lineToRelative(-5.3f, 5.3f)
                lineTo(6.7f, 0.01f)
                lineToRelative(-1.41f, 1.41f)
                lineToRelative(4.58f, 4.58f)
                lineTo(3f, 6f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(24f)
                verticalLineToRelative(-15f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(16f, 21f)
                lineTo(3f, 21f)
                verticalLineToRelative(-12f)
                horizontalLineToRelative(13f)
                verticalLineToRelative(12f)
                close()
                moveTo(21f, 21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 16f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(21f, 11f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                close()
                moveTo(14f, 19f)
                lineTo(5f, 19f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(9f)
                verticalLineToRelative(8f)
                close()
            }
        }.also { _TvRetro = it}
