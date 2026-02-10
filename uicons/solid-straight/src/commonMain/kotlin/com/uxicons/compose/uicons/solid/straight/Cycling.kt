package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Cycling: ImageVector? = null

val Icons.Ss.Cycling: ImageVector
    get() = _Cycling ?: UXIcon(name = "Cycling") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 19f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                reflectiveCurveToRelative(-5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                close()
                moveTo(19.24f, 14.02f)
                lineTo(16.98f, 10.36f)
                curveToRelative(-0.15f, -0.25f, -0.0f, -0.36f, 0.26f, -0.36f)
                horizontalLineToRelative(2.76f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-2.67f)
                curveToRelative(-0.17f, 0f, -0.33f, 0.02f, -0.49f, 0.06f)
                lineToRelative(-3.66f, -1.68f)
                curveToRelative(-1.42f, -0.79f, -3.23f, -0.29f, -4.06f, 1.12f)
                lineToRelative(-1.19f, 2.12f)
                curveToRelative(-0.45f, 0.73f, -0.56f, 1.62f, -0.3f, 2.44f)
                curveToRelative(0.24f, 0.79f, 0.81f, 1.45f, 1.55f, 1.81f)
                lineToRelative(1.81f, 1.17f)
                verticalLineToRelative(4.96f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-6.04f)
                lineToRelative(-1.62f, -1.04f)
                lineToRelative(2.31f, -4.1f)
                lineToRelative(1.46f, 0.67f)
                curveToRelative(-0.25f, 0.42f, -0.31f, 0.98f, -0.07f, 1.56f)
                lineToRelative(2.04f, 3.33f)
                curveToRelative(-1.83f, 0.75f, -3.12f, 2.54f, -3.12f, 4.63f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                reflectiveCurveToRelative(5f, -2.24f, 5f, -5f)
                curveToRelative(0f, -2.67f, -2.12f, -4.85f, -4.76f, -4.98f)
                close()
                moveTo(13.5f, 5f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                reflectiveCurveToRelative(-1.12f, -2.5f, -2.5f, -2.5f)
                reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
                reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
                close()
            }
        }.also { _Cycling = it}
