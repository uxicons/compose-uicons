package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lift: ImageVector? = null

val Icons.Rr.Lift: ImageVector
    get() = _Lift ?: UXIcon(name = "Lift") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.73f, 14.54f)
                lineToRelative(-2.09f, 2.09f)
                curveToRelative(-0.35f, 0.35f, -0.93f, 0.35f, -1.28f, 0f)
                lineToRelative(-2.09f, -2.09f)
                curveToRelative(-0.57f, -0.57f, -0.17f, -1.54f, 0.64f, -1.54f)
                horizontalLineToRelative(4.19f)
                curveToRelative(0.81f, 0f, 1.21f, 0.97f, 0.64f, 1.54f)
                close()
                moveTo(18.91f, 11f)
                horizontalLineToRelative(4.19f)
                curveToRelative(0.81f, 0f, 1.21f, -0.97f, 0.64f, -1.54f)
                lineToRelative(-2.09f, -2.09f)
                curveToRelative(-0.35f, -0.35f, -0.93f, -0.35f, -1.28f, 0f)
                lineToRelative(-2.09f, 2.09f)
                curveToRelative(-0.57f, 0.57f, -0.17f, 1.54f, 0.64f, 1.54f)
                close()
                moveTo(20f, 19f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                horizontalLineToRelative(-10f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-14f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(20f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(5f, 22f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-20f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(14f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                close()
            }
        }.also { _Lift = it}
