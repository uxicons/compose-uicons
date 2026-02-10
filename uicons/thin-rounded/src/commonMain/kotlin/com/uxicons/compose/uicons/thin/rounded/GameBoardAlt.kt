package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _GameBoardAlt: ImageVector? = null

val Icons.Tr.GameBoardAlt: ImageVector
    get() = _GameBoardAlt ?: UXIcon(name = "GameBoardAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(3.79f)
                lineTo(1f, 8.29f)
                verticalLineToRelative(-3.79f)
                close()
                moveTo(1f, 9.71f)
                lineTo(9.71f, 1f)
                horizontalLineToRelative(1.29f)
                verticalLineToRelative(3.29f)
                lineToRelative(-6.71f, 6.71f)
                lineTo(1f, 11f)
                verticalLineToRelative(-1.29f)
                close()
                moveTo(11f, 5.71f)
                verticalLineToRelative(5.29f)
                lineTo(5.71f, 11f)
                lineToRelative(5.29f, -5.29f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                horizontalLineToRelative(-3.79f)
                lineToRelative(7.29f, -7.29f)
                verticalLineToRelative(3.79f)
                close()
                moveTo(23f, 14.29f)
                lineToRelative(-8.71f, 8.71f)
                horizontalLineToRelative(-1.29f)
                verticalLineToRelative(-3.29f)
                lineToRelative(6.71f, -6.71f)
                horizontalLineToRelative(3.29f)
                verticalLineToRelative(1.29f)
                close()
                moveTo(13f, 18.29f)
                verticalLineToRelative(-5.29f)
                horizontalLineToRelative(5.29f)
                lineToRelative(-5.29f, 5.29f)
                close()
                moveTo(23f, 12f)
                lineTo(12.5f, 12f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(10.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                verticalLineToRelative(-7.5f)
                lineTo(11.5f, 12f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(12f, 1f)
                horizontalLineToRelative(7.5f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(7.5f)
                close()
            }
        }.also { _GameBoardAlt = it}
