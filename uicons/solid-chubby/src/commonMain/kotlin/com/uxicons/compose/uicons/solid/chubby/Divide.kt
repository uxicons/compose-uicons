package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Divide: ImageVector? = null

val Icons.Sc.Divide: ImageVector
    get() = _Divide ?: UXIcon(name = "Divide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                horizontalLineToRelative(-19f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(19f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(11.98f, 8f)
                curveToRelative(1.87f, -0.01f, 2.96f, -1.1f, 3.0f, -3.02f)
                curveToRelative(-0.03f, -1.83f, -1.18f, -2.97f, -3.01f, -2.98f)
                curveToRelative(-1.84f, 0.01f, -2.96f, 1.13f, -3.0f, 2.98f)
                verticalLineToRelative(0.04f)
                curveToRelative(0.03f, 1.88f, 1.13f, 2.97f, 3.01f, 2.98f)
                close()
                moveTo(11.97f, 16f)
                curveToRelative(-1.84f, 0.01f, -2.96f, 1.13f, -3.0f, 2.98f)
                verticalLineToRelative(0.04f)
                curveToRelative(0.03f, 1.88f, 1.13f, 2.97f, 3.01f, 2.98f)
                curveToRelative(1.87f, -0.01f, 2.96f, -1.1f, 3.0f, -3.02f)
                curveToRelative(-0.03f, -1.83f, -1.18f, -2.97f, -3.01f, -2.98f)
                close()
            }
        }.also { _Divide = it}
