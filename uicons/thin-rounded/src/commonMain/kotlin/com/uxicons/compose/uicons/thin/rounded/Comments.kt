package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Comments: ImageVector? = null

val Icons.Tr.Comments: ImageVector
    get() = _Comments ?: UXIcon(name = "Comments") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8.69f, 18f)
                lineTo(3.5f, 18f)
                curveToRelative(-2.29f, 0f, -3.5f, -1.21f, -3.5f, -3.5f)
                verticalLineToRelative(-5.19f)
                curveTo(0f, 4.6f, 3.82f, 0.34f, 8.35f, 0.02f)
                curveToRelative(2.6f, -0.18f, 5.16f, 0.77f, 7.01f, 2.62f)
                curveToRelative(1.85f, 1.85f, 2.81f, 4.42f, 2.62f, 7.04f)
                curveToRelative(-0.32f, 4.51f, -4.57f, 8.33f, -9.29f, 8.33f)
                close()
                moveTo(8.98f, 1f)
                curveToRelative(-0.19f, 0f, -0.38f, 0.01f, -0.57f, 0.02f)
                curveTo(4.4f, 1.3f, 1f, 5.1f, 1f, 9.31f)
                verticalLineToRelative(5.19f)
                curveToRelative(0f, 1.73f, 0.77f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(5.18f)
                curveToRelative(4.21f, 0f, 8.01f, -3.39f, 8.29f, -7.4f)
                curveToRelative(0.17f, -2.33f, -0.69f, -4.61f, -2.33f, -6.26f)
                curveToRelative(-1.51f, -1.51f, -3.54f, -2.35f, -5.66f, -2.35f)
                close()
                moveTo(24.0f, 21.0f)
                verticalLineToRelative(-4.73f)
                curveToRelative(0f, -2.7f, -1.42f, -5.35f, -3.72f, -6.93f)
                curveToRelative(-0.23f, -0.16f, -0.54f, -0.1f, -0.69f, 0.13f)
                curveToRelative(-0.16f, 0.23f, -0.1f, 0.54f, 0.13f, 0.69f)
                curveToRelative(2.02f, 1.39f, 3.28f, 3.73f, 3.28f, 6.11f)
                verticalLineToRelative(4.73f)
                curveToRelative(0f, 1.65f, -1.09f, 2.0f, -2f, 2.0f)
                horizontalLineToRelative(-4.72f)
                curveToRelative(-2.37f, 0f, -4.71f, -1.26f, -6.11f, -3.28f)
                curveToRelative(-0.16f, -0.23f, -0.47f, -0.28f, -0.69f, -0.13f)
                reflectiveCurveToRelative(-0.28f, 0.47f, -0.13f, 0.69f)
                curveToRelative(1.58f, 2.29f, 4.23f, 3.72f, 6.93f, 3.72f)
                horizontalLineToRelative(4.72f)
                curveToRelative(1.85f, 0f, 3f, -1.15f, 3f, -3.0f)
                close()
            }
        }.also { _Comments = it}
