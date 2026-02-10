package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GameBoardAlt: ImageVector? = null

val Icons.Ss.GameBoardAlt: ImageVector
    get() = _GameBoardAlt ?: UXIcon(name = "GameBoardAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13f, 0f)
                horizontalLineToRelative(8f)
                arcToRelative(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = true, 3f, 3f)
                verticalLineToRelative(8f)
                lineTo(13f, 11f)
                close()
                moveTo(11f, 0f)
                horizontalLineToRelative(-0.96f)
                lineTo(0f, 10.04f)
                lineTo(0f, 11f)
                lineTo(3.17f, 11f)
                lineTo(11f, 3.17f)
                close()
                moveTo(13f, 18f)
                lineTo(18f, 13f)
                lineTo(13f, 13f)
                close()
                moveTo(24f, 13f)
                lineTo(20.83f, 13f)
                lineTo(13f, 20.83f)
                lineTo(13f, 24f)
                horizontalLineToRelative(0.96f)
                lineTo(24f, 13.96f)
                close()
                moveTo(11f, 13f)
                lineTo(0f, 13f)
                lineTo(0f, 24f)
                lineTo(11f, 24f)
                close()
                moveTo(11f, 6f)
                lineTo(6f, 11f)
                horizontalLineToRelative(5f)
                close()
                moveTo(16.79f, 24f)
                lineTo(24f, 24f)
                lineTo(24f, 16.79f)
                close()
                moveTo(7.21f, 0f)
                lineTo(3f, 0f)
                arcTo(3f, 3f, 0f, isMoreThanHalf = false, isPositiveArc = false, 0f, 3f)
                lineTo(0f, 7.21f)
                close()
            }
        }.also { _GameBoardAlt = it}
