package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Dollar: ImageVector? = null

val Icons.Rc.Dollar: ImageVector
    get() = _Dollar ?: UXIcon(name = "Dollar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.78f, 15.73f)
                curveToRelative(-0.05f, -2.8f, -2.64f, -5.11f, -5.78f, -5.13f)
                curveToRelative(-0.94f, -0.01f, -1.81f, -0.37f, -2.4f, -1.0f)
                curveToRelative(-0.49f, -0.52f, -0.74f, -1.18f, -0.7f, -1.84f)
                curveToRelative(0.1f, -1.65f, 1.55f, -3.1f, 3.09f, -3.11f)
                curveToRelative(1.25f, 0.01f, 2.49f, 0.98f, 2.94f, 2.31f)
                curveToRelative(0.18f, 0.52f, 0.74f, 0.81f, 1.27f, 0.63f)
                curveToRelative(0.52f, -0.18f, 0.81f, -0.74f, 0.63f, -1.27f)
                curveToRelative(-0.61f, -1.81f, -2.11f, -3.16f, -3.83f, -3.56f)
                verticalLineToRelative(-0.76f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(0.76f)
                curveToRelative(-2.17f, 0.5f, -3.95f, 2.53f, -4.09f, 4.88f)
                curveToRelative(-0.07f, 1.22f, 0.37f, 2.4f, 1.24f, 3.33f)
                curveToRelative(0.96f, 1.03f, 2.37f, 1.62f, 3.85f, 1.64f)
                curveToRelative(2.06f, 0.02f, 3.76f, 1.44f, 3.79f, 3.17f)
                curveToRelative(0.01f, 0.82f, -0.38f, 1.69f, -1.06f, 2.39f)
                curveToRelative(-0.74f, 0.76f, -1.74f, 1.2f, -2.72f, 1.21f)
                curveToRelative(-0.99f, -0.01f, -1.99f, -0.45f, -2.73f, -1.21f)
                curveToRelative(-0.69f, -0.7f, -1.07f, -1.57f, -1.06f, -2.39f)
                curveToRelative(0.01f, -0.55f, -0.43f, -1.01f, -0.99f, -1.01f)
                horizontalLineToRelative(-0.01f)
                curveToRelative(-0.55f, 0f, -0.99f, 0.44f, -1f, 0.99f)
                curveToRelative(-0.02f, 1.35f, 0.58f, 2.74f, 1.63f, 3.81f)
                curveToRelative(0.87f, 0.89f, 1.98f, 1.49f, 3.15f, 1.71f)
                verticalLineToRelative(0.74f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-0.74f)
                curveToRelative(1.17f, -0.23f, 2.28f, -0.82f, 3.15f, -1.71f)
                curveToRelative(1.05f, -1.08f, 1.65f, -2.47f, 1.63f, -3.82f)
                close()
            }
        }.also { _Dollar = it}
