package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PersonStress: ImageVector? = null

val Icons.Rr.PersonStress: ImageVector
    get() = _PersonStress ?: UXIcon(name = "PersonStress") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 10f)
                curveToRelative(1.66f, 0f, 3f, 1.34f, 3f, 3f)
                reflectiveCurveToRelative(-1.34f, 3f, -3f, 3f)
                reflectiveCurveToRelative(-3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                close()
                moveTo(21f, 9f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.65f)
                curveToRelative(0f, 0.41f, -0.25f, 0.78f, -0.63f, 0.93f)
                lineToRelative(-3.56f, 1.43f)
                horizontalLineToRelative(-7.62f)
                lineToRelative(-3.56f, -1.43f)
                curveToRelative(-0.38f, -0.15f, -0.63f, -0.52f, -0.63f, -0.93f)
                verticalLineToRelative(-4.65f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(4.65f)
                curveToRelative(0f, 1.23f, 0.74f, 2.33f, 1.89f, 2.79f)
                lineToRelative(3.11f, 1.25f)
                verticalLineToRelative(4.32f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-4.32f)
                lineToRelative(3.12f, -1.25f)
                curveToRelative(1.15f, -0.46f, 1.89f, -1.55f, 1.89f, -2.79f)
                verticalLineToRelative(-4.65f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(4.85f, 6.68f)
                curveToRelative(0.22f, 0.41f, 0.78f, 0.49f, 1.1f, 0.16f)
                lineToRelative(1.64f, -1.64f)
                lineToRelative(1.22f, 2.45f)
                curveToRelative(0.2f, 0.39f, 0.73f, 0.46f, 1.01f, 0.12f)
                curveToRelative(0.11f, -0.13f, 0.16f, -0.31f, 0.14f, -0.48f)
                lineToRelative(-0.83f, -5.72f)
                curveToRelative(-0.11f, -0.53f, -0.77f, -0.73f, -1.15f, -0.35f)
                lineToRelative(-1.63f, 1.63f)
                lineTo(5.25f, 0.41f)
                curveToRelative(-0.22f, -0.46f, -0.82f, -0.56f, -1.18f, -0.2f)
                lineToRelative(-1.12f, 1.12f)
                curveToRelative(-0.27f, 0.27f, -0.33f, 0.67f, -0.17f, 1.01f)
                lineToRelative(2.07f, 4.34f)
                close()
                moveTo(15.15f, 7.65f)
                lineToRelative(1.22f, -2.45f)
                lineToRelative(1.64f, 1.64f)
                curveToRelative(0.33f, 0.33f, 0.89f, 0.25f, 1.1f, -0.16f)
                lineToRelative(2.07f, -4.34f)
                curveToRelative(0.17f, -0.34f, 0.1f, -0.74f, -0.17f, -1.01f)
                lineToRelative(-1.12f, -1.12f)
                curveToRelative(-0.36f, -0.36f, -0.96f, -0.26f, -1.18f, 0.2f)
                lineToRelative(-1.1f, 2.44f)
                lineToRelative(-1.63f, -1.63f)
                curveToRelative(-0.39f, -0.39f, -1.04f, -0.19f, -1.15f, 0.35f)
                lineToRelative(-0.83f, 5.72f)
                curveToRelative(-0.03f, 0.17f, 0.02f, 0.34f, 0.14f, 0.48f)
                curveToRelative(0.28f, 0.34f, 0.82f, 0.28f, 1.01f, -0.12f)
                close()
            }
        }.also { _PersonStress = it}
