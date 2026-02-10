package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Customize: ImageVector? = null

val Icons.Bs.Customize: ImageVector
    get() = _Customize ?: UXIcon(name = "Customize") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.3f, 15.64f)
                lineToRelative(1.84f, 1.06f)
                lineToRelative(-1.5f, 2.6f)
                lineToRelative(-1.84f, -1.06f)
                curveToRelative(-1.54f, 1.92f, -3.77f, 3.25f, -6.3f, 3.64f)
                verticalLineToRelative(2.12f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-2.12f)
                curveToRelative(-2.54f, -0.39f, -4.77f, -1.72f, -6.3f, -3.64f)
                lineToRelative(-1.84f, 1.06f)
                lineToRelative(-1.5f, -2.6f)
                lineToRelative(1.84f, -1.06f)
                curveToRelative(-0.44f, -1.13f, -0.7f, -2.35f, -0.7f, -3.64f)
                reflectiveCurveToRelative(0.25f, -2.51f, 0.7f, -3.64f)
                lineToRelative(-1.84f, -1.06f)
                lineToRelative(1.5f, -2.6f)
                lineToRelative(1.84f, 1.06f)
                curveToRelative(1.54f, -1.92f, 3.77f, -3.25f, 6.3f, -3.64f)
                lineTo(10.5f, 0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2.12f)
                curveToRelative(0.68f, 0.11f, 1.33f, 0.27f, 1.96f, 0.5f)
                lineToRelative(-2.45f, 2.45f)
                curveToRelative(-0.33f, -0.05f, -0.66f, -0.08f, -1.0f, -0.08f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                curveToRelative(0f, -0.34f, -0.03f, -0.68f, -0.08f, -1.0f)
                lineToRelative(2.45f, -2.45f)
                curveToRelative(0.4f, 1.08f, 0.63f, 2.24f, 0.63f, 3.46f)
                curveToRelative(0f, 1.28f, -0.25f, 2.51f, -0.7f, 3.64f)
                close()
                moveTo(10f, 14f)
                horizontalLineToRelative(3.09f)
                lineToRelative(7.75f, -7.75f)
                lineToRelative(-3.09f, -3.09f)
                lineToRelative(-7.75f, 7.75f)
                verticalLineToRelative(3.09f)
                close()
                moveTo(23.36f, 0.64f)
                curveToRelative(-0.85f, -0.85f, -2.23f, -0.85f, -3.09f, 0f)
                lineToRelative(-1.11f, 1.11f)
                lineToRelative(3.09f, 3.09f)
                lineToRelative(1.11f, -1.11f)
                curveToRelative(0.85f, -0.85f, 0.85f, -2.23f, 0f, -3.09f)
                close()
            }
        }.also { _Customize = it}
