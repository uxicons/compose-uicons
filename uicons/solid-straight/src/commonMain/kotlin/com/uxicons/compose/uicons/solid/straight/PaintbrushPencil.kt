package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaintbrushPencil: ImageVector? = null

val Icons.Ss.PaintbrushPencil: ImageVector
    get() = _PaintbrushPencil ?: UXIcon(name = "PaintbrushPencil") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17.07f, 13.36f)
                lineToRelative(6.93f, 6.93f)
                verticalLineToRelative(3.71f)
                reflectiveCurveToRelative(-3.71f, 0f, -3.71f, 0f)
                lineToRelative(-6.93f, -6.93f)
                lineToRelative(3.71f, -3.71f)
                close()
                moveTo(0.77f, 4.48f)
                lineToRelative(6.11f, 6.11f)
                lineToRelative(3.71f, -3.71f)
                lineTo(4.48f, 0.77f)
                curveToRelative(-1.02f, -1.02f, -2.69f, -1.02f, -3.71f, 0f)
                curveToRelative(-1.02f, 1.02f, -1.02f, 2.69f, 0f, 3.71f)
                close()
                moveTo(9.53f, 14.47f)
                curveToRelative(-1.96f, -1.96f, -5.12f, -1.96f, -7.08f, 0f)
                curveToRelative(-1.96f, 1.96f, -2.46f, 9.53f, -2.46f, 9.53f)
                curveToRelative(0f, 0f, 7.58f, -0.5f, 9.53f, -2.46f)
                curveToRelative(1.96f, -1.96f, 1.96f, -5.12f, 0f, -7.08f)
                close()
                moveTo(23.23f, 0.77f)
                curveToRelative(-1.02f, -1.02f, -2.69f, -1.02f, -3.71f, 0f)
                lineToRelative(-10.79f, 10.79f)
                curveToRelative(0.81f, 0.34f, 1.56f, 0.83f, 2.22f, 1.49f)
                horizontalLineToRelative(0f)
                curveToRelative(0.66f, 0.66f, 1.15f, 1.41f, 1.49f, 2.22f)
                lineToRelative(10.79f, -10.79f)
                curveToRelative(1.02f, -1.02f, 1.02f, -2.69f, 0f, -3.71f)
                close()
            }
        }.also { _PaintbrushPencil = it}
