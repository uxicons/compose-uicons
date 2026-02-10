package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blood: ImageVector? = null

val Icons.Bs.Blood: ImageVector
    get() = _Blood ?: UXIcon(name = "Blood") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6f, 9.26f)
                lineTo(1.76f, 13.75f)
                curveToRelative(-2.34f, 2.34f, -2.34f, 6.15f, 0f, 8.48f)
                curveToRelative(1.13f, 1.13f, 2.64f, 1.76f, 4.24f, 1.76f)
                horizontalLineToRelative(0.0f)
                curveToRelative(1.6f, 0f, 3.11f, -0.62f, 4.24f, -1.76f)
                curveToRelative(2.34f, -2.34f, 2.34f, -6.15f, 0.03f, -8.45f)
                lineToRelative(-4.27f, -4.53f)
                close()
                moveTo(8.12f, 20.12f)
                curveToRelative(-0.57f, 0.57f, -1.32f, 0.88f, -2.12f, 0.88f)
                horizontalLineToRelative(-0.0f)
                curveToRelative(-0.8f, 0f, -1.55f, -0.31f, -2.12f, -0.88f)
                curveToRelative(-1.17f, -1.17f, -1.17f, -3.07f, 0.03f, -4.27f)
                lineToRelative(2.09f, -2.22f)
                lineToRelative(2.12f, 2.25f)
                curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0f, 4.24f)
                close()
                moveTo(22.38f, 7.69f)
                lineToRelative(-3.88f, -3.79f)
                lineToRelative(-3.89f, 3.8f)
                curveToRelative(-2.15f, 2.15f, -2.15f, 5.63f, 0f, 7.78f)
                horizontalLineToRelative(0f)
                curveToRelative(1.04f, 1.04f, 2.42f, 1.61f, 3.89f, 1.61f)
                reflectiveCurveToRelative(2.85f, -0.57f, 3.89f, -1.61f)
                curveToRelative(2.15f, -2.15f, 2.15f, -5.63f, -0.01f, -7.79f)
                close()
                moveTo(20.27f, 13.36f)
                curveToRelative(-0.94f, 0.94f, -2.59f, 0.94f, -3.54f, 0f)
                curveToRelative(-0.97f, -0.97f, -0.97f, -2.56f, -0.01f, -3.52f)
                lineToRelative(1.78f, -1.74f)
                lineToRelative(1.77f, 1.73f)
                curveToRelative(0.97f, 0.97f, 0.97f, 2.56f, 0f, 3.54f)
                close()
                moveTo(11.86f, 2.31f)
                curveToRelative(1.3f, 1.3f, 1.3f, 3.41f, 0f, 4.72f)
                curveToRelative(-0.65f, 0.65f, -1.5f, 0.98f, -2.36f, 0.98f)
                curveToRelative(-0.85f, 0f, -1.71f, -0.33f, -2.36f, -0.98f)
                curveToRelative(-1.3f, -1.3f, -1.3f, -3.41f, 0f, -4.72f)
                lineToRelative(2.36f, -2.31f)
                lineToRelative(2.36f, 2.31f)
                close()
            }
        }.also { _Blood = it}
