package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowRightToCity: ImageVector? = null

val Icons.Bs.ArrowRightToCity: ImageVector
    get() = _ArrowRightToCity ?: UXIcon(name = "ArrowRightToCity") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11f, 15f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(14f, 5f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(11f, 13f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(20.5f, 5f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                horizontalLineToRelative(-6f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                lineTo(6f, 7.66f)
                lineToRelative(3f, 3.07f)
                lineTo(9f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(4.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(12.5f)
                lineTo(9f, 21f)
                verticalLineToRelative(-4.73f)
                lineToRelative(-3f, 3.07f)
                verticalLineToRelative(4.66f)
                lineTo(24f, 24f)
                lineTo(24f, 8.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(16f, 18f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                close()
                moveTo(19f, 10f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-3f)
                close()
                moveTo(8.29f, 14.13f)
                curveToRelative(0.35f, -0.35f, 0.35f, -0.91f, 0f, -1.26f)
                lineToRelative(-3.29f, -3.37f)
                verticalLineToRelative(2.5f)
                lineTo(0f, 12f)
                verticalLineToRelative(3f)
                lineTo(5f, 15f)
                verticalLineToRelative(2.5f)
                lineToRelative(3.29f, -3.37f)
                close()
            }
        }.also { _ArrowRightToCity = it}
