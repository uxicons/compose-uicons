package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HouseChimney: ImageVector? = null

val Icons.Sc.HouseChimney: ImageVector
    get() = _HouseChimney ?: UXIcon(name = "HouseChimney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.5f, 6.58f)
                curveToRelative(0.0f, -0.03f, 0.0f, -0.05f, 0.0f, -0.08f)
                verticalLineToRelative(-3.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(1.28f)
                curveToRelative(-2.25f, -1.53f, -5.12f, -3.28f, -6.5f, -3.28f)
                curveToRelative(-2.08f, 0f, -7.56f, 3.98f, -9.19f, 5.2f)
                curveToRelative(-0.13f, 0.1f, -0.24f, 0.23f, -0.31f, 0.38f)
                curveToRelative(-0.06f, 0.13f, -1.5f, 3.26f, -1.5f, 8.43f)
                curveToRelative(0f, 2.13f, 0.48f, 6.9f, 0.51f, 7.1f)
                curveToRelative(0.05f, 0.51f, 0.48f, 0.9f, 0.99f, 0.9f)
                horizontalLineToRelative(6f)
                curveToRelative(0.3f, 0f, 0.57f, -0.14f, 0.77f, -0.36f)
                curveToRelative(0.41f, -0.45f, 0.14f, -1.2f, 0.14f, -1.2f)
                curveToRelative(-0.15f, -0.77f, -0.41f, -2.06f, -0.41f, -3.44f)
                curveToRelative(0f, -1.52f, 0.2f, -2.91f, 0.33f, -3.65f)
                curveToRelative(0.56f, -0.15f, 1.53f, -0.35f, 2.67f, -0.35f)
                curveToRelative(1.14f, 0f, 2.11f, 0.2f, 2.67f, 0.35f)
                curveToRelative(0.13f, 0.74f, 0.33f, 2.13f, 0.33f, 3.65f)
                curveToRelative(0f, 1.38f, -0.26f, 2.67f, -0.41f, 3.44f)
                curveToRelative(0f, 0f, -0.27f, 0.72f, 0.14f, 1.2f)
                curveToRelative(0.19f, 0.23f, 0.47f, 0.36f, 0.77f, 0.36f)
                horizontalLineToRelative(6f)
                curveToRelative(0.51f, 0f, 0.94f, -0.39f, 0.99f, -0.9f)
                curveToRelative(0.02f, -0.2f, 0.51f, -4.98f, 0.51f, -7.1f)
                curveToRelative(0f, -5.14f, -1.43f, -8.27f, -1.5f, -8.42f)
                close()
            }
        }.also { _HouseChimney = it}
