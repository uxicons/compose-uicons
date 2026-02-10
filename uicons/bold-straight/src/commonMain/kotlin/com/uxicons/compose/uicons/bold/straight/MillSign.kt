package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MillSign: ImageVector? = null

val Icons.Bs.MillSign: ImageVector
    get() = _MillSign ?: UXIcon(name = "MillSign") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(24f, 9.75f)
                verticalLineToRelative(11.25f)
                horizontalLineToRelative(-3f)
                verticalLineTo(9.75f)
                curveToRelative(0f, -2.07f, -1.68f, -3.75f, -3.75f, -3.75f)
                curveToRelative(-0.8f, 0f, -1.54f, 0.25f, -2.15f, 0.68f)
                lineToRelative(-1.6f, 4.41f)
                verticalLineToRelative(9.91f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-1.66f)
                lineToRelative(-1.7f, 4.66f)
                horizontalLineToRelative(-3.19f)
                lineToRelative(4.89f, -13.44f)
                verticalLineToRelative(-0.81f)
                curveToRelative(0f, -2.07f, -1.68f, -3.75f, -3.75f, -3.75f)
                reflectiveCurveToRelative(-3.75f, 1.68f, -3.75f, 3.75f)
                verticalLineToRelative(11.25f)
                horizontalLineTo(0f)
                verticalLineTo(3f)
                horizontalLineTo(3f)
                verticalLineToRelative(1.14f)
                curveToRelative(1.07f, -0.72f, 2.36f, -1.14f, 3.75f, -1.14f)
                curveToRelative(2.12f, 0f, 4.01f, 0.98f, 5.25f, 2.51f)
                curveToRelative(0.17f, -0.21f, 0.36f, -0.42f, 0.56f, -0.61f)
                lineTo(14.34f, 0f)
                horizontalLineToRelative(3.19f)
                lineToRelative(-1.11f, 3.05f)
                curveToRelative(0.27f, -0.03f, 0.55f, -0.05f, 0.83f, -0.05f)
                curveToRelative(3.72f, 0f, 6.75f, 3.03f, 6.75f, 6.75f)
                close()
            }
        }.also { _MillSign = it}
