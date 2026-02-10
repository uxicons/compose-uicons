package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CircleX: ImageVector? = null

val Icons.Sc.CircleX: ImageVector
    get() = _CircleX ?: UXIcon(name = "CircleX") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(16.26f, 16.24f)
                curveToRelative(0.42f, 0.36f, 0.47f, 0.99f, 0.11f, 1.41f)
                curveToRelative(-0.36f, 0.42f, -0.99f, 0.47f, -1.41f, 0.11f)
                curveToRelative(-0.07f, -0.06f, -1.34f, -1.16f, -2.96f, -3.18f)
                curveToRelative(-1.62f, 2.01f, -2.89f, 3.12f, -2.96f, 3.18f)
                curveToRelative(-0.42f, 0.36f, -1.05f, 0.31f, -1.41f, -0.11f)
                curveToRelative(-0.36f, -0.42f, -0.31f, -1.05f, 0.11f, -1.41f)
                curveToRelative(0.02f, -0.01f, 1.36f, -1.18f, 3.01f, -3.3f)
                curveToRelative(-2.18f, -3.06f, -3.14f, -5.47f, -3.18f, -5.57f)
                curveToRelative(-0.2f, -0.51f, 0.05f, -1.09f, 0.56f, -1.3f)
                curveToRelative(0.51f, -0.2f, 1.09f, 0.05f, 1.3f, 0.56f)
                curveToRelative(0.01f, 0.02f, 0.82f, 2.01f, 2.57f, 4.59f)
                curveToRelative(1.75f, -2.58f, 2.56f, -4.57f, 2.57f, -4.59f)
                curveToRelative(0.2f, -0.51f, 0.79f, -0.76f, 1.3f, -0.56f)
                curveToRelative(0.51f, 0.2f, 0.77f, 0.78f, 0.56f, 1.3f)
                curveToRelative(-0.04f, 0.1f, -1.0f, 2.51f, -3.18f, 5.57f)
                curveToRelative(1.65f, 2.12f, 3.0f, 3.29f, 3.01f, 3.3f)
                close()
            }
        }.also { _CircleX = it}
