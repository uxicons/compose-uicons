package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Swap: ImageVector? = null

val Icons.Rs.Swap: ImageVector
    get() = _Swap ?: UXIcon(name = "Swap") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.95f, 19.61f)
                lineToRelative(-3.39f, 3.69f)
                curveToRelative(-0.39f, 0.44f, -0.97f, 0.69f, -1.57f, 0.69f)
                reflectiveCurveToRelative(-1.17f, -0.26f, -1.57f, -0.7f)
                lineToRelative(-3.42f, -3.73f)
                lineToRelative(1.48f, -1.35f)
                lineToRelative(2.52f, 2.71f)
                verticalLineToRelative(-12.42f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.48f, -2.02f, 4.5f, -4.5f, 4.5f)
                reflectiveCurveToRelative(-4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineTo(3.04f)
                lineToRelative(-2.48f, 2.71f)
                lineTo(0.04f, 4.39f)
                lineTo(3.43f, 0.69f)
                curveToRelative(0.79f, -0.88f, 2.34f, -0.89f, 3.14f, 0.01f)
                lineToRelative(3.42f, 3.73f)
                lineToRelative(-1.48f, 1.35f)
                lineToRelative(-2.52f, -2.71f)
                verticalLineToRelative(12.42f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -2.48f, 2.02f, -4.5f, 4.5f, -4.5f)
                reflectiveCurveToRelative(4.5f, 2.02f, 4.5f, 4.5f)
                verticalLineToRelative(12.46f)
                lineToRelative(2.48f, -2.71f)
                lineToRelative(1.48f, 1.35f)
                close()
            }
        }.also { _Swap = it}
