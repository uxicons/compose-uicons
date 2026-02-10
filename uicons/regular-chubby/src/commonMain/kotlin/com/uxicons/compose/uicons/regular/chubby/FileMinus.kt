package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FileMinus: ImageVector? = null

val Icons.Rc.FileMinus: ImageVector
    get() = _FileMinus ?: UXIcon(name = "FileMinus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 14f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-6f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(22f, 12f)
                curveToRelative(0f, 5.07f, -0.99f, 9.13f, -1.03f, 9.29f)
                curveToRelative(-0.09f, 0.36f, -0.37f, 0.64f, -0.73f, 0.73f)
                curveToRelative(-0.17f, 0.04f, -4.17f, 1.03f, -8.24f, 1.03f)
                reflectiveCurveToRelative(-8.07f, -0.99f, -8.24f, -1.03f)
                curveToRelative(-0.36f, -0.09f, -0.64f, -0.37f, -0.73f, -0.73f)
                curveToRelative(-0.04f, -0.17f, -1.03f, -4.18f, -1.03f, -9.24f)
                reflectiveCurveToRelative(0.99f, -9.07f, 1.03f, -9.24f)
                curveToRelative(0.09f, -0.36f, 0.37f, -0.64f, 0.73f, -0.73f)
                curveToRelative(0.17f, -0.04f, 4.17f, -1.03f, 8.24f, -1.03f)
                curveToRelative(1.22f, 0f, 2.28f, 0.09f, 3.14f, 0.26f)
                curveToRelative(0.18f, 0.04f, 0.35f, 0.13f, 0.49f, 0.26f)
                lineToRelative(5.72f, 5.44f)
                curveToRelative(0.16f, 0.15f, 0.27f, 0.35f, 0.3f, 0.57f)
                curveToRelative(0.23f, 1.49f, 0.35f, 2.94f, 0.35f, 4.42f)
                close()
                moveTo(15.5f, 4.21f)
                curveToRelative(0.01f, 1.21f, 0.09f, 2.1f, 0.16f, 2.65f)
                curveToRelative(0.64f, 0.08f, 1.67f, 0.18f, 2.83f, 0.19f)
                close()
                moveTo(20f, 12.05f)
                curveToRelative(0f, -1.0f, -0.07f, -2.05f, -0.19f, -3.05f)
                curveToRelative(-0.38f, 0.02f, -0.76f, 0.05f, -1.12f, 0.05f)
                curveToRelative(-2.21f, 0f, -3.98f, -0.3f, -4.08f, -0.32f)
                curveToRelative(-0.4f, -0.07f, -0.72f, -0.37f, -0.8f, -0.77f)
                curveToRelative(-0.02f, -0.07f, -0.36f, -1.72f, -0.29f, -4.85f)
                curveToRelative(-0.47f, -0.04f, -0.97f, -0.06f, -1.51f, -0.06f)
                curveToRelative(-2.95f, 0f, -5.92f, 0.57f, -7.16f, 0.83f)
                curveToRelative(-0.27f, 1.27f, -0.84f, 4.45f, -0.84f, 8.17f)
                reflectiveCurveToRelative(0.57f, 6.89f, 0.84f, 8.16f)
                curveToRelative(1.24f, 0.27f, 4.22f, 0.83f, 7.16f, 0.83f)
                reflectiveCurveToRelative(5.92f, -0.57f, 7.16f, -0.83f)
                curveToRelative(0.27f, -1.27f, 0.84f, -4.45f, 0.84f, -8.17f)
                close()
            }
        }.also { _FileMinus = it}
