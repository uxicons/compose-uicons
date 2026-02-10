package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShareAltSquare: ImageVector? = null

val Icons.Bs.ShareAltSquare: ImageVector
    get() = _ShareAltSquare ?: UXIcon(name = "ShareAltSquare") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 0f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(24f)
                lineTo(24f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(21f, 21f)
                lineTo(3f, 21f)
                lineTo(3f, 3.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(17f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(17.5f)
                close()
                moveTo(12.97f, 10.21f)
                lineToRelative(-2.06f, 1.1f)
                curveToRelative(0.05f, 0.22f, 0.08f, 0.45f, 0.08f, 0.69f)
                reflectiveCurveToRelative(-0.03f, 0.47f, -0.08f, 0.69f)
                lineToRelative(2.06f, 1.1f)
                curveToRelative(0.53f, -0.49f, 1.24f, -0.79f, 2.02f, -0.79f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                curveToRelative(0f, -0.15f, 0.01f, -0.3f, 0.03f, -0.45f)
                lineToRelative(-2.2f, -1.18f)
                curveToRelative(-0.51f, 0.39f, -1.14f, 0.62f, -1.83f, 0.62f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                curveToRelative(0.69f, 0f, 1.32f, 0.23f, 1.83f, 0.62f)
                lineToRelative(2.2f, -1.18f)
                curveToRelative(-0.02f, -0.15f, -0.03f, -0.3f, -0.03f, -0.45f)
                curveToRelative(0f, -1.66f, 1.34f, -3f, 3f, -3f)
                reflectiveCurveToRelative(3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                curveToRelative(-0.78f, 0f, -1.49f, -0.3f, -2.02f, -0.79f)
                close()
            }
        }.also { _ShareAltSquare = it}
