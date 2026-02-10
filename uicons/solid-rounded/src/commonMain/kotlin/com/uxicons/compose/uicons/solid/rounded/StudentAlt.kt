package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _StudentAlt: ImageVector? = null

val Icons.Sr.StudentAlt: ImageVector
    get() = _StudentAlt ?: UXIcon(name = "StudentAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24.0f, 5.51f)
                curveToRelative(0.0f, -0.98f, -0.58f, -1.82f, -1.48f, -2.15f)
                lineTo(14.62f, 0.46f)
                curveToRelative(-1.66f, -0.61f, -3.48f, -0.61f, -5.14f, -0.01f)
                lineTo(1.49f, 3.36f)
                curveTo(0.58f, 3.69f, 0.0f, 4.54f, 0.0f, 5.51f)
                curveToRelative(0f, 0.98f, 0.58f, 1.82f, 1.49f, 2.15f)
                lineToRelative(7.95f, 2.89f)
                curveToRelative(0.82f, 0.3f, 1.69f, 0.45f, 2.55f, 0.45f)
                reflectiveCurveToRelative(1.73f, -0.15f, 2.55f, -0.45f)
                lineToRelative(7.46f, -2.71f)
                verticalLineToRelative(4.15f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, 0f, 0.0f, -6.48f, 0.0f, -6.49f)
                close()
                moveTo(2.2f, 16.04f)
                curveToRelative(2.09f, 0.52f, 6.05f, 1.65f, 8.8f, 1.9f)
                verticalLineToRelative(4.11f)
                curveToRelative(-2.75f, 0.25f, -6.71f, 1.38f, -8.8f, 1.9f)
                curveToRelative(-1.12f, 0.28f, -2.2f, -0.57f, -2.2f, -1.73f)
                verticalLineToRelative(-4.46f)
                curveToRelative(0f, -1.16f, 1.08f, -2.01f, 2.2f, -1.73f)
                close()
                moveTo(24f, 17.77f)
                verticalLineToRelative(4.46f)
                curveToRelative(0f, 1.16f, -1.08f, 2.01f, -2.2f, 1.73f)
                curveToRelative(-2.09f, -0.52f, -6.05f, -1.65f, -8.8f, -1.9f)
                verticalLineToRelative(-4.11f)
                curveToRelative(2.75f, -0.25f, 6.71f, -1.38f, 8.8f, -1.9f)
                curveToRelative(1.12f, -0.28f, 2.2f, 0.57f, 2.2f, 1.73f)
                close()
                moveTo(5f, 14.7f)
                verticalLineToRelative(-3.63f)
                lineToRelative(3.76f, 1.36f)
                curveToRelative(2.07f, 0.75f, 4.39f, 0.75f, 6.47f, 0f)
                lineToRelative(3.77f, -1.37f)
                verticalLineToRelative(3.63f)
                curveToRelative(-1.95f, 0.5f, -4.5f, 1.33f, -7f, 1.33f)
                reflectiveCurveToRelative(-5.05f, -0.83f, -7f, -1.33f)
                close()
            }
        }.also { _StudentAlt = it}
