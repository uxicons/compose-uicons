package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlogPencil: ImageVector? = null

val Icons.Ts.BlogPencil: ImageVector
    get() = _BlogPencil ?: UXIcon(name = "BlogPencil") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21.5f, 2f)
                lineTo(2.5f, 2f)
                curveTo(1.12f, 2f, 0f, 3.12f, 0f, 4.5f)
                lineTo(0f, 22f)
                lineTo(15.64f, 22f)
                lineToRelative(-1f, -1f)
                lineTo(1f, 21f)
                lineTo(1f, 8f)
                lineTo(23f, 8f)
                verticalLineToRelative(8.64f)
                lineToRelative(1f, 1f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                close()
                moveTo(1f, 7f)
                verticalLineToRelative(-2.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                lineTo(21.5f, 3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(2.5f)
                lineTo(1f, 7f)
                close()
                moveTo(15.54f, 12f)
                horizontalLineToRelative(-3.54f)
                verticalLineToRelative(3.54f)
                lineToRelative(7.73f, 7.73f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.3f, -0.26f, 1.77f, -0.73f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                reflectiveCurveToRelative(-0.26f, -1.3f, -0.73f, -1.77f)
                lineToRelative(-7.73f, -7.73f)
                close()
                moveTo(22.56f, 22.56f)
                curveToRelative(-0.57f, 0.57f, -1.55f, 0.57f, -2.12f, 0f)
                lineToRelative(-7.44f, -7.44f)
                verticalLineToRelative(-2.12f)
                horizontalLineToRelative(2.12f)
                lineToRelative(7.44f, 7.44f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.66f, 0.44f, 1.06f)
                reflectiveCurveToRelative(-0.16f, 0.78f, -0.44f, 1.06f)
                close()
            }
        }.also { _BlogPencil = it}
