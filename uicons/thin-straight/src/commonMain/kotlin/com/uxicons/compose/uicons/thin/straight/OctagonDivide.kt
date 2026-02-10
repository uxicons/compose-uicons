package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonDivide: ImageVector? = null

val Icons.Ts.OctagonDivide: ImageVector
    get() = _OctagonDivide ?: UXIcon(name = "OctagonDivide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.27f, 6.3f)
                lineTo(17.7f, 0.73f)
                curveToRelative(-0.47f, -0.47f, -1.1f, -0.73f, -1.77f, -0.73f)
                horizontalLineToRelative(-7.87f)
                curveToRelative(-0.67f, 0f, -1.29f, 0.26f, -1.77f, 0.73f)
                lineTo(0.73f, 6.3f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.77f)
                verticalLineToRelative(7.87f)
                curveToRelative(0f, 0.67f, 0.26f, 1.29f, 0.73f, 1.77f)
                lineToRelative(5.57f, 5.57f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                horizontalLineToRelative(7.87f)
                curveToRelative(0.67f, 0f, 1.29f, -0.26f, 1.77f, -0.73f)
                lineToRelative(5.57f, -5.57f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                verticalLineToRelative(-7.87f)
                curveToRelative(0f, -0.67f, -0.26f, -1.29f, -0.73f, -1.77f)
                close()
                moveTo(23f, 15.94f)
                curveToRelative(0f, 0.4f, -0.16f, 0.78f, -0.44f, 1.06f)
                lineToRelative(-5.57f, 5.57f)
                curveToRelative(-0.28f, 0.28f, -0.67f, 0.44f, -1.06f, 0.44f)
                horizontalLineToRelative(-7.87f)
                curveToRelative(-0.4f, 0f, -0.78f, -0.16f, -1.06f, -0.44f)
                lineToRelative(-5.57f, -5.57f)
                curveToRelative(-0.28f, -0.28f, -0.44f, -0.67f, -0.44f, -1.06f)
                verticalLineToRelative(-7.87f)
                curveToRelative(0f, -0.4f, 0.16f, -0.78f, 0.44f, -1.06f)
                lineTo(7.0f, 1.44f)
                curveToRelative(0.28f, -0.28f, 0.67f, -0.44f, 1.06f, -0.44f)
                horizontalLineToRelative(7.87f)
                curveToRelative(0.4f, 0f, 0.78f, 0.16f, 1.06f, 0.44f)
                lineToRelative(5.57f, 5.57f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.67f, 0.44f, 1.06f)
                verticalLineToRelative(7.87f)
                close()
                moveTo(6f, 11.5f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(1f)
                lineTo(6f, 12.5f)
                verticalLineToRelative(-1f)
                close()
                moveTo(12f, 5.5f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                close()
                moveTo(12f, 18.5f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _OctagonDivide = it}
