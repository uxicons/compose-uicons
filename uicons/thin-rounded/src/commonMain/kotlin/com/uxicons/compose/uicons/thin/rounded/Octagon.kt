package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Octagon: ImageVector? = null

val Icons.Tr.Octagon: ImageVector
    get() = _Octagon ?: UXIcon(name = "Octagon") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.16f, 24f)
                horizontalLineToRelative(-6.21f)
                curveToRelative(-1.2f, 0f, -2.33f, -0.47f, -3.18f, -1.32f)
                lineTo(1.37f, 18.29f)
                curveToRelative(-0.85f, -0.85f, -1.32f, -1.98f, -1.32f, -3.18f)
                verticalLineToRelative(-6.21f)
                curveToRelative(0f, -1.2f, 0.47f, -2.33f, 1.32f, -3.18f)
                lineTo(5.76f, 1.32f)
                curveToRelative(0.85f, -0.85f, 1.98f, -1.32f, 3.18f, -1.32f)
                horizontalLineToRelative(6.21f)
                curveToRelative(1.2f, 0f, 2.33f, 0.47f, 3.18f, 1.32f)
                lineToRelative(4.39f, 4.39f)
                curveToRelative(0.85f, 0.85f, 1.32f, 1.98f, 1.32f, 3.18f)
                verticalLineToRelative(6.21f)
                curveToRelative(0f, 1.2f, -0.47f, 2.33f, -1.32f, 3.18f)
                lineToRelative(-4.39f, 4.39f)
                curveToRelative(-0.85f, 0.85f, -1.98f, 1.32f, -3.18f, 1.32f)
                close()
                moveTo(8.94f, 1f)
                curveToRelative(-0.94f, 0f, -1.81f, 0.36f, -2.48f, 1.02f)
                lineTo(2.08f, 6.42f)
                curveToRelative(-0.66f, 0.66f, -1.02f, 1.54f, -1.02f, 2.48f)
                verticalLineToRelative(6.21f)
                curveToRelative(0f, 0.94f, 0.36f, 1.81f, 1.02f, 2.48f)
                lineToRelative(4.39f, 4.39f)
                curveToRelative(0.66f, 0.66f, 1.54f, 1.02f, 2.48f, 1.02f)
                horizontalLineToRelative(6.21f)
                curveToRelative(0.94f, 0f, 1.81f, -0.36f, 2.48f, -1.02f)
                lineToRelative(4.39f, -4.39f)
                curveToRelative(0.66f, -0.66f, 1.02f, -1.54f, 1.02f, -2.48f)
                verticalLineToRelative(-6.21f)
                curveToRelative(0f, -0.94f, -0.36f, -1.81f, -1.02f, -2.48f)
                lineToRelative(-4.39f, -4.39f)
                curveToRelative(-0.66f, -0.66f, -1.54f, -1.02f, -2.48f, -1.02f)
                horizontalLineToRelative(-6.21f)
                close()
            }
        }.also { _Octagon = it}
