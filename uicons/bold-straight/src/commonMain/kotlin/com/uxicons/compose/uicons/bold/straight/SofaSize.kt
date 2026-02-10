package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SofaSize: ImageVector? = null

val Icons.Bs.SofaSize: ImageVector
    get() = _SofaSize ?: UXIcon(name = "SofaSize") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0.26f, 4.07f)
                curveToRelative(-0.34f, -0.31f, -0.34f, -0.84f, 0f, -1.15f)
                lineTo(3f, 0f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(18f)
                lineTo(21f, 0f)
                lineToRelative(2.74f, 2.93f)
                curveToRelative(0.34f, 0.31f, 0.34f, 0.84f, 0f, 1.15f)
                lineToRelative(-2.74f, 2.93f)
                verticalLineToRelative(-2f)
                lineTo(3f, 5.0f)
                verticalLineToRelative(2f)
                lineTo(0.26f, 4.07f)
                close()
                moveTo(22f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(9f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                lineTo(5f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2f)
                lineTo(0f, 22f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                horizontalLineToRelative(11f)
                curveToRelative(2.48f, 0f, 4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(1.5f)
                close()
                moveTo(19f, 11.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                lineTo(6.5f, 10f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-5.5f)
                close()
            }
        }.also { _SofaSize = it}
