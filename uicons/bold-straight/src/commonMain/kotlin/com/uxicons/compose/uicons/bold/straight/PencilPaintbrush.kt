package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PencilPaintbrush: ImageVector? = null

val Icons.Bs.PencilPaintbrush: ImageVector
    get() = _PencilPaintbrush ?: UXIcon(name = "PencilPaintbrush") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 24f)
                horizontalLineToRelative(-5.73f)
                curveToRelative(-2.07f, 0f, -4.27f, -1.79f, -4.27f, -4f)
                reflectiveCurveToRelative(1.68f, -4f, 3.75f, -4f)
                curveToRelative(5f, 0f, 6.25f, 8f, 6.25f, 8f)
                close()
                moveTo(22.83f, 6.83f)
                lineTo(5.66f, 24f)
                lineTo(0f, 24f)
                verticalLineToRelative(-5.66f)
                lineTo(17.17f, 1.17f)
                curveToRelative(0.75f, -0.76f, 1.76f, -1.17f, 2.83f, -1.17f)
                reflectiveCurveToRelative(2.08f, 0.42f, 2.83f, 1.17f)
                horizontalLineToRelative(0f)
                curveToRelative(0.76f, 0.76f, 1.17f, 1.76f, 1.17f, 2.83f)
                reflectiveCurveToRelative(-0.42f, 2.08f, -1.17f, 2.83f)
                close()
                moveTo(17.15f, 8.27f)
                lineToRelative(-1.42f, -1.42f)
                lineTo(3f, 19.58f)
                verticalLineToRelative(1.42f)
                horizontalLineToRelative(1.42f)
                lineToRelative(12.73f, -12.73f)
                close()
                moveTo(4.63f, 10.6f)
                lineToRelative(2.21f, -2.03f)
                lineToRelative(-3.56f, -3.88f)
                curveToRelative(-0.19f, -0.2f, -0.28f, -0.44f, -0.27f, -0.72f)
                curveToRelative(0.01f, -0.27f, 0.12f, -0.52f, 0.31f, -0.7f)
                curveToRelative(0.2f, -0.19f, 0.43f, -0.28f, 0.72f, -0.27f)
                curveToRelative(0.27f, 0.01f, 0.52f, 0.11f, 0.68f, 0.29f)
                lineToRelative(3.54f, 3.86f)
                lineToRelative(2.21f, -2.03f)
                lineToRelative(-3.56f, -3.88f)
                curveTo(6.17f, 0.47f, 5.17f, 0.03f, 4.11f, 0.0f)
                curveTo(3.05f, -0.03f, 2.02f, 0.36f, 1.24f, 1.1f)
                curveTo(0.47f, 1.84f, 0.03f, 2.83f, 0f, 3.9f)
                reflectiveCurveToRelative(0.36f, 2.08f, 1.08f, 2.84f)
                lineToRelative(3.54f, 3.86f)
                close()
            }
        }.also { _PencilPaintbrush = it}
