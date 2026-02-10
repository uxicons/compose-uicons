package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Portrait: ImageVector? = null

val Icons.Sc.Portrait: ImageVector
    get() = _Portrait ?: UXIcon(name = "Portrait") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(10.72f, 9.28f)
                curveToRelative(0.04f, 0.13f, 0.15f, 0.24f, 0.28f, 0.28f)
                curveToRelative(0.67f, 0.23f, 1.32f, 0.23f, 1.99f, 0f)
                curveToRelative(0.13f, -0.04f, 0.24f, -0.15f, 0.28f, -0.28f)
                curveToRelative(0.23f, -0.67f, 0.23f, -1.32f, 0f, -1.99f)
                curveToRelative(-0.04f, -0.13f, -0.15f, -0.24f, -0.28f, -0.28f)
                curveToRelative(-0.34f, -0.11f, -0.67f, -0.17f, -0.99f, -0.17f)
                reflectiveCurveToRelative(-0.66f, 0.06f, -1.0f, 0.17f)
                curveToRelative(-0.13f, 0.04f, -0.24f, 0.15f, -0.28f, 0.28f)
                curveToRelative(-0.23f, 0.67f, -0.23f, 1.32f, 0f, 1.99f)
                horizontalLineToRelative(0f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.81f, 2.86f)
                curveToRelative(-0.1f, -0.33f, -0.36f, -0.58f, -0.69f, -0.67f)
                curveToRelative(-0.17f, -0.05f, -4.27f, -1.19f, -9.12f, -1.19f)
                reflectiveCurveTo(3.05f, 2.14f, 2.88f, 2.19f)
                curveToRelative(-0.33f, 0.09f, -0.59f, 0.35f, -0.69f, 0.67f)
                curveToRelative(-0.05f, 0.16f, -1.19f, 4.01f, -1.19f, 9.14f)
                curveToRelative(0f, 5.17f, 1.15f, 8.98f, 1.19f, 9.14f)
                curveToRelative(0.1f, 0.33f, 0.36f, 0.58f, 0.69f, 0.67f)
                curveToRelative(0.17f, 0.05f, 4.27f, 1.19f, 9.12f, 1.19f)
                reflectiveCurveToRelative(8.95f, -1.14f, 9.12f, -1.19f)
                curveToRelative(0.33f, -0.09f, 0.59f, -0.35f, 0.69f, -0.67f)
                curveToRelative(0.05f, -0.16f, 1.19f, -4.01f, 1.19f, -9.14f)
                curveToRelative(0f, -5.17f, -1.15f, -8.98f, -1.19f, -9.14f)
                close()
                moveTo(8.83f, 6.65f)
                curveToRelative(0.24f, -0.72f, 0.82f, -1.3f, 1.54f, -1.54f)
                curveToRelative(1.08f, -0.36f, 2.18f, -0.36f, 3.26f, 0f)
                curveToRelative(0.72f, 0.24f, 1.3f, 0.82f, 1.54f, 1.54f)
                curveToRelative(0.36f, 1.08f, 0.36f, 2.18f, 0f, 3.26f)
                curveToRelative(-0.24f, 0.72f, -0.82f, 1.3f, -1.54f, 1.54f)
                curveToRelative(-0.54f, 0.18f, -1.09f, 0.27f, -1.63f, 0.27f)
                reflectiveCurveToRelative(-1.09f, -0.09f, -1.63f, -0.27f)
                curveToRelative(-0.72f, -0.24f, -1.3f, -0.82f, -1.54f, -1.54f)
                curveToRelative(-0.36f, -1.08f, -0.36f, -2.18f, 0f, -3.26f)
                close()
                moveTo(16.15f, 19.17f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.73f, -1.41f, -3.15f, -3.15f, -3.15f)
                reflectiveCurveToRelative(-3.15f, 1.41f, -3.15f, 3.15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -2.84f, 2.31f, -5.15f, 5.15f, -5.15f)
                reflectiveCurveToRelative(5.15f, 2.31f, 5.15f, 5.15f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
            }
        }.also { _Portrait = it}
