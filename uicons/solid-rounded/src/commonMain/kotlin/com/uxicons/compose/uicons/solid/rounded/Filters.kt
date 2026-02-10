package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Filters: ImageVector? = null

val Icons.Sr.Filters: ImageVector
    get() = _Filters ?: UXIcon(name = "Filters") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(16f, 20f)
                curveToRelative(-0.21f, 0f, -0.42f, -0.07f, -0.6f, -0.2f)
                lineToRelative(-4f, -3f)
                curveToRelative(-0.25f, -0.19f, -0.4f, -0.48f, -0.4f, -0.8f)
                verticalLineToRelative(-3.59f)
                lineTo(5.12f, 6.54f)
                curveToRelative(-0.72f, -0.72f, -1.12f, -1.69f, -1.12f, -2.71f)
                curveToRelative(0f, -2.11f, 1.72f, -3.83f, 3.83f, -3.83f)
                horizontalLineToRelative(12.34f)
                curveToRelative(2.11f, 0f, 3.83f, 1.72f, 3.83f, 3.83f)
                curveToRelative(0f, 1.02f, -0.4f, 1.98f, -1.12f, 2.71f)
                lineToRelative(-5.88f, 5.88f)
                verticalLineToRelative(6.59f)
                curveToRelative(0f, 0.38f, -0.21f, 0.72f, -0.55f, 0.9f)
                curveToRelative(-0.14f, 0.07f, -0.29f, 0.1f, -0.45f, 0.1f)
                close()
                moveTo(10.2f, 18.4f)
                curveToRelative(-0.75f, -0.56f, -1.2f, -1.46f, -1.2f, -2.4f)
                verticalLineToRelative(-2.76f)
                lineTo(3.71f, 7.95f)
                curveToRelative(-0.95f, -0.95f, -1.5f, -2.18f, -1.65f, -3.5f)
                curveToRelative(-1.22f, 0.64f, -2.06f, 1.91f, -2.06f, 3.38f)
                curveToRelative(0f, 1.02f, 0.4f, 1.98f, 1.12f, 2.71f)
                lineToRelative(5.88f, 5.88f)
                verticalLineToRelative(3.59f)
                curveToRelative(0f, 0.32f, 0.15f, 0.61f, 0.4f, 0.8f)
                lineToRelative(4f, 3f)
                curveToRelative(0.18f, 0.13f, 0.39f, 0.2f, 0.6f, 0.2f)
                curveToRelative(0.15f, 0f, 0.31f, -0.04f, 0.45f, -0.1f)
                curveToRelative(0.34f, -0.17f, 0.55f, -0.52f, 0.55f, -0.9f)
                verticalLineToRelative(-2.5f)
                lineToRelative(-2.8f, -2.1f)
                close()
            }
        }.also { _Filters = it}
