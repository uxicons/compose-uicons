package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Student: ImageVector? = null

val Icons.Sr.Student: ImageVector
    get() = _Student ?: UXIcon(name = "Student") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.0f, 4.5f)
                curveToRelative(0.0f, -0.86f, -0.53f, -1.61f, -1.34f, -1.9f)
                lineTo(14.2f, 0.32f)
                curveToRelative(-1.39f, -0.49f, -2.92f, -0.49f, -4.3f, -0.01f)
                lineTo(3.35f, 2.6f)
                curveToRelative(-0.82f, 0.29f, -1.35f, 1.03f, -1.35f, 1.9f)
                curveToRelative(0f, 0.87f, 0.53f, 1.61f, 1.35f, 1.9f)
                lineToRelative(6.51f, 2.27f)
                curveToRelative(0.69f, 0.24f, 1.41f, 0.36f, 2.14f, 0.36f)
                reflectiveCurveToRelative(1.45f, -0.12f, 2.14f, -0.36f)
                lineToRelative(5.86f, -2.04f)
                verticalLineToRelative(4.38f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, 0f, 0.0f, -6.49f, 0.0f, -6.5f)
                close()
                moveTo(14.79f, 10.55f)
                lineToRelative(3.21f, -1.12f)
                verticalLineToRelative(0.56f)
                curveToRelative(0f, 3.31f, -2.69f, 6f, -6f, 6f)
                reflectiveCurveToRelative(-6f, -2.69f, -6f, -6f)
                verticalLineToRelative(-0.56f)
                lineToRelative(3.2f, 1.12f)
                curveToRelative(1.8f, 0.63f, 3.79f, 0.63f, 5.59f, 0f)
                close()
                moveTo(19f, 24f)
                lineTo(5f, 24f)
                curveToRelative(-0.32f, 0f, -0.62f, -0.15f, -0.81f, -0.41f)
                reflectiveCurveToRelative(-0.24f, -0.59f, -0.15f, -0.89f)
                curveToRelative(1.04f, -3.36f, 4.32f, -5.7f, 7.96f, -5.7f)
                reflectiveCurveToRelative(6.91f, 2.35f, 7.96f, 5.7f)
                curveToRelative(0.09f, 0.3f, 0.04f, 0.63f, -0.15f, 0.89f)
                reflectiveCurveToRelative(-0.49f, 0.41f, -0.81f, 0.41f)
                close()
            }
        }.also { _Student = it}
