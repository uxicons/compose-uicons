package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SadCry: ImageVector? = null

val Icons.Bs.SadCry: ImageVector
    get() = _SadCry ?: UXIcon(name = "SadCry") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 16f)
                curveToRelative(-0.05f, 3.95f, -3.95f, 3.95f, -4f, 0f)
                curveTo(10.05f, 12.05f, 13.95f, 12.05f, 14f, 16f)
                close()
                moveTo(5f, 24f)
                lineTo(8f, 24f)
                lineTo(8f, 14f)
                lineTo(5f, 14f)
                close()
                moveTo(16f, 24f)
                horizontalLineToRelative(3f)
                lineTo(19f, 14f)
                lineTo(16f, 14f)
                close()
                moveTo(8f, 7f)
                curveToRelative(-2.27f, 0f, -3f, 3.37f, -3f, 5f)
                curveToRelative(2.76f, -2.61f, 3.25f, -2.59f, 6f, 0f)
                curveTo(11f, 10.37f, 10.27f, 7f, 8f, 7f)
                close()
                moveTo(16f, 7f)
                curveToRelative(-2.27f, 0f, -3f, 3.37f, -3f, 5f)
                curveToRelative(2.76f, -2.61f, 3.25f, -2.59f, 6f, 0f)
                curveTo(19f, 10.37f, 18.27f, 7f, 16f, 7f)
                close()
                moveTo(24f, 12f)
                arcTo(12.01f, 12.01f, 0f, isMoreThanHalf = false, isPositiveArc = false, 12f, 0f)
                curveTo(1.76f, -0.08f, -3.8f, 12.38f, 3f, 19.91f)
                lineTo(3f, 12f)
                curveTo(3.45f, 0.07f, 20.55f, 0.08f, 21f, 12f)
                verticalLineToRelative(7.91f)
                arcTo(11.94f, 11.94f, 0f, isMoreThanHalf = false, isPositiveArc = false, 24f, 12f)
                close()
                moveTo(10f, 20.77f)
                verticalLineToRelative(3.05f)
                arcToRelative(11.39f, 11.39f, 0f, isMoreThanHalf = false, isPositiveArc = false, 4f, 0f)
                lineTo(14f, 20.77f)
                arcTo(8.83f, 8.83f, 0f, isMoreThanHalf = false, isPositiveArc = true, 10f, 20.77f)
                close()
            }
        }.also { _SadCry = it}
