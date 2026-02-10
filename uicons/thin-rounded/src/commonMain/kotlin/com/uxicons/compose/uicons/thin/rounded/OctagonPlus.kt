package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonPlus: ImageVector? = null

val Icons.Tr.OctagonPlus: ImageVector
    get() = _OctagonPlus ?: UXIcon(name = "OctagonPlus") {
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
                moveTo(18f, 12f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(-5f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _OctagonPlus = it}
