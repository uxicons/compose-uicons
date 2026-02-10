package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Sofa: ImageVector? = null

val Icons.Rs.Sofa: ImageVector
    get() = _Sofa ?: UXIcon(name = "Sofa") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 9f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -3.31f, -2.69f, -6f, -6f, -6f)
                horizontalLineToRelative(-8f)
                curveTo(4.69f, 0f, 2f, 2.69f, 2f, 6f)
                verticalLineToRelative(3f)
                lineTo(0f, 9f)
                verticalLineToRelative(13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-13f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(4f, 6f)
                curveToRelative(0f, -2.21f, 1.79f, -4f, 4f, -4f)
                horizontalLineToRelative(8f)
                curveToRelative(2.21f, 0f, 4f, 1.79f, 4f, 4f)
                verticalLineToRelative(3.18f)
                curveToRelative(-1.16f, 0.41f, -2f, 1.51f, -2f, 2.82f)
                verticalLineToRelative(2f)
                lineTo(6f, 14f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.3f, -0.84f, -2.4f, -2f, -2.82f)
                verticalLineToRelative(-3.18f)
                close()
                moveTo(18f, 16f)
                verticalLineToRelative(4f)
                lineTo(6f, 20f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(12f)
                close()
                moveTo(2f, 20f)
                verticalLineToRelative(-9f)
                horizontalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(22f, 20f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(9f)
                close()
            }
        }.also { _Sofa = it}
