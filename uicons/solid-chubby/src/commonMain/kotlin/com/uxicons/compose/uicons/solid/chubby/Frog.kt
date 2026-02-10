package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Frog: ImageVector? = null

val Icons.Sc.Frog: ImageVector
    get() = _Frog ?: UXIcon(name = "Frog") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 3f)
                curveToRelative(0f, -1.43f, 0.57f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.57f, 2f, 2f)
                reflectiveCurveToRelative(-0.57f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.57f, -2f, -2f)
                close()
                moveTo(21.5f, 20f)
                curveToRelative(-0.6f, -0.01f, -1.14f, -0.26f, -1.43f, -0.39f)
                curveToRelative(-0.16f, -0.07f, -3.67f, -1.66f, -4.04f, -7.61f)
                horizontalLineToRelative(0.58f)
                curveToRelative(1.31f, 0f, 2.6f, -0.44f, 4.05f, -1.38f)
                curveToRelative(1.0f, -0.65f, 2.33f, -1.68f, 2.33f, -3.12f)
                reflectiveCurveToRelative(-1.33f, -2.47f, -2.33f, -3.12f)
                curveToRelative(-0.59f, -0.38f, -1.15f, -0.67f, -1.69f, -0.89f)
                curveToRelative(-0.14f, 2.48f, -1.29f, 3.51f, -3.97f, 3.51f)
                curveToRelative(-2.71f, 0f, -3.86f, -1.04f, -3.98f, -3.58f)
                curveToRelative(-6.73f, 1.42f, -10.02f, 5.96f, -10.02f, 13.83f)
                curveToRelative(0f, 4.03f, 1.65f, 5.75f, 5.5f, 5.75f)
                curveToRelative(4.08f, 0f, 7.12f, -0.5f, 7.25f, -0.52f)
                curveToRelative(0.82f, -0.14f, 1.37f, -0.91f, 1.23f, -1.73f)
                curveToRelative(-0.14f, -0.82f, -0.91f, -1.37f, -1.73f, -1.23f)
                curveToRelative(-0.01f, 0.0f, -0.61f, 0.1f, -1.61f, 0.21f)
                curveToRelative(0.2f, -0.63f, 0.36f, -1.35f, 0.36f, -2.23f)
                curveToRelative(0f, -1.94f, -0.56f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(1.87f, 0f, 3.19f, 0.57f, 3.88f, 1.68f)
                curveToRelative(1.2f, 5.58f, 4.92f, 7.43f, 5.49f, 7.68f)
                curveToRelative(0.27f, 0.13f, 1.4f, 0.64f, 2.62f, 0.64f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _Frog = it}
