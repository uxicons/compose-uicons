package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Legal: ImageVector? = null

val Icons.Bs.Legal: ImageVector
    get() = _Legal ?: UXIcon(name = "Legal") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 3.5f)
                verticalLineToRelative(20.5f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(8f)
                lineTo(21f, 3.5f)
                curveToRelative(0f, -0.28f, -0.23f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-11f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.23f, -0.5f, 0.5f)
                verticalLineToRelative(7.15f)
                curveToRelative(-0.72f, -0.91f, -1.78f, -1.52f, -3f, -1.65f)
                lineTo(6f, 3.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(11f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                close()
                moveTo(11f, 8f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(3f)
                close()
                moveTo(11f, 13f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-6f)
                verticalLineToRelative(3f)
                close()
                moveTo(15f, 17.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                close()
                moveTo(10f, 20.5f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-0.95f)
                curveToRelative(0.69f, -1.71f, 1.45f, -3.79f, 1.45f, -4.55f)
                curveToRelative(0f, -1.38f, -1.12f, -2.45f, -2.5f, -2.45f)
                reflectiveCurveToRelative(-2.5f, 1.07f, -2.5f, 2.45f)
                curveToRelative(0f, 0.77f, 0.77f, 2.85f, 1.45f, 4.55f)
                horizontalLineToRelative(-0.95f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(0.5f)
                lineTo(0f, 21f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-0.5f)
                close()
            }
        }.also { _Legal = it}
