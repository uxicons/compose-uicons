package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlogPencil: ImageVector? = null

val Icons.Tr.BlogPencil: ImageVector
    get() = _BlogPencil ?: UXIcon(name = "BlogPencil") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 2f)
                lineTo(4.5f, 2f)
                curveTo(2.02f, 2f, 0f, 4.02f, 0f, 6.5f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                lineTo(14.5f, 22f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(4.5f, 21f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(1f, 8f)
                lineTo(23f, 8f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(1f, 7f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(15f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(0.5f)
                lineTo(1f, 7f)
                close()
                moveTo(15.56f, 12.03f)
                curveToRelative(-0.66f, -0.66f, -1.54f, -1.03f, -2.47f, -1.03f)
                horizontalLineToRelative(-1.59f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(1.59f)
                curveToRelative(0f, 0.94f, 0.36f, 1.81f, 1.03f, 2.47f)
                lineToRelative(7.71f, 7.71f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                reflectiveCurveToRelative(1.3f, -0.26f, 1.77f, -0.73f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                reflectiveCurveToRelative(-0.26f, -1.3f, -0.73f, -1.77f)
                lineToRelative(-7.71f, -7.71f)
                close()
                moveTo(22.56f, 22.57f)
                curveToRelative(-0.57f, 0.57f, -1.55f, 0.57f, -2.12f, 0f)
                lineToRelative(-7.71f, -7.71f)
                curveToRelative(-0.47f, -0.47f, -0.73f, -1.1f, -0.73f, -1.77f)
                verticalLineToRelative(-1.09f)
                horizontalLineToRelative(1.09f)
                curveToRelative(0.67f, 0f, 1.3f, 0.26f, 1.77f, 0.73f)
                lineToRelative(7.71f, 7.71f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.66f, 0.44f, 1.06f)
                reflectiveCurveToRelative(-0.16f, 0.78f, -0.44f, 1.06f)
                close()
            }
        }.also { _BlogPencil = it}
