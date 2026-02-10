package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _OctagonExclamation: ImageVector? = null

val Icons.Ts.OctagonExclamation: ImageVector
    get() = _OctagonExclamation ?: UXIcon(name = "OctagonExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.27f, 6.3f)
                lineTo(17.7f, 0.73f)
                curveToRelative(-0.47f, -0.47f, -1.1f, -0.73f, -1.77f, -0.73f)
                horizontalLineToRelative(-7.87f)
                curveToRelative(-0.67f, 0f, -1.3f, 0.26f, -1.77f, 0.73f)
                lineTo(0.73f, 6.3f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.77f)
                verticalLineToRelative(7.87f)
                curveToRelative(0f, 0.67f, 0.26f, 1.29f, 0.73f, 1.77f)
                lineToRelative(5.56f, 5.57f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.77f, 0.73f)
                horizontalLineToRelative(7.87f)
                curveToRelative(0.67f, 0f, 1.3f, -0.26f, 1.77f, -0.73f)
                lineToRelative(5.56f, -5.57f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.77f)
                verticalLineToRelative(-7.87f)
                curveToRelative(0f, -0.67f, -0.26f, -1.29f, -0.73f, -1.77f)
                close()
                moveTo(23f, 15.94f)
                curveToRelative(0f, 0.4f, -0.16f, 0.78f, -0.44f, 1.06f)
                lineToRelative(-5.56f, 5.57f)
                curveToRelative(-0.28f, 0.28f, -0.66f, 0.44f, -1.06f, 0.44f)
                horizontalLineToRelative(-7.87f)
                curveToRelative(-0.4f, 0f, -0.78f, -0.16f, -1.06f, -0.44f)
                lineToRelative(-5.56f, -5.57f)
                curveToRelative(-0.28f, -0.28f, -0.44f, -0.67f, -0.44f, -1.06f)
                verticalLineToRelative(-7.87f)
                curveToRelative(0f, -0.4f, 0.16f, -0.78f, 0.44f, -1.06f)
                lineTo(7.0f, 1.44f)
                curveToRelative(0.28f, -0.28f, 0.66f, -0.44f, 1.06f, -0.44f)
                horizontalLineToRelative(7.87f)
                curveToRelative(0.4f, 0f, 0.78f, 0.16f, 1.06f, 0.44f)
                lineToRelative(5.56f, 5.57f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.67f, 0.44f, 1.06f)
                verticalLineToRelative(7.87f)
                close()
                moveTo(12.5f, 15f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10f)
                close()
                moveTo(13.5f, 18f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
            }
        }.also { _OctagonExclamation = it}
