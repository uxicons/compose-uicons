package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Windsock: ImageVector? = null

val Icons.Sc.Windsock: ImageVector
    get() = _Windsock ?: UXIcon(name = "Windsock") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.99f, 3.82f)
                curveToRelative(0f, -1.56f, -1.28f, -2.82f, -2.86f, -2.82f)
                reflectiveCurveTo(1.27f, 2.27f, 1.27f, 3.82f)
                curveToRelative(0f, 1.01f, 0.55f, 1.9f, 1.36f, 2.4f)
                curveToRelative(0f, 0.01f, 0f, 0.02f, 0f, 0.03f)
                verticalLineToRelative(15.24f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                verticalLineToRelative(-1.81f)
                curveToRelative(0.87f, -0.07f, 2.1f, -0.18f, 3.47f, -0.33f)
                verticalLineTo(5.22f)
                curveToRelative(-0.86f, -0.1f, -1.67f, -0.18f, -2.37f, -0.24f)
                curveToRelative(0.16f, -0.35f, 0.26f, -0.75f, 0.26f, -1.16f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(22.59f, 10.23f)
                curveToRelative(-0.15f, -0.26f, -1.41f, -2.18f, -5.67f, -3.56f)
                verticalLineToRelative(11.23f)
                curveToRelative(4.26f, -1.38f, 5.52f, -3.3f, 5.67f, -3.56f)
                curveToRelative(0.09f, -0.15f, 0.14f, -0.33f, 0.14f, -0.51f)
                verticalLineToRelative(-3.1f)
                curveToRelative(0f, -0.18f, -0.05f, -0.35f, -0.14f, -0.51f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.1f, 5.47f)
                verticalLineToRelative(13.64f)
                curveToRelative(0.94f, -0.13f, 1.88f, -0.28f, 2.78f, -0.45f)
                curveToRelative(0.36f, -0.07f, 0.7f, -0.14f, 1.04f, -0.22f)
                verticalLineTo(6.13f)
                curveToRelative(-0.33f, -0.08f, -0.68f, -0.15f, -1.04f, -0.22f)
                curveToRelative(-0.9f, -0.17f, -1.85f, -0.32f, -2.78f, -0.45f)
                close()
            }
        }.also { _Windsock = it}
