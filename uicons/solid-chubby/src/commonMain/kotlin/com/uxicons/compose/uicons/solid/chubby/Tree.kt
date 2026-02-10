package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Tree: ImageVector? = null

val Icons.Sc.Tree: ImageVector
    get() = _Tree ?: UXIcon(name = "Tree") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(20.89f, 17.9f)
                lineToRelative(-0.73f, -2.13f)
                curveToRelative(-0.37f, -1.07f, -0.96f, -2.09f, -1.77f, -3.05f)
                curveToRelative(0.21f, -0.08f, 0.4f, -0.23f, 0.51f, -0.44f)
                curveToRelative(0.14f, -0.25f, 0.17f, -0.55f, 0.08f, -0.82f)
                lineToRelative(-0.37f, -1.06f)
                curveToRelative(-0.42f, -1.23f, -1.15f, -2.27f, -1.92f, -3.1f)
                curveToRelative(0.12f, -0.08f, 0.22f, -0.19f, 0.29f, -0.32f)
                curveToRelative(0.14f, -0.25f, 0.17f, -0.55f, 0.08f, -0.82f)
                curveToRelative(-1.09f, -3.16f, -4.46f, -4.96f, -4.6f, -5.03f)
                curveToRelative(-0.29f, -0.15f, -0.64f, -0.15f, -0.93f, 0f)
                curveToRelative(-0.13f, 0.07f, -2.98f, 1.59f, -4.29f, 4.29f)
                curveToRelative(0.78f, 0.18f, 2.65f, 0.39f, 3.66f, 0.44f)
                curveToRelative(0.55f, 0.03f, 0.97f, 0.5f, 0.94f, 1.05f)
                curveToRelative(-0.03f, 0.53f, -0.47f, 0.95f, -1.0f, 0.95f)
                curveToRelative(-0.02f, 0f, -0.04f, 0f, -0.05f, -0.0f)
                curveToRelative(-0.03f, -0.0f, -2.16f, -0.14f, -3.61f, -0.41f)
                curveToRelative(-0.72f, 0.81f, -1.4f, 1.81f, -1.8f, 2.97f)
                lineToRelative(-0.19f, 0.56f)
                curveToRelative(1.71f, 0.28f, 5.56f, 0.56f, 6.8f, 0.56f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                curveToRelative(-1.14f, 0f, -4.54f, -0.22f, -6.61f, -0.51f)
                curveToRelative(-0.69f, 0.88f, -1.21f, 1.8f, -1.54f, 2.77f)
                lineToRelative(-0.73f, 2.13f)
                curveToRelative(-0.09f, 0.27f, -0.07f, 0.57f, 0.08f, 0.82f)
                curveToRelative(0.14f, 0.25f, 0.39f, 0.43f, 0.67f, 0.48f)
                lineToRelative(2.97f, 0.58f)
                curveToRelative(1.36f, 0.27f, 2.76f, 0.43f, 4.16f, 0.48f)
                verticalLineToRelative(1.73f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1.73f)
                curveToRelative(1.4f, -0.05f, 2.8f, -0.21f, 4.16f, -0.48f)
                lineToRelative(2.97f, -0.58f)
                curveToRelative(0.28f, -0.06f, 0.53f, -0.23f, 0.67f, -0.48f)
                curveToRelative(0.14f, -0.25f, 0.17f, -0.55f, 0.08f, -0.82f)
                close()
            }
        }.also { _Tree = it}
