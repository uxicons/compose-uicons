package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VectorCircle: ImageVector? = null

val Icons.Sr.VectorCircle: ImageVector
    get() = _VectorCircle ?: UXIcon(name = "VectorCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.04f, 9.0f)
                curveToRelative(-1.01f, -3.38f, -3.66f, -6.03f, -7.04f, -7.04f)
                curveToRelative(-0.02f, -1.09f, -0.91f, -1.96f, -2.0f, -1.96f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.09f, 0f, -1.98f, 0.88f, -2.0f, 1.96f)
                curveToRelative(-3.38f, 1.01f, -6.03f, 3.66f, -7.04f, 7.04f)
                curveToRelative(-1.09f, 0.02f, -1.96f, 0.91f, -1.96f, 2.0f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.09f, 0.88f, 1.98f, 1.96f, 2.0f)
                curveToRelative(1.01f, 3.38f, 3.66f, 6.03f, 7.04f, 7.04f)
                curveToRelative(0.02f, 1.09f, 0.91f, 1.96f, 2.0f, 1.96f)
                horizontalLineToRelative(2f)
                curveToRelative(1.09f, 0f, 1.98f, -0.88f, 2.0f, -1.96f)
                curveToRelative(3.38f, -1.01f, 6.03f, -3.66f, 7.04f, -7.04f)
                curveToRelative(1.09f, -0.02f, 1.96f, -0.91f, 1.96f, -2.0f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.09f, -0.88f, -1.98f, -1.96f, -2.0f)
                close()
                moveTo(14.99f, 19.96f)
                curveToRelative(-0.02f, -1.08f, -0.91f, -1.96f, -2.0f, -1.96f)
                horizontalLineToRelative(-2f)
                curveToRelative(-1.09f, 0f, -1.97f, 0.87f, -2.0f, 1.96f)
                curveToRelative(-2.29f, -0.86f, -4.1f, -2.67f, -4.96f, -4.96f)
                curveToRelative(1.08f, -0.02f, 1.96f, -0.91f, 1.96f, -2.0f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -1.09f, -0.87f, -1.97f, -1.96f, -2.0f)
                curveToRelative(0.86f, -2.29f, 2.67f, -4.1f, 4.96f, -4.96f)
                curveToRelative(0.02f, 1.08f, 0.91f, 1.96f, 2.0f, 1.96f)
                horizontalLineToRelative(2f)
                curveToRelative(1.09f, 0f, 1.97f, -0.87f, 2.0f, -1.96f)
                curveToRelative(2.29f, 0.86f, 4.1f, 2.67f, 4.96f, 4.96f)
                curveToRelative(-1.08f, 0.02f, -1.96f, 0.91f, -1.96f, 2.0f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.09f, 0.87f, 1.97f, 1.96f, 2.0f)
                curveToRelative(-0.86f, 2.29f, -2.67f, 4.1f, -4.96f, 4.96f)
                close()
            }
        }.also { _VectorCircle = it}
