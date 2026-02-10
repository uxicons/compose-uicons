package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DumbbellHorizontal: ImageVector? = null

val Icons.Ts.DumbbellHorizontal: ImageVector
    get() = _DumbbellHorizontal ?: UXIcon(name = "DumbbellHorizontal") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 11.5f)
                horizontalLineToRelative(-2f)
                lineTo(22f, 5.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-2.5f)
                lineTo(17f, 11.5f)
                lineTo(7f, 11.5f)
                lineTo(7f, 3f)
                horizontalLineToRelative(-2.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(6f)
                lineTo(0f, 11.5f)
                verticalLineToRelative(1f)
                lineTo(2f, 12.5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(2.5f)
                lineTo(7f, 12.5f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(8.5f)
                horizontalLineToRelative(2.5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1f)
                close()
                moveTo(6f, 20f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(3f, 5.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.5f)
                lineTo(6f, 20f)
                close()
                moveTo(21f, 18.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-1.5f)
                lineTo(18f, 4f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(13f)
                close()
            }
        }.also { _DumbbellHorizontal = it}
