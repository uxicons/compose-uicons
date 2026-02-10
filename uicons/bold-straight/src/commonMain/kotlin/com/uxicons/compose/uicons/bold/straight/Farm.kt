package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Farm: ImageVector? = null

val Icons.Bs.Farm: ImageVector
    get() = _Farm ?: UXIcon(name = "Farm") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14f, 8f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                close()
                moveTo(24f, 10.5f)
                verticalLineToRelative(13.5f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3.21f)
                lineToRelative(-1.63f, -1.33f)
                lineToRelative(1.63f, -1.33f)
                verticalLineToRelative(-3.12f)
                horizontalLineToRelative(-0.93f)
                lineToRelative(-3.08f, 2.52f)
                lineToRelative(-3.08f, -2.52f)
                horizontalLineToRelative(-0.93f)
                verticalLineToRelative(3.12f)
                lineToRelative(1.63f, 1.33f)
                lineToRelative(-1.63f, 1.33f)
                verticalLineToRelative(3.21f)
                lineTo(0f, 24f)
                lineTo(0f, 10.5f)
                curveToRelative(0f, -0.68f, 0.2f, -1.33f, 0.57f, -1.89f)
                lineTo(3.75f, 3.84f)
                curveToRelative(0.37f, -0.55f, 0.88f, -0.98f, 1.49f, -1.24f)
                lineTo(10.66f, 0.28f)
                curveToRelative(0.85f, -0.36f, 1.83f, -0.36f, 2.69f, 0f)
                lineToRelative(5.41f, 2.32f)
                curveToRelative(0.61f, 0.26f, 1.12f, 0.69f, 1.49f, 1.24f)
                lineToRelative(3.18f, 4.77f)
                curveToRelative(0.38f, 0.56f, 0.57f, 1.22f, 0.57f, 1.89f)
                close()
                moveTo(21f, 10.5f)
                curveToRelative(0f, -0.08f, -0.02f, -0.16f, -0.07f, -0.23f)
                lineToRelative(-3.18f, -4.77f)
                curveToRelative(-0.04f, -0.07f, -0.11f, -0.12f, -0.18f, -0.15f)
                lineToRelative(-5.41f, -2.32f)
                curveToRelative(-0.1f, -0.04f, -0.22f, -0.04f, -0.32f, 0f)
                lineToRelative(-5.41f, 2.32f)
                curveToRelative(-0.07f, 0.03f, -0.14f, 0.08f, -0.18f, 0.15f)
                lineToRelative(-3.18f, 4.77f)
                curveToRelative(-0.04f, 0.07f, -0.07f, 0.15f, -0.07f, 0.23f)
                verticalLineToRelative(10.5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-5.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(7f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(5.5f)
                horizontalLineToRelative(2f)
                lineTo(21.0f, 10.5f)
                close()
                moveTo(8.75f, 24f)
                horizontalLineToRelative(6.44f)
                lineToRelative(-3.19f, -2.61f)
                lineToRelative(-3.25f, 2.61f)
                close()
            }
        }.also { _Farm = it}
