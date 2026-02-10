package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cheap: ImageVector? = null

val Icons.Rs.Cheap: ImageVector
    get() = _Cheap ?: UXIcon(name = "Cheap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.7f, 19.21f)
                lineToRelative(-4.29f, 4.21f)
                curveToRelative(-0.39f, 0.39f, -0.89f, 0.58f, -1.4f, 0.58f)
                reflectiveCurveToRelative(-1.03f, -0.2f, -1.42f, -0.59f)
                lineToRelative(-4.25f, -4.25f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.25f, 3.25f)
                lineTo(17.03f, 0f)
                lineToRelative(2f, 0.0f)
                lineToRelative(-0.02f, 21.02f)
                lineToRelative(3.3f, -3.23f)
                lineToRelative(1.4f, 1.43f)
                close()
                moveTo(15f, 1.35f)
                curveToRelative(-1.47f, -0.85f, -3.18f, -1.35f, -5f, -1.35f)
                curveTo(4.49f, 0f, 0f, 4.49f, 0f, 10f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                verticalLineToRelative(-2f)
                curveToRelative(-4.41f, 0f, -8f, -3.59f, -8f, -8f)
                reflectiveCurveTo(5.59f, 2f, 10f, 2f)
                curveToRelative(1.89f, 0f, 3.63f, 0.66f, 5f, 1.76f)
                verticalLineTo(1.35f)
                close()
                moveTo(4f, 10f)
                curveToRelative(0f, 3.31f, 2.69f, 6f, 6f, 6f)
                verticalLineToRelative(-2f)
                curveToRelative(-2.21f, 0f, -4f, -1.79f, -4f, -4f)
                reflectiveCurveToRelative(1.79f, -4f, 4f, -4f)
                verticalLineToRelative(-2f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                close()
            }
        }.also { _Cheap = it}
