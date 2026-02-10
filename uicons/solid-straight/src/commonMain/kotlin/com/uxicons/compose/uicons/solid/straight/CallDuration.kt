package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallDuration: ImageVector? = null

val Icons.Ss.CallDuration: ImageVector
    get() = _CallDuration ?: UXIcon(name = "CallDuration") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18f, 0f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                reflectiveCurveToRelative(2.69f, 6f, 6f, 6f)
                reflectiveCurveToRelative(6f, -2.69f, 6f, -6f)
                reflectiveCurveTo(21.31f, 0f, 18f, 0f)
                close()
                moveTo(19.08f, 8.44f)
                lineToRelative(-2.08f, -2.02f)
                verticalLineToRelative(-3.42f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2.58f)
                lineToRelative(1.47f, 1.43f)
                lineToRelative(-1.39f, 1.44f)
                close()
                moveTo(17.23f, 13.23f)
                lineToRelative(6.26f, 6.27f)
                lineToRelative(-2.77f, 2.77f)
                curveToRelative(-1.1f, 1.11f, -2.6f, 1.72f, -4.21f, 1.72f)
                curveTo(9.27f, 23.98f, 0.02f, 14.73f, 0.02f, 7.48f)
                curveTo(0.02f, 5.87f, 0.63f, 4.38f, 1.74f, 3.27f)
                lineTo(4.5f, 0.5f)
                lineToRelative(6.26f, 6.26f)
                lineToRelative(-3.72f, 3.72f)
                curveToRelative(1.37f, 3.06f, 3.49f, 5.19f, 6.45f, 6.47f)
                lineToRelative(3.73f, -3.73f)
                close()
            }
        }.also { _CallDuration = it}
