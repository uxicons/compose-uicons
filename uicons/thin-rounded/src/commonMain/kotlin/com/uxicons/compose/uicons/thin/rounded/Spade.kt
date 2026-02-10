package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Spade: ImageVector? = null

val Icons.Tr.Spade: ImageVector
    get() = _Spade ?: UXIcon(name = "Spade") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.25f, 20f)
                curveToRelative(3.17f, 0f, 5.75f, -2.82f, 5.75f, -6.3f)
                curveToRelative(0f, -3.84f, -4.1f, -9.18f, -7.9f, -12.52f)
                curveToRelative(-1.77f, -1.55f, -4.43f, -1.55f, -6.19f, 0f)
                curveTo(5.1f, 4.51f, 1f, 9.86f, 1f, 13.7f)
                curveToRelative(0f, 3.48f, 2.58f, 6.3f, 5.75f, 6.3f)
                curveToRelative(2.12f, 0f, 3.69f, -1.41f, 4.64f, -2.62f)
                curveToRelative(-0.28f, 2.36f, -1.24f, 5.62f, -4.39f, 5.62f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                reflectiveCurveToRelative(0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-3.15f, 0f, -4.11f, -3.26f, -4.39f, -5.62f)
                curveToRelative(0.95f, 1.21f, 2.52f, 2.62f, 4.64f, 2.62f)
                close()
                moveTo(6.75f, 19.01f)
                curveToRelative(-2.62f, 0f, -4.75f, -2.38f, -4.75f, -5.31f)
                curveToRelative(0f, -3.37f, 3.81f, -8.47f, 7.57f, -11.77f)
                curveToRelative(1.39f, -1.22f, 3.48f, -1.22f, 4.87f, 0f)
                curveToRelative(3.76f, 3.3f, 7.56f, 8.4f, 7.56f, 11.77f)
                curveToRelative(0f, 2.93f, -2.13f, 5.31f, -4.75f, 5.31f)
                curveToRelative(-2.98f, 0f, -4.78f, -3.69f, -4.8f, -3.72f)
                curveToRelative(-0.0f, -0.01f, -0.12f, -0.28f, -0.45f, -0.28f)
                reflectiveCurveToRelative(-0.45f, 0.28f, -0.45f, 0.28f)
                curveToRelative(-0.02f, 0.04f, -1.82f, 3.72f, -4.8f, 3.72f)
                close()
                moveTo(14.1f, 23f)
                horizontalLineToRelative(-4.19f)
                curveToRelative(1.01f, -0.83f, 1.69f, -2.1f, 2.1f, -3.56f)
                curveToRelative(0.41f, 1.46f, 1.08f, 2.73f, 2.1f, 3.56f)
                close()
            }
        }.also { _Spade = it}
