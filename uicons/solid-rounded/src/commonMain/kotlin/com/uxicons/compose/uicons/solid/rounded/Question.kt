package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Question: ImageVector? = null

val Icons.Sr.Question: ImageVector
    get() = _Question ?: UXIcon(name = "Question") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 20f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -2.32f, 1.38f, -4.36f, 3.89f, -5.74f)
                curveToRelative(2.29f, -1.26f, 3.47f, -3.75f, 3.01f, -6.36f)
                curveToRelative(-0.42f, -2.41f, -2.4f, -4.38f, -4.81f, -4.81f)
                curveToRelative(-1.81f, -0.32f, -3.57f, 0.15f, -4.95f, 1.31f)
                curveToRelative(-1.36f, 1.14f, -2.14f, 2.82f, -2.14f, 4.6f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -2.37f, 1.04f, -4.6f, 2.86f, -6.13f)
                curveTo(8.67f, 0.35f, 11.07f, -0.29f, 13.44f, 0.13f)
                curveToRelative(3.22f, 0.56f, 5.87f, 3.21f, 6.43f, 6.43f)
                curveToRelative(0.6f, 3.4f, -1.02f, 6.8f, -4.02f, 8.45f)
                curveToRelative(-1.3f, 0.72f, -2.86f, 1.99f, -2.86f, 3.99f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                close()
                moveTo(10.5f, 22.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                reflectiveCurveToRelative(1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f)
                close()
            }
        }.also { _Question = it}
