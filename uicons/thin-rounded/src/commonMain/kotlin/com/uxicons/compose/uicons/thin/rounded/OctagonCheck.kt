package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonCheck: ImageVector? = null

val Icons.Tr.OctagonCheck: ImageVector
    get() = _OctagonCheck ?: UXIcon(name = "OctagonCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.68f, 5.71f)
                lineToRelative(-4.39f, -4.39f)
                curveToRelative(-0.85f, -0.85f, -1.98f, -1.32f, -3.18f, -1.32f)
                horizontalLineToRelative(-6.21f)
                curveToRelative(-1.2f, 0f, -2.33f, 0.47f, -3.18f, 1.32f)
                lineTo(1.32f, 5.71f)
                curveToRelative(-0.85f, 0.85f, -1.32f, 1.98f, -1.32f, 3.18f)
                verticalLineToRelative(6.21f)
                curveToRelative(0f, 1.2f, 0.47f, 2.33f, 1.32f, 3.18f)
                lineToRelative(4.39f, 4.39f)
                curveToRelative(0.85f, 0.85f, 1.98f, 1.32f, 3.18f, 1.32f)
                horizontalLineToRelative(6.21f)
                curveToRelative(1.2f, 0f, 2.33f, -0.47f, 3.18f, -1.32f)
                lineToRelative(4.39f, -4.39f)
                curveToRelative(0.85f, -0.85f, 1.32f, -1.98f, 1.32f, -3.18f)
                verticalLineToRelative(-6.21f)
                curveToRelative(0f, -1.2f, -0.47f, -2.33f, -1.32f, -3.18f)
                close()
                moveTo(23f, 15.11f)
                curveToRelative(0f, 0.94f, -0.36f, 1.81f, -1.02f, 2.48f)
                lineToRelative(-4.39f, 4.39f)
                curveToRelative(-0.66f, 0.66f, -1.54f, 1.02f, -2.48f, 1.02f)
                horizontalLineToRelative(-6.21f)
                curveToRelative(-0.94f, 0f, -1.81f, -0.36f, -2.48f, -1.02f)
                lineToRelative(-4.39f, -4.39f)
                curveToRelative(-0.66f, -0.66f, -1.02f, -1.54f, -1.02f, -2.48f)
                verticalLineToRelative(-6.21f)
                curveToRelative(0f, -0.94f, 0.36f, -1.81f, 1.02f, -2.48f)
                lineTo(6.42f, 2.02f)
                curveToRelative(0.66f, -0.66f, 1.54f, -1.02f, 2.48f, -1.02f)
                horizontalLineToRelative(6.21f)
                curveToRelative(0.94f, 0f, 1.81f, 0.36f, 2.48f, 1.02f)
                lineToRelative(4.39f, 4.39f)
                curveToRelative(0.66f, 0.66f, 1.02f, 1.54f, 1.02f, 2.48f)
                verticalLineToRelative(6.21f)
                close()
                moveTo(17.98f, 8.21f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(-5.31f, 5.31f)
                curveToRelative(-0.51f, 0.51f, -1.19f, 0.77f, -1.86f, 0.77f)
                reflectiveCurveToRelative(-1.35f, -0.26f, -1.86f, -0.77f)
                lineToRelative(-2.86f, -2.86f)
                curveToRelative(-0.2f, -0.2f, -0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(0.51f, -0.2f, 0.71f, 0f)
                lineToRelative(2.86f, 2.86f)
                curveToRelative(0.64f, 0.64f, 1.68f, 0.64f, 2.32f, 0f)
                lineToRelative(5.31f, -5.31f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                close()
            }
        }.also { _OctagonCheck = it}
