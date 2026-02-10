package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MillSign: ImageVector? = null

val Icons.Ss.MillSign: ImageVector
    get() = _MillSign ?: UXIcon(name = "MillSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(23f, 9f)
                verticalLineToRelative(12f)
                horizontalLineToRelative(-2f)
                verticalLineTo(9f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                curveToRelative(-0.74f, 0f, -1.43f, 0.22f, -2.03f, 0.57f)
                lineToRelative(-1.97f, 5.43f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4.5f)
                lineToRelative(-2.73f, 7.5f)
                horizontalLineToRelative(-2.13f)
                lineToRelative(4.86f, -13.35f)
                verticalLineToRelative(-1.65f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
                verticalLineToRelative(12f)
                horizontalLineTo(1f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineToRelative(1.54f)
                curveToRelative(1.06f, -0.95f, 2.46f, -1.54f, 4f, -1.54f)
                curveToRelative(2.09f, 0f, 3.92f, 1.07f, 5f, 2.69f)
                curveToRelative(0.36f, -0.54f, 0.81f, -1.02f, 1.32f, -1.42f)
                lineTo(14.87f, 0f)
                horizontalLineToRelative(2.13f)
                lineToRelative(-1.13f, 3.11f)
                curveToRelative(0.37f, -0.07f, 0.74f, -0.11f, 1.13f, -0.11f)
                curveToRelative(3.31f, 0f, 6f, 2.69f, 6f, 6f)
                close()
            }
        }.also { _MillSign = it}
