package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Whale: ImageVector? = null

val Icons.Rc.Whale: ImageVector
    get() = _Whale ?: UXIcon(name = "Whale") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 17f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(23f, 15.5f)
                curveToRelative(0f, 5.19f, -2.31f, 7.5f, -7.5f, 7.5f)
                curveToRelative(-9.62f, 0f, -14.5f, -1.55f, -14.5f, -10f)
                curveToRelative(0f, -2.7f, 1.56f, -4.92f, 2.83f, -6.29f)
                curveToRelative(-1.89f, -0.59f, -2.8f, -2.09f, -2.83f, -4.61f)
                curveToRelative(-0.07f, -0.58f, 0.41f, -1.11f, 0.99f, -1.1f)
                curveToRelative(2.0f, 0f, 3.25f, 0.58f, 4.0f, 1.31f)
                curveToRelative(0.75f, -0.73f, 2.01f, -1.31f, 4.0f, -1.31f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                curveToRelative(0f, 3.05f, -1.28f, 4.64f, -4.0f, 4.94f)
                curveToRelative(0.01f, 0.99f, 0.04f, 1.87f, 0.17f, 2.77f)
                curveToRelative(2.05f, -1.16f, 4.75f, -1.7f, 8.33f, -1.7f)
                curveToRelative(5.19f, 0f, 7.5f, 2.31f, 7.5f, 7.5f)
                close()
                moveTo(7f, 4.52f)
                verticalLineToRelative(0.41f)
                curveToRelative(1.19f, -0.17f, 1.75f, -0.7f, 1.93f, -1.86f)
                curveToRelative(-1.79f, 0.29f, -1.92f, 1.3f, -1.93f, 1.44f)
                close()
                moveTo(5f, 4.94f)
                verticalLineToRelative(-0.44f)
                curveToRelative(-0.01f, -0.11f, -0.12f, -1.13f, -1.93f, -1.42f)
                curveToRelative(0.18f, 1.16f, 0.74f, 1.69f, 1.93f, 1.86f)
                close()
                moveTo(21f, 15.5f)
                curveToRelative(0f, -4.11f, -1.39f, -5.5f, -5.5f, -5.5f)
                curveToRelative(-3.86f, 0f, -6.59f, 0.7f, -8.37f, 2.14f)
                curveToRelative(-0.26f, 0.21f, -0.62f, 0.28f, -0.94f, 0.17f)
                curveToRelative(-0.32f, -0.1f, -0.57f, -0.36f, -0.66f, -0.69f)
                curveToRelative(-0.31f, -1.17f, -0.44f, -2.2f, -0.5f, -3.27f)
                curveToRelative(-0.97f, 1.12f, -2.04f, 2.77f, -2.04f, 4.64f)
                curveToRelative(0f, 6.36f, 2.57f, 8f, 12.5f, 8f)
                curveToRelative(4.11f, 0f, 5.5f, -1.39f, 5.5f, -5.5f)
                close()
            }
        }.also { _Whale = it}
