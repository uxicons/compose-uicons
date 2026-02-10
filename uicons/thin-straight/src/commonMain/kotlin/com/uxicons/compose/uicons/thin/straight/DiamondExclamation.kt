package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiamondExclamation: ImageVector? = null

val Icons.Ts.DiamondExclamation: ImageVector
    get() = _DiamondExclamation ?: UXIcon(name = "DiamondExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.27f, 10.23f)
                lineTo(13.76f, 0.73f)
                curveToRelative(-0.94f, -0.94f, -2.58f, -0.94f, -3.53f, 0f)
                lineTo(0.73f, 10.23f)
                curveToRelative(-0.47f, 0.47f, -0.73f, 1.1f, -0.73f, 1.76f)
                reflectiveCurveToRelative(0.26f, 1.29f, 0.73f, 1.76f)
                lineToRelative(9.51f, 9.51f)
                curveToRelative(0.47f, 0.47f, 1.1f, 0.73f, 1.76f, 0.73f)
                reflectiveCurveToRelative(1.29f, -0.26f, 1.76f, -0.73f)
                lineToRelative(9.51f, -9.51f)
                curveToRelative(0.47f, -0.47f, 0.73f, -1.1f, 0.73f, -1.76f)
                reflectiveCurveToRelative(-0.26f, -1.29f, -0.73f, -1.76f)
                close()
                moveTo(22.56f, 13.05f)
                lineToRelative(-9.51f, 9.51f)
                curveToRelative(-0.56f, 0.56f, -1.55f, 0.56f, -2.11f, 0f)
                lineTo(1.44f, 13.05f)
                curveToRelative(-0.28f, -0.28f, -0.44f, -0.66f, -0.44f, -1.06f)
                reflectiveCurveToRelative(0.15f, -0.77f, 0.44f, -1.06f)
                lineTo(10.94f, 1.43f)
                curveToRelative(0.28f, -0.28f, 0.66f, -0.44f, 1.06f, -0.44f)
                reflectiveCurveToRelative(0.77f, 0.15f, 1.06f, 0.44f)
                lineToRelative(9.51f, 9.51f)
                curveToRelative(0.28f, 0.28f, 0.44f, 0.66f, 0.44f, 1.06f)
                reflectiveCurveToRelative(-0.15f, 0.77f, -0.44f, 1.06f)
                close()
                moveTo(12.5f, 14.08f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 6f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(8.08f)
                close()
                moveTo(13.0f, 17.0f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _DiamondExclamation = it}
