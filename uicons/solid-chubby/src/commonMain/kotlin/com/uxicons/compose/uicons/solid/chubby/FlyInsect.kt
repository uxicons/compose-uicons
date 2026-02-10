package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlyInsect: ImageVector? = null

val Icons.Sc.FlyInsect: ImageVector
    get() = _FlyInsect ?: UXIcon(name = "FlyInsect") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(16f, 8f)
                curveToRelative(0f, 1.43f, -0.57f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.43f, 0f, -2f, -0.57f, -2f, -2f)
                reflectiveCurveToRelative(0.57f, -2f, 2f, -2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.43f, 0f, 2f, 0.57f, 2f, 2f)
                close()
                moveTo(21.71f, 12.88f)
                curveToRelative(-0.72f, -0.72f, -2.32f, -1.97f, -4.02f, -3.09f)
                curveToRelative(-0.55f, 1.42f, -1.82f, 2.21f, -3.69f, 2.21f)
                horizontalLineToRelative(-0.6f)
                curveToRelative(1.09f, 2.3f, 2.58f, 4.8f, 3.48f, 5.71f)
                curveToRelative(1.72f, 1.72f, 3.1f, 1.72f, 4.83f, 0f)
                curveToRelative(1.72f, -1.72f, 1.72f, -3.1f, 0f, -4.83f)
                close()
                moveTo(2.29f, 17.71f)
                curveToRelative(1.72f, 1.72f, 3.1f, 1.72f, 4.83f, 0f)
                curveToRelative(0.91f, -0.91f, 2.39f, -3.41f, 3.48f, -5.71f)
                horizontalLineToRelative(-0.6f)
                curveToRelative(-1.86f, 0f, -3.14f, -0.79f, -3.69f, -2.21f)
                curveToRelative(-1.7f, 1.12f, -3.29f, 2.37f, -4.02f, 3.09f)
                curveToRelative(-1.72f, 1.72f, -1.72f, 3.1f, 0f, 4.83f)
                close()
                moveTo(14.49f, 17.92f)
                curveToRelative(-0.84f, -1.17f, -1.75f, -2.75f, -2.49f, -4.23f)
                curveToRelative(-0.74f, 1.48f, -1.65f, 3.06f, -2.49f, 4.23f)
                curveToRelative(1.7f, 0.09f, 3.28f, 0.09f, 4.98f, 0f)
                close()
                moveTo(12f, 20f)
                curveToRelative(-0.92f, 0f, -1.9f, -0.04f, -2.91f, -0.1f)
                curveToRelative(0.67f, 1.49f, 1.58f, 3.1f, 2.91f, 3.1f)
                reflectiveCurveToRelative(2.24f, -1.61f, 2.91f, -3.1f)
                curveToRelative(-1.01f, 0.06f, -1.99f, 0.1f, -2.9f, 0.1f)
                close()
                moveTo(10f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(0.16f, 0f, 0.32f, 0.01f, 0.47f, 0.03f)
                curveToRelative(0.02f, -0.17f, 0.03f, -0.34f, 0.03f, -0.53f)
                curveToRelative(0f, -1.75f, -0.75f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 0.75f, -2.5f, 2.5f)
                curveToRelative(0f, 0.19f, 0.01f, 0.36f, 0.03f, 0.53f)
                curveToRelative(0.15f, -0.01f, 0.3f, -0.03f, 0.47f, -0.03f)
                close()
            }
        }.also { _FlyInsect = it}
