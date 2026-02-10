package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Divide: ImageVector? = null

val Icons.Rc.Divide: ImageVector
    get() = _Divide ?: UXIcon(name = "Divide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-20f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                reflectiveCurveToRelative(0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(20f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
                moveTo(8.97f, 5.02f)
                verticalLineToRelative(-0.04f)
                curveToRelative(0.03f, -1.86f, 1.15f, -2.97f, 3.0f, -2.98f)
                curveToRelative(1.83f, 0.01f, 2.98f, 1.15f, 3.01f, 2.98f)
                curveToRelative(-0.04f, 1.92f, -1.13f, 3.01f, -3.0f, 3.02f)
                curveToRelative(-1.88f, -0.01f, -2.97f, -1.1f, -3.01f, -2.98f)
                close()
                moveTo(10.97f, 5f)
                curveToRelative(0.02f, 0.77f, 0.25f, 0.99f, 1.01f, 1f)
                curveToRelative(0.76f, -0.01f, 0.98f, -0.22f, 0.99f, -1.02f)
                curveToRelative(-0.01f, -0.72f, -0.27f, -0.98f, -1.01f, -0.98f)
                curveToRelative(-0.74f, 0.01f, -0.98f, 0.24f, -0.99f, 1f)
                close()
                moveTo(14.97f, 18.98f)
                curveToRelative(-0.04f, 1.92f, -1.13f, 3.01f, -3.0f, 3.02f)
                curveToRelative(-1.88f, -0.01f, -2.97f, -1.1f, -3.01f, -2.98f)
                verticalLineToRelative(-0.04f)
                curveToRelative(0.03f, -1.86f, 1.15f, -2.97f, 3.0f, -2.98f)
                curveToRelative(1.83f, 0.01f, 2.98f, 1.15f, 3.01f, 2.98f)
                close()
                moveTo(12.97f, 18.98f)
                curveToRelative(-0.01f, -0.72f, -0.27f, -0.98f, -1.01f, -0.98f)
                curveToRelative(-0.74f, 0.01f, -0.98f, 0.24f, -0.99f, 1f)
                curveToRelative(0.02f, 0.77f, 0.25f, 0.99f, 1.01f, 1f)
                curveToRelative(0.76f, -0.01f, 0.98f, -0.22f, 0.99f, -1.02f)
                close()
            }
        }.also { _Divide = it}
