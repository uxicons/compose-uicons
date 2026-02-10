package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Question: ImageVector? = null

val Icons.Tr.Question: ImageVector
    get() = _Question ?: UXIcon(name = "Question") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                curveToRelative(0f, -2.9f, 2.21f, -4.45f, 3.87f, -5.36f)
                curveToRelative(2.63f, -1.45f, 4.04f, -4.42f, 3.51f, -7.41f)
                curveToRelative(-0.49f, -2.81f, -2.8f, -5.12f, -5.62f, -5.61f)
                curveToRelative(-2.02f, -0.36f, -4.01f, 0.14f, -5.59f, 1.38f)
                curveToRelative(-1.56f, 1.23f, -2.54f, 3.07f, -2.67f, 5.04f)
                curveToRelative(-0.02f, 0.28f, -0.26f, 0.48f, -0.53f, 0.47f)
                curveToRelative(-0.28f, -0.02f, -0.48f, -0.26f, -0.47f, -0.53f)
                curveToRelative(0.15f, -2.26f, 1.26f, -4.36f, 3.05f, -5.76f)
                curveTo(8.87f, 0.28f, 11.14f, -0.28f, 13.45f, 0.13f)
                curveToRelative(3.22f, 0.56f, 5.86f, 3.21f, 6.43f, 6.43f)
                curveToRelative(0.6f, 3.4f, -1.02f, 6.8f, -4.02f, 8.46f)
                curveToRelative(-2.32f, 1.28f, -3.36f, 2.66f, -3.36f, 4.49f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                close()
                moveTo(11f, 23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
            }
        }.also { _Question = it}
