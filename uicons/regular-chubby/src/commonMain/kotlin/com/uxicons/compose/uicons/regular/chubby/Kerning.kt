package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Kerning: ImageVector? = null

val Icons.Rc.Kerning: ImageVector
    get() = _Kerning ?: UXIcon(name = "Kerning") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.0f, 16.4f)
                curveToRelative(-0.61f, -5.97f, -3.62f, -9.42f, -3.75f, -9.56f)
                curveToRelative(-0.38f, -0.43f, -1.11f, -0.43f, -1.49f, 0f)
                curveToRelative(-0.13f, 0.14f, -3.14f, 3.59f, -3.75f, 9.56f)
                curveToRelative(-0.06f, 0.55f, 0.34f, 1.04f, 0.9f, 1.1f)
                curveToRelative(0.56f, 0.06f, 1.04f, -0.34f, 1.1f, -0.89f)
                curveToRelative(0.06f, -0.56f, 0.14f, -1.09f, 0.24f, -1.6f)
                horizontalLineToRelative(4.54f)
                curveToRelative(0.1f, 0.51f, 0.18f, 1.04f, 0.24f, 1.6f)
                curveToRelative(0.05f, 0.52f, 0.49f, 0.9f, 0.99f, 0.9f)
                curveToRelative(0.03f, 0f, 0.07f, -0.0f, 0.1f, -0.01f)
                curveToRelative(0.55f, -0.06f, 0.95f, -0.55f, 0.9f, -1.1f)
                close()
                moveTo(16.74f, 13f)
                curveToRelative(0.54f, -1.69f, 1.24f, -2.97f, 1.76f, -3.79f)
                curveToRelative(0.52f, 0.82f, 1.22f, 2.1f, 1.76f, 3.79f)
                horizontalLineToRelative(-3.51f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.0f, 7.47f)
                curveToRelative(-0.02f, -0.55f, -0.48f, -0.98f, -1.03f, -0.97f)
                curveToRelative(-0.55f, 0.01f, -0.99f, 0.47f, -0.97f, 1.03f)
                curveToRelative(0.02f, 0.74f, -0.01f, 2.94f, -0.4f, 4.17f)
                curveToRelative(-0.58f, 1.86f, -1.51f, 2.97f, -2.1f, 3.52f)
                curveToRelative(-0.58f, -0.55f, -1.51f, -1.66f, -2.1f, -3.52f)
                curveToRelative(-0.39f, -1.23f, -0.42f, -3.43f, -0.4f, -4.17f)
                curveToRelative(0.01f, -0.55f, -0.42f, -1.01f, -0.97f, -1.03f)
                curveToRelative(-0.56f, -0.0f, -1.01f, 0.42f, -1.03f, 0.97f)
                curveToRelative(-0.0f, 0.12f, -0.08f, 3.02f, 0.49f, 4.83f)
                curveToRelative(1.12f, 3.56f, 3.38f, 4.99f, 3.48f, 5.05f)
                curveToRelative(0.16f, 0.1f, 0.34f, 0.15f, 0.53f, 0.15f)
                reflectiveCurveToRelative(0.36f, -0.05f, 0.53f, -0.15f)
                curveToRelative(0.1f, -0.06f, 2.35f, -1.49f, 3.48f, -5.05f)
                curveToRelative(0.57f, -1.81f, 0.5f, -4.71f, 0.49f, -4.83f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.88f, 2.58f)
                curveToRelative(-0.51f, -0.21f, -1.09f, 0.03f, -1.31f, 0.54f)
                lineToRelative(-7f, 17f)
                curveToRelative(-0.21f, 0.51f, 0.07f, 1.38f, 0.93f, 1.38f)
                curveToRelative(0.39f, 0f, 0.77f, -0.23f, 0.93f, -0.62f)
                lineToRelative(7f, -17.0f)
                curveToRelative(0.21f, -0.51f, -0.03f, -1.09f, -0.54f, -1.31f)
                close()
            }
        }.also { _Kerning = it}
