package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PaintbrushPencil: ImageVector? = null

val Icons.Sr.PaintbrushPencil: ImageVector
    get() = _PaintbrushPencil ?: UXIcon(name = "PaintbrushPencil") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9.55f, 21.46f)
                curveToRelative(-1.33f, 1.33f, -5.58f, 2.24f, -7.92f, 2.51f)
                curveToRelative(-0.94f, 0.11f, -1.73f, -0.68f, -1.62f, -1.62f)
                curveToRelative(0.28f, -2.35f, 1.2f, -6.57f, 2.53f, -7.9f)
                curveToRelative(1.94f, -1.94f, 5.07f, -1.94f, 7.01f, 0f)
                curveToRelative(1.94f, 1.94f, 1.94f, 5.07f, 0f, 7.01f)
                close()
                moveTo(19.12f, 22.83f)
                curveToRelative(0.75f, 0.75f, 1.77f, 1.17f, 2.83f, 1.17f)
                horizontalLineToRelative(2.05f)
                reflectiveCurveToRelative(0f, -2.05f, 0f, -2.05f)
                curveToRelative(0f, -1.06f, -0.42f, -2.08f, -1.17f, -2.83f)
                lineToRelative(-5.03f, -5.03f)
                lineToRelative(-3.71f, 3.71f)
                lineToRelative(5.03f, 5.03f)
                close()
                moveTo(0.85f, 0.85f)
                curveToRelative(-1.02f, 1.02f, -1.02f, 2.69f, 0f, 3.71f)
                lineToRelative(5.25f, 5.25f)
                lineToRelative(3.71f, -3.71f)
                lineTo(4.57f, 0.85f)
                curveToRelative(-1.02f, -1.02f, -2.69f, -1.02f, -3.71f, 0f)
                close()
                moveTo(23.23f, 0.77f)
                curveToRelative(-1.02f, -1.02f, -2.69f, -1.02f, -3.71f, 0f)
                lineToRelative(-10.78f, 10.78f)
                curveToRelative(0.81f, 0.34f, 1.56f, 0.83f, 2.22f, 1.49f)
                curveToRelative(0.66f, 0.66f, 1.15f, 1.41f, 1.49f, 2.22f)
                lineToRelative(10.78f, -10.78f)
                curveToRelative(1.02f, -1.02f, 1.02f, -2.69f, 0f, -3.71f)
                close()
            }
        }.also { _PaintbrushPencil = it}
