package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookPlus: ImageVector? = null

val Icons.Sr.BookPlus: ImageVector
    get() = _BookPlus ?: UXIcon(name = "BookPlus") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 12f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveToRelative(-2.69f, -6f, -6f, -6f)
                close()
                moveTo(20.5f, 19f)
                horizontalLineToRelative(-1.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(1.5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
                moveTo(3f, 16f)
                horizontalLineToRelative(1f)
                lineTo(4f, 0.1f)
                curveTo(1.67f, 0.57f, 0f, 2.62f, 0f, 5f)
                verticalLineToRelative(12.03f)
                curveToRelative(0.7f, -0.53f, 1.52f, -0.86f, 2.4f, -0.96f)
                curveToRelative(0.2f, -0.04f, 0.4f, -0.06f, 0.6f, -0.06f)
                close()
                moveTo(10.26f, 16f)
                horizontalLineToRelative(-4.26f)
                lineTo(6f, 0f)
                horizontalLineToRelative(9f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(5.26f)
                curveToRelative(-0.64f, -0.17f, -1.31f, -0.26f, -2f, -0.26f)
                curveToRelative(-3.72f, 0f, -6.84f, 2.56f, -7.74f, 6f)
                close()
                moveTo(12.73f, 24f)
                lineTo(3f, 24f)
                curveToRelative(-1.66f, 0f, -3f, -1.34f, -3f, -3f)
                reflectiveCurveToRelative(1.34f, -3f, 3f, -3f)
                horizontalLineToRelative(7f)
                curveToRelative(0f, 2.39f, 1.06f, 4.53f, 2.73f, 6f)
                close()
            }
        }.also { _BookPlus = it}
