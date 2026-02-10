package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _HeadVr: ImageVector? = null

val Icons.Bs.HeadVr: ImageVector
    get() = _HeadVr ?: UXIcon(name = "HeadVr") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9.76f, 11f)
                curveToRelative(0.62f, 1.75f, 2.29f, 3f, 4.24f, 3f)
                horizontalLineToRelative(10f)
                lineTo(24f, 5f)
                horizontalLineToRelative(-3.7f)
                curveToRelative(-0.15f, -0.22f, -0.28f, -0.4f, -0.41f, -0.56f)
                curveTo(17.4f, 1.12f, 13.3f, -0.52f, 9.18f, 0.15f)
                curveTo(4.95f, 0.85f, 1.5f, 3.97f, 0.39f, 8.1f)
                curveToRelative(-0.94f, 3.49f, -0.11f, 7.12f, 2.26f, 9.96f)
                curveToRelative(0.23f, 0.27f, 0.35f, 0.61f, 0.35f, 0.95f)
                verticalLineToRelative(4.99f)
                horizontalLineToRelative(14f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(0.87f)
                curveToRelative(1.76f, 0f, 3.25f, -1.32f, 3.47f, -3.06f)
                lineToRelative(0.24f, -1.94f)
                horizontalLineToRelative(-3.02f)
                lineToRelative(-0.2f, 1.56f)
                curveToRelative(-0.03f, 0.25f, -0.24f, 0.44f, -0.5f, 0.44f)
                horizontalLineToRelative(-3.87f)
                verticalLineToRelative(3f)
                lineTo(6f, 21f)
                verticalLineToRelative(-1.99f)
                curveToRelative(0f, -1.05f, -0.37f, -2.07f, -1.05f, -2.88f)
                curveToRelative(-1.26f, -1.5f, -1.92f, -3.3f, -1.94f, -5.14f)
                horizontalLineToRelative(6.74f)
                close()
                moveTo(21f, 11f)
                horizontalLineToRelative(-7f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(3f)
                close()
                moveTo(9.67f, 3.11f)
                curveToRelative(2.42f, -0.4f, 4.84f, 0.3f, 6.66f, 1.89f)
                horizontalLineToRelative(-2.33f)
                curveToRelative(-1.96f, 0f, -3.62f, 1.25f, -4.24f, 3f)
                lineTo(3.58f, 8f)
                curveToRelative(1.02f, -2.52f, 3.37f, -4.44f, 6.09f, -4.89f)
                close()
            }
        }.also { _HeadVr = it}
