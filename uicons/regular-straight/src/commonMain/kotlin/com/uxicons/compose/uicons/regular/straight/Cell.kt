package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cell: ImageVector? = null

val Icons.Rs.Cell: ImageVector
    get() = _Cell ?: UXIcon(name = "Cell") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.75f, 2.64f)
                lineToRelative(-4f, -2.31f)
                curveToRelative(-0.77f, -0.44f, -1.73f, -0.44f, -2.5f, 0f)
                lineToRelative(-4.25f, 2.45f)
                lineToRelative(-4.25f, -2.45f)
                curveToRelative(-0.77f, -0.44f, -1.73f, -0.44f, -2.5f, 0f)
                lineToRelative(-4.0f, 2.31f)
                curveToRelative(-0.77f, 0.45f, -1.25f, 1.27f, -1.25f, 2.17f)
                verticalLineToRelative(4.8f)
                curveToRelative(0f, 0.89f, 0.48f, 1.72f, 1.25f, 2.17f)
                lineToRelative(4.25f, 2.45f)
                verticalLineToRelative(4.97f)
                curveToRelative(0f, 0.89f, 0.48f, 1.72f, 1.25f, 2.17f)
                lineToRelative(4f, 2.31f)
                curveToRelative(0.39f, 0.22f, 0.82f, 0.33f, 1.25f, 0.33f)
                reflectiveCurveToRelative(0.86f, -0.11f, 1.25f, -0.33f)
                lineToRelative(4f, -2.31f)
                curveToRelative(0.77f, -0.45f, 1.25f, -1.28f, 1.25f, -2.17f)
                verticalLineToRelative(-4.97f)
                lineToRelative(4.25f, -2.45f)
                curveToRelative(0.77f, -0.45f, 1.25f, -1.27f, 1.25f, -2.17f)
                verticalLineToRelative(-4.8f)
                curveToRelative(0f, -0.89f, -0.48f, -1.72f, -1.25f, -2.17f)
                close()
                moveTo(2f, 9.6f)
                verticalLineToRelative(-4.8f)
                curveToRelative(0f, -0.18f, 0.1f, -0.34f, 0.25f, -0.43f)
                lineToRelative(4f, -2.31f)
                curveToRelative(0.08f, -0.04f, 0.16f, -0.07f, 0.25f, -0.07f)
                reflectiveCurveToRelative(0.17f, 0.02f, 0.25f, 0.07f)
                lineToRelative(4.25f, 2.45f)
                verticalLineToRelative(5.38f)
                lineToRelative(-4.5f, 2.6f)
                lineToRelative(-4.25f, -2.45f)
                curveToRelative(-0.15f, -0.09f, -0.25f, -0.26f, -0.25f, -0.43f)
                close()
                moveTo(16.25f, 19.63f)
                lineTo(12.25f, 21.93f)
                curveToRelative(-0.15f, 0.09f, -0.35f, 0.09f, -0.5f, 0f)
                lineToRelative(-4f, -2.31f)
                curveToRelative(-0.15f, -0.09f, -0.25f, -0.26f, -0.25f, -0.43f)
                verticalLineToRelative(-4.97f)
                lineToRelative(4.5f, -2.6f)
                lineToRelative(4.5f, 2.6f)
                verticalLineToRelative(4.97f)
                curveToRelative(0f, 0.18f, -0.1f, 0.34f, -0.25f, 0.43f)
                close()
                moveTo(22f, 9.6f)
                curveToRelative(0f, 0.18f, -0.1f, 0.34f, -0.25f, 0.43f)
                lineToRelative(-4.25f, 2.45f)
                lineToRelative(-4.5f, -2.6f)
                verticalLineToRelative(-5.37f)
                lineToRelative(4.25f, -2.45f)
                curveToRelative(0.15f, -0.09f, 0.35f, -0.09f, 0.5f, 0f)
                lineToRelative(4.0f, 2.31f)
                curveToRelative(0.15f, 0.09f, 0.25f, 0.25f, 0.25f, 0.43f)
                verticalLineToRelative(4.8f)
                close()
            }
        }.also { _Cell = it}
