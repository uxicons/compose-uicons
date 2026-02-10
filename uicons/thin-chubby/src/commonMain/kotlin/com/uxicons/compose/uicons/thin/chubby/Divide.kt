package com.uxicons.compose.uicons.thin.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Divide: ImageVector? = null

val Icons.Tc.Divide: ImageVector
    get() = _Divide ?: UXIcon(name = "Divide") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 12f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-21f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(21f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(9.97f, 5.01f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0.02f, -1.26f, 0.75f, -1.98f, 2.0f, -1.99f)
                curveToRelative(1.24f, 0.01f, 1.98f, 0.75f, 2.0f, 1.99f)
                curveToRelative(-0.02f, 1.29f, -0.73f, 2.0f, -2.0f, 2.01f)
                curveToRelative(-1.27f, -0.01f, -1.98f, -0.71f, -2.0f, -1.99f)
                close()
                moveTo(10.97f, 5f)
                curveToRelative(0.02f, 0.72f, 0.3f, 1.0f, 1.0f, 1f)
                curveToRelative(0.71f, -0.0f, 0.98f, -0.28f, 1.0f, -1.01f)
                curveToRelative(-0.01f, -0.68f, -0.31f, -0.98f, -1.0f, -0.99f)
                curveToRelative(-0.7f, 0.0f, -0.98f, 0.28f, -1.0f, 1f)
                close()
                moveTo(13.97f, 18.99f)
                curveToRelative(-0.02f, 1.29f, -0.73f, 2.0f, -2.0f, 2.01f)
                curveToRelative(-1.27f, -0.01f, -1.98f, -0.71f, -2.0f, -1.99f)
                verticalLineToRelative(-0.02f)
                curveToRelative(0.02f, -1.26f, 0.75f, -1.98f, 2.0f, -1.99f)
                curveToRelative(1.24f, 0.01f, 1.98f, 0.75f, 2.0f, 1.99f)
                close()
                moveTo(12.97f, 18.99f)
                curveToRelative(-0.01f, -0.68f, -0.31f, -0.98f, -1.0f, -0.99f)
                curveToRelative(-0.7f, 0.0f, -0.98f, 0.28f, -1.0f, 1f)
                curveToRelative(0.02f, 0.72f, 0.3f, 1.0f, 1.0f, 1f)
                curveToRelative(0.71f, -0.0f, 0.98f, -0.28f, 1.0f, -1.01f)
                close()
            }
        }.also { _Divide = it}
