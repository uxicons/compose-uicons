package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Towel: ImageVector? = null

val Icons.Sr.Towel: ImageVector
    get() = _Towel ?: UXIcon(name = "Towel") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 9f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-15f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                close()
                moveTo(11f, 13f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-6.5f)
                curveToRelative(0f, -0.93f, 0.28f, -1.78f, 0.76f, -2.5f)
                horizontalLineToRelative(-10.76f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                close()
                moveTo(10f, 24f)
                horizontalLineToRelative(9f)
                curveToRelative(1.66f, 0f, 3f, -1.34f, 3f, -3f)
                horizontalLineToRelative(-15f)
                curveToRelative(0f, 1.66f, 1.34f, 3f, 3f, 3f)
                close()
                moveTo(22f, 5f)
                verticalLineToRelative(-2.35f)
                curveToRelative(0f, -1.31f, -0.94f, -2.5f, -2.24f, -2.63f)
                curveToRelative(-1.5f, -0.15f, -2.76f, 1.02f, -2.76f, 2.49f)
                verticalLineToRelative(4.5f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                horizontalLineToRelative(-1f)
                close()
            }
        }.also { _Towel = it}
