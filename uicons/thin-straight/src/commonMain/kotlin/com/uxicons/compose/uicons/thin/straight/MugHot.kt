package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MugHot: ImageVector? = null

val Icons.Ts.MugHot: ImageVector
    get() = _MugHot ?: UXIcon(name = "MugHot") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 11.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                verticalLineToRelative(-3f)
                lineTo(1f, 6f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(15.5f, 24f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-2.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-7.5f)
                close()
                moveTo(17f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(3.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(2f, 7f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(14.5f)
                close()
                moveTo(22f, 18f)
                horizontalLineToRelative(-4f)
                lineTo(18f, 10f)
                horizontalLineToRelative(2.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(6.5f)
                close()
                moveTo(10f, 4f)
                horizontalLineToRelative(-1f)
                lineTo(9f, 0f)
                horizontalLineToRelative(1f)
                lineTo(10f, 4f)
                close()
                moveTo(14f, 4f)
                horizontalLineToRelative(-1f)
                lineTo(13f, 0f)
                horizontalLineToRelative(1f)
                lineTo(14f, 4f)
                close()
                moveTo(6f, 4f)
                horizontalLineToRelative(-1f)
                lineTo(5f, 0f)
                horizontalLineToRelative(1f)
                lineTo(6f, 4f)
                close()
            }
        }.also { _MugHot = it}
