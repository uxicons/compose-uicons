package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Swap: ImageVector? = null

val Icons.Tr.Swap: ImageVector
    get() = _Swap ?: UXIcon(name = "Swap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.85f, 20.36f)
                lineToRelative(-3.17f, 3.13f)
                curveToRelative(-0.28f, 0.32f, -0.72f, 0.52f, -1.18f, 0.52f)
                reflectiveCurveToRelative(-0.9f, -0.2f, -1.2f, -0.54f)
                lineToRelative(-3.15f, -3.11f)
                curveToRelative(-0.2f, -0.19f, -0.2f, -0.51f, -0.0f, -0.71f)
                curveToRelative(0.19f, -0.2f, 0.51f, -0.2f, 0.71f, -0.0f)
                lineToRelative(3.15f, 3.11f)
                verticalLineTo(7.26f)
                curveToRelative(0f, -1.79f, -1.46f, -3.25f, -3.25f, -3.25f)
                reflectiveCurveToRelative(-3.25f, 1.46f, -3.25f, 3.25f)
                verticalLineToRelative(9.49f)
                curveToRelative(0f, 2.34f, -1.91f, 4.25f, -4.25f, 4.25f)
                reflectiveCurveToRelative(-4.25f, -1.91f, -4.25f, -4.25f)
                verticalLineTo(1.25f)
                lineTo(0.85f, 4.36f)
                curveToRelative(-0.2f, 0.2f, -0.51f, 0.19f, -0.71f, -0.0f)
                curveToRelative(-0.19f, -0.2f, -0.19f, -0.51f, 0.0f, -0.71f)
                lineTo(3.32f, 0.52f)
                curveToRelative(0.24f, -0.27f, 0.56f, -0.52f, 1.18f, -0.52f)
                reflectiveCurveToRelative(0.95f, 0.25f, 1.2f, 0.54f)
                lineToRelative(3.15f, 3.11f)
                curveToRelative(0.2f, 0.19f, 0.2f, 0.51f, 0.0f, 0.71f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                curveToRelative(-0.13f, 0f, -0.25f, -0.05f, -0.35f, -0.14f)
                lineToRelative(-3.15f, -3.11f)
                verticalLineToRelative(15.5f)
                curveToRelative(0f, 1.79f, 1.46f, 3.25f, 3.25f, 3.25f)
                reflectiveCurveToRelative(3.25f, -1.46f, 3.25f, -3.25f)
                verticalLineTo(7.26f)
                curveToRelative(0f, -2.34f, 1.91f, -4.25f, 4.25f, -4.25f)
                reflectiveCurveToRelative(4.25f, 1.91f, 4.25f, 4.25f)
                verticalLineToRelative(15.5f)
                lineToRelative(3.15f, -3.11f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.19f, 0.71f, 0.0f)
                curveToRelative(0.19f, 0.2f, 0.19f, 0.51f, -0.0f, 0.71f)
                close()
            }
        }.also { _Swap = it}
