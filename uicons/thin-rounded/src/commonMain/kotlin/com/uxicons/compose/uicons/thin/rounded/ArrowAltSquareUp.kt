package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowAltSquareUp: ImageVector? = null

val Icons.Tr.ArrowAltSquareUp: ImageVector
    get() = _ArrowAltSquareUp ?: UXIcon(name = "ArrowAltSquareUp") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
                moveTo(12.91f, 5.38f)
                curveToRelative(-0.48f, -0.49f, -1.33f, -0.49f, -1.81f, 0f)
                lineToRelative(-4.36f, 4.42f)
                curveToRelative(-0.37f, 0.37f, -0.47f, 0.93f, -0.27f, 1.41f)
                curveToRelative(0.2f, 0.49f, 0.66f, 0.79f, 1.18f, 0.79f)
                horizontalLineToRelative(3.86f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-6.5f)
                horizontalLineToRelative(3.86f)
                curveToRelative(0.52f, 0f, 0.98f, -0.3f, 1.18f, -0.79f)
                curveToRelative(0.2f, -0.48f, 0.1f, -1.04f, -0.27f, -1.41f)
                lineToRelative(-4.36f, -4.42f)
                close()
                moveTo(16.62f, 10.82f)
                curveToRelative(-0.02f, 0.05f, -0.09f, 0.17f, -0.26f, 0.17f)
                lineTo(7.64f, 11.0f)
                curveToRelative(-0.17f, 0f, -0.23f, -0.12f, -0.26f, -0.17f)
                curveToRelative(-0.02f, -0.06f, -0.06f, -0.2f, 0.06f, -0.32f)
                lineToRelative(4.36f, -4.42f)
                curveToRelative(0.05f, -0.05f, 0.12f, -0.08f, 0.2f, -0.08f)
                reflectiveCurveToRelative(0.14f, 0.03f, 0.2f, 0.08f)
                lineToRelative(4.36f, 4.42f)
                curveToRelative(0.12f, 0.13f, 0.08f, 0.27f, 0.06f, 0.32f)
                close()
            }
        }.also { _ArrowAltSquareUp = it}
