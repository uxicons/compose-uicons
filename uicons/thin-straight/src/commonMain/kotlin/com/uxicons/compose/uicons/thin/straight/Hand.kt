package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Hand: ImageVector? = null

val Icons.Ts.Hand: ImageVector
    get() = _Hand ?: UXIcon(name = "Hand") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.13f, 17f)
                horizontalLineToRelative(9.87f)
                lineToRelative(-0.01f, -4.0f)
                lineToRelative(-1.97f, -11.0f)
                lineTo(2.5f, 2f)
                curveTo(1.12f, 2f, 0f, 3.12f, 0f, 4.5f)
                lineTo(0f, 14.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                lineTo(6.99f, 17f)
                lineToRelative(2.77f, 4.39f)
                curveToRelative(0.32f, 0.66f, 0.82f, 1.15f, 1.41f, 1.39f)
                curveToRelative(0.36f, 0.15f, 0.73f, 0.22f, 1.1f, 0.22f)
                curveToRelative(0.78f, 0f, 1.53f, -0.34f, 2.06f, -0.96f)
                curveToRelative(0.52f, -0.61f, 0.74f, -1.41f, 0.6f, -2.26f)
                lineToRelative(-0.8f, -2.78f)
                close()
                moveTo(2.5f, 16f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(1f, 4.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(7f, 3f)
                lineToRelative(0.01f, 13f)
                lineTo(2.5f, 16f)
                close()
                moveTo(13.56f, 21.39f)
                curveToRelative(-0.5f, 0.58f, -1.29f, 0.77f, -2.02f, 0.47f)
                curveToRelative(-0.36f, -0.15f, -0.67f, -0.47f, -0.92f, -0.96f)
                lineToRelative(-2.62f, -4.15f)
                lineToRelative(-0.01f, -13.75f)
                horizontalLineToRelative(13.18f)
                lineToRelative(1.82f, 10.09f)
                verticalLineToRelative(2.91f)
                lineTo(12.8f, 16f)
                lineToRelative(1.15f, 3.99f)
                curveToRelative(0.08f, 0.5f, -0.06f, 1.01f, -0.39f, 1.4f)
                close()
            }
        }.also { _Hand = it}
