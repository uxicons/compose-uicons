package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Fog: ImageVector? = null

val Icons.Ss.Fog: ImageVector
    get() = _Fog ?: UXIcon(name = "Fog") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 24f)
                lineTo(5f, 24f)
                lineTo(5f, 22f)
                horizontalLineToRelative(9f)
                close()
                moveTo(19f, 22f)
                lineTo(16f, 22f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(19f, 18f)
                lineTo(10f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                close()
                moveTo(8f, 18f)
                lineTo(5f, 18f)
                verticalLineToRelative(2f)
                lineTo(8f, 20f)
                close()
                moveTo(14f, 14f)
                lineTo(5f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(9f)
                close()
                moveTo(19f, 14f)
                lineTo(16f, 14f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                close()
                moveTo(24f, 12.5f)
                arcToRelative(7.49f, 7.49f, 0f, isMoreThanHalf = false, isPositiveArc = true, -3f, 6f)
                lineTo(21f, 14f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, -2f)
                lineTo(5.04f, 12f)
                arcToRelative(2f, 2f, 0f, isMoreThanHalf = false, isPositiveArc = false, -2f, 2f)
                verticalLineToRelative(5.42f)
                curveToRelative(-3.58f, -1.61f, -4.1f, -7.16f, -0.77f, -9.37f)
                curveTo(-0.07f, 0.2f, 13.62f, -4.04f, 17.44f, 5.06f)
                arcTo(7.46f, 7.46f, 0f, isMoreThanHalf = false, isPositiveArc = true, 24f, 12.5f)
                close()
            }
        }.also { _Fog = it}
