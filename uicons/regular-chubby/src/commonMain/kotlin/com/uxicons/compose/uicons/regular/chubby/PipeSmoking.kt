package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PipeSmoking: ImageVector? = null

val Icons.Rc.PipeSmoking: ImageVector
    get() = _PipeSmoking ?: UXIcon(name = "PipeSmoking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(8f, 23f)
                horizontalLineToRelative(-1f)
                curveToRelative(-4.15f, 0f, -6f, -1.85f, -6f, -6f)
                curveToRelative(0f, -1.72f, 0.31f, -3.66f, 0.93f, -5.78f)
                curveToRelative(0.09f, -0.3f, 0.3f, -0.54f, 0.59f, -0.65f)
                curveToRelative(0.15f, -0.06f, 1.51f, -0.57f, 4.13f, -0.57f)
                curveToRelative(2.65f, 0f, 4.13f, 0.54f, 4.19f, 0.56f)
                curveToRelative(0.3f, 0.11f, 0.52f, 0.35f, 0.61f, 0.66f)
                curveToRelative(0.17f, 0.57f, 0.31f, 1.28f, 0.44f, 1.97f)
                curveToRelative(2.8f, -2.68f, 6.03f, -8.69f, 7.19f, -11.1f)
                curveToRelative(0.07f, -0.15f, 0.17f, -0.27f, 0.29f, -0.37f)
                curveToRelative(0.0f, -0.0f, 0.01f, -0.01f, 0.01f, -0.01f)
                curveToRelative(0.15f, -0.12f, 0.99f, -0.71f, 2.62f, -0.71f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                curveToRelative(-0.52f, 0f, -0.88f, 0.09f, -1.11f, 0.17f)
                curveToRelative(-0.63f, 3.17f, -4.36f, 19.83f, -12.89f, 19.83f)
                close()
                moveTo(3.71f, 12.3f)
                curveToRelative(-0.47f, 1.73f, -0.71f, 3.31f, -0.71f, 4.7f)
                curveToRelative(0f, 3.03f, 0.97f, 4f, 4f, 4f)
                horizontalLineToRelative(1f)
                curveToRelative(4.09f, 0f, 7.13f, -5.71f, 9.01f, -11.13f)
                curveToRelative(-1.62f, 2.49f, -3.53f, 4.95f, -5.31f, 5.99f)
                curveToRelative(-0.58f, 0.36f, -1.4f, -0.03f, -1.49f, -0.7f)
                curveToRelative(-0.14f, -0.85f, -0.31f, -1.91f, -0.53f, -2.85f)
                curveToRelative(-0.55f, -0.13f, -1.58f, -0.31f, -3.02f, -0.31f)
                curveToRelative(-1.43f, 0f, -2.42f, 0.18f, -2.95f, 0.3f)
                close()
            }
        }.also { _PipeSmoking = it}
