package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _AppleBooks: ImageVector? = null

val Icons.Ss.AppleBooks: ImageVector
    get() = _AppleBooks ?: UXIcon(name = "AppleBooks") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(4f, 11.0f)
                curveToRelative(0f, -3.31f, 2.49f, -6.0f, 5.5f, -6.0f)
                horizontalLineToRelative(1.49f)
                curveToRelative(-0.07f, -1.9f, -0.8f, -3.45f, -1.12f, -4.05f)
                lineTo(11.62f, -0.0f)
                curveToRelative(0.41f, 0.75f, 1.04f, 2.15f, 1.28f, 3.91f)
                curveToRelative(0.15f, -0.84f, 0.5f, -1.91f, 1.26f, -2.67f)
                curveTo(15.59f, -0.17f, 18f, 0.01f, 18f, 0.01f)
                curveToRelative(0f, 0f, -0.03f, 2.56f, -1.46f, 3.97f)
                curveToRelative(-0.58f, 0.57f, -1.29f, 0.87f, -1.95f, 1.03f)
                curveToRelative(2.98f, 0.05f, 5.42f, 2.71f, 5.42f, 6.0f)
                curveToRelative(0f, 3.31f, -2.44f, 6.0f, -5.46f, 6.0f)
                curveToRelative(-0.92f, 0f, -1.78f, -0.25f, -2.54f, -0.7f)
                curveToRelative(-0.76f, 0.44f, -1.63f, 0.7f, -2.54f, 0.7f)
                curveToRelative(-3.01f, 0f, -5.46f, -2.69f, -5.46f, -6.0f)
                close()
                moveTo(24f, 18f)
                lineTo(3f, 18f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                reflectiveCurveToRelative(1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(21f)
                reflectiveCurveToRelative(-1f, -1.5f, -1f, -3f)
                reflectiveCurveToRelative(1f, -3f, 1f, -3f)
                close()
            }
        }.also { _AppleBooks = it}
