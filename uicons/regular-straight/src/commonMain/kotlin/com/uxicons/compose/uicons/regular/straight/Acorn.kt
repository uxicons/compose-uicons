package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Acorn: ImageVector? = null

val Icons.Rs.Acorn: ImageVector
    get() = _Acorn ?: UXIcon(name = "Acorn") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 8f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                horizontalLineToRelative(-4f)
                lineTo(13f, 0f)
                horizontalLineToRelative(-2f)
                lineTo(11f, 2f)
                lineTo(7f, 2f)
                curveTo(3.69f, 2f, 1f, 4.69f, 1f, 8f)
                verticalLineToRelative(2f)
                lineTo(3f, 10f)
                verticalLineToRelative(3.91f)
                curveToRelative(0f, 6.71f, 8.3f, 9.81f, 8.66f, 9.94f)
                lineToRelative(0.34f, 0.12f)
                lineToRelative(0.34f, -0.12f)
                curveToRelative(0.35f, -0.13f, 8.66f, -3.23f, 8.66f, -9.94f)
                verticalLineToRelative(-3.91f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(19f, 13.91f)
                curveToRelative(0f, 4.64f, -5.55f, 7.31f, -7f, 7.92f)
                curveToRelative(-1.45f, -0.61f, -7f, -3.27f, -7f, -7.92f)
                verticalLineToRelative(-3.91f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(3.91f)
                close()
                moveTo(3f, 8f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(10f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                lineTo(3f, 8f)
                close()
            }
        }.also { _Acorn = it}
