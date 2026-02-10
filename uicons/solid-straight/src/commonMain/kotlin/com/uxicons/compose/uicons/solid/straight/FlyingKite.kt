package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _FlyingKite: ImageVector? = null

val Icons.Ss.FlyingKite: ImageVector
    get() = _FlyingKite ?: UXIcon(name = "FlyingKite") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7f, 4.5f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                reflectiveCurveToRelative(-1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                close()
                moveTo(13.01f, 12f)
                horizontalLineToRelative(1.99f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3.01f)
                lineToRelative(-1.92f, -2.62f)
                lineToRelative(-1.62f, 5.02f)
                lineToRelative(3.55f, 2.02f)
                verticalLineToRelative(5.58f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.42f)
                lineToRelative(-4.59f, -2.61f)
                curveToRelative(-1.27f, -0.8f, -1.77f, -2.35f, -1.21f, -3.7f)
                lineToRelative(1.14f, -3.35f)
                curveToRelative(0.48f, -1.19f, 1.57f, -1.92f, 2.8f, -1.92f)
                curveToRelative(0.99f, -0.07f, 2.05f, 0.29f, 2.68f, 1.02f)
                lineToRelative(2.18f, 2.98f)
                close()
                moveTo(18.34f, 7.29f)
                curveToRelative(-0.24f, 0.35f, -0.32f, 0.56f, -0.34f, 0.66f)
                curveToRelative(0.27f, 0.2f, 1.19f, 0.39f, 1.7f, 0.5f)
                curveToRelative(1.39f, 0.29f, 3.3f, 0.69f, 3.3f, 2.4f)
                curveToRelative(0f, 2.5f, -3.77f, 3.16f, -6f, 3.16f)
                verticalLineToRelative(-2f)
                curveToRelative(1.84f, 0f, 3.85f, -0.57f, 3.99f, -1.1f)
                curveToRelative(-0.27f, -0.2f, -1.19f, -0.39f, -1.7f, -0.5f)
                curveToRelative(-1.39f, -0.29f, -3.3f, -0.69f, -3.3f, -2.4f)
                curveToRelative(0f, -0.52f, 0.21f, -1.08f, 0.61f, -1.7f)
                lineToRelative(1.03f, -6.3f)
                horizontalLineToRelative(6.36f)
                verticalLineToRelative(6.36f)
                lineToRelative(-5.66f, 0.93f)
                close()
                moveTo(3.94f, 18.35f)
                lineTo(3.66f, 19f)
                horizontalLineToRelative(-3.66f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(5f)
                lineToRelative(0.68f, -1.58f)
                lineToRelative(-1.25f, -0.71f)
                curveToRelative(-0.17f, -0.11f, -0.32f, -0.24f, -0.48f, -0.36f)
                close()
            }
        }.also { _FlyingKite = it}
