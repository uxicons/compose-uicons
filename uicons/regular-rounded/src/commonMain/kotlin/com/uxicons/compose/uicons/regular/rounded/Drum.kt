package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Drum: ImageVector? = null

val Icons.Rr.Drum: ImageVector
    get() = _Drum ?: UXIcon(name = "Drum") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 6.29f)
                curveToRelative(-0.4f, -0.39f, -1.03f, -0.38f, -1.41f, 0.02f)
                curveToRelative(-0.39f, 0.4f, -0.38f, 1.03f, 0.02f, 1.41f)
                curveToRelative(0.6f, 0.58f, 0.9f, 1.18f, 0.9f, 1.78f)
                curveToRelative(0f, 2.13f, -4.11f, 4.5f, -10f, 4.5f)
                reflectiveCurveTo(2f, 11.63f, 2f, 9.5f)
                reflectiveCurveToRelative(4.11f, -4.5f, 10f, -4.5f)
                curveToRelative(0.64f, 0f, 1.28f, 0.03f, 1.91f, 0.09f)
                curveToRelative(0.57f, 0.05f, 1.04f, -0.35f, 1.09f, -0.9f)
                curveToRelative(0.05f, -0.55f, -0.35f, -1.04f, -0.9f, -1.09f)
                curveToRelative(-0.69f, -0.06f, -1.39f, -0.1f, -2.09f, -0.1f)
                curveTo(5.27f, 3f, 0f, 5.86f, 0f, 9.5f)
                verticalLineToRelative(8f)
                curveToRelative(0f, 3.65f, 5.27f, 6.5f, 12f, 6.5f)
                reflectiveCurveToRelative(12f, -2.85f, 12f, -6.5f)
                verticalLineToRelative(-8f)
                curveToRelative(0f, -1.14f, -0.52f, -2.26f, -1.5f, -3.21f)
                close()
                moveTo(11f, 21.98f)
                curveToRelative(-1.48f, -0.07f, -2.82f, -0.29f, -4f, -0.61f)
                verticalLineToRelative(-5.94f)
                curveToRelative(1.23f, 0.3f, 2.58f, 0.49f, 4f, 0.55f)
                verticalLineToRelative(6.0f)
                close()
                moveTo(13f, 15.98f)
                curveToRelative(1.42f, -0.06f, 2.77f, -0.25f, 4f, -0.55f)
                verticalLineToRelative(5.94f)
                curveToRelative(-1.18f, 0.32f, -2.52f, 0.54f, -4f, 0.61f)
                verticalLineToRelative(-6.0f)
                close()
                moveTo(2f, 17.5f)
                verticalLineToRelative(-4.36f)
                curveToRelative(0.8f, 0.65f, 1.82f, 1.22f, 3f, 1.67f)
                verticalLineToRelative(5.83f)
                curveToRelative(-1.89f, -0.87f, -3f, -2.04f, -3f, -3.15f)
                close()
                moveTo(19f, 20.65f)
                verticalLineToRelative(-5.83f)
                curveToRelative(1.18f, -0.45f, 2.2f, -1.02f, 3f, -1.67f)
                verticalLineToRelative(4.36f)
                curveToRelative(0f, 1.11f, -1.11f, 2.28f, -3f, 3.15f)
                close()
                moveTo(12.29f, 9.26f)
                lineTo(22.31f, 0.26f)
                curveToRelative(0.41f, -0.37f, 1.04f, -0.34f, 1.41f, 0.07f)
                curveToRelative(0.37f, 0.41f, 0.34f, 1.04f, -0.07f, 1.41f)
                lineToRelative(-10.01f, 9f)
                curveToRelative(-0.19f, 0.17f, -0.43f, 0.26f, -0.67f, 0.26f)
                curveToRelative(-0.27f, 0f, -0.55f, -0.11f, -0.74f, -0.33f)
                curveToRelative(-0.37f, -0.41f, -0.34f, -1.04f, 0.07f, -1.41f)
                close()
            }
        }.also { _Drum = it}
