package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _VectorCircle: ImageVector? = null

val Icons.Ts.VectorCircle: ImageVector
    get() = _VectorCircle ?: UXIcon(name = "VectorCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 9f)
                horizontalLineToRelative(-1.95f)
                curveToRelative(-1.01f, -3.39f, -3.67f, -6.05f, -7.05f, -7.06f)
                lineTo(15f, 0f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(1.94f)
                curveToRelative(-3.39f, 1.01f, -6.04f, 3.67f, -7.05f, 7.06f)
                lineTo(0f, 9f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(1.95f)
                curveToRelative(1.01f, 3.39f, 3.67f, 6.05f, 7.05f, 7.06f)
                verticalLineToRelative(1.94f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-1.94f)
                curveToRelative(3.39f, -1.01f, 6.04f, -3.67f, 7.05f, -7.06f)
                horizontalLineToRelative(1.95f)
                verticalLineToRelative(-6f)
                close()
                moveTo(10f, 1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(-4f)
                lineTo(10f, 1f)
                close()
                moveTo(1f, 10f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                lineTo(1f, 14f)
                verticalLineToRelative(-4f)
                close()
                moveTo(14f, 23f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
                moveTo(15f, 21.02f)
                verticalLineToRelative(-3.02f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3.02f)
                curveToRelative(-2.83f, -0.94f, -5.06f, -3.17f, -6.0f, -6.01f)
                horizontalLineToRelative(3.0f)
                verticalLineToRelative(-6f)
                horizontalLineToRelative(-3.0f)
                curveToRelative(0.94f, -2.84f, 3.17f, -5.07f, 6.0f, -6.01f)
                verticalLineToRelative(3.02f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3.02f)
                curveToRelative(2.83f, 0.94f, 5.06f, 3.17f, 6.0f, 6.01f)
                horizontalLineToRelative(-3.0f)
                verticalLineToRelative(6f)
                horizontalLineToRelative(3.0f)
                curveToRelative(-0.94f, 2.84f, -3.17f, 5.07f, -6.0f, 6.01f)
                close()
                moveTo(23f, 14f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(4f)
                close()
            }
        }.also { _VectorCircle = it}
