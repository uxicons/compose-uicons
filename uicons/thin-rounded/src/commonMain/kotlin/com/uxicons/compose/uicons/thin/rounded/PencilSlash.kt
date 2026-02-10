package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PencilSlash: ImageVector? = null

val Icons.Tr.PencilSlash: ImageVector
    get() = _PencilSlash ?: UXIcon(name = "PencilSlash") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(11.62f, 15.62f)
                lineToRelative(-5.65f, 5.65f)
                lineToRelative(-3.24f, -3.24f)
                lineToRelative(5.76f, -5.76f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                lineToRelative(-6.36f, 6.36f)
                curveToRelative(-0.92f, 0.92f, -1.43f, 2.15f, -1.43f, 3.45f)
                verticalLineToRelative(2.13f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.13f)
                curveToRelative(1.3f, 0f, 2.53f, -0.51f, 3.45f, -1.43f)
                lineToRelative(6.24f, -6.24f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                reflectiveCurveToRelative(-0.51f, -0.2f, -0.71f, 0f)
                close()
                moveTo(1f, 23f)
                verticalLineToRelative(-1.63f)
                curveToRelative(0f, -0.98f, 0.36f, -1.91f, 1.03f, -2.63f)
                lineToRelative(3.23f, 3.23f)
                curveToRelative(-0.72f, 0.67f, -1.65f, 1.03f, -2.63f, 1.03f)
                horizontalLineToRelative(-1.63f)
                close()
                moveTo(23.85f, 23.15f)
                lineToRelative(-9.15f, -9.15f)
                lineToRelative(8.33f, -8.38f)
                curveToRelative(1.28f, -1.28f, 1.28f, -3.37f, 0f, -4.65f)
                curveToRelative(-1.28f, -1.28f, -3.37f, -1.28f, -4.65f, 0f)
                lineToRelative(-8.38f, 8.33f)
                lineTo(0.85f, 0.15f)
                curveTo(0.66f, -0.05f, 0.34f, -0.05f, 0.15f, 0.15f)
                reflectiveCurveTo(-0.05f, 0.66f, 0.15f, 0.85f)
                lineToRelative(23f, 23f)
                curveToRelative(0.1f, 0.1f, 0.23f, 0.15f, 0.35f, 0.15f)
                reflectiveCurveToRelative(0.26f, -0.05f, 0.35f, -0.15f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                close()
                moveTo(19.09f, 1.67f)
                curveToRelative(0.89f, -0.89f, 2.35f, -0.89f, 3.24f, 0f)
                curveToRelative(0.89f, 0.89f, 0.89f, 2.35f, 0f, 3.24f)
                lineToRelative(-2.98f, 3.0f)
                lineToRelative(-3.26f, -3.26f)
                lineToRelative(3.0f, -2.98f)
                close()
                moveTo(15.38f, 5.36f)
                lineToRelative(3.26f, 3.26f)
                lineToRelative(-4.65f, 4.67f)
                lineToRelative(-3.29f, -3.29f)
                lineToRelative(4.67f, -4.65f)
                close()
            }
        }.also { _PencilSlash = it}
