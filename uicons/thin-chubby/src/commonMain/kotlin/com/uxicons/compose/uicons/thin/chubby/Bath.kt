package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Bath: ImageVector? = null

val Icons.Tc.Bath: ImageVector
    get() = _Bath ?: UXIcon(name = "Bath") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.86f, 11.15f)
                curveToRelative(-0.09f, -0.1f, -0.23f, -0.15f, -0.36f, -0.15f)
                horizontalLineToRelative(-20.5f)
                curveToRelative(0.01f, -1.95f, 0.11f, -4.93f, 1.83f, -7.59f)
                curveToRelative(0.29f, -0.11f, 1.06f, -0.35f, 2.13f, -0.35f)
                curveToRelative(0.54f, 0f, 1.12f, 0.1f, 1.71f, 0.25f)
                curveToRelative(-1.12f, 1.55f, -0.89f, 3.01f, 0.7f, 4.61f)
                curveToRelative(0.19f, 0.19f, 0.52f, 0.19f, 0.71f, 0f)
                lineToRelative(4.73f, -4.73f)
                curveToRelative(0.2f, -0.2f, 0.2f, -0.51f, 0f, -0.71f)
                curveToRelative(-1.92f, -1.92f, -3.5f, -1.93f, -5.42f, -0.02f)
                curveToRelative(-0.84f, -0.26f, -1.66f, -0.39f, -2.44f, -0.39f)
                curveToRelative(-1.59f, 0f, -2.63f, 0.47f, -2.67f, 0.49f)
                curveToRelative(-0.08f, 0.04f, -0.15f, 0.1f, -0.21f, 0.18f)
                curveToRelative(-2.12f, 3.21f, -2.08f, 6.75f, -2.08f, 8.8f)
                curveToRelative(0.17f, 4.4f, 1.43f, 7.28f, 4f, 8.88f)
                verticalLineToRelative(2.1f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-1.56f)
                curveToRelative(1.58f, 0.71f, 3.57f, 1.06f, 6f, 1.06f)
                reflectiveCurveToRelative(4.42f, -0.34f, 6f, -1.06f)
                verticalLineToRelative(1.56f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-2.1f)
                curveToRelative(2.57f, -1.61f, 3.83f, -4.49f, 4f, -8.88f)
                curveToRelative(0.01f, -0.14f, -0.04f, -0.27f, -0.14f, -0.37f)
                close()
                moveTo(9.08f, 3.18f)
                curveToRelative(0.77f, -0.77f, 1.4f, -1.12f, 2.01f, -1.12f)
                curveToRelative(0.51f, 0f, 1.04f, 0.25f, 1.65f, 0.78f)
                lineToRelative(-4.0f, 4.0f)
                curveToRelative(-1.13f, -1.3f, -1.02f, -2.3f, 0.34f, -3.66f)
                close()
                moveTo(12f, 21f)
                curveToRelative(-6.75f, 0f, -9.58f, -2.53f, -9.97f, -9f)
                horizontalLineToRelative(19.95f)
                curveToRelative(-0.39f, 6.47f, -3.23f, 9f, -9.97f, 9f)
                close()
            }
        }.also { _Bath = it}
