package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Equality: ImageVector? = null

val Icons.Br.Equality: ImageVector
    get() = _Equality ?: UXIcon(name = "Equality") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 13.5f)
            curveToRelative(0.22f, 6.25f, 9.44f, 5.76f, 8.94f, -0.43f)
            lineToRelative(-2.57f, -8.57f)
            curveToRelative(-0.45f, -1.49f, -1.79f, -2.49f, -3.35f, -2.49f)
            horizontalLineToRelative(-4.51f)
            verticalLineToRelative(-0.5f)
            curveToRelative(-0.03f, -1.97f, -2.97f, -1.97f, -3f, 0f)
            verticalLineToRelative(0.5f)
            lineTo(5.99f, 2f)
            curveToRelative(-1.56f, 0f, -2.9f, 1.0f, -3.35f, 2.49f)
            lineTo(0.06f, 13.07f)
            curveToRelative(-0.4f, 2.6f, 1.85f, 4.95f, 4.44f, 4.93f)
            curveToRelative(2.58f, 0.02f, 4.82f, -2.32f, 4.44f, -4.92f)
            lineTo(6.58f, 5f)
            horizontalLineToRelative(3.92f)
            lineTo(10.5f, 21f)
            lineTo(5.5f, 21f)
            curveToRelative(-1.97f, 0.03f, -1.97f, 2.97f, 0f, 3f)
            horizontalLineToRelative(13f)
            curveToRelative(1.97f, -0.03f, 1.97f, -2.97f, 0f, -3f)
            horizontalLineToRelative(-5f)
            lineTo(13.5f, 5f)
            horizontalLineToRelative(3.92f)
            lineToRelative(-2.36f, 8.08f)
            curveToRelative(-0.04f, 0.14f, -0.06f, 0.28f, -0.06f, 0.42f)
            close()
            moveTo(4.52f, 8.65f)
            lineToRelative(1.27f, 4.35f)
            lineTo(3.22f, 13f)
            lineToRelative(1.31f, -4.35f)
            close()
            moveTo(20.78f, 13f)
            horizontalLineToRelative(-2.58f)
            lineToRelative(1.27f, -4.35f)
            lineToRelative(1.31f, 4.35f)
            close()
        }
    }.also { _Equality = it }
