package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Badge: ImageVector? = null

val Icons.Tr.Badge: ImageVector
    get() = _Badge ?: UXIcon(name = "Badge") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20f, 8f)
                curveTo(20f, 3.59f, 16.41f, 0f, 12f, 0f)
                reflectiveCurveTo(4f, 3.59f, 4f, 8f)
                curveToRelative(0f, 2.02f, 0.76f, 3.87f, 2.01f, 5.28f)
                curveToRelative(0f, 0.01f, -0.01f, 8.57f, -0.01f, 8.57f)
                curveToRelative(0f, 0.83f, 0.47f, 1.58f, 1.22f, 1.94f)
                curveToRelative(0.75f, 0.36f, 1.62f, 0.26f, 2.27f, -0.26f)
                lineToRelative(1.79f, -1.43f)
                curveToRelative(0.42f, -0.34f, 1.01f, -0.34f, 1.44f, 0f)
                lineToRelative(1.79f, 1.43f)
                curveToRelative(0.39f, 0.31f, 0.86f, 0.47f, 1.34f, 0.47f)
                curveToRelative(0.32f, 0f, 0.64f, -0.07f, 0.94f, -0.21f)
                curveToRelative(0.75f, -0.36f, 1.22f, -1.1f, 1.22f, -1.94f)
                curveToRelative(0f, 0f, -0.01f, -8.56f, -0.01f, -8.57f)
                curveToRelative(1.24f, -1.41f, 2.01f, -3.26f, 2.01f, -5.28f)
                close()
                moveTo(12f, 1f)
                curveToRelative(3.86f, 0f, 7f, 3.14f, 7f, 7f)
                reflectiveCurveToRelative(-3.14f, 7f, -7f, 7f)
                reflectiveCurveToRelative(-7f, -3.14f, -7f, -7f)
                reflectiveCurveTo(8.14f, 1f, 12f, 1f)
                close()
                moveTo(16.35f, 22.88f)
                curveToRelative(-0.41f, 0.2f, -0.86f, 0.15f, -1.22f, -0.14f)
                lineToRelative(-1.79f, -1.43f)
                curveToRelative(-0.79f, -0.63f, -1.9f, -0.63f, -2.69f, 0f)
                lineToRelative(-1.79f, 1.43f)
                curveToRelative(-0.35f, 0.28f, -0.81f, 0.33f, -1.22f, 0.14f)
                curveToRelative(-0.41f, -0.2f, -0.65f, -0.58f, -0.65f, -1.04f)
                verticalLineToRelative(-7.61f)
                curveToRelative(1.37f, 1.1f, 3.11f, 1.76f, 5f, 1.76f)
                reflectiveCurveToRelative(3.63f, -0.66f, 5f, -1.76f)
                verticalLineToRelative(7.61f)
                curveToRelative(0f, 0.45f, -0.24f, 0.84f, -0.65f, 1.04f)
                close()
            }
        }.also { _Badge = it}
