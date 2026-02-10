package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PenSlash: ImageVector? = null

val Icons.Tr.PenSlash: ImageVector
    get() = _PenSlash ?: UXIcon(name = "PenSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.33f, 15.62f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(-6.24f, 6.24f)
                curveToRelative(-0.92f, 0.92f, -2.15f, 1.43f, -3.45f, 1.43f)
                lineTo(0.5f, 24f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-2.13f)
                curveToRelative(0f, -1.3f, 0.51f, -2.53f, 1.43f, -3.45f)
                lineToRelative(6.36f, -6.36f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                reflectiveCurveToRelative(0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(-6.36f, 6.36f)
                curveToRelative(-0.73f, 0.73f, -1.14f, 1.71f, -1.14f, 2.74f)
                verticalLineToRelative(1.63f)
                horizontalLineToRelative(1.63f)
                curveToRelative(1.04f, 0f, 2.01f, -0.4f, 2.74f, -1.14f)
                lineToRelative(6.24f, -6.24f)
                curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0f)
                close()
                moveTo(23.85f, 23.85f)
                curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f)
                reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f)
                lineTo(0.15f, 0.85f)
                curveTo(-0.05f, 0.66f, -0.05f, 0.34f, 0.15f, 0.15f)
                reflectiveCurveTo(0.66f, -0.05f, 0.85f, 0.15f)
                lineToRelative(9.15f, 9.15f)
                lineTo(18.38f, 0.96f)
                curveToRelative(1.28f, -1.28f, 3.37f, -1.28f, 4.65f, 0f)
                reflectiveCurveToRelative(1.28f, 3.37f, 0f, 4.65f)
                lineToRelative(-8.33f, 8.38f)
                lineToRelative(9.15f, 9.15f)
                curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0f, 0.71f)
                close()
                moveTo(16.09f, 4.65f)
                lineToRelative(3.26f, 3.26f)
                lineToRelative(2.98f, -3.0f)
                curveToRelative(0.89f, -0.9f, 0.89f, -2.35f, 0f, -3.24f)
                curveToRelative(-0.89f, -0.89f, -2.35f, -0.89f, -3.24f, 0f)
                lineToRelative(-3.0f, 2.98f)
                close()
                moveTo(10.71f, 10f)
                lineToRelative(3.29f, 3.29f)
                lineToRelative(4.65f, -4.67f)
                lineToRelative(-3.26f, -3.26f)
                lineToRelative(-4.67f, 4.65f)
                close()
            }
        }.also { _PenSlash = it}
