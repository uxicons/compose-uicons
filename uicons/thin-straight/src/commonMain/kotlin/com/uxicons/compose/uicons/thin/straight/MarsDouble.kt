package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MarsDouble: ImageVector? = null

val Icons.Ts.MarsDouble: ImageVector
    get() = _MarsDouble ?: UXIcon(name = "MarsDouble") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.5f, 6f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.29f)
                lineToRelative(-5.57f, 5.57f)
                curveToRelative(-1.02f, -0.88f, -2.32f, -1.44f, -3.75f, -1.55f)
                curveToRelative(-0.1f, -1.42f, -0.67f, -2.72f, -1.55f, -3.75f)
                lineToRelative(5.57f, -5.57f)
                verticalLineToRelative(4.29f)
                horizontalLineToRelative(1f)
                lineTo(18f, 1.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-4.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(4.29f)
                lineToRelative(-5.57f, 5.57f)
                curveToRelative(-1.14f, -0.98f, -2.61f, -1.57f, -4.23f, -1.57f)
                curveTo(2.92f, 5f, 0f, 7.92f, 0f, 11.5f)
                curveToRelative(0f, 3.42f, 2.66f, 6.24f, 6.02f, 6.48f)
                curveToRelative(0.25f, 3.36f, 3.06f, 6.02f, 6.48f, 6.02f)
                curveToRelative(3.58f, 0f, 6.5f, -2.92f, 6.5f, -6.5f)
                curveToRelative(0f, -1.61f, -0.59f, -3.09f, -1.57f, -4.23f)
                lineToRelative(5.57f, -5.57f)
                verticalLineToRelative(4.29f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-4.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                close()
                moveTo(1f, 11.5f)
                curveToRelative(0f, -3.03f, 2.47f, -5.5f, 5.5f, -5.5f)
                reflectiveCurveToRelative(5.5f, 2.47f, 5.5f, 5.5f)
                reflectiveCurveToRelative(-2.47f, 5.5f, -5.5f, 5.5f)
                reflectiveCurveTo(1f, 14.53f, 1f, 11.5f)
                close()
                moveTo(12.5f, 23f)
                curveToRelative(-2.87f, 0f, -5.24f, -2.21f, -5.48f, -5.02f)
                curveToRelative(3.17f, -0.25f, 5.71f, -2.79f, 5.96f, -5.96f)
                curveToRelative(2.81f, 0.24f, 5.02f, 2.61f, 5.02f, 5.48f)
                curveToRelative(0f, 3.03f, -2.47f, 5.5f, -5.5f, 5.5f)
                close()
            }
        }.also { _MarsDouble = it}
